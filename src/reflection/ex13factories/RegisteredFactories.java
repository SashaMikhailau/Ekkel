package reflection.ex13factories;

import reflection.ex11pets.TypeCounter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RegisteredFactories {
    public static void main(String[] args) {
        Stream.generate(Part::createRandom).limit(20).forEach(part->{
            System.out.println(part);
            System.out.println(Part.getNullPart(part.getClass()));
        });
        Part.prinInfo();
    }
}
interface IPart{

}
class Part implements IPart{
    private static TypeCounter counter = new TypeCounter(IPart.class);
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    public static void prinInfo() {
        System.out.println(counter.toString());
    }

    static IPart getNullPart(Class<? extends Part> clazz){
        return (IPart) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{Null.class,IPart.class}, new NullPartInvocationHandler(clazz));
    }
    private static List<Class<? extends Part>> factories = new ArrayList<>();
    static{
        factories.add(FuelEngine.class);
        factories.add(DieselEngine.class);
        factories.add(AirFilter.class);
        factories.add(FuelFilter.class);
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        Class<? extends Part> factory = factories.get(rand.nextInt(factories.size()));
        Part part = null;
        try {
            part = factory.newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            e.printStackTrace();
        }
        counter.count(part);
        return part;
    }
}

abstract class Filter extends Part {

}
class AirFilter extends Filter{
    static class Factory implements reflection.ex13factories.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
class FuelFilter extends Filter {
    static class Factory implements reflection.ex13factories.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class Engine extends Part {

}

class FuelEngine extends Engine {
    static class Factory implements reflection.ex13factories.Factory<FuelEngine> {
        @Override
        public FuelEngine create() {
            return new FuelEngine();
        }
    }
}

class DieselEngine extends Engine {
    static class Factory implements reflection.ex13factories.Factory<DieselEngine> {
        @Override
        public DieselEngine create() {
            return new DieselEngine();
        }

    }
}

interface Null{

}


class NullPartInvocationHandler implements InvocationHandler {
    IPart proxied;

    public NullPartInvocationHandler(Class<? extends Part> clazz) {
        this.proxied = new NullPart(clazz);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }

    private static class NullPart implements Null,IPart {
        private String name;
        public NullPart(Class<? extends Part> clazz) {
            name = "Null "+ clazz.getSimpleName();
        }

        @Override
        public String toString() {
            return name;
        }
    }
}


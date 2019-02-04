package ekkel_generics.mixins;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MixinProxy implements InvocationHandler {
    Map<String, Object> delegatesByMethod;

    public MixinProxy(TwoTouple<Object,Class>...pairs) {
        delegatesByMethod = new HashMap<>();
        for (TwoTouple<Object, Class> pair : pairs) {
            for (Method method : pair.second().getMethods()) {
                String methodName = method.getName();
                if (!delegatesByMethod.containsKey(methodName)) {
                    delegatesByMethod.put(methodName, pair.first());
                }
            }
        }

    }
    public static Object newInstance(TwoTouple<Object,Class> ...pairs) {
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = pairs[i].second();
        }
















        ClassLoader cl = pairs[0].first().getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object calledObject = delegatesByMethod.get(method.getName());
        return method.invoke(calledObject,objects);

    }


    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(new TwoTouple<>(new BasicImp(), Basic.class),
                new TwoTouple<>(new ColorImp("Blue"), Colored.class),
                new TwoTouple<>(new SerialNumberedImp(), SerialNumbered.class),
                new TwoTouple<>(new TimeStampImp(), TimeStamped.class));
        Basic basicMixin = (Basic) mixin;
        Colored coloredMixin = (Colored) mixin;
        TimeStamped timeStampedMixin = (TimeStamped) mixin;
        SerialNumbered serialNumberedMixin = (SerialNumbered) mixin;
        basicMixin.set("Hello");
        System.out.println(basicMixin.get());
        System.out.println(serialNumberedMixin.getSerial());
        System.out.println(timeStampedMixin.getTimeStamp());
        System.out.println(coloredMixin.getColor());
    }
}

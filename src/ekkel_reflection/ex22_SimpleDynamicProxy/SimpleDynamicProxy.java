package ekkel_reflection.ex22_SimpleDynamicProxy;

import ekkel_reflection.ex21_SimpleProxy.Interface;
import ekkel_reflection.ex21_SimpleProxy.RealObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SimpleDynamicProxy {
    public static void consume(Interface inter) {
        inter.doSomethig();
        inter.doSomethingElse("bonono");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consume(real);
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicHandler(real));
        consume(proxy);
    }


}

class DynamicHandler implements InvocationHandler {
    private Object proxied;

    public DynamicHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy:" +proxy.getClass()+" method: "+method.getName());
        if (args != null) {
            for(Object arg : args) {
                System.out.println("arg:"+arg);
            }
        }
        LocalTime start = LocalTime.now();
        Object result =method.invoke(proxied,args);
        LocalTime end= LocalTime.now();
        System.out.println(String.format("Method took %d ms", ChronoUnit.MILLIS.between(start,end)));

        return result;
    }
}

package org.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
//        user.show();
        //静态代理
//        UserProxy userProxy = new UserProxy(user);
//        userProxy.show();
        //动态代理
        InvocationHandler userInvocationHandler = new UserInvocationHandler(user);
        IUser userProxy = (IUser) Proxy.newProxyInstance(user.getClass().getClassLoader(), new Class[]{IUser.class},userInvocationHandler);
        userProxy.update();
    }
}

package org.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {
    IUser user;

    public UserInvocationHandler(IUser user) {
        this.user = user;
    }
    public UserInvocationHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用了"+method.getName());
        method.invoke(user,args);
        return null;
    }
}

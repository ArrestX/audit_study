package org.proxy;

public class UserProxy implements IUser{
    IUser user;
    public UserProxy(IUser user){
        this.user = user;
    }

    @Override
    public void show() {
        user.show();
        System.out.println("调用了show");
    }
    @Override
    public void create() {
        user.create();
        System.out.println("调用了create");
    }
    @Override
    public void update() {
        user.update();
        System.out.println("调用了update");
    }
}


package org.deserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Person implements Serializable {
    public Person() {
        System.out.println("无参Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        System.out.println("有参代码块");
        this.age = age;
        this.name = name;
    }

    public void action(String act){
        System.out.println("action方法");
    }
    private transient int age;
    private String name;
    public static int id;
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
    public static void staticAction(){
        System.out.println("静态方法");
    }
    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        Runtime.getRuntime().exec("calc");
    }

}

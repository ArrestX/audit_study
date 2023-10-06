package org.deserialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args)throws Exception {
        Person person = new Person();
        Class.forName("org.deserialization.Person");
        Class c = person.getClass();
        //反射就是操作class

        //从原型class里实例化对象
//        c.newInstance();
        Constructor newCs = c.getConstructor(int.class,String.class);
        Person p = (Person) newCs.newInstance(22, "abc");
        System.out.println(p);
        //获取类里边的属性
//        Field[] personfield = c.getDeclaredFields();
//
//        for (Field f:personfield){
//            System.out.println(f);
//        }
        Field namefield = c.getDeclaredField("age");
        namefield.setAccessible(true);
        namefield.set(p,222);
        System.out.println(p);
        //获取类中的属性
//        Method [] personMethod = c.getMethods();
//        for (Method m :personMethod){
//            System.out.println(m);
//        }
        Method actionMethod = c.getMethod("action",String.class);
        actionMethod.invoke(p,"adasda");
    }
}

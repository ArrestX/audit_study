package org.classLoader;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassloaderTest {
    public static void main(String[] args) throws Exception{
//        new Person(22,"222");
//        Person.staticAction();
//        Person.id=1;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        Class<?> c = Class.forName("org.deserialization.Person", false, systemClassLoader);
//        c.newInstance();
//        System.out.println(systemClassLoader);
//        Class<?> c = systemClassLoader.loadClass("org.deserialization.Person");
//        c.newInstance();
//        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("http://192.168.222.184:9999/")});
//        Class<?> c = urlClassLoader.loadClass("org.classLoader.Test");
//        c.newInstance();
//        Method defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
//        defineClassMethod.setAccessible(true);
        byte[] code = Files.readAllBytes(Paths.get("C:\\data\\Test.class"));
//        Class c = (Class) defineClassMethod.invoke(systemClassLoader,"Test",code,0,code.length);
//        c.newInstance();
        Class c = Unsafe.class;
        Field theUnsafeField = c.getDeclaredField("theUnsafe");
        theUnsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafeField.get(null);
        Class c2 = (Class) unsafe.defineClass("Test", code, 0, code.length, systemClassLoader, null);
        c2.newInstance();
    }

}

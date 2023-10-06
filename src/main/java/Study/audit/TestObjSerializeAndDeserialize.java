package org.audit;

import java.io.*;
import java.text.MessageFormat;

public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception {
        SerializePerson();//序列化 Person 对象
        Person p = DeserializePerson();//反序列 Perons 对象
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                p.getName(), p.getAge(), p.getSex()));
    }
    /**
     * MethodName: SerializePerson
     * Description: 序列化 Person 对象
     */
    private static void SerializePerson() throws FileNotFoundException,
            IOException {
        Person person = new Person();
        person.setName("fuhei");
        person.setAge(22);
        person.setSex("男");
        // ObjectOutputStream 对象输出流，将 Person 对象存储到 Person.txt 文件中，完成对Person 对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("Person.txt")));
        oo.writeObject(person);
        System.out.println("Person 对象序列化成功！");
        oo.close();
    }
    /**
     * MethodName: DeserializePerson
     * Description: 反序列 Perons 对象
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person 对象反序列化成功！");
        return person;
    }
}
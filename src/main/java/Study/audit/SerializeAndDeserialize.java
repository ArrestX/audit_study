package org.audit;

import java.io.*;

public class SerializeAndDeserialize {
    public static void main(String[] args) throws Exception {
        Evil evil = new Evil();
        //linux下的计算器使用open -a Calculator
        evil.cmd = "calc";
        byte[] serializeData=serialize(evil);
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("evil.txt")));
        oo.writeObject(serializeData);
        System.out.println("对象序列化成功！");
        oo.close();
        unserialize(serializeData);
        System.out.println("对象反序列化成功！");
    }
    public static byte[] serialize(final Object obj) throws Exception {
        ByteArrayOutputStream btout = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(btout);
        objOut.writeObject(obj);
        return btout.toByteArray();
    }
    public static Object unserialize(final byte[] serialized) throws Exception {
        ByteArrayInputStream btin = new ByteArrayInputStream(serialized);
        ObjectInputStream objIn = new ObjectInputStream(btin);
        return objIn.readObject();
    }
}
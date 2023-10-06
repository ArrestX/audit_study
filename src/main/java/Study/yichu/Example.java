package org.yichu;

public class Example {
    public static void main(String[] args) {
        byte[] buffer = new byte[8];
        int len = args[0].length();
        if (len > buffer.length) {
            len = buffer.length;
        }
        for (int i = 0; i < len; i++) {
            buffer[i] = (byte) args[0].charAt(i);
        }
        System.out.println(new String(buffer));
    }
}

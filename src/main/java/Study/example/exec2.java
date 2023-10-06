package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exec2 {
    public static void main(String[] args) throws IOException {
        //执行命令
        String[] command = {"/bin/sh","-c","ping -t 3 127.0.0.1;id"};
        String command2="/bin/sh -c \"ping -t 3 127.0.0.1;id \"";
//        Process proc = Runtime.getRuntime().exec("ping 127.0.0.1;ls");
        Process proc = Runtime.getRuntime().exec(command2);
        //回显
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream(),
                "GBK"));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

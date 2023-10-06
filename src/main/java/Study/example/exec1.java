package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exec1 {
    public static void main(String[] args) throws IOException {
        //执行系统命令
        ProcessBuilder p = new ProcessBuilder("ls","-al");
        Process pb = p.start();
        //获取执行完成命令后的结果并输出
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(pb.getInputStream(),
                "GBK"));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
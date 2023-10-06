//package org.example;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class exec3 {
//    public static void main(String[] args) throws IOException {
//        String ip=request.getParameter("ip"); try {
//            String[] command = { "/bin/sh", "-c", "ping -t 3 " +ip}; Process proc = Runtime.getRuntime().exec(command);
//            String line;
//            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()
//            while ((line = reader.readLine()) != null) { out.println(line);
//            }
//            reader.close();
//        } catch (Exception e) {
//            out.println(e); }    }
//    }
//}

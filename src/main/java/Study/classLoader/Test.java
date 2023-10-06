package org.classLoader;

import java.io.IOException;

public class Test {
    static {
        try {
            Runtime.getRuntime().exec("calc");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

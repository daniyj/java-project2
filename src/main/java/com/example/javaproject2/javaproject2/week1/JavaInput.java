package com.example.javaproject2.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar(){

    }
    public void readTwoChars() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);
        }
}


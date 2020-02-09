package com.rakovets.course.challenge.streamIO;

import java.io.FileInputStream;
import java.io.IOException;

public class Ticket1 {
    public static void main(String[] args) {
        try {
            FileInputStream abc = new FileInputStream("C:\\a.txt");
            int i = -1;
            while ((i = abc.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

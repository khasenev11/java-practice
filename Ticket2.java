package com.rakovets.course.challenge.streamIO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ticket2 {
    public static void main(String[] args) {
        String[] abc = {"ads wsgh esth rar frg ter yyj gare hyujt iaer uut jaer ktey oety lru mrt bety ytey cyoip dwer arty"};

        try (FileOutputStream abcd = new FileOutputStream("C://notes1.txt")) {

            String str;
            for (String s : abc) {
                str = n(s);
                System.out.println(str);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    static char[] chars = "aeiou".toCharArray();
    static String n(String s) {

        StringBuilder sb = new StringBuilder();
        boolean start = true, word = false;
        char[] schars = s.toCharArray();
        char c;
        for (int i = 0; i <= schars.length; i++) {

            c = i < schars.length ? Character.toLowerCase(schars[i]) : ' ';
            if (Character.isWhitespace(c)) {

                if (word) {

                    sb.append(' ');
                    word = false;
                }

                start = true;
            }
            else if (start) {

                start = false;
                for (char ch : chars) {

                    if (c == ch) {

                        word = true;
                        break;
                    }
                }
            }


            if (word) {

                sb.append(schars[i]);
            }
        }

        return sb.toString().trim();
    }
}

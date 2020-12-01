package com.company;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File dir = new File("user.dir", "tempfile4.txt");
        dir.mkdirs();
        File myFile = new File(new File("user.dir", "tempfile.txt"), "tmp.txt");
        myFile.createNewFile();
        int counter = 0;
        try (Scanner scanner = new Scanner(myFile)) {
            scanner.useDelimiter("");
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                char[] myChar = s.toCharArray();
                for (char testChar : myChar) {
                    System.out.println(testChar);
                    counter++;
                }
                //scanner.nextLine();

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(counter);
        }

    }
}

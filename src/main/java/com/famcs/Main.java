package com.famcs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {

        Scanner input = null;

        try {
            input = new Scanner(new FileReader("input.txt"));
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String text = readText(input);

        System.out.println(deleteSpaces(text));
    }

    public static String deleteSpaces(String text) {

        text = text.replaceAll("(\\.\\s)\\s*|\\s+","$1 ");
        return text;
    }

    public static String readText(Scanner input) {
        String text = "";
        while (input.hasNextLine()) {
            text += input.nextLine() + " ";
        }

        return text;
    }
}

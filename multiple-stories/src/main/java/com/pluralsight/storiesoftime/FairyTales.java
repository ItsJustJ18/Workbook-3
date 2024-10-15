package com.pluralsight.storiesoftime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FairyTales {

    public static void readStory(String filename) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("./src/main/resources/" + filename);
        Scanner fileScanner = new Scanner(fis);

        while (fileScanner.hasNextLine()) {
            String input = fileScanner.nextLine();
            System.out.println(input);
        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        int storyChoice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                =============================================
                                Story Time
                =============================================
                
                Please select a story your heart desires.
                Type in:
                1. goldilocks.txt
                2. hanzel-and-gretel.txt
                3. mary-had-a-little-lamb.txt
                
                """);
        storyChoice = scanner.nextInt();
        scanner.nextLine();
        if (storyChoice == 1) {
            System.out.println("goldilocks");
            readStory("goldilocks.txt");
        } else if (storyChoice == 2) {
            System.out.println("hanzel-and-gretel");
            readStory("hanzel-and-gretel.txt");
        } else if (storyChoice == 3) {
            System.out.println("mary-had-a-little-lamb");
            readStory("mary-had-a-little-lamb.txt");
        }
    }
}






package com.pluralsight.quotes;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        String select;

        String[] quotes = {

                "Yesterday is History, Tomorrow is a Mystery, but Today is a Gift. That's why it's called the Present",
                "This too shall pass. ", "Yes the past does hurt, but the way I see it is either you can run from it or learn from it.", "Love is putting someone's needs before your own. ",
                "Because when I look at you, I can feel it. And I look at you and I’m home.", "Why so serious? ", "The worst part about having a mental illness is people expect you to behave as if you don’t.",
                "Power Isn’t Determined By Your Size, But By The Size Of Your Heart And Dreams.", "If you have time to fantasize about a beautiful ending, why not live beautifully until the end? ", "The world is not black and white. It’s a gray area, and it’s up to us to decide what’s right and wrong."

        };

        System.out.print("Pick a quote that has inspiration to you. (select from 1 - 10.) ");
        int number = userInput.nextInt();

        System.out.println(quotes[number]);
        //select = userInput.nextLine();

        System.out.println("Would you like another quote? Type Yes or No. ");
        boolean proceed = true;

        while (proceed) {

            if (userInput.equals("Yes"))
                System.out.println("Would you like another quote? Type Yes or No. ");
            userInput.nextLine();



            //number x--

            //System.out.println(number[quotes]);

        }
    }

}

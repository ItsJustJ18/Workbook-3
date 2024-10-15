package com.pluralsight.onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
 ArrayList<Storage>
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String decide;

        System.out.println("Type ME BOOMBA to enter the store. ");
        boolean incorrect_password = true;
        while (incorrect_password) {

            decide = userInput.nextLine();


            if (decide.equals("ME BOOMBA")) {
                incorrect_password = false;
                //password while loop breaks
                //Prints out prompt for userInput
                boolean display_choices = true;
                while (display_choices) {
                    System.out.print("""    
                            ========================
                            
                                 J's Electronics
                            
                            ========================
                            Take a browse or look into our store to purchase items
                            
                            Enter "1" to see all available items in store.
                            Enter "2" to see items that you've inserted into your cart.
                            Enter "3" to leave the online store.
                            """);


                    decide = userInput.nextLine();
                    //if user wants to check out a book
                    if (decide.equals("1")) {
                        System.out.println("Hey there! Glad your willing to take a look around. Here are the available items that we have to offer. ");
                        //to do list items with price, ID, and give customers to add towards the cart with getters and setters

                        System.out.println("Press Enter to return to the home screen. ");
                        userInput.nextLine();
                    }
                    //if user wants to see what books are out and who has them
                    else if (decide.equals("2")) {
                        System.out.println("Listed below are the following items in your cart to view. Would you like to remove an item? ");
                        //to-do list the items in the cart that someone wants to purchase and then give an option to remove items from the cart

                        System.out.println("Press Enter to return to the home screen. ");
                        userInput.nextLine();

                        //user decides to close the program
                    } else if (decide.equals("3")) {
                        display_choices = false;
                        System.out.println("Thanks for visiting J's Electronics. Hope to see you around!");

                    } else {
                        System.out.println("Please input a number dear customer. Like 1, 2, or 3 perhaps? ");
                    }
                }

            } else { //if incorrect password
                System.out.println("Sorry but this isn't the password we gave you. Please type exactly in the prompt. ");
            }



        }



    }
}
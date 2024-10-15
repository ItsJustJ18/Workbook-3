package com.pluralsight.payroll;

import java.io.*;
import java.util.Scanner;

public class Calculator {

    private String employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public static void getEmployee(String filename) throws FileNotFoundException {

        FileInputStream employee = new FileInputStream("./src/main/resources/" + filename);
        Scanner fileScanner = new Scanner(employee);

        while (fileScanner.hasNext()) {
            String input = fileScanner.nextLine();
            System.out.println(input);
        }


    }

}
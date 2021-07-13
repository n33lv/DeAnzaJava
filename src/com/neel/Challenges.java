package com.neel;

import java.util.Scanner;

public class Challenges {
    public double testAverage() {
        double score1;
        double score2;
        double score3;
        System.out.println("Enter the three test values.");
        Scanner in = new Scanner(System.in);
        score1 = in.nextDouble();
        System.out.println("You entered the number " + score1);
        score2 = in.nextDouble();
        System.out.println("You entered the number " + score2);
        score3 = in.nextDouble();
        System.out.println("You entered the number " + score3);
        double testMean = (score1 + score2 + score3)/3;
        System.out.println("The average value of the test scores is: " + testMean);
        if (testMean <= 65) {
            System.out.println("The class has failed.");
            return 0;
        } else if (testMean >= 75 && testMean < 85) {
            System.out.println("The class recieves a C.");
            return 0;
        } else if (testMean >= 85 && testMean < 95) {
            System.out.println("The class recieves a B.");
            return 0;
        } else if (testMean >= 95) {
            System.out.println("The class receives an A!");
            return 0;
        }
        return 0;


    }
    public double circuitBoardProfit(double retailPriceOfCircutBoard) {
        //profit = Retail price * 0.4
        double profit = retailPriceOfCircutBoard * 0.4;
        System.out.println("The company makes a profit of " + profit + "from their circut boards.");
        return 0;
    }
    public double totalCostOfRestaurantBill(double chargeOfMealEmpty) {
        double tax = (chargeOfMealEmpty * 0.0675);
        double mealAndTax = chargeOfMealEmpty + tax;
        System.out.println("The tax of the meal is: " + tax);
        double tip = (mealAndTax * 0.2);
        System.out.println("You will pay $" + tip + " in tip.");
        double mealTaxTip = mealAndTax + tip;
        System.out.println("The total bill of your order will be: $" + mealTaxTip);
        return 0;

    }
    public void boysAndGirl(int boys, int girls) {
        double percentOfBoys = ((double)boys / (boys + girls)) * 100;
        double percentOfGirls = ((double)girls / (boys + girls)) * 100;
        System.out.println("The percentage of boys is: " + percentOfBoys);
        System.out.println("The percentage of girls is: " + percentOfGirls);
        return;
    }

    public void stockPrice(double numOfStocks, double priceOfStock) {
        double totalStockCostEmpty = numOfStocks * priceOfStock;
        System.out.println("The cost of the stocks without commision is: " + totalStockCostEmpty);
        double commisionOfStocks = 0.02 * totalStockCostEmpty;
        System.out.println("The commision that you will pay of the stocks is: " + commisionOfStocks);
        double grandTotalStockPrice = totalStockCostEmpty + commisionOfStocks;
        System.out.println("The total cost of the stocks will be: " + grandTotalStockPrice);
    }
    public int customerChoosings(int customersSurveyed) {
        double customersMinWeekly = 0.14 * customersSurveyed;
        double cMNsubCitrus = 0.64 * customersMinWeekly;
        System.out.println("The number of people who took the survey were: " + customersSurveyed);
        System.out.println("The number of people who buy an energy drink atleast once every week are: " + customersMinWeekly);
        System.out.println("Of the people who get buy weekly, " + cMNsubCitrus + " prefer citrus flavored drinks");
        return 0;
    }
    public double cookieIngredientCalculator(int numOfCookies) {
        System.out.println("You want to make " + numOfCookies + " cookies.");
        double sugar = numOfCookies * 1.5;
        System.out.println("You will need " + sugar + " cups of sugar.");
        double butter = numOfCookies * 1;
        System.out.println("You will need " + butter + " cups of butter.");
        double flour = numOfCookies * 2.75;
        System.out.println("You will need " + flour + " cups of flour.");
        return 0;
    }
    public void askUserForInfo(String firstName, String lastName, String favouriteCity){
        System.out.println("Your name is: " + firstName + lastName);
         String name = firstName + lastName;
         char firstInitial = name.charAt(0);
         char lastInitial = lastName.charAt(0);
        System.out.println("Your initials are: " + firstInitial + lastInitial);
        System.out.println("There are " + name.length() + " characters in your name.");


    }
    public double convertCToF(double Celsuis) {
        //(0°C × 9/5) + 32 = 32°F
        //multiply the temperature in degrees Celsius by 2, and then add 30 to get the (estimated) temperature in degrees Fahrenheit.
        double F = (Celsuis*2) + 30;
        System.out.println(F);
        System.out.println("That is the degree in Farenheight.");
        return 0;

    }
    public double operationCalc() {
        System.out.println("In this calculator you will be able to add, subtract, multpily, divide, and do Mod Division.");
        System.out.println("Type in what you would like to do. Add, Subtract, multiply, divide, Mod Division");
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        if (command.equalsIgnoreCase("add")) {
            System.out.println("Lets add! Enter the first number.");
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
            System.out.println("Enter the next number.");
            double y = in.nextDouble();
            System.out.println("You entered: " + y);
            double z = x + y;
            System.out.println(x + " + " + y + " is: " + z);
            return 0;
        } else if (command.equalsIgnoreCase("subtract")) {
            System.out.println("Lets subtract! Enter the first number.");
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
            System.out.println("Enter the next number.");
            double y = in.nextDouble();
            System.out.println("You entered: " + y);
            double z = x - y;
            System.out.println(x + " - " + y + " is: " + z);
            return 0;
        } else if (command.equalsIgnoreCase("multiply")){
            System.out.println("Lets multiply! Enter the first number.");
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
            System.out.println("Enter the next number.");
            double y = in.nextDouble();
            System.out.println("You entered: " + y);
            double z = x * y;
            System.out.println(x + " * " + y + " is: " + z);
            return 0;
        } else if (command.equalsIgnoreCase("divide")) {
            System.out.println("Lets divide! Enter the first number.");
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
            System.out.println("Enter the next number.");
            double y = in.nextDouble();
            System.out.println("You entered: " + y);
            double z = x/y;
            System.out.println(x + " / " + y + " is: " + z);
            return 0;
        } else if (command.equalsIgnoreCase("Mod division")) {
            System.out.println("Lets Mod Divide! Enter the first number.");
            double x = in.nextDouble();
            System.out.println("You entered: " + x);
            System.out.println("Enter the next number.");
            double y = in.nextDouble();
            System.out.println("You entered: " + y);
            double z = x % y;
            System.out.println(x + " % " + y + " is: " + z);
            return 0;
        } else {
            System.out.println("This command is not acceptable!");
            return 0;
        }
    }
    public void LoanQualifier(int yrsWorked, long salary) {
        if (yrsWorked > 2 && salary > 2) {
            System.out.println("You are eligible for a loan.");

        } else {
            System.out.println("You are not eligible for a loan.");
        }

    }







}

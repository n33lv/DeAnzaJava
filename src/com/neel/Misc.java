package com.neel;
import java.util.Scanner;

public class Misc {
    public void flowChartHelp(){
        System.out.println("An oval or elsispse is used for start or stop");
        System.out.println("A rectangle is for Processing something");
        System.out.println("A paralleogram is used for reading something and printing an output");
        System.out.println("Lastly the diamond is used for decisions");
    }
    public int distributeOranges(int numberOfOranges, int numberOfPeople) {
        int distributeOrange = numberOfOranges/numberOfPeople;
        System.out.println("The number of oranges that each person will have is: " + distributeOrange);
        return 0;

    }

    public double grossSalary(double timeWorking, long moneyPerHour, int daysOfWorking) {
      
        

        double grossSalaryD = timeWorking*moneyPerHour;
        System.out.println("The person makes this much money per day: " + grossSalaryD);
        double grossSalaryW = grossSalaryD * daysOfWorking;
        System.out.println("So while working " + daysOfWorking + " a week, they make $" + grossSalaryW);
        return 0;
    }

    public void testAverage() {
        System.out.println("Enter the three test values.");
        Scanner in = new Scanner(System.in);
        double score1 = in.nextDouble();
        System.out.println("You entered the number " + score1);
        double score2 = in.nextDouble();
        System.out.println("You entered the number " + score2);
        double score3 = in.nextDouble();
        System.out.println("You entered the number " + score3);
        Challenges n = new Challenges();
        double testAverage = n.testAverage(score1, score2, score3);
    }
    public void circuitBoardProfit() {
        System.out.println("Enter the retail price of the circuit board.");
        Scanner in = new Scanner(System.in);
        double retailPriceOfCircutBoard = in.nextDouble();
        System.out.println("You entered the number " + retailPriceOfCircutBoard);
        Challenges n = new Challenges();
        double circuitBoardProfit = n.circuitBoardProfit(retailPriceOfCircutBoard);
    }
    public void totalCostOfRestaurantBill() {
        System.out.println("Enter the intial cost of the meal without tax or tip.");
        Scanner in = new Scanner(System.in);
        double chargeOfMealEmpty = in.nextDouble();
        System.out.println("You entered the number " + chargeOfMealEmpty);
        Challenges n = new Challenges();
        double totalCostOfRestaurantBill = n.totalCostOfRestaurantBill(chargeOfMealEmpty);
    }
    public void boysAndGirls() {
        System.out.println("How many boys are there?");
        Scanner in = new Scanner(System.in);
        int boys = in.nextInt();
        System.out.println("You entered the number " + boys);
        System.out.println("How many girls are there?");
        int girls = in.nextInt();
        System.out.println("You entered the number " + girls);
        Challenges n = new Challenges();
        n.boysAndGirl(boys, girls);
    }
    public void stockPrice() {
        System.out.println("Please enter the number of Stocks that you would like to purchase.");
        Scanner in = new Scanner(System.in);
        double numOfStocks = in.nextDouble();
        System.out.println("You entered the number: " + numOfStocks);
        System.out.println("Next, what is the price of one stock?");
        double priceOfStock = in.nextDouble();
        System.out.println("You entered the number: " + priceOfStock);
        Challenges n = new Challenges();
        n.stockPrice(numOfStocks, priceOfStock);


    }
    public void customerChoosings() {
        System.out.println("Enter the number of people who were surveyed.");
        Scanner in = new Scanner(System.in);
        int customersSurveyed = in.nextInt();
        System.out.println("You entered the number: " + customersSurveyed);
        Challenges n = new Challenges();
        n.customerChoosings(customersSurveyed);
    }
    public void cookieIngredientsCalculator() {
        System.out.println("Please enter the number of cookies that you would like to make");
        Scanner in = new Scanner(System.in);
        int numOfCookies = in.nextInt();
        System.out.println("You entered the number: " + numOfCookies);
        Challenges n = new Challenges();
        n.cookieIngredientCalculator(numOfCookies);
    }
    public void askUserForInfo() {
        System.out.println("Please enter in your first name.");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        System.out.println("You entered: " + firstName + " as your first name.");
        System.out.println("Please type in your last name.");
        String lastName = in.next();
        System.out.println("You entered: " + firstName + " as your last name");
        System.out.println("What is your favourite City?");
        String favouriteCity = in.next();
        System.out.println("You entered: " + favouriteCity);
        System.out.println("Thanks for the information!");
        Challenges n = new Challenges();
        n.askUserForInfo(firstName, lastName, favouriteCity);


    }

}

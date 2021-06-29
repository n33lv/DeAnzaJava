package com.neel;

public class Challenges {
    public double testAverage(double score1, double score2, double score3) {
        double testMean = (score1 + score2 + score3)/3;
        System.out.println("The average value of the test scores is: " + testMean);
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
    public int boysAndGirl(int boys, int girls) {
        double percentOfBoys = (boys / (boys + girls)) * 100;
        double percentOfGirls = (girls / (boys + girls)) * 100;
        System.out.println("The percentage of boys is: " + percentOfBoys);
        System.out.println("The percentage of girls is: " + percentOfGirls);
        return 0;
    }
}

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


}

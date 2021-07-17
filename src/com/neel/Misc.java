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
    public void convertCToF() {
        System.out.println("Please enter in the tempreture in Celsuis");
        Scanner in = new Scanner(System.in);
        double celsuis = in.nextDouble();
        System.out.println("You entered: " + celsuis);
        Challenges n = new Challenges();
        n.convertCToF(celsuis);

    }
    public void numCompare(double a, double b) {
        System.out.println("We will compare two numbers for you. The first number, known as A, and the second one known as B.");
        System.out.println("Enter the required values and let the magic happen!");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        System.out.println("You entered: " + a);
        b = in.nextDouble();
        System.out.println("You entered: " + b);
        in.close();
        if (a > b) {
            System.out.println("Number a is greater than number B.");
        } else if (a < b) {
            System.out.println("Number B is greater than number A");
        } else if (a == b) {
            System.out.println("Number B and A are equal.");
        }

    }

    public void numSmallest(double a, double b) {
        System.out.println("We will compare two numbers and return the smallest one. Type in your values, a and b!");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your value for number A.");
        a = in.nextDouble();
        System.out.println("You entered: " + a);
        b = in.nextDouble();
        System.out.println("You entered: " + b);
        in.close();
        if (a == b) {
            System.out.println("The two numbers are equal!");
        }
        System.out.println("The smallest of the two numbers is " + Math.min(a, b));
    }
    public void evenOrOdd() {
        System.out.println("We will take one number and determine if the number is even or odd.");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("You entered the value: " + a);
        in.close();
        if (a % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd.");
        }

    }
    public void romanNumeralConversion() {
        System.out.println("You may enter numbers 1 through 10 inclusive and have it converted into a roman numeral.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("You entered: " + a);
        switch (a){
            case 1:
                System.out.println("The roman numeral of this number is: I ");
                break;
            case 2:
                System.out.println("The roman numeral of this number is: II ");
                break;
            case 3:
                System.out.println("The roman numeral of this number is: III ");
                break;
            case 4:
                System.out.println("The roman numeral of this number is: IV ");
                break;
            case 5:
                System.out.println("The roman numeral of this number is: V ");
                break;
            case 6:
                System.out.println("The roman numeral of this number is: VI ");
                break;
            case 7:
                System.out.println("The roman numeral of this number is: VII ");
                break;
            case 8:
                System.out.println("The roman numeral of this number is: VIII ");
                break;
            case 9:
                System.out.println("The roman numeral of this number is: IX ");
                break;
            case 10:
                System.out.println("The roman numeral of this number is: X ");
                break;
            default:
                System.out.println("This value is not in the range of 1 through 10!");
        }
        //in.next();

    }
    public void romanNumeralRepeat() {
        while (true) {
            romanNumeralConversion();
        }
    }
    public double greatestNum3(double a, double b, double c) {
        if(a>b) {
            if (a==c){
                System.out.println("The greatest numbers are: " + a + " and " + c);
                return 0;
            } else {
                System.out.println("The greatest number is " + Math.max(a,c));
                return 0;
            }
        } else if (a==b) {
            if (a==c) {
                System.out.println("All of the numbers are equal!");
                return 0;
            } else {
                System.out.println("The greatest number is " + Math.max(a,c));
                return 0;
            }
        } else if (a<b) {
            if (b!=c) {
                System.out.println("The greatest number is " + Math.max(b, c));
            }
        }
        return 0;

    }

    public void LoanQualifier() {
        System.out.println("Enter the number of years that you have worked.");
        Scanner in = new Scanner(System.in);
        int yrsWorked = in.nextInt();
        System.out.println("You entered: " + yrsWorked);
        System.out.println("Enter your salary.");
        long salary = in.nextLong();
        System.out.println("You entered: " + salary);
        in.close();
        System.out.println("Calculating eligibilty for loan");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        Challenges n = new Challenges();
        n.LoanQualifier(yrsWorked, salary);
    }

    //TODO: Make a function, "Login," in there you will be asked to store a username and password. They will either say save or exit.
    //TODO: Save means that they will save the names. Exit means they will restart. Various information can be shown after.
    //TODO: Then if "exit" is read from the console, then the program will stop and simply ask for the username.
    //TODO: If the correct username is entered (The one that was previously saved,) along with the password, it will be able to pull up the various
    //TODO: information again.
    public void Login() {
        System.out.println("Create Your Account!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your username.");
        String username = in.nextLine();
        System.out.println("You entered: " + username);
        System.out.println("Enter your password.");
        String password = in.nextLine();

        System.out.println("You entered: " + password);
        System.out.println("Congrats! You have set up an account! Your information will be shown here. Type Menu to go back to the home page.");
        System.out.println("Type something to display your information.");

        // various info
        System.out.println("Name: Neel");
        System.out.println("Date of birth: Unknown");
        System.out.println("Favorite color: black");
        System.out.println("No more information has been registered.");


        while (true) {
            System.out.println("Type Menu to log out.");
            String command = in.nextLine();
            if (command.equalsIgnoreCase("Menu")) {
                System.out.println("Home Page");
                System.out.println("Enter your username.");
                command = in.nextLine();
                if (command.equalsIgnoreCase(username)) {
                    System.out.println("Please enter your password");
                    command = in.nextLine();
                    if (command.equalsIgnoreCase(password)) {
                        System.out.println("Correct Username and Password.");
                        System.out.println("Name: Neel");
                        System.out.println("Date of birth: Unknown");
                        System.out.println("Favorite color: black");
                        System.out.println("No more information has been registered.");
                    } else {
                        System.out.println("Incorrect password.");
                    }

                } else {
                    System.out.println("Incorrect username.");
                }

            } else {
                System.out.println("Unknown command. Please type \"Menu\" to log out.");
            }
        }




/*
        public void LoginTry() {
            Scanner in = new Scanner(System.in);
            System.out.println("Home Page");
            System.out.println("Enter your username.");
        }

 */



    }

    public void variousInfo() {
        System.out.println("Name: Neel");
        System.out.println("Date of birth: Unknown");
        System.out.println("Favorite color: black");
        System.out.println("No more information has been registered.");
    }










}

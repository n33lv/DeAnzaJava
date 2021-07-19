package com.neel;

import java.util.Scanner;
public class Week3AssignmentQuizzes {

    /**
     *
     * Write a program that reads a letter and displays its corresponding digit.
     *
       1. Analysis (Describe the problem including input and output in your own words)
       2. Design (Describe the major steps for solving the problem.)
       3. Coding: (Copy and Paste Source Code here. Format your code using Courier 10pts)
       4. Testing: (Describe how you test this program)

      Answers:

      1 -----> Analysis

      Problem:

      The problem is I am to create a program which when the user inputs a set of letters, the program will output a corresponding
      digit on the standard letter/number mapping for a telephone.


       Input and output:

       The user will be greeted with instructions on how the program works. The user is meant to enter a set of letters
      in. The letters will then be run through an if statement to determine which number the set of letters correpsond to.
      If a match is found it will be outputted. If not a statement will be printed to try and help the user figure out if they have
      inputed the wrong thing and if they would like to use reference with their own phone.

     2 ---------> Design

     Function: The method takes a string as input representing a letter and  returns the corresponding digit associated with it.
     To do this, the method uses a switch statement to group the corresponding numbers associated with a digit and returns the value.
     If no match is found, the method throws an exception.

     The letter supplied can contains trailing and leading spaces, so the method trims the letter using String.trim() function
     and to avoid matching both upper and lower cases, it converts the letter to lower case and only matches lower case alphabet.

     In the Main method, the java.util.Scanner is used in order to be able to read input from the console and mapped number is
     printed back on the console using System.out.println.

     Alternatives considered:
     We can also use if, else statements instead of case statement.  However use of case makes the code neater.

     3 ------------>

    Code is provided above.

    4 -------------->

    Testing the program:

               Method 1:

               I read the program and try to make sense of the output, while considering a hypothetical input. I can debug any
               problems or implement any lacking features into the program should the need arise. I run this multiple times
               to make sure that every aspect of the program is actaully working.


               Method 2:

                I actually run the program in an IDE. I give hypothetical inputs. I run this multpiple times to make sure that
                every aspect of the program is actually working.

    */
    public static int letterNumberTeleMap(String letter) {
        switch (letter.toLowerCase().trim()) {
            case "a":
            case "b":
            case "c":
                return 2;
            case "d":
            case "e":
            case "f":
                return 3;
            case "g":
            case "h":
            case "i":
                return 4;
            case "j":
            case "k":
            case "l":
                return 5;
            case "m":
            case "n":
            case "o":
                return 6;
            case "p":
            case "q":
            case "r":
            case "s":
                return 7;
            case "t":
            case "u":
            case "v":
                return 8;
            case "w":
            case "x":
            case "y":
            case "z":
                return 9;
            case "+":
                return 0;
            case "":
                return 1;
            default:
                throw new IllegalArgumentException("You may have mistyped the letter, or entered a string of letters.");

        }
    }


    /**
     *
    1. Analysis (Describe the problem including input and output in your own words)
    2. Design (Describe the major steps for solving the problem.)
    3. Coding: (Copy and Paste Source Code here. Format your code using Courier 10pts)
    4. Testing: (Describe how you test this program)

    1 ----------->  Anylyisis: The user is to input the weight of the package and the distance that the package will travel. The program will then calculate the total shipping cost.
     The problem is to calculate the shipping cost given the weight and distance that the package will travel.

    2 ----------->

     Design:

     The method takes two input arguments, one for distance and another for the weight of the shipping package
     and returns calculated shipping cost.

     The logic to calculate shipping cost is as follows:
     a) do integer division of distance by 500 to find the closet whole number
     b) Add one to the result
     c) If the distance is a multiple of 500 (checed using modulo operator), do not add 1 (ie subtract 1 from the b)
     d) This gives the totalCostOverTravel regardless of the weight.
     e) Now based on the package weight multiply the result with rate per 500 miles shipped.

     I used modulus to determine if something needed to be fixed in the if statement.
     I also had a if statement for the calculation of the shipping cost.

     The method throws an illegal argument exception when the values inputted were not within the range of values that could be inputted.
     These could be negative or zero numbers in place of the weight.

    Finally, I import a scanner to use the scanner to read the user input and make it interactive.

    3 --------------> The code is above

    4 -------------->

     Testing the program:

                Method 1:

                I read the program and try to make sense of the output, while considering a hypothetical input. I can debug any
                problems or implement any lacking features into the program should the need arise. I run this multiple times
                to make sure that every aspect of the program is actaully working.


                Method 2:

                 I actually run the program in an IDE. I give hypothetical inputs. I run this multpiple times to make sure that
                 every aspect of the program is actually working.


                Method 3:

                I try to test out how the program responds in three catogories.
                    1. In boundary values e.g. between 2 and 10 lb of weight
                    2. Out of boundary values e.g. negative numbers
                    3. Boundary values. e.g. 2, 6, 10 lb, 500 miles, 1000 miles

                This will help give me at least an overview or fix most of the underlying problems in the code if not all of the problems themselves.



     */
    public static double dHLShippingCosts(double weightOfPackage, int distanceOfPackageTraveled) {
        int totalCostOverTravel = (distanceOfPackageTraveled/500) + 1;
        if (distanceOfPackageTraveled % 500 == 0) {
            totalCostOverTravel--;
        }

        if ((weightOfPackage <= 2) && (weightOfPackage > 0)) {
            double totalCost = totalCostOverTravel * 1.1;
            return totalCost;
        } else if ((weightOfPackage > 2) && (weightOfPackage <= 6)) {
            double totalCost = totalCostOverTravel * 2.2;
            return totalCost;
        } else if ((weightOfPackage > 6) && (weightOfPackage <= 10)) {
            double totalCost = totalCostOverTravel * 3.7;
            return totalCost;
        } else if (weightOfPackage > 10) {
            double totalCost = totalCostOverTravel * 3.8;
            return totalCost;
        } else {
            throw new IllegalArgumentException("You cannot have a package of negative or zero weight.");
        }



    }



    public static void main(String[] args) {


        System.out.println("You can enter in a letter and the corresponding number will be returned.");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("You entered: " + a);
        in.close();

        int number = letterNumberTeleMap(a);
        System.out.println("Number mapped to " + a + " is " + number);

        //------------------------------------------
        in = new Scanner(System.in);
        System.out.println("Enter the weight (in lb) of the package.");
        double weightOfPackage = in.nextDouble();
        System.out.println("Now enter the distance (in miles) the it will be shipped.");
        int distanceOfPackageTraveled = in.nextInt();
        in.close();

        double totalCost = dHLShippingCosts(weightOfPackage, distanceOfPackageTraveled);
        System.out.println("The total shipping cost is " + totalCost);




    }

}

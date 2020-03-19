//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/1NMD_hv_t5-EI2v-PshXYUpR1VAEjQjGVXUQS18hyrGg/edit?usp=sharing

import java.util.*;

public class lab3 {

    public static void main(String[] args) {

        //Example1.
        echo("hello", 3);
        echo("bye", 4);

        
        //Example2.
        Scanner input = new Scanner(System.in);

        int numOne = input.nextInt();
        int numTwo = input.nextInt();

        //The method returns a value which we can then use to make any other calculations.
        double doubleAverage = average(numOne, numTwo) * 2;

        //What do you expect this to be?
        System.out.println(doubleAverage);
        
        //Example3.
        System.out.println(add("1", "2"));

        System.out.println(add(1, 2));

        //Example4.
        String words[] = {"INFS", "1609", "Nick", "Pass", "Class"};
        int numbers[] = {1,2,3,4,5,5,6,7,8,3};

        printArray(words);
        printArray(numbers);


        input.close();
    
    }

    //Example 1.
    //This method takes 2 things as "input within its paramaters".
    //What the method takes is demonstrated by the parameter list.
    //When the correct input is called in the main method the following code runs.
    //We need to make sure when we use methods, out input matches the type and order specified.
    private static void echo(String sound, int times) {
        for(int i =0; i < times; i++) {
            System.out.print(sound + " ");
        }

        System.out.println();
    }

    //Example 2.
    //Rather than just printing, what if we want to actually return a value back into the main method?
    //You will specify a return data type value in front of the method. In this case this is a double.
    //Once the calulation the return keyword is used to send the value back to the main method.
    public static double average(int num1, int num2) {

        double average = ((num1 + num2)/2);
        //System.out.println(average + " here");
        return average;
    }

    //Example3.
    //Overloading example. 
    //Depending on what is inputed into the parameters, certain output will be returned. 
    //This makes the use of the method very flexible and you can use one method for multiple things.
    protected static String add(String number1, String nuumber2) {

        String returnString = "Unable to add String Data Types";
        return returnString;
    }

    protected static int  add(int number1, int number2) {

        int total = number1 + number2;
        return total;
    }

    //Example4.
    public static void printArray(String[] array) {

        for(String words : array) {
            System.out.print(words + " ");
        }
    }

    public static void printArray(int[] array) {
        for(int numbers : array) {
            System.out.println(numbers + ", ");
        }
    }

}
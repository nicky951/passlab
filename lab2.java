//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//Pass Lab 2 Summary: https://docs.google.com/document/d/1xsFYUCr9oRZUI2aCmhqQqdJcyh4cn5VCJ2jd7_49sqk/edit?usp=sharing

import java.util.*;

public class lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //While Loop Example 1
        //While loop is an entry condition loop
        //It will check the condition first before it enters the loop then check again after
        String word = input.nextLine();

        while(!word.equals("stop")) {
            System.out.println(word);
            word = input.nextLine();
        }

        
        //While Loop Example 2
        //Continuous printing and iteration
        //Note what the continue does
        int a = 5;

        while(a < 10) {
            if(a == 6) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }


        //Do While Loop Example 3
        //Entry condition do while loop
        //Even though i does not meet the condition "i < 1" it enters the do block
        //This is because it will check the condition after it exits the do block
        int i = 2;

        do {
            i++;
            System.out.println(i);
        } while(i < 1);

        //Incrementing before and after Example 4
        int c = 1;
        int d = 1;

        System.out.println(c++);
        System.out.println(++d);

        //For Loop Example 5
        //Each for loop has a starting statment, ending condition and an adjustment statement
        //Until b = 10, I want to keep printing "*". Instead of putting this in a while loop, you can do this instead.
        for(int b = 0; b < 10; b++) {
            System.out.print("*");
            
        }

        System.out.println();

        //Nested For Loop Example 6
        //We go into the outer loop -> the one with e
        //e = 0 then we enter the inner loop -> the one with f
        //f = 0 meets the condition of f <= e. 1 star printed and f + 1.
        //f = 1 does not meet the condition f <= e. Why? because e is still 0. We have not yet exited to the outer loop and incremented e.
        //and so on.......
        for(int e = 0; e < 10; e++) {
            for(int f = 0; f <= e; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
}


//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/1Jbgq7umLBVgpjJgV6qXfEyqGhydQNaMOKRM6ILR5Rsc/edit?usp=sharing
import java.util.*;

public class lab5 {

    public static void main(String[] args) {

        //Example1.
        String sentence = "my sentence";
        String completeSentence = String.format("this is %s", sentence);

        System.out.println(completeSentence);

        System.out.printf("%nHere is the number as a floating point value: %f", 123.0);

        System.out.printf("%nHere is the same number to exactly 3 decimals: %.3f", 123.0);

        System.out.printf("%nHere is the same number with padding at the front: %10.3f %n", 123.0);
        
        //For more examples of what you can use see: https://dzone.com/articles/java-string-format-examples

        
        //Example2.
        System.out.println();

        drink coke = new drink("Coke", 250, "Coca Cola");
        drink orangeJuice = new drink("OJ", 200, "Woolworths");
        coffee columbia = new coffee("Columbia Cold Brew", 100, "UNSW Cafe", 50, "Columbia");
        tea earlGrey = new tea("Earl Grey Tea", 120, "Haven Cafe", 96, "black tea");
        
        coke.printDetails();;
        orangeJuice.printDetails();
        columbia.printDetails();
        earlGrey.printDetails();

        System.out.println();

        drinking(columbia);
        drinking(earlGrey);

        System.out.println();
        

        
        ArrayList<drink> drinksList = new ArrayList<drink>();
        drinksList.add(coke);
        drinksList.add(orangeJuice);
        drinksList.add(columbia);
        drinksList.add(earlGrey);

        for(drink liquid: drinksList) {
            liquid.printDetails();
        }
        
        
    }

    public static void drinking(coffee drink) {
        System.out.println("You drank " + drink.getCaffeine() + " mLs of caffeine");
    }

    public static void drinking(tea drink) {
        System.out.println("This " + drink.getTeaLeaves() + " is very nice");
    }
}
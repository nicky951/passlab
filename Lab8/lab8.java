//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/1BPzaWrqo4_mN1RQnoaPdhWFthj-lX2s8lCYhSxQZgsQ/edit?usp=sharing



import java.util.*;

public class lab8 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        //Example 1
        //The XOR operator
        boolean hungry;
        boolean thirsty;

        System.out.print("Are you hungry? \n");
        hungry = input.nextBoolean();

        System.out.print("Are you thirsty? \n");
        thirsty = input.nextBoolean();


        //If your hungry and not thirsty or thirsty and not hungry
        if((hungry && !thirsty) || (thirsty && !hungry)) {
            if(hungry) System.out.println("You need to eat");
            if(thirsty) System.out.println("You need to drink");
        } else if( hungry && thirsty) {
            System.out.println("You need to eat and drink");
        } else {
            System.out.println("Go exercise");
        }

        //Exact same way of writing the above
        if(hungry ^ thirsty) {
            if(hungry) System.out.println("You need to eat");
            if(thirsty) System.out.println("You need to drink");
        } else if( hungry && thirsty) {
            System.out.println("You need to eat and drink");
        } else {
            System.out.println("Go exercise");
        }
        

        /*
        //Example 2
        //Type Conversion
        
        String s = input.nextLine();
        int i = Integer.parseInt(s);
        String s2 = Integer.toString(i);
        double d = Double.parseDouble(s2);

        System.out.print(s + "\n" + i + "\n" + s2 + "\n" + d + "\n");

        //What if you want to take a string of numbers and convert it into multiple ints?

        String multipleString = input.nextLine();
        String[] split = multipleString.split("\\s+");
        int[] numbers = new int[5];

        for(int a = 0; a < split.length; a++) {
            numbers[a] = Integer.parseInt(split[a]);
        }

        for(int number: numbers) {
            System.out.print(number + "\n");
        }
        */

        //Example 3
        //Constructor Chaining
        /*
        ArrayList<person> list = new ArrayList<person>();

        person individual = new person();
        person justin = new person("Justin");
        person liz = new person("Liz", 2);
        person riley = new person("Riley", 3, true);
        person nick = new person("Nick", 100);

        list.add(individual);
        list.add(justin);
        list.add(liz);
        list.add(riley);
        list.add(nick);

        for(person p: list) {
            System.out.println(p.toString());
        }
        
        */

        input.close();
    }
}
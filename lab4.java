//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/18z3ssc2vCIuXlcTJ5xYHJ5nBj6bp5xwvjzOZQBjvi6k/edit?usp=sharing


import java.util.*;

public class lab4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        //Example1.
        //Here are the several ways that you can initialise an Array.
        int[] numbers = {1, 2, 3, 4, 5};

        String[] words = new String[3];
        
        for(int i = 0; i < words.length; i++ ) {
            words[i] = input.nextLine();
        }
        
        //Call the print methods.
        System.out.println("Example 1 Output:");
        print(numbers);
        print(words);
        

        
        //Example2.
        //Default values in arrays. This is a question that was raised last week.
        //When we create a new array without specifying the elements, what is actually in it? Is it empty?

        int[] numbers2  = new int[3];
        String[] words2 = new String[3];
        boolean[] value = new boolean[3];

        //What do we expect when we print this?
        print(numbers2);
        print(words2);
        print(value);

        

        
        //Example3. 
        //Arraylist vs Array

        String[] stringz = new String[2];

        stringz[0] = "INFS";
        stringz[1] = "1609";

        //This will throw an exception.
        //ArrayIndexOutOfBoundsException
        //stringz[3] = "error";

        //This line of code converts an Array into an ArrayList. This uses the Arrays import. (import java.util.Arrays)
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringz));

        //Because we now have an ArrayList rather than an Array, we can keep adding elements to the list.
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        arrayList.add("no error");
        System.out.println(arrayList.get(2));

        //This is how you replace elements at different indexes in the ArrayList.
        arrayList.set(0, "bye");

        for(String word: arrayList) {
            System.out.println(word);
        }
        

        
        //Example 4.
        //Passing by Value VS Passing by Reference
        String[] reference = {"Yenni", "Wilbert", "Kendrick", "Nick"};
        String element = "INFS1609";

        //This method aims to edit the values passed in
        editValue(reference);
        editValue(element);

        //Print out both things that were edited.
        print(reference);
        System.out.println(element);
        
    }

    public static void print(String[] words) {
        System.out.println();
        for(String word: words) {
            System.out.println(word);
        }
    }

    public static void print(int[] numbers) {
        for(int number: numbers) {
            System.out.print(number + " ");
        }
    }

    public static void print(boolean[] booleans) {
        for(boolean value: booleans) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void editValue(String[] array) {
        
        for(int i = 0; i < array.length; i++) {
            array[i] = "Replaced element"; 
        } 
    }

    public static void editValue(String words) {
        words = "I have replaced the original word";
    }
}
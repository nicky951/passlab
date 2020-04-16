//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/1OlPqDkllCmY1LUhnlPUnVeBmUWV-VJU5Qx7wbuGwQwE/edit?usp=sharing
import java.util.*;

public class lab7 {
    
    public static void main(String args[]) {

        human nick = new human("Nick", 70, "Australian", 21);
        chicken hen = new chicken("Hen", 1, 5, false);
        chicken rooster = new chicken("Rooster", 3, 0, true);

        ArrayList<animal> animalList= new ArrayList<animal>();

        animalList.add(nick);
        animalList.add(hen);
        animalList.add(rooster);

        for(animal thing: animalList) {
            System.out.println("This is edible:" + thing.checkEdible());
            thing.makeNoise();
        }

        System.out.print("\nThis is how you eat these animals\n" );
        hen.howToEat();
        rooster.howToEat();

    }
    
}
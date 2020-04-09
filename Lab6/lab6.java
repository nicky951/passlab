//DISCLAIMER:
//THESE EXAMPLES ARE CREATED BY NICHOLAS LIANG AS COMPLEMENTS TO INFS1609 PASS CLASS AND LECTURE CONTENT
//PLEASE DO NOT USE THESE AS SUBSTITUTES EXAMPLES FOR ANY CONTENT WITHIN THE LECTURE OR TUTORIALS
//UNDERSTANDING OF CONTENT SHOULD ALWAYS BE BASED OFF EXAMPLES THAT ARE COVERED IN LECTURES AND TUTORIALS
//USE AT YOUR OWN RISK.
//https://docs.google.com/document/d/1TTKurrqUXYFbw6TXC46F7UD9-LOpHCsDRBcPykZIPEY/edit?usp=sharing






import java.util.*;

public class lab6 {

    public static void main(String args[]) {

        ArrayList<Object> list = new ArrayList<Object>();
        ArrayList<String> courseList = new ArrayList<String>(Arrays.asList("INFS1609", "INFS2605", "INFS3634"));


        //an object is always based off a class
        //class is a blue print of the object
        //create 1 object based off the class-> creating 1 instance of that class
        person nick = new person("Nick", 1, true);//<refering to this as an object (This is 1 instance of that class)
        person colin = new student("Colin", 2, false, "INFS", 85);
        person wilbert = new lecturer("Wilbert", 3, true, courseList);
        person liz = new student("Liz", 4, false, "INFS", 90);
        
        person nick2 = nick;

        if(nick2.equals(nick)) {
            System.out.println("yes");
        }
        

        list.add(nick);
        list.add(wilbert);
        list.add(colin);
        list.add(liz);
        list.add("String");
        list.add(100);
        //list.add(nick2);

        //hashcode -> a number that the computer generates to basically identify an object
        for(Object object: list) {
            toStringRepresentation(object);
        }

        //polymorphism -> super and subtypes.
        //person is an object. (supertype is an object) -> Subtype is the person
        //student and lecturer-> (still referring to a person) -> we are refering to an object as well
        //a student can be all of the following: student, person or an object

    }

    //Example3.
    //This examples how polymorphism works.
    public static void toStringRepresentation(Object object) {
        System.out.println(object.toString());
    }

}
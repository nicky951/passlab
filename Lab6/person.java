import java.util.*;
public class person {

    protected String name;
    protected int id;
    protected boolean staff;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getStaff() {
        return this.staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }
    
    //Example1.
    //The "this" keyword.
    //The keyword refers to the current object in the methor or constructor. 
    //When we run this constructor, we are telling the computer when it compiles
    //that this attribute of the object instance is equals to whatever is passed into the parameters. 
    
    
    public person(String name, int id, boolean staff) {
        this.name = name;
        this.id = id;
        this.staff = staff;
    }
    
    //Confusion comes here.
    //Why do we not just name it different things?
    //You absolutely can!
    //This produces the exact same output as the other.
    //When this is run, the compiler implictly appends the keyword "this" infront of name.
    
    /*
    public person(String names, int ids, boolean staffs) {
        name = names;
        id = ids;
        staff = staffs;
    }
    */

    //Example2.
    //toString() method
    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", staff='" + getStaff() + "'" +
            "}";
    }
    
}
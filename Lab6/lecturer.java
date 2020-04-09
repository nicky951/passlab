import java.util.*;
public class lecturer extends person {

    ArrayList<String> courses = new ArrayList<String>();
    
    public ArrayList<String> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public lecturer (String name, int id, boolean staff, ArrayList<String> courses) {
        super(name, id, staff);
        this.courses = courses;
    }

    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", staff='" + getStaff() + "'" +
            " courses='" + getCourses() + "'" +
            "}";
    }
    

}
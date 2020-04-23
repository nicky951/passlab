
public class person {

    String name;
    int id;
    boolean staff;

    person(){
        this("No Name");
    }

    person(String name) {
        this(name, 0);
    }

    person(String name, int id) {
        this(name, id , false);
    }

    person(String name, int id, boolean staff) {
        this.name = name;
        this.id = id;
        this.staff = staff;
    }

    person(String name, boolean staff) {
        this.name = name;
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", id='" + this.id + "'" +
            ", staff='" + this.staff + "'" +
            "}";
    }

}
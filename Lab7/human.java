
public class human extends animal {

    private String nationality;
    private int age;

    public human(String name, int weight, String nationality, int age) {
        super(name, weight);
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("HAHAHAHA");
    }

    @Override
    public boolean checkEdible() {
        return false;
    }
 
}
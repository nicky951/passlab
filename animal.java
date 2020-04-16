
public abstract class animal {

    protected String name;
    protected int weight;

    public abstract void makeNoise();
    public abstract boolean checkEdible();

    public void move(int distance) {
        System.out.print("\n moved " + distance + " metres \n" );
    }

    public animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
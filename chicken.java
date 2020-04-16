
public class chicken extends animal implements edible {

    private int eggs;
    private boolean rooster;

    public chicken(String name, int weight, int eggs, boolean rooster) {
        super(name,weight);
        this.eggs = eggs;
        this.rooster = rooster;
    }

    @Override
    public void howToEat() {
        if(this.weight > 2 && this.rooster == true) {
            System.out.println("You can deep fry this chicken");
        } else {
            System.out.println("You can eat " + eggs + " eggs");
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("buck buck");
    }

    @Override
    public boolean checkEdible() {
        return edible;
    }


}
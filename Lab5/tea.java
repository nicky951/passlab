public class tea extends drink {

    private int temperature;
    private String teaLeaves;

    public tea(String name, int mLs, String manufacturer,int temperature, String teaLeaves) {
        super(name, mLs, manufacturer);
        this.temperature = temperature;
        this.teaLeaves = teaLeaves;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getTeaLeaves() {
        return this.teaLeaves;
    }

    public void setTeaLeaves(String teaLeaves) {
        this.teaLeaves = teaLeaves;
    }

    public void printDetails() {
        System.out.println(name + " is brewed at " + temperature + " degrees with " + teaLeaves + " leaves");
    }


}
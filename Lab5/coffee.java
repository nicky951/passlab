public class coffee extends drink {

    private double caffeine;
    private String beans;

    public double getCaffeine() {
        return this.caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }

    public String getBeans() {
        return this.beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public coffee(String name, int mLs, String manufacturer, double caffeine, String beans) {
        super(name, mLs, manufacturer);
        this.caffeine = caffeine;
        this.beans = beans;
    }

    public void  printDetails() {
        System.out.println(name + " is made from " + beans + " beans and has a caffeine dosage of " + caffeine);
    }

}
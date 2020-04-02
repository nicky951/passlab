import java.util.*;

public class drink {

    protected String name;
    protected int mLs;
    protected String manufacturer;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMLs() {
        return this.mLs;
    }

    public void setMLs(int mLs) {
        this.mLs = mLs;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public drink(String name, int mLs, String manufacturer) {
        this.name = name;
        this.mLs = mLs;
        this.manufacturer = manufacturer;
    }

    public void printDetails() {
        System.out.println(name + " is made by " + manufacturer + " at " + mLs + "mLs");
    }

}
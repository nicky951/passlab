import java.util.*;
public class student extends person {

    private String degree;
    private int wam;

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getWam() {
		return this.wam;
	}

	public void setWam(int wam) {
		this.wam = wam;
    }
    
    public student(String name, int id, boolean staff, String degree, int wam) {
        super(name, id, staff);
        this.degree = degree;
        this.wam = wam;
    }

    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", staff='" + getStaff() + "'" +
            " degree='" + getDegree() + "'" +
            ", wam='" + getWam() + "'" +
            "}";
    }
    

}
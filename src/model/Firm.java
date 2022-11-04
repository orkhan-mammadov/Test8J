package model;

import java.util.ArrayList;
import java.util.List;

public class Firm {

    private String name;
    private List<Employee> e = new ArrayList<>();
    private int emplAmount;

    public Firm(String name, int emplAmount) {
        this.name = name;
        this.emplAmount = emplAmount;
    }

    public Firm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmplAmount() {
        return emplAmount;
    }

    public void setEmplAmount(int emplAmount) {
        this.emplAmount = emplAmount;
    }

    public void add(Employee employee) throws Exception {
        if(e.size()<this.getEmplAmount())
            e.add(employee);
        else
            throw new Exception("Max size of employee has been reached!");
    }

    public List<Employee> getE() {
        return e;
    }

    @Override
    public String toString() {
        return "Firm: '" + name + '\'' +
                ", emplAmount= " + emplAmount +
                "\nEmployees: " + getE();
    }
}

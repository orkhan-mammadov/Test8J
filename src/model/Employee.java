package model;

public class Employee extends Human{

    private Double salary;

    public Employee(String name, String surname, Double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public Employee() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\n"+super.toString() + ", " +
                "salary= " + salary;
    }
}

import model.Employee;
import model.Firm;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jalal", "Mammadli",1200d);
        Employee e2 = new Employee("Jalal", "Mammadsiz",1100d);

        Firm firm = new Firm("Acc", 2);

        try {
            firm.add(e1);
            firm.add(e2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(firm);
    }
}
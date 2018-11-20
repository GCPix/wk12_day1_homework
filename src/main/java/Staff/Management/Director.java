package Staff.Management;

public class Director extends Manager{

//
//    Add a private property to store a double value budget.
//    Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
//    Create a getter method for this property.
//    Test all methods.

    private double budget;

    public Director(String name, String niNumber, Double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.salary*0.02;
    }
}

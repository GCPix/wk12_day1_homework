package Staff.Management;

public class Manager extends Staff.Employee{
//    Create a subclass of Employee called Manager in a package called management.
//    Create a class for Manager.
//    Add a property to store the department name in a property called deptName.
//    Create a constructor that includes all the parameters needed for Employee and deptName.
//    Add a getter method for deptName.
//    Test all methods including raiseSalary and payBonus

    private String deptName;

    public Manager(String name, String niNumber, Double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }



    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

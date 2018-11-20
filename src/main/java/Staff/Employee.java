package Staff;

    public abstract class Employee {
//    Create an abstract Employee parent class in a package called staff.
//    Employee will have a name, NI number and salary.
//    Create Getters for all properties.
//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
//    Add a method called payBonus which returns 1% of the employees salary.
//    Don't worry about testing just now until you create the subclasses.

        protected String name;
        protected String niNumber;
        protected Double salary;

        public Employee(String name, String niNumber, Double salary) {
            this.name = name;
            this.niNumber = niNumber;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
          if(name!=null&&name!="")
            this.name = name;
        }

        public String getNiNumber() {
            return niNumber;
        }

        public void setNiNumber(String niNumber) {
            this.niNumber = niNumber;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
        //    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
        public void raiseSalary(double increase){
            if (increase > 0){this.salary += increase;};

        }
        //    Add a method called payBonus which returns 1% of the employees salary.
        public double payBonus(){
            return this.salary*0.01;
        }
    }



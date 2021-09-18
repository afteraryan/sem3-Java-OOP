class Employee {
    protected String name;
    protected int empid;
    protected double salary;

    Employee(String name, int empid, double salary) {this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public double getSalary() {return this.salary;}

    public String getName() {
        return this.name;}

    public void increaseSalary(double percentage) {this.salary += salary * percentage / 100;}
}

class Manager extends Employee {private String department;

    Manager(String name, int empid, double salary, String department) {super(name, empid, salary);
        this.department = department;}

    public String getDepartment() {return this.department;}
}
//Design a class employee of an organization. An employee has a name, empid,and salary. 
//Write the default constructor, a constructor with parameters(name, empid, and salary) and 
//methods to return name and salary.
//Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage.
//Derive a subclass Manager from employee.
//Add an instance variable named department to the manager class. 
//Supply a test program that uses theses classes and methods.

class Employee {
    protected String name;
    protected int empid;
    protected double salary;

    Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void increaseSalary(double percentage) {
        this.salary += salary * percentage / 100;
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
public class Exp5 {
    public static void main(String[] args) {
        Employee A = new Employee("Bunty", 8118, 100);
        Manager B = new Manager("Bubly", 1881, 100, "Department 1");
        B.increaseSalary(25);
        System.out.println("Name: "+A.getName()+"\nSalary: "+A.getSalary());
        System.out.println("Name: "+B.getName()+"\nSalary: "+B.getSalary());
    }
}

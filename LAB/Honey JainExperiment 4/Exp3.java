//Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
//Every worker has a name and a salary rate. 
//Write method ComPay (int hours) to compute the week pay of every worker. 
//A Daily Worker is paid on the basis of the number of days he/she works. 
//The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. 
//Test this program to calculate the pay of workers. 
//You are expected to use the concept of polymorphism to write this program.

class Worker {

    protected String name;
    protected double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
}
class SalariedWorker extends Worker {

    private int hoursWorked;

    SalariedWorker(String name, double salaryRate, int hoursWorked) {
        super(name, salaryRate);
        this.hoursWorked = hoursWorked;
    }

    public double ComPay() {
        double salary = 40 * salaryRate;
        return salary;
    }
}
class DailyWorker extends Worker {

    private int daysWorked;

    DailyWorker(String name, double salaryRate, int daysWorked) {
        super(name, salaryRate);
        this.daysWorked = daysWorked;
    }

    public double ComPay() {
        double salary = daysWorked * salaryRate;
        return salary;
    }
}
public class Exp3 {
    public static void main(String[] args) {
        SalariedWorker one = new SalariedWorker("1", 686, 86);
        DailyWorker two = new DailyWorker("2", 656, 86);

        System.out.println("Salaried : "+one.ComPay());
        System.out.println("Daily : "+two.ComPay());
    }
}

//Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. 
//The charges depend on the duration and the type of the call. 
//Write a program using the concept of polymorphism in Java to calculate the charges.
class TrunkCall {
    protected int duration;

    TrunkCall(int duration) {this.duration = duration;}

    public int getDuration() {return this.duration;}

    public double cost() {return 0.0;}
}

class Ordinary extends TrunkCall {
    private static final double charge = 1.0;

    Ordinary(int duration) {super(duration);}

    public double cost() {return charge * duration;}
}

class Urgent extends TrunkCall {private static final double charge = 3.0;

    Urgent(int duration) {
        super(duration);
    }

    public double cost() {
        return charge * duration;
    }
}

class Lightning extends TrunkCall {
    private static final double charge = 5;

    Lightning(int duration) {
        super(duration);
    }

    public double cost() {
        return charge * duration;
    }
}
public class Exp4 {
    public static void main(String[] args) {
        TrunkCall x = new Ordinary(25);
        TrunkCall f = new Urgent(25);
        TrunkCall j = new Lightning(25);
        System.out.println("Ordinary: "+x.cost());
        System.out.println("Urgent: "+f.cost());
        System.out.println("Lightning: "+j.cost());

    }
}


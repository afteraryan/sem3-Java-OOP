//Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. 
//The charges depend on the duration and the type of the call. 
//Write a program using the concept of polymorphism in Java to calculate the charges.

class TrunkCall {
    protected int duration;

    TrunkCall(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public double cost() {
        return 0.0;
    }
}

class Ordinary extends TrunkCall {
    private static final double charge = 1.0;

    Ordinary(int duration) {
        super(duration);
    }

    public double cost() {
        return charge * duration;
    }
}

class Urgent extends TrunkCall {
    private static final double charge = 2.0;

    Urgent(int duration) {
        super(duration);
    }

    public double cost() {
        return charge * duration;
    }
}

class Lightning extends TrunkCall {
    private static final double charge = 2.5;

    Lightning(int duration) {
        super(duration);
    }

    public double cost() {
        return charge * duration;
    }
}
public class Exp4 {
    public static void main(String[] args) {
        TrunkCall a = new Ordinary(10);
        TrunkCall b = new Urgent(10);
        TrunkCall c = new Lightning(10);
        System.out.println("Cost of Ordinary Call: "+a.cost());
        System.out.println("Cost of Urgent Call: "+b.cost());
        System.out.println("Cost of Lightning Call: "+c.cost());

    }
}


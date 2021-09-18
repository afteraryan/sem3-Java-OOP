// Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class. 
class Player {
    protected String name;
    protected int age;
    protected double height;

    Player(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printDetails() {
        System.out.println("\nInfo of Player:");
        System.out.println("Name: "+name + "\n" +"Age: "+ age + "\n" + "Height: "+height);
    }
}

class Cricket_Player extends Player {
    private String team;
    private String position;

    Cricket_Player(String name, int age, double height, String team, String position) {
        super(name, age, height);
        this.team = team;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team: "+ team + "\n" +"Position: "+ position);
    }
}

class Football_Player extends Player {
    private String team;
    private String position;

    Football_Player(String name, int age, double height, String team, String position) {
        super(name, age, height);
        this.team = team;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team: "+team + "\n" +"Position: "+ position);
    }

}

class Hockey_Player extends Player {
    private String team;
    private String position;

    Hockey_Player(String name, int age, double height, String team, String position) {
        super(name, age, height);
        this.team = team;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team: "+team + "\n" +"Position: "+ position + "\n");
    }

}
public class Exp2 {
    public static void main(String[] args) {
        Player p = new Cricket_Player("Bobby", 54, 145, "Team1", "Bowler");
        p.printDetails();
        p = new Football_Player("Honey", 24, 335.5, "Team2", "Bowler");
        p.printDetails();
        p = new Hockey_Player("Sunny", 34, 64, "Team3", "Batsman");
    }
}

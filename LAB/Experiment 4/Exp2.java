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
        System.out.println("\nDetails of Player:");
        System.out.println("Name: "+name + "\n" +"Age: "+ age + "\n" + "Height: "+height);
    }
}

class Cricket_Player extends Player {
    private String teamName;
    private String position;

    Cricket_Player(String name, int age, double height, String teamName, String position) {
        super(name, age, height);
        this.teamName = teamName;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Name: "+teamName + "\n" +"Position: "+ position);
    }
}

class Football_Player extends Player {
    private String teamName;
    private String position;

    Football_Player(String name, int age, double height, String teamName, String position) {
        super(name, age, height);
        this.teamName = teamName;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Name: "+teamName + "\n" +"Position: "+ position);
    }

}

class Hockey_Player extends Player {
    private String teamName;
    private String position;

    Hockey_Player(String name, int age, double height, String teamName, String position) {
        super(name, age, height);
        this.teamName = teamName;
        this.position = position;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Name: "+teamName + "\n" +"Position: "+ position);
    }

}
public class Exp2 {
    public static void main(String[] args) {
        Player p = new Cricket_Player("Amar", 30, 190, "Team1", "Batsman");
        p.printDetails();
        p = new Football_Player("Akbar", 25, 200.5, "Team2", "Extras");
        p.printDetails();
        p = new Hockey_Player("Anthony", 40, 170, "Team3", "Bowler");
    }
}

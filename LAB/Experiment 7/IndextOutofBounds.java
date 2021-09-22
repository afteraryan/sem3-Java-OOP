class StudentRecords
{
    String Name;
    int RollNo;
    StudentRecords(){};
    StudentRecords(String n, int rollnumber)
    {
        Name = n;
        RollNo = rollnumber;
    }
    public void Print()
    {
        System.out.println("Name: " + Name + "\nRoll No: " + RollNo);
    }
}




public class IndextOutofBounds 
{
    public static void main(String[] args)
    {
        StudentRecords[] obj;   //Decalring Array
        obj = new StudentRecords[10];   //Assigning Size

        obj[0] = new StudentRecords("AryanSaxena",1);
        obj[1] = new StudentRecords("ChiragSingh",2);
        obj[2] = new StudentRecords("AarushiJain",3);
        obj[3] = new StudentRecords("RohitSharma",0);
        obj[4] = new StudentRecords("SarvagyaGupta",5);
        obj[5] = new StudentRecords("ManikaRajpal",6);
        obj[6] = new StudentRecords("AvinashKumar",7);
        obj[7] = new StudentRecords("AyushJuyal", 8);
        obj[8] = new StudentRecords("VeethikaEeti",9);
        obj[9] = new StudentRecords("Supandi",10);
    

        try 
        {
            obj[10] = new StudentRecords("Batman",11);
            obj[10].Print();
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array oversized: "  + e );
            System.out.println("Try less than 10!\n");
        }
    }
}

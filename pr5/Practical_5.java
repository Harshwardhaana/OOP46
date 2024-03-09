/*
Aim: Practical No.5   Author: harsh meshram Version: 5.5     Date: 27 Feb,2024
*/

class Emerging_Technologie 
{
    String principle;
    String vicePresident;
    String secretary;
    String jointSecretary;
    String treasurer;
    
    Emerging_Technologie(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) 
    {
        this.principle = principle;
        this.vicePresident = vicePresident;
        this.secretary = secretary;
        this.jointSecretary = jointSecretary;
        this.treasurer = treasurer;
    }

    void forum()
    {
        System.out.println("Principle: " + principle);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Joint Secretary: " + jointSecretary);
        System.out.println("Treasurer: " + treasurer);
    }
}
class AIML extends Emerging_Technologie 
{
    AIML(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) 
    {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class AIDS extends Emerging_Technologie
{
    AIDS(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class CSE extends Emerging_Technologie
{
    CSE(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

public class Practical_5 
{
    public static void main(String[] args) 
    {
        // Creating objects for each child class
        AIML aiml = new AIML("harsh", "Vedant Shende", "Peeyush Kaware", "Bhavesh More", "Samarth Sharma");
        AIDS aids = new AIDS("harsh", "Vedant Shende", "Peeyush Kaware", "Bhavesh More", "Samarth Sharma");
        CSE cse = new CSE("harsh", "Vedant Shende", "Peeyush Kaware", "Bhavesh More", "Samarth Sharma");

        // Calling forum function for each object
        System.out.println("AIML Forum:");
        aiml.forum();
        System.out.println("\nAIDS Forum:");
        aids.forum();
        System.out.println("\nCSE Forum:");
        cse.forum();
    }
}
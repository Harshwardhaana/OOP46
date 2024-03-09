class Main {

    public static void main(String[] argv) {
        CompanyData SBJIT = new CompanyData("Harsh Meshram", 18, "Male", 46);
        SBJIT.display();
    }
}

class CompanyData {

    String name;
    int age;
    String gender;
    int empid; // Change the data type to int

    // Default Constructor
    CompanyData() {
        System.out.println("Inside Default Constructor");
    }

    // Parameterized Constructor
    CompanyData(String ne, int ag, String gen, int en) {
        System.out.println("Inside Para. Constructor");
        this.name = ne;
        this.age = ag;
        this.gender = gen;
        this.empid = en; // Fix the typo and assign the correct value
    }

    // Display method
    public void display() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender + "\nEmp ID: " + this.empid);
    }
}

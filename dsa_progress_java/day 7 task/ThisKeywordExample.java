class NameAndRollno {
    String name;
    String rollno;

    // Constructor (name must match class name exactly)
    NameAndRollno(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void display() {
        System.out.println("Name: " + this.name + "\nRollno: " + this.rollno);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {

        NameAndRollno s1 = new NameAndRollno("Anjana", "24EC123");
        s1.display();
        System.out.println(s1.hashCode());

        NameAndRollno s2 = new NameAndRollno("Anjana", "24EC124");
        s2.display();
        System.out.println(s2.hashCode());
    }
}
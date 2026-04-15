class Encapsulation{
    int a;

    Encapsulation(){
        int b = a;
    }

    void display(){
        System.out.println("Implementation of Encapsulation"+b);
    }
}

public class encapsulationImplementation{
    public static void main(String[]args){
        Encapsulation e = new Encapsulation();
        e.display();
    }
}
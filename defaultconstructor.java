class dconstruct{
    dconstruct(int x){
        System.out.println("I am inside paramterized constructor");
    }
}
public class defaultconstructor{
    public static void main(String[] args){
        dconstruct obj=new dconstruct(5);
    }
}
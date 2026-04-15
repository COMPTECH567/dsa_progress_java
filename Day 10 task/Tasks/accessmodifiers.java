class AccessDemo {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // default (no modifier)

    public void show() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.show();

        // obj.privateVar ❌ not accessible directly
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
    }
}
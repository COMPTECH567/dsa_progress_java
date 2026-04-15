public class MultipleExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // ArithmeticException

            int arr[] = new int[3];
            arr[5] = 10; // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Index out of range");
        } catch (Exception e) {
            System.out.println("General Exception occurred");
        }

        System.out.println("Program continues...");
    }
}
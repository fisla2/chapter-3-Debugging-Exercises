public class DebugThree2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        // Check if y is not zero before performing the division
        if (y != 0) {
            int result = x / y;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");  // Handle the case when y is 0
        }
    }
}

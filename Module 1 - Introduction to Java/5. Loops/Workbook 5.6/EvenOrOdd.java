public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19.

        /*
         * Task 2
         * 
         * 1. If the number is even, print ' – even' beside the number.
         * 2. If the number is odd, print ' – odd' beside the number.
         * 
         */
        for (int i = 0; i <= 19; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " - even ");
            } else {
                System.out.print(i + " - odd ");
            }
        }

    }
}


public class PrintNumbers {
    public static void main(String[] args) {
        // Print column headers
        System.out.print("   |");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n----------------------------------------");

        // Print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }
}

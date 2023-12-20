import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println(" Please enter the first number: ");
        int n = s.nextInt();

         System.out.println(" Please enter the second number: ");
        int m = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= m) {
                // Check if it's the first or last row or the first or last column
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print two spaces for the hollow part
                }
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
    }
}



import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input on the keyboard
        System.out.print("Enter the number of rowsof matrix : ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of matrix : ");
        int n = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                first[c][d] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                second[c][d] = in.nextInt();
            }
        }

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                sum[c][d] = first[c][d] + second[c][d];
            }
        }
        // replace '+' with '-' to subtract matrices

        System.out.println("Sum of entered matrices : -");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}

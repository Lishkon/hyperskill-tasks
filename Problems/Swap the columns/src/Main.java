import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arrayToBeSwapped = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayToBeSwapped[i][j] = scanner.nextInt();
            }
        }

        int swap1 = scanner.nextInt(); // i
        int swap2 = scanner.nextInt(); // j

        int numToSwap1;
        int numToSwap2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numToSwap1 = arrayToBeSwapped[i][swap1];
                numToSwap2 = arrayToBeSwapped[i][swap2];
                arrayToBeSwapped[i][swap1] = numToSwap2; 
                arrayToBeSwapped[i][swap2] = numToSwap1; 
                break;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print (arrayToBeSwapped[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] rectArray = new int[n][m];

        // Filling in the array with the values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rectArray[i][j] = scanner.nextInt();
            }
        }

        // Rotating the array
        for (int i = 0; i < m ; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(rectArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
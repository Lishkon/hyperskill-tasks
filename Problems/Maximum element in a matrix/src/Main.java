import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] newArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArray[i][j] = scanner.nextInt();
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if (newArray[i][j] > maxValue) {
                    maxValue = newArray[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        String output = "";
        for (int a: result) {
            output += a + " ";
        }
        System.out.println(output.trim());

    }
}

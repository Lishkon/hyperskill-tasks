import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int[] inputs = new int[]{a,b,c};
        Arrays.sort(inputs);
        int maxnum = inputs[2];
        int count;
        if (a == maxnum) {
            count = 1;
        } else if (b == maxnum) {
            count = 2;
        } else {
            count = 3;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextDouble();
        int x = 0;
        while (m < k) {
            m = m * (1 + p);
            x++;
        }
        System.out.print(x);
    }
}
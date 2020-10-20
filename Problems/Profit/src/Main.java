import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        // M
        int inputAmount = scanner.nextInt();
        // P
        int depositPercentAmount = scanner.nextInt();
        // K
        int targetAmount = scanner.nextInt();

        int yearCount = 0;
        int tempAmount = inputAmount;

        do {
            tempAmount += (inputAmount*inputAmount)/depositPercentAmount;
            yearCount++;
        } while (tempAmount!=targetAmount);

        System.out.println(yearCount);
        // 1 + (1*(1/100))
    }
}
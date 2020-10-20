import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int amountOfBridges = scanner.nextInt();
        int currentHeight;
        boolean crashable = false;
        int bridgeNumber = 0;
        for (int i = 1; i <= amountOfBridges; i++) {
            currentHeight = scanner.nextInt();
            if (currentHeight <= busHeight && bridgeNumber == 0) {
                crashable = true;
                bridgeNumber = i;
            }
        }

        if (crashable) {
            System.out.println("Will crash on bridge " + bridgeNumber);
        } else {
            System.out.println("Will not crash");
        }
    }
}
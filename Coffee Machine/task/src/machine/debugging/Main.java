package machine.debugging;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("test");
            i = scanner.nextInt();
            if (i == 1) {
                System.out.println("first");
            } else if (i == 2) {
                System.out.println("second");
            } else {
                break;
            }
        } while (true);
    }
}

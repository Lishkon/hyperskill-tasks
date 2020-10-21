import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
                counter++;
                if (counter == input) {
                    break;
                }
            }
            if (counter == input) {
                break;
            }
        }

    }
}
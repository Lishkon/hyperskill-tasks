import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int collatz = input;
        System.out.print(input + " ");
        if (input != 1) {
            do {
                if (collatz % 2 == 0) {
                    collatz /= 2;
                } else {
                    collatz *= 3;
                    collatz += 1;
                }
                System.out.print(collatz + " ");
            } while (collatz != 1);
        }
    }
}
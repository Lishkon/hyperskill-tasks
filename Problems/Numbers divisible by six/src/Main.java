import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int LENGTH = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < LENGTH; i++) {
            int input = scanner.nextInt();
            if (input % 6 == 0) {
                sum+= input;
            }
        }
        System.out.println(sum);
    }
}
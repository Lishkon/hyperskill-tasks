import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        long product = num1;
        for (int i = num1+1; i < num2; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
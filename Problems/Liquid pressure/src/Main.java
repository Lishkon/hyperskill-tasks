import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double pressure = density * 9.8 * height;
        System.out.println(pressure);
    }
}
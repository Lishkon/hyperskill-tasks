import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double dist = scanner.nextDouble();
        double travelTime = scanner.nextDouble();
        double speed = dist / travelTime;
        System.out.println(speed);
    }
}
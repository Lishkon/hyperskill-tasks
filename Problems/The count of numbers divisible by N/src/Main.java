import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numN = scanner.nextInt();
        int count = 0;
        for (; numA <= numB; numA++) {
            if (numA % numN == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
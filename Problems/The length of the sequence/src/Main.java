import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            int input = scanner.nextInt();
            if (input != 0) {
                count++;
            } else {
                break;
            }
        } while (scanner.hasNext());
        System.out.println(count);
    }
}
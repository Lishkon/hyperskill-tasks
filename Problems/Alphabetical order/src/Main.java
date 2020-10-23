import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        boolean orderedFlag = true;
        for (int i = 0; i < tokens.length - 1; i++) {
            if (tokens[i].compareToIgnoreCase(tokens[i + 1]) > 0) {
                orderedFlag = false;
                break;
            }

        }
        System.out.println(orderedFlag);
    }
}
import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        String result = "";
        if (isNullOrEmpty(firstName) && !isNullOrEmpty(lastName)) {
            result = lastName;
        } else if (isNullOrEmpty(lastName) && !isNullOrEmpty(firstName)) {
            result = firstName;
        } else {
            result = firstName + " " + lastName;
        }
        return result;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
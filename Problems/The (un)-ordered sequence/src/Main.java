import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean asc = true;
        boolean desc = true;

        int num2;
        int num1 = sc.nextInt();
        while ((num2 = sc.nextInt()) != 0) {
            if (num1 > num2) {
                asc = false;
            } else {
                desc = false;
            }
            num1 = num2;
        }
        System.out.println(asc || desc);
    }
}
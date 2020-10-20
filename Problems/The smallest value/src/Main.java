import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long lValue = scanner.nextLong();
        System.out.println(reverseFactorial(lValue));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int reverseFactorial(long m) {
        int smallestValue = 0;
        for (long i = 0; i < m; i++) {
            if (factorial((int) i) > m) {
                smallestValue = (int) i;
                break;
            }
        }
        return smallestValue;

    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] inputs = new int[length];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }
        int maxNum = 0;
        int position = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (maxNum < inputs[i]) {
                maxNum = inputs[i];
                position = i;
            }
        }
        System.out.println(position);


    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int sum1 = (num1 % 10);
        int num2 = num1 / 10;
        int sum2 = num2 % 10;
        int sum3 = num2 /10;

        System.out.println(sum1 + sum2 + sum3);

    }
}
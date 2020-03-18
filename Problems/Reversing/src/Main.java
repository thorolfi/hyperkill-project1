import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num0 = scanner.nextInt(); // input

        int num1 = num0 / 100; // first digit
        int num2 = (num0 % 100) / 10; //second digit
        int num3 = num0 % 10; //third digit

        int reverse = 100*num3 + 10*num2 + num1; //reversed number

        System.out.println(reverse);

    }
}
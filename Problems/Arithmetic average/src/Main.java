import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double isDivisible = 0;
        double mode = 0;

        for (double i = a; i <= b; i++){
            if (i % 3 == 0) {
                isDivisible += i;
                mode++;
            }
        }
        System.out.println(isDivisible / mode);
    }
}
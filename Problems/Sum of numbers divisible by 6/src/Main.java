import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int divisibleSum = 0;
        int element;

        for (int i = 0; i < numberOfElements; i++) {
            element = scanner.nextInt();
            if (element % 6 == 0) {
                divisibleSum += element;
            }

        }
        System.out.println(divisibleSum);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(newString.substring(a, ++b));
    }
}
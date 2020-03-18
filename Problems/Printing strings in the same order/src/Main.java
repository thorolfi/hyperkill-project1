import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOne = scanner.nextLine(); // 1st string
        String lineTwo = scanner.nextLine(); // 2nd string
        int myInt1 = scanner.nextInt(); //int1
        int myInt2 = scanner.nextInt(); //int2

        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(myInt1);
        System.out.println(myInt2);
    }
}
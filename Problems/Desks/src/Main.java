import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classSize1 = scanner.nextInt();
        int classSize2 = scanner.nextInt();
        int classSize3 = scanner.nextInt();
        int desks = ((classSize1 / 2) + (classSize1 % 2)) + ((classSize2 / 2) + (classSize2 % 2)) + ((classSize3 / 2) +(classSize3 % 2));

        System.out.println(desks);
    }
}
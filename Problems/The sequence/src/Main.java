import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentMax = 0;

        while (scanner.hasNext()) {
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > currentMax) {
               currentMax = element;
            }
        } System.out.println(currentMax);
    }
}
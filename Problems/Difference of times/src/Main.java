import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int totalseconds1 = ((hours1 * 60 * 60) + (minutes1 * 60) + seconds1);

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int totalseconds2 = ((hours2 * 60 * 60) + (minutes2 * 60) + seconds2);

        System.out.println(totalseconds2 - totalseconds1);

    }
}
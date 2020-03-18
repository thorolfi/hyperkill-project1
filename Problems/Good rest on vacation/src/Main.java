import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        int totalCost = (flight * 2 + foodPerDay * days + (hotelCost * (days - 1)));
        System.out.print(totalCost);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            sum += num;
            if (num == 0 || sum >= 1000){
                break;
            }
        }
        if(sum < 1000){
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = input;
        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                count--;
                if(count == 0){
                    break;
                }
            } if(count == 0){
                break;
            }
        }
    }
}
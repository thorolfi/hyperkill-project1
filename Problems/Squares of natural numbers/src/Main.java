import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = scanner.nextInt();
        int currentValue = 1;
        while(currentValue * currentValue <= maxValue){
            System.out.println(currentValue * currentValue);
            currentValue ++;
        }
    }
}
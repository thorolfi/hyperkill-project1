import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 0;
        long nFactorial = 1;
        if (m == 0){
            System.out.println("0");
        } else {
            while (nFactorial <= m){
                n++;
                nFactorial *= n;
            } System.out.println(n);
        }
    }
}
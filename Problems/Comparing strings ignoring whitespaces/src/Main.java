import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String str1NoWhiteSpace = str1.replace(" ", "");
        String str2NoWhiteSpace = str2.replace(" ", "");
        System.out.println(str1NoWhiteSpace.equals(str2NoWhiteSpace));


    }
}
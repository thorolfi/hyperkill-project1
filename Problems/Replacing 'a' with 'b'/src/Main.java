import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.nextLine();

        String aTob = str.replace("a", "b");
        System.out.print(aTob);
    }
}
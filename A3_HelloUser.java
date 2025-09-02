import java.util.Scanner;

public class A3_HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println(); // print blank line
        System.out.println("Hello " + name + ".");

        scanner.close();
    }
}

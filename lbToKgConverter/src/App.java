import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pounds?\n");
        String lbs = scanner.nextLine();
        double doubleLbs = Double.parseDouble(lbs);
        System.out.printf("That is %f kilograms!", doubleLbs * 0.45359237);
    }
}

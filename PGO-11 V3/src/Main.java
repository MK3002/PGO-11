import java.util.Scanner;
public class Main {
    private static int[] numbers = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static int readNumber() throws NegativeNumberException {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        System.out.println("Array contents:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

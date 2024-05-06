import java.util.Scanner;

public class BinaryToDecimalOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number (binary): ");
        String binaryString = scanner.nextLine();
        scanner.close();
        int decimal = binaryToDecimal(binaryString);
        System.out.println("Decimal Number: " + decimal);
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }
    public static int binaryToDecimal(String binaryString) {
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }
    public static String decimalToOctal(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return octal;
    }
}

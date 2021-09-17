import java.util.Scanner;

public class octal {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to be converted to octal: ");
        int num = input.nextInt();

        String octalStr = Integer.toOctalString(num);
        System.out.println("Number to octal equivalent: " + octalStr);
    }
}

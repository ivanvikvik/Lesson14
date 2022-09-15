import java.util.Scanner;

public class Task01 {

    public static int findMaxDigit(int number){
        number = number < 0 ? -number : number;
//        number = Math.abs(number);

        int max = number % 10;
        number /= 10;

        while(number != 0) {
            int digit = number % 10;

            if (digit == 9) {
                max = digit;
                break;
            }

            if (digit > max) {
                max = digit;
            }

            number /= 10;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number: ");
        int num = scanner.nextInt();

        int digit = findMaxDigit(num);

        System.out.println("Max number digit is " + digit);
    }
}

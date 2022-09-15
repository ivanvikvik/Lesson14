// break continue return throw
//12346321 -> 6
//893456778 -> 9
//22222 -> 2

public class Task01 {
    public static void main(String[] args) {
        int number = 7234239;

        int max = number % 10;
        number /= 10;
//        int max = 0;

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

        System.out.println("Max number digit is " + max);
    }
}

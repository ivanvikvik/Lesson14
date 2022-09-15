import java.util.Scanner;

public class Task03 {

    public static String getAllEvenNumbers(int number) {
        String msg = "";

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                continue;
            }
            msg += i + " ";
            //....
        }

        return msg;
    }


    public static void main(String[] args) {

        int number = Task02.inputPositiveNumber();

        String result = getAllEvenNumbers(number);

        System.out.println(result);

    }
}

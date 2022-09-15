// 1234321
// 123321

// 12345 --> 54321
// 1) 12345 % 10 -> 5
// 2) 12345 / 10 -> 1234
// 3) 1234 % 10 -> 5 * 10 + 4
// 4) 1234 / 10 -> 123
// 5) 123 % 10 -> 54 * 10 + 3
// 6) 123 / 10 -> 12
// 7) 12 % 10 -> 543 * 10 + 2
// 8) 12 / 10 -> 1
// 7) 1 % 10 -> 5432 * 10 + 1
// 54321 == 12345 -> false
// 12321 == 12321 -> true

public class Task07 {

    public static boolean checkPalindrome(int number) {

        // fool proof ("защита от дурака")
        if (number <= 0) {
            return false;
        }

        int copy = number;
        int num = 0;

        while(copy > 9){
            num += copy % 10;
            num *= 10;
            copy /= 10;
        }

        num += copy;

        return num == number;
    }

    public static void main(String[] args) {
        int number = Task02.inputPositiveNumber();

        boolean result = checkPalindrome(number);

        String msg = result ? "Yes, number is palindrome"
                : "No, number isn't palindrome";

        System.out.println(msg);
    }
}

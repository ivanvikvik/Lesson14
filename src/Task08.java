public class Task08 {
    public static boolean checkEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        return a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
    }

    public static void main(String[] args) {
        int a = Task02.inputPositiveNumber();
        int b = Task02.inputPositiveNumber();
        int c = Task02.inputPositiveNumber();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = result ? "Yes, all numbers are even."
                : "No, some numbers aren't even";

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = result ? "Yes, all numbers are odd."
                : "No, some numbers aren't odd";

        System.out.println(msg);

    }
}

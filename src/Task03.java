// output only even (чётные) number
// with continue operator
public class Task03 {
    public static void main(String[] args) {
        int number = 50;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
            //....
        }

    }
}

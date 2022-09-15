// output only even (чётные) number
// with continue operator
public class Task05 {
    public static void main(String[] args) {
        int number = 50;

        byte b1 = 1;
        byte result = (byte) (b1 + b1);
        b1 = (byte) (b1 * 10);
        b1 *= 10;

        b1++;
        ++b1;

        b1--;
        --b1;

        for (int i = 2; i <= number; i += 2) {
            System.out.print(i + " ");
        }

        while (true) ;

    }
}

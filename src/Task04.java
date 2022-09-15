// output only even (чётные) number
// without continue operator
public class Task04 {
    public static void main(String[] args) {
        int number = 50;

        for (int i = 1; i <= number; i++) {
            if (!(i % 2 == 1)) {
                System.out.print(i + " ");
                //....
            }
        }

    }
}

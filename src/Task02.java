import java.util.Scanner;

public class Task02 {

    public static int inputPositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){
            System.out.print("Input positive number: ");
            number = scanner.nextInt();
            if (number > 0){
                break;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int number = inputPositiveNumber();
        System.out.println(number);
    }
}

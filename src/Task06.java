public class Task06 {

    public static String getPythagorasTable(int dimension){
        StringBuilder msg = new StringBuilder();

        for (int j = 1; j <= dimension; j++) {
            for (int i = 1; i <= dimension; i++) {
                msg.append(i * j).append("\t");
            }
            msg.append("\n");
        }

        return msg + "";
    }

    public static void main(String[] args) {
        int dimension = Task02.inputPositiveNumber();

        String result = getPythagorasTable(dimension);

        System.out.println(result);
    }
}

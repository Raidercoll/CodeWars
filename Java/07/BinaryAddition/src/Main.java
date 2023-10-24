public class Main {
    public static String binaryAddition(int a, int b) {
        int sumNumber = a+b;
        String res = "";

        do {
            res = sumNumber % 2 +"".concat(res);

            sumNumber = sumNumber / 2;

        } while (sumNumber >= 1);

        return res;
    };

    public static void main(String[] args) {
        String res = binaryAddition(2,2);

        System.out.println(res);
    }
}
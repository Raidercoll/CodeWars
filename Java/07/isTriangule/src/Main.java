public class Main {

    public static boolean isTriangle(int a, int b, int c){
        if (a == 0 || b == 0 || c == 0){
            return false;
        }

        int sumAB = a+b;
        int sumBC = b+c;
        int sumAC = a+c;

        if (sumAB <= c || sumBC <= a || sumAC <= b){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,3));
    }
}
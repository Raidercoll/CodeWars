import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String pigIt(String s) {
        String[] strSplit = s.split(" ");

        for (String str:
             strSplit) {
            String[] aux = str.split("");
            aux[aux.length-1] = aux[0];

        }

        return "";
    }

    public static void main(String[] args) {

    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static char findMissingLetter(char[] array) {
        char res = ' ';

        for (int i = 1; i < array.length; i ++){
            res = (int) array[i-1] + 1 == (int) array[i] ? ' ' : array[i+1];
        }

        return res;
    }

    public static void main(String[] args) {
        char[] list = ('a','b','c','d','f');
        char res = findMissingLetter(list);
        System.out.println(res);
    }
}
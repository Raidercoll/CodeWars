// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static char findMissingLetter(char[] array) {
        int res = 0;

        for (int i = 1; i < array.length; i ++){
            res = (int) array[i-1] + 1 == (int) array[i] ? res : (int) array[i] -1;
        }

        return res == 0 ? ' ' : (char) res;
    }

    public static void main(String[] args) {
        char[] list = {'O','Q','R','S'};
        char res = findMissingLetter(list);
        System.out.println(res);
    }
}
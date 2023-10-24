public class Main {

    public static boolean isIsogram(String str){
        char[] alphabet = new char[26];
        for(int i = 0; i < str.length(); i ++){
            char letter = str.toLowerCase().charAt(i);
            if(alphabet[(int) letter-97] == letter) {
                return false;
            }else {
                alphabet[(int) letter-97] = letter;
            }
        }
        return true;
    };

    public static boolean bestIsIsogram(String str){
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Hello"));

        System.out.println(isIsogram("Helo"));
    }
}
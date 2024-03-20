package Array;

public class Array1 {

    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "aba", "cfg", "madam"};

        for (String str : arr) {
            if (isPalindrome(str)) {
                System.out.println(str );
                break;
            }
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return str.equals(reversed.toString());
    }
}

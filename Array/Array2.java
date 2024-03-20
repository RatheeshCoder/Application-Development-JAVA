package Array;

public class Array2 {

    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "aaaa", "cbc"};
        
        int len = arr.length;
        System.out.print("Indices of 'a' in the array: ");
        for (int i = 0; i < len; i++) {
            String str = arr[i];
            int index = findIndex(str);
            if (index != -1) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static int findIndex(String str) {
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'a') {
                return i;
            }
        }
        return -1;
    }
}

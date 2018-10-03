import java.util.*;

/**
 * amar_strings
 */
public class amar_strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = input.next();
        System.out.println("Enter character");
        char c = input.next().charAt(0);
        char[] stringToChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (c == stringToChar[i]) {
                System.out.println("At Index of: "+(i+1)+" Yes");
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }

}
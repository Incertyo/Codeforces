import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Input string
        String c = "hello"; // Target word to form
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c.charAt(idx)) {
                idx++;
                if (idx == c.length()) { // Stop if all characters of 'hello' are found
                    break;
                }
            }
        }

        System.out.println(idx == c.length() ? "YES" : "NO");
    }
}
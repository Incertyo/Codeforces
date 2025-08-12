import java.util.Locale;
import java.util.Scanner;

public class Capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        s=(s.charAt(0)+"").toUpperCase()+s.substring(1);
        System.out.println(s);
    }
}

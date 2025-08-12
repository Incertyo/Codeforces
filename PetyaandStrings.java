import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String t = sc.next().toLowerCase();

        int result = s.compareTo(t);

        if(result < 0) {
            System.out.println(-1);
        } else if(result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}

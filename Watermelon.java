import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b =sc.nextByte();
        String s = (b%2==0&&b>2)?"YES":"NO";
        System.out.println(s);
    }
}

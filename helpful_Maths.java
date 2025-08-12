import java.util.Arrays;
import java.util.Scanner;

public class helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().replace("+","");
        char []c=input.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++){
            System.out.print(c[i]+"+");
        }
        System.out.println(c[c.length-1]);
    }
}

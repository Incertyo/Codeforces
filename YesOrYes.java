import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -->0){
            String s = sc.next().toUpperCase();
            if(s.equals("YES")){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

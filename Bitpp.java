import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.charAt(0)=='+'||s.charAt(2)=='+'){
                c++;
            }
            if(s.charAt(0)=='-'||s.charAt(2)=='-'){
                c--;
            }
        }
        System.out.println(c);

    }
}

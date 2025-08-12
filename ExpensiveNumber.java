import java.util.Scanner;

public class ExpensiveNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            String s=sc.next();
            int n = s.length();
            int z=0,best=0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='0'){
                    z++;
                }
                else{
                    best=Math.max(z+1,best);
                }
            }
            System.out.println(n-best);
        }
    }
}

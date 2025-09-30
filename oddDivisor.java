import java.util.Scanner;

public class oddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -->0) {
            long val=sc.nextLong();
            int c=0;
            while(val>0){
                if((val&1)==1){
                    c++;
                }
                val=val>>1;
            }
            System.out.println((c==1)?"NO":"YES");
        }
    }
}

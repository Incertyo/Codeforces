import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long c=0;
        while(n!=0){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
        System.out.println(c);
    }
}

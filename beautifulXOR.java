import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beautifulXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while (loop-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xor = a ^ b;
            if (a < b) {
                System.out.println(-1);
            } else if (a == b) {
                System.out.println(0);
            } else if(xor<=a) {
                System.out.println(1);
                System.out.println(xor);
            }
            else{
                for(int i=0;i<32;i++){
                    long bit=1<<i;
                    if(bit<=a){
                        long c=a^bit;
                        long x2=c^b;
                        if(x2<c){
                            System.out.println(2);
                            System.out.println(bit+" "+x2);
                        }
                    }
                }

            }
        }
    }
}

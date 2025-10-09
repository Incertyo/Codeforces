import java.util.HashSet;
import java.util.Scanner;

public class LongestDivisorinterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            Long n= sc.nextLong();
            int c=0;
            int max=0;
            for(int i=1;i<=(int)Math.sqrt(n)+1;i++){
                if(n%i==0){
                        c++;
                        max=Math.max(max,c);
                    }
                    else{
                        break;
                    }
                }
            System.out.println(max);
        }
    }
}

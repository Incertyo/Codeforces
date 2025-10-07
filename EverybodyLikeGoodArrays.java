import java.util.Scanner;

public class EverybodyLikeGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            long []arr= new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            int c=0;
            for(int i=0;i<n-1;i++){
                if(((arr[i]^arr[i+1])&1)==0){
                    c++;
                }
            }
            System.out.println(c);

        }
    }
}

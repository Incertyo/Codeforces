import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int q= sc.nextInt();
            long[] arr = new long[n];
            long sum=0;
            long[]presum=new long[n+1];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                sum+=arr[i];
                presum[i+1]=sum;
            }
            long actual_sum=sum;
            for(int i=0;i<q;i++) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();
                long currSubsum=presum[(int)r]-presum[(int)l-1];
                long newsum=actual_sum-currSubsum+(k*(r-l+1));
                if(newsum%2==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
    }
}

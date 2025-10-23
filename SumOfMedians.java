import java.util.Scanner;

public class SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int median=Math.ceilDiv(n,2);
            long[] arr=new long[n*k];
            for(int i=0;i<n*k;i++){
                arr[i]=sc.nextLong();
            }
            long sum=0;
            int gap=n-median+1;
            int i=arr.length-gap;
            for(int j=0;j<k;j++){
                sum+=arr[i];
                i=i-gap;
            }
            System.out.println(sum);

        }
    }
}

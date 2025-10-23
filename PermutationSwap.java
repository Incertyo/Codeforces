import java.util.Scanner;

public class PermutationSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=Math.abs(arr[0]-1);
            for(int i=1;i<n;i++){
                k=gcd(k,Math.abs(arr[i]-(i+1)));
            }
            System.out.println(k);

        }
    }

    private static int gcd(int a, int b) {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}

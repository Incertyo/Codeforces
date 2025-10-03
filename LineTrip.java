import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int x=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int[]arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            max=Math.abs(0-arr[0]);
            for(int i=0;i<n-1;i++){
            max=Math.max(max,Math.abs(arr[i]-arr[i+1]));
            }
            max=Math.max(max,2*Math.abs(arr[n-1]-x));
            System.out.println(max);

        }
    }
}

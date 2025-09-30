import java.util.Scanner;

public class Holiday_OF_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n--];
        int max=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        int ans=0;
        for(int i=0;i< arr.length;i++){
            ans+=(max-arr[i]);
        }
        System.out.println(ans);
    }
}

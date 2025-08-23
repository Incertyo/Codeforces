import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop=sc.nextInt();
        int[]arr= new int[loop];
        for(int i=0;i<loop;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        int l=0,r=arr.length-1;
        while(r>=0&&l<arr.length){
            if(arr[l]>0&&l<=r){
                ans-=arr[l];
                if(arr[r]<0){
                    ans-=arr[r];
                }
            }
            else if (arr[r]<0){
                ans-=arr[r];
            }
            l++;
            r--;
        }
        System.out.println(ans);
    }
}

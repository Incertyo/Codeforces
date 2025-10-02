import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            byte []arr= new byte[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextByte();
            }
            int l=0,r=0;
            int sum=0;
            int len=0;
            while(r<arr.length){
                sum+=arr[r];
                while(sum>0&&l< arr.length){
                    sum-=arr[l++];
                }
                if(sum==0){
                    len=Math.max(len,r-l+1);
                }
                r++;
            }
            System.out.println(len);
        }
    }
}

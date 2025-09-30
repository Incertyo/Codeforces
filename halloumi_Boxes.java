import java.util.Arrays;
import java.util.Scanner;

public class halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop= sc.nextInt();
        while( loop -->0){
            int n = sc.nextInt();
            int k= sc.nextInt();
            int[]arr= new int [n];
            int i=0;
            while( n -->0){
                arr[i++]=sc.nextInt();
            }
            boolean chk= true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    chk=false;
                    break;
                }
            }
            if(chk){
                System.out.println("YES");
            }
            else{
                if(k==1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}

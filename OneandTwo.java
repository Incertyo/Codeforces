import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]arr= new int[n];
            int[]pre_sum=new int[n];
            int min=-1,total=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==2)total++;
                if(i==0){
                    pre_sum[0]=arr[0]==2?1:0;
                }
                else{
                    pre_sum[i]=pre_sum[i-1]+((arr[i]==2)?1:0);
                }
            }
            if(total%2==1){
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n;i++){
                if(2*pre_sum[i]==total){
                        min=i+1;
                        break;
                }
            }
            System.out.println(min);
        }
    }
}

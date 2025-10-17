import java.util.Scanner;

public class LuntikandSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int count0=0;
            int count1=0;
            for(int i=0;i<n;i++){
                long num=sc.nextLong();
                if(num==0){
                    count0++;
                }
                else if(num==1){
                    count1++;
                }
            }
            System.out.println((long)(Math.pow(2,count0)*count1));

        }
    }
}

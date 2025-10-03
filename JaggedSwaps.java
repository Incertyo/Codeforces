import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num<min){
                    min=num;
                    idx=i;
                }
            }
            if(idx!=0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}

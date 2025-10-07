import java.util.Scanner;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int mask=0;
            for(int i=0;i<n;i++){
                mask^=sc.nextInt();
            }
            if((n%2)==1){
                System.out.println(mask);
            }
            else if(n%2==0 && mask==0){
                System.out.println(mask);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}

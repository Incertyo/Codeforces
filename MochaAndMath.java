import java.util.Scanner;

public class MochaAndMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            long ans=~0;
            for(int i=0;i<n;i++){
                ans&=sc.nextLong();
            }
            System.out.println(ans);
        }
    }
}

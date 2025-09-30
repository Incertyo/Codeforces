import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -->0){
            int ans =0;
            for(int i=0;i<3;i++){
                ans=ans^sc.nextInt();
            }
            System.out.println(ans);
        }
    }
}

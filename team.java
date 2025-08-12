import java.util.Scanner;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<3;j++){
                c+=sc.nextInt();
            }
            if(c>1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

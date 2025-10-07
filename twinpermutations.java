import java.util.Scanner;

public class twinpermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]ans=new int[n];
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                ans[i]=n+1-num;
            }
            for(int e:ans){
                System.out.print(e+" ");
            }
            System.out.println();

        }
    }
}

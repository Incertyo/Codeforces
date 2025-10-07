import java.util.Scanner;

public class twopermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b+2<=n||(a==b&&b==n)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

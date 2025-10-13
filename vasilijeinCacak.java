import java.util.Scanner;

public class vasilijeinCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long n= sc.nextLong();
            long k= sc.nextLong();
            long x=sc.nextLong();
            long min= k*(k+1)/2;
            long mxi=(n*(n+1)/2)-((n-k)*(n-k+1)/2);
            if(x>=min && x<=mxi){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}

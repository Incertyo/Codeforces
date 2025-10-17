import java.util.Scanner;

public class JellyfishandUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            int n= sc.nextInt();
            long[]arr=new long[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextLong();
            long c=b;
            for(int i=0;i<n;i++){
                c+=Math.min(arr[i],a-1);
            }
            System.out.println(c);
        }
    }
}

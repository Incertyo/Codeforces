import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num%2==1)c++;
            }
            if((c&1)==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}

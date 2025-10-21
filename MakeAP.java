import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            long c= sc.nextLong();
            long na= 2*b-c;
            double nb= (a+c)/2;
            boolean chk=false;
            if(na%a==0&&na/a>0) {
                chk = true;
            }
            if(nb%b==0&&nb/b>0&&(c-a)%2==0) {
                chk = true;
            }
            long nc= 2*b-a;
            if(nc%c==0&&nc/c>0) {
                chk = true;
            }
           if(chk){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }

        }
    }
}

import java.util.Scanner;

public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            long x= sc.nextLong();
            long min=0;
            long max=0;
            for(int i=0;i<n;i++){
                long num=sc.nextLong();
                min+=num;
                max+=Math.ceil(num*1.0/x);
            }
            long minv=(long)Math.ceil(min*1.0/x);
            System.out.println(minv+" "+max);

        }
    }
}

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int min=Integer.MAX_VALUE;
        while(loop -->0){
            int num=sc.nextInt();
            min=Math.min(min,Math.abs(num));
        }
        System.out.println(min);
    }
}

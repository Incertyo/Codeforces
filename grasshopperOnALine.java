import java.util.Scanner;

public class grasshopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int x= sc.nextInt();
            int k= sc.nextInt();
            if((x%k)==0){
                System.out.println(2);
                System.out.println(1+" "+(x-1));
            }
            else{
                System.out.println(1);
                System.out.println(x);
            }
        }
    }
}

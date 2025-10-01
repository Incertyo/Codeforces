import java.util.Scanner;

public class eXTREMELYROUND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
           int length=(int)Math.floor(Math.log10(n))+1;
            int ans= (int) ((n/Math.pow(10,length-1))+9*(length-1));
            System.out.println(ans);
        }
    }
}

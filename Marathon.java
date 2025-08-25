import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop= sc.nextInt();
        while(loop -->0){
            int tim = sc.nextInt();
            int c=0;
            for(int i=0;i<3;i++){
                if(sc.nextInt()>tim){
                    c++;
                }
            }
            System.out.println(c);
        }

    }
}

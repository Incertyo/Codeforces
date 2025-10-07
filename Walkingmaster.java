import java.util.Scanner;

public class Walkingmaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();
            int c=0;
            if(y2<y1){
                System.out.println(-1);
            }else {
                int path= y2-y1;
                x1+=path;
                if(x1<x2){
                    System.out.println(-1);
                    continue;
                }
                else{
                    path+=x1-x2;
                    System.out.println(path);
                }
            }
        }
    }
}

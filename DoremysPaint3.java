import java.util.HashSet;
import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            HashSet<Integer> unique= new HashSet<>();
            for(int i=0;i<n;i++){
                unique.add(sc.nextInt());
            }
            if(unique.size()==1){
                System.out.println("Yes");
            }
            else if(unique.size()<3){
                if(n<=3){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }
    }
}

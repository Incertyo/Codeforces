import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            int x= sc.nextInt();
            HashSet<Integer>set = new HashSet<>();
            set.add(0);
            ArrayList<Integer>list= new ArrayList<>();
            int max=0;
            for(int i=1;i<=k;i++){
                if(i!=x){
                    set.add(i);
                    max=i;
                }
            }
            if(max!=0&&set.contains(n%max)){
                for(int i=0;i<n/max;i++){
                    list.add(max);
                }
                if(n%max!=0){
                    list.add(n%max);
                }
                System.out.println("YES");
                System.out.println(list.size());
                for(int e:list){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

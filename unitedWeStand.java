import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class unitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]a= new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
            }
            List<Integer>b=new ArrayList<>();
            List<Integer>c=new ArrayList<>();
            for(int e:a){
                if(e==max){
                    c.add(e);
                }
                else{
                    b.add(e);
                }
            }
            if(b.size()==0){
                System.out.println(-1);
            }
            else{
                System.out.println(b.size()+" "+c.size());
                for(int e:b){
                    System.out.print(e+" ");
                }
                System.out.println();
                for(int e:c){
                    System.out.print(e+" ");
                }
                System.out.println();
            }


        }
    }
}

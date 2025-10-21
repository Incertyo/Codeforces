import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class beautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            String s= sc.next();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    continue;
                }
                else{
                    list.add(i+1);
                }
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}

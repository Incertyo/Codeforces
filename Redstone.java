import java.util.HashSet;
import java.util.Scanner;

public class Redstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t -->0){
            int gears = sc.nextInt();
            HashSet<Integer>set = new HashSet<>();
            boolean chk=false;
            for(int i=0;i<gears;i++){
                int val= sc.nextInt();
                if(set.contains(val)){
                    chk=true;
                }
                set.add(val);
            }
            if(chk){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class iwannabetheguy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int p= sc.nextInt();
        while(p -->0){
            set.add(sc.nextInt());
        }
        int q= sc.nextInt();
        while(q -->0){
            set.add(sc.nextInt());
        }
        System.out.println((set.size()==n)?"I become the guy.":"Oh, my keyboard!");
    }
}

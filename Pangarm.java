import java.util.HashSet;
import java.util.Scanner;

public class Pangarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<26){
            System.out.println("NO");
        }
        else{
            String s = sc.next().toLowerCase();
            HashSet<Character> set = new HashSet<>();
            for(int i =0;i<n;i++){
                set.add(s.charAt(i));
            }
            System.out.println((set.size()==26)?"YES":"NO");

        }
    }
}

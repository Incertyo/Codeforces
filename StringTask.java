import java.util.Scanner;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        s=s.replace("a","");
        s=s.replace("e", "");
        s=s.replace("i","");
        s=s.replace("o","");
        s=s.replace("u","");
        s=s.replace("y","");
        String ans="";
        for(int i =0;i<s.length();i++){
            ans=ans+"."+s.charAt(i);
        }
        System.out.println(ans);
    }
}

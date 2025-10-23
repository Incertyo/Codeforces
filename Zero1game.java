import java.util.Scanner;

public class Zero1game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
           String s = sc.next();
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    c++;
                }
            }
            int ans=Math.min(c,s.length()-c);
            System.out.println(ans%2==0?"NET":"DA");
        }
    }
}

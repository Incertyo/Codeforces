import java.util.Scanner;

public class ComparisionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            String s= sc.next();
            int max=1;
            int l=0,r=0;
            while(r<s.length()-1){
                r++;
                if(s.charAt(r)==s.charAt(l)){
                    max=Math.max(max,r-l+1);
                }
                else{
                    l=r;
                }
            }
            System.out.println(max+1);

        }
    }
}

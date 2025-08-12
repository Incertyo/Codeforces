import java.util.Scanner;
import java.util.Stack;

public class sumofroundnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer> st=new Stack<>();
            int n=sc.nextInt();
            int ans=0;
            int mul=1;
            while(n>0){
                ans=n%10*mul;
                if(ans!=0){st.push(ans);}
                n=n/10;
                mul=mul*10;
            }
            System.out.println(st.size());
            while(st.size()>0){
                System.out.print(st.pop()+" ");
            }
            System.out.println();
        }
    }
}

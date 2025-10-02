import java.util.Scanner;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            String s= sc.next();
            int i=0;
            int j=s.length()-1;
            while(i<j){
                int l=Integer.parseInt(s.charAt(i)+"");
                int r=Integer.parseInt(s.charAt(j)+"");
                if((l^r)!=1){
                    break;
                }
                i++;
                j--;
            }
            System.out.println(j-i+1);
        }
    }
}

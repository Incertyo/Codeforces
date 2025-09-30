import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int n = sc.nextInt();
            int pos=0;
            int neg=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num>0) pos++;
                else neg++;
            }
            int c=0;
            while(pos<neg | neg%2!=0){
                c++;
                pos++;
                neg--;
            }
            System.out.println(c);

        }
    }
}

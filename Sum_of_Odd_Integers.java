import java.util.Scanner;

public class Sum_of_Odd_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]= new int[n][2];
        for(int i=0;i<arr.length;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a%2!=b%2)||(b>(Math.sqrt(a)))){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}

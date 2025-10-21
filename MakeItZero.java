import java.util.Scanner;

public class MakeItZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            byte []arr=new byte[n];
            int xor=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextByte();
                xor^=arr[i];
            }
                if(n%2==0){
                    System.out.println(2);
                    System.out.println(1+" "+n);
                    System.out.println(1+" "+n);
                }
                else{
                    System.out.println(4);
                    System.out.println(1+" "+(n-1));
                    System.out.println(1+" "+(n-1));
                    System.out.println(n-1+" "+(n));
                    System.out.println(n-1+" "+(n));
                }

        }
    }
}

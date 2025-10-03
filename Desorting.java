import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean eq=false;
            boolean chk=false;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    eq=true;
                    break;
                }
                else if(arr[i]>arr[i+1]){
                    chk=true;
                    break;
                }
                else{
                    min=Math.min(min,(arr[i+1]-arr[i])/2+1);
                }
            }
            if(eq){
                System.out.println(1);
            }
            else if(chk){
                System.out.println(0);
            }
            else{
                System.out.println(min);
            }

        }
    }
}

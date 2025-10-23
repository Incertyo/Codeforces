import java.util.Scanner;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean chk=false;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        if(arr[i]<arr[j]&&arr[j]>arr[k]){
                            System.out.println("YES");
                            System.out.println((i+1)+" "+(j+1)+" "+(k+1));
                            chk=true;
                        }
                        if(chk)break;
                    }
                    if(chk)break;
                }
                if(chk)break;
            }
            if(!chk){
                System.out.println("NO");
            }

        }
    }
}

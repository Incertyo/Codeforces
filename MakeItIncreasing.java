import java.util.Scanner;

public class MakeItIncreasing {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int loop = sc.nextInt();
    while(loop -->0){
        int n= sc.nextInt();
        long[]arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        boolean chk=false;
        for(int j=0;j<n-1;j++){
            if(arr[j]<=arr[j+1]){
                chk=true;
                break;
            }
        }
        if(n==1){
            System.out.println(0);

        }

        else if (!chk){
            System.out.println(-1);
        }
        else{
            int c=0;
            while(chk){
                for(int i=n-1;i>0;i--){
                    if(arr[i]<=arr[i-1]){
                        arr[i-1]/=2;
                        c++;
                    }
                }
                for(int j=0;j<n-1;j++){
                    if(arr[j]<arr[j+1]){
                        chk=false;
                        break;
                    }
                    if(arr[j]==0&&arr[j+1]==0){
                        System.out.println(-1);
                        break;
                    }
                }

            }
            System.out.println(c);
        }

    }
}}

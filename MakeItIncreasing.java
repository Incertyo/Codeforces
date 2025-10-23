import java.util.Scanner;

public class MakeItIncreasing {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int loop = sc.nextInt();
    while (loop-- > 0) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        boolean flag = true;
        int c = 0;
        if (n == 1) {
            System.out.println(0);
        } else  {

            for (int i = n - 2; i >=0; i--) {
                while (arr[i+1] <= arr[i ]) {
                    if(arr[i+1]==0){
                        flag = false;
                        break;
                    }
                    arr[i ] /= 2;
                    c++;
                }
                if(!flag){
                    break;
                }
            }
            if(flag){

                System.out.println(c);
            }
            else{
                System.out.println(-1);
            }
        }


    }
}}

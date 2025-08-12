import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = arr1[0];
        int key = arr1[1];
        int c =0;

        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            if(i==key){
                c=key;
            }
        }
        for (int i = c; i < arr2.length; i++) {
            if(arr2[key]==0){
                c=0;
                break;
            }
            if (arr2[i]==arr2[key]&&arr2[key]>0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

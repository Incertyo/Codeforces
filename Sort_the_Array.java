import java.util.Arrays;
import java.util.Scanner;
public class Sort_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l_idx = -1, r_idx = -1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                l_idx = j;
                break;
            }
        }
        for (int j = n - 1; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                r_idx = j;
                break;
            }
        }
        if (l_idx == -1 && r_idx == -1) {
            System.out.println("yes\n1 1");
            return;
        }
        int left = l_idx, right = r_idx;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        boolean b = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("yes\n" + (l_idx + 1) + " " + (r_idx + 1));
        } else {
            System.out.println("no");
        }
    }
}

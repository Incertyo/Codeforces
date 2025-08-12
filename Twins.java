import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int sum = 0;
        int count = 0;
        int target = total / 2;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum > target) {
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }
}

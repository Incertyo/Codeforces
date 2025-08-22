import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TheCunningSellerEZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int num = sc.nextInt();
            List<Integer> map = new ArrayList<>();
            while (num > 0) {
                int res = maxpow(num);
                map.add(res);
                num -= res;
            }
            long totalCost = 0;
            for (int val : map) {
                totalCost += calc(val);
            }
            System.out.println(totalCost);
        }
    }

    private static int maxpow(int num) {
        int power = 1;
        while (power * 3 <= num) {
            power *= 3;
        }
        return power;
    }
    private static long calc(int val) {
        int x = (int) Math.round(Math.log(val) / Math.log(3));
        long part1 = (long) Math.pow(3, x + 1);
        long part2 = x * (long) Math.pow(3, x - 1);
        return part1 + part2;
    }
}
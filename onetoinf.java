import java.util.Scanner;
public class onetoinf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 0; t < tc; t++) {
            long N = sc.nextLong();
            long ds = 0;
            int dl = 1;
            long currnum = 1;
            while (true) {
                long cinB = 9 * (long) Math.pow(10, dl - 1);
                long tdigits = cinB * dl;
                if (N >= tdigits) {
                    for (long i = currnum; i < currnum + cinB; i++) {
                        ds += sumDigits(i);
                    }
                    N -= tdigits;
                    currnum += cinB;
                    dl++;
                } else {
                    long ntotake = N / dl;
                    long excessdig = N % dl;
                    for (long i = currnum; i < currnum + ntotake; i++) {
                        ds += sumDigits(i);
                    }
                    if (excessdig > 0) {
                        String lastNum = Long.toString(currnum + ntotake);
                        for (int i = 0; i < excessdig; i++) {
                            ds += lastNum.charAt(i) - '0';
                        }
                    }
                    break;
                }
            }
            System.out.println(ds);
        }
    }

    static int sumDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
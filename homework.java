
    import java.util.Scanner;

    public class homework {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int loop = sc.nextInt();
            for (int i = 0; i < loop; i++) {
                int a_len = sc.nextInt();
                String a = sc.next();
                int b_len = sc.nextInt();
                String b = sc.next();
                String Comp = sc.next();
                StringBuffer result = new StringBuffer(a);
                for (int j = 0; j < b_len; j++) {
                    if (Comp.charAt(j) == 'V') {
                        result.insert(0, "" + b.charAt(j));
                    } else if (Comp.charAt(j) == 'D') {
                        result.append(b.charAt(j));
                    }
                }
                System.out.println(result.toString());
            }
        }
    }


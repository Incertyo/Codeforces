import java.util.HashSet;
import java.util.Scanner;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            Long a= sc.nextLong();
            Long b= sc.nextLong();
            Long xk= sc.nextLong();
            Long yk= sc.nextLong();
            Long xq= sc.nextLong();
            Long yq= sc.nextLong();
            HashSet<Long[]> set_k = new HashSet<>();
            Long i = a;

            long i1 = b;
            set_k.add(new Long[]{xk+ i,yk+ i1});
            set_k.add(new Long[]{yk+ i1,xk+ i});
            set_k.add(new Long[]{xk+ i,yk- i1});
            set_k.add(new Long[]{yk- i1,xk+ i});
            set_k.add(new Long[]{xk- i,yk+ i1});
            set_k.add(new Long[]{yk+ i1,xk- i});
            set_k.add(new Long[]{xk- i,yk- i1});
            set_k.add(new Long[]{yk- i1,xk- i});

            HashSet<Long[]> set_q = new HashSet<>();
            set_q.add(new Long[]{xq+ i,yq+ i1});
            set_q.add(new Long[]{yq+ i1,xq+ i});
            set_q.add(new Long[]{xq+ i,yq- i1});
            set_q.add(new Long[]{yq- i1,xq+ i});
            set_q.add(new Long[]{xq- i,yq+ i1});
            set_q.add(new Long[]{yq+ i1,xq- i});
            set_q.add(new Long[]{xq- i,yq- i1});
            set_q.add(new Long[]{yq- i1,xq- i});
            HashSet<Long[]> inter= new HashSet<>(set_k);
            inter.retainAll(set_q);
            System.out.println(inter.size());
        }
    }
}

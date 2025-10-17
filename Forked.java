import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
class Pair implements Comparable<Pair>{
    long a,b;
    Pair(long a,long b){
        this.a=a;
        this.b=b;
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        // Two pairs are equal if both coordinates are equal.
        return a == pair.a && b == pair.b;
    }

    @Override
    public int hashCode() {
        // Simple hash code generation for two long values
        return Objects.hash(a, b);
    }

    // You can remove compareTo since it's not needed for your current logic.
    // If you must keep it, the correct logic for sorting would be:
    @Override
    public int compareTo(Pair Other) {
        if (this.a != Other.a) {
            return Long.compare(this.a, Other.a); // Sort by 'a' first
        }
        return Long.compare(this.b, Other.b); // Then by 'b'
    }
}
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
            HashSet<Pair> set_k = new HashSet<>();
            Long i = a;

            long i1 = b;
            set_k.add(new Pair(xk+ i,yk+ i1));
            set_k.add(new Pair(yk+ i1,xk+ i));
            set_k.add(new Pair(xk+ i,yk- i1));
            set_k.add(new Pair(yk- i1,xk+i ));
            set_k.add(new Pair(xk- i,yk+ i1));
            set_k.add(new Pair(yk+ i1,xk- i));
            set_k.add(new Pair(xk- i,yk- i1));
            set_k.add(new Pair(yk- i1,xk- i));
            HashSet<Pair> set_q = new HashSet<>();
            set_q.add(new Pair(xq+ i,yq+ i1));
            set_q.add(new Pair(yq+ i1,xq+ i));
            set_q.add(new Pair(xq+ i,yq- i1));
            set_q.add(new Pair(yq- i1,xq+ i));
            set_q.add(new Pair(xq- i,yq+ i1));
            set_q.add(new Pair(yq+ i1,xq- i));
            set_q.add(new Pair(xq- i,yq- i1));
            set_q.add(new Pair(yq- i1,xq- i));
            HashSet<Pair> inter= new HashSet<>(set_k);
            inter.retainAll(set_q);
            System.out.println(inter.size());
        }
    }
}

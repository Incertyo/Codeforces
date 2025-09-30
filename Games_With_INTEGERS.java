import java.util.Scanner;
public class Games_With_INTEGERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
        int n= sc.nextInt();
        if(n%3==0){
            System.out.println("Second");
        }
        else{
            System.out.println("First");
        }

        }
    }
}

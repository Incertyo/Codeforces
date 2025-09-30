import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class GoalsOfVivtyory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int sum=0;
            for(int i=0;i<n-1;i++){
                int num= sc.nextInt();
                sum+=num;
            }
                System.out.println(-sum);

        }
    }
}

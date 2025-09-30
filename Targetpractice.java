import java.util.Scanner;

public class Targetpractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            String [] arr = new String[10];
            int[]map = {0,1,2,3,4,5,5,4,3,2,1};
            int sum=0;
            for(int i=0;i<10;i++){
                String s= sc.next();
                for(int j=0;j<10;j++){
                    char c= s.charAt(j);
                    if(c=='X'){
                        sum+=Math.min(map[i+1],map[j+1]);
                    }
                }
            }
            System.out.println(sum);

        }
    }
}

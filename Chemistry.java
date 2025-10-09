import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            String s= sc.next();
            int[]arr=new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++){
                if(arr[i]%2==1){
                    count++;
                }
            }
            if(count>k+1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }

        }
    }
}

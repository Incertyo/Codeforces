import java.util.Scanner;

public class Not_Quite_latin_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n -->0){
            int[] map = new int[3];
            for(int i=0;i<3;i++){
                String c= sc.next();
                for(int k=0;k<c.length();k++) {
                    char ch=c.charAt(k);
                    if (ch != '?') {
                        map[ch - 'A']++;
                    }
                }
            }
            char ans=' ';
            for(int t=0;t<3;t++){
                if(map[t]==2){
                    ans=(char)(t+'A');
                }
            }
            System.out.println(ans);
        }
    }
}

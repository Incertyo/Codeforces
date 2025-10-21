import java.util.Scanner;

public class ABBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            String s=sc.next();
          if(s.charAt(0)!=s.charAt(s.length()-1)) {
              if(s.charAt(0)=='a'){
                  s='b'+s.substring(1);
              }
              else{
                  s='a'+s.substring(1);
              }
          }
            System.out.println(s);
        }
    }
}

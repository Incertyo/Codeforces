import java.util.Locale;
import java.util.Scanner;

public class Capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isLower = Character.isLowerCase(s.charAt(0));
        boolean rest=(s.substring(1)+"").equals((s.substring(1)+"").toUpperCase());
        boolean chk= s.equals(s.toUpperCase())||(isLower&&rest);
        StringBuilder sb = new StringBuilder();
        if(chk){
            int i=0;
            while(i<s.length()){
                if(Character.isUpperCase(s.charAt(i))){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
                i++;
            }
            System.out.println(sb);
        }
        else{
            System.out.println(s);
        }

    }
}

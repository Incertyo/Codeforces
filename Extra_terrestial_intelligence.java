import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Extra_terrestial_intelligence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            int length = Integer.parseInt(br.readLine().trim());
            int s = Integer.parseInt(br.readLine().trim());
            int parity=0;
            for(int i =0;i<length;i++){
                parity=parity+s%10;
                s/=10;
            }
            bw.write(parity>=3&&parity%2!=0?"YES":"NO");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: The file does not contain valid integers.");
        }

    }
}

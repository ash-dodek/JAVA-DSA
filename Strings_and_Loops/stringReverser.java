package Strings_and_Loops;
import java.util.Scanner;
public class stringReverser{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        System.out.println("Enter the string to be reversed");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length()/2; i++) {
            int frontIndex = i;
            int backIndex = sb.length() - 1 -i;
            /*
            h e l l o
            0 1 2 3 4 
            */
            char frontChar = sb.charAt(frontIndex);
            char backChar = sb.charAt(backIndex);
            sb.setCharAt(frontIndex, backChar);
            sb.setCharAt(backIndex, frontChar);
        }
        System.out.println(sb);
        sc.close();
    }
}
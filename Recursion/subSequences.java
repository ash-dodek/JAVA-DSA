package Recursion;

import java.util.Scanner;
public class subSequences {
    public static void subSeq(String str, int index, String newString){
        if (index==str.length()) {
            System.out.println(newString);
            return;
        }
        //If wants to be
        subSeq(str, index+1, newString+str.charAt(index));
        //Does not wants to be
        subSeq(str, index+1, newString);
    }
    public static void main(String[] args) {
        System.out.print("Enter the string to find subsequeces of:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        subSeq(str, 0, "");
    }
}

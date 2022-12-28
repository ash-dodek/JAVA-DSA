package Recursion;


import java.util.Scanner;
public class StrRev{
    public static void stringRev(String str, int index){
        if (index==0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringRev(str, index-1);
    }


    public static void main(String[] args) {
        System.out.print("Enter the string to be reversed:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "abcd";
        stringRev(str,str.length()-1);

        sc.close();;
    }
}
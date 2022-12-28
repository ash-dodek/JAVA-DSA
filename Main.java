import java.util.Scanner;

//custom imports
import Strings_and_Loops.*;
import SortingAlgorithms.*;
import Recursion.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Sorting\n2-Recursion\n3-Miscellaneous");
        int choice = sc.nextInt();
        switch (choice) {
            case 1://osrting
                System.out.println("1=>Bubble sort");
                int choice1 = sc.nextInt() ;
                switch (choice1) {
                    case 1: //bubble sort
                        BubbleSort.main(args);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                } 
                break;

            case 2: //recursion
                System.out.println("1=>Reverse a string(Recursion)\n2=>Print subsequence of a string(Recursion)");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        StrRev.main(args);
                        break;
                    case 2:
                        subSequences.main(args);
                        break;
                    default:
                    System.out.println("Invalid choice");
                        break;
                }
                break;
            case 3://Misc
                System.out.println("1=>Reverse a string");
                int choice3 = sc.nextInt();
                if (choice3==1) {
                    stringReverser.main(args);
                }
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
        // another.main(args);
        // stringReverser.main(args);
        sc.close();
    }
}
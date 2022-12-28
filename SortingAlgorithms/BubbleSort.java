package SortingAlgorithms;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        // BubbleSort(arr,n);
        sc.close();
        /*
         7 8 3 1 2
         i=0, j=2
         a[i]=7 a[j]=3
         */
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int tNum = arr[j];
                    arr[j]=arr[i];
                    arr[i]=tNum; 
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}

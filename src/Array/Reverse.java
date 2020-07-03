package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array ="+ Arrays.toString(a));
        reverse(a);
        System.out.println("Reversed Array ="+ Arrays.toString(a));

    }
    public static void reverse(int[] arr){
        int maxindex=arr.length-1;
        int halflength=arr.length/2;
        for(int i=0;i<halflength;i++){
            int temp=arr[i];
            arr[i]=arr[maxindex-i];
            arr[maxindex-i]=temp;
        }

    }
}

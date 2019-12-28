package Shiererba;

import java.util.Scanner;

public class wu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String[]  arr=str.split(",");
        int[] a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
    }

}

package Shiererba;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int[]a=new int[str.length()];
        for(int i=0;i<str.length();i++) {
            a[i]=Integer.parseInt(str.substring(i, i+1));
        }
        for(int i=0;i<a.length-1;i++) {
            for (int j = 0; j<a.length-1; j++) {
                if(a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        for (int p=0;p<a.length;p++)
        System.out.print(a[p]);
    }}
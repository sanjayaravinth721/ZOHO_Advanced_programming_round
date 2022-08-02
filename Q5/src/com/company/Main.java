package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int[] a;
        int[] b;

           int n = s.nextInt();

            int k = s.nextInt();

            a = new int[k];

            for(int j=0;j<k;j++){
                a[j] = s.nextInt();
            }

            int p = s.nextInt();

             b = new int[p];

            for(int f=0;f<p;f++){
                b[f]=s.nextInt();
            }
        int f1=0; int f2=0;
        int sum1=0;

        for(int i=0;i<k;i++){
            sum1 = sum1+ a[i];  //6
        }

        int sum2=0;
        for(int j=0;j<p;j++){
            sum2 =sum2+b[j];
        }

        int s1=sum1;  //6
        int s2 = sum2;  //8

        sum1=0;
        for(int i=0;i<k;i++){
            sum1 = sum1+a[i];
            if(sum1==s2){
                f1=1;
                break;
            }
        }
        sum2=0;
        for(int i=0;i<p;i++){
            sum2 = sum2+b[i];
            if(sum2==s1){
                f2=1;
                break;
            }
        }

        if(f1==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        if(f2==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

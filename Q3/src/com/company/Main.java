package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int p=0;

        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[p++]=a[i];
            }
        }
        for(int k=p;k<n;k++){
           a[k]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

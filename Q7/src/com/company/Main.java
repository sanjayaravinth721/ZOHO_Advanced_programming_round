package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=1;

        for(int i=0;i<n;i++){
            int l=0;
            for(int j=0;j<n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i+1;k++) {
                System.out.print(k+"  ");
                l=k;
            }
            l--;
            for(int j=1;j<i+1;j++){
                System.out.print(l--+"  ");
            }
            System.out.println();

        }

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public  static  int r = 0;

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        int[] a;
        int [] b;
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


        int sum =0;

        int min1 = mini(a,k);
        int min2 = mini(b,k);
        System.out.println(min1);
        System.out.println(min2);

        for(int i=0;i<p;i++) {

            if (min1 != min2) {

                sum = a[min1] + b[min2];
                break;
            } else {
                a[min1] = -1;
                min1 = mini(a,k);
            }
        }
        System.out.println(sum);
    }

    public static int mini(int a[],int k){
        int min = 32000;
        int f=0;
        for(int i =0 ;i<k;i++){
            if(a[i]!=-1) {
                if (a[i] < min) {
                    min = a[i];
                    f = i;  //0  //0
                }
            }
        }

        return f;
    }
}

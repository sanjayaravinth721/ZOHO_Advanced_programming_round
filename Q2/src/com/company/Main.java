package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];

        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }

        LinkedList<Integer> l = new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(a[i]);
            l.add(b[i]);
        }

        for(int i:l){
            System.out.print(i+" ");
        }
    }
}

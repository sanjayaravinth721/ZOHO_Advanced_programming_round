package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=3+3;
        int k=1;
        int p=1;

        System.out.println("enter the seat number");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int f=0;

    for(int i=1;i<=17;i++){
        for(int j=1;j<=n;j++){
            //System.out.print(p+" ");

            p = p+k ;// 1 2 3  //

            if(p==o){
                f=1;
                if(j+1==1 || j+1==4){
                    System.out.println("WS");
                    break;
                }
                else if(j+1==2 || j+1==5){
                    System.out.println("MS");
                    break;
                }
                if(j+1==3 || j+1==6){
                    System.out.println("AS");
                    break;
                }
                break;
            }

        }
        if(f==1){
            break;
        }
        //System.out.println();
        if(i%2!=0){
            p=p+n-1;
            k= -1;
        }
        else{
            p=p+n+1;  //3+11
            k=1;
        }



    }


    }
}

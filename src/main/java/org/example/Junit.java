package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Junit {
    public int divide(int a ,int b){
        return a/b;
    }
    public boolean isEven(int a){
        return a%2==0;
    }
    public String reverseString(String s){
        char []arr=s.toCharArray();

            int i=0;int j=arr.length-1;
            while(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }


            return new String(arr);
    }

    public double circlearea(double r){
        return 3.14*r*r;
    }

    public void sortMe(ArrayList<Integer> arr){
        arr.sort((a,b)->b-a);
    }
    public int[] reverseArray(int[]arr) throws InterruptedException {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            Thread.sleep(10);
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return arr ;
    }
}

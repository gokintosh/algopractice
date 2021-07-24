package com.gokulnair.easy.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromSortArray {

    public static int removeDuplFromSortArray(int[] arr){

//        max size of array that can have
//        int[] finalArr=new int[arr.length];

        int i=0,j=i+1;

        while(i<j&&j<arr.length){
            if(arr[i]==arr[j]){
                arr[j]=0;
                j++;

            }

            else if(j-i==1){
                i++;
                j++;
            }
            else{
                i++;

                arr[i]=arr[j];
                arr[j]=0;
                j++;

            }
        }

        return i+1;


    }


    public static void main(String[] args) {
	// write your code here

        int[] demoArray={-1,0,0,0,0,3,3};
        System.out.println(removeDuplFromSortArray(demoArray));
//        removeDuplFromSortArray(demoArray);
    }
}

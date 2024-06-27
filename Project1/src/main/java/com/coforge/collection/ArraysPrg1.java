package com.coforge.collection;

import java.util.Arrays;

public class ArraysPrg1 {
    public static void main(String[] args) {
        int ar[]={11,2,3,4,5,1};
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println("After sorting binary search can be used ");
        int i=Arrays.binarySearch(ar,4);
        if(i>=0)
            System.out.println("Found at "+i);
        else
            System.out.println("Not Found ");
    }
}

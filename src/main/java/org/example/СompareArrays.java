package org.example;

import java.util.Arrays;

public class СompareArrays {
    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].getClass().equals(arr2[i].getClass())){
                return false;
            }
        }

        return true;
    }

    public static <T1, T2> boolean compareArrays2(T1[] arr1, T2[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        boolean temp = false;
        for (int i = 0; i < arr1.length; i++) {
            temp = false;
            if(arr1[i].toString().equals(arr2[i].toString()) || arr1[i].equals(arr2[i])){
                temp = true;
            }
        }


        return temp;
    }
}

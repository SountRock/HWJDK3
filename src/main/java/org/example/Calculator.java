package org.example;

public class Calculator <T extends Number>{
    public static <T1 extends Number, T2 extends Number> double sum(T1 arg1, T2 arg2){
        return arg1.doubleValue() + arg2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double multiply(T1 arg1, T2 arg2){
        return arg1.doubleValue() * arg2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double divide(T1 arg1, T2 arg2){
        if(arg2.doubleValue() == 0.0){
            return Double.NaN;
        }

        return arg1.doubleValue() / arg2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double subtract(T1 arg1, T2 arg2){
        return arg1.doubleValue() - arg2.doubleValue();
    }
}

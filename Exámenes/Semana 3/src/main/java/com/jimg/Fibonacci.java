package com.jimg;

/**
 * This class provides a method that returns the n-positioned number
 * of the Fibonacci sequence
 *
 * 
 */

public class Fibonacci {

    public int compute(int n){
        int result;

        if(n < 0){
            throw new RuntimeException("El número es negativo: " + n);
        } else if(n == 0){
            result = 0;
        }else {
            int f0 = 0;
            int f1 = 1;
            int aux;

            for(int i = 0; i < n; i++){
                aux = f1;
                f1 = f0 + f1;
                f0 = aux;
            }
            result = f0;
        }
        return result;
    }
}

package com.tts;
import java.util.*;
import static java.lang.Double.valueOf;

public class Main {


    public static void main(String[] args) {
        //sum of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("The sum of the numbers is:" + sum);

        //doubled numbers
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your result is: "+ Arrays.toString(result));
    }

    public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i=0; i<size; i++){
            result[i] = Math.pow(valueOf(i), valueOf(power));
        }
        return result;
    }
}





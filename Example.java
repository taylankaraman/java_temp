import java.util.*;
import java.io.*;

public class Example{
    public static void main(String []argh){

        int a = 0;
        int b = 2;
        int n = 10;
        printSeries(a, b, n);
    }

    public static void printSeries(int a, int b, int n){
        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += (int)(java.lang.Math.pow(2,i) * b);
            }
            sum += a;
            System.out.format("%d ", sum);
        }
        System.out.format("%n");
    }
}

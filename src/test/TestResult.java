package test;

import domain.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
/**
 * create variables and array
 */
        System.out.println("¬вед≥ть к≥льк≥сть елемент≥в масиву");
        int k = inputVal('k');
        int[]a = new int[k];
        int i = k/2, j = 1, c = k/2;
        a[i] = 0;


/**
 * do operations with massive
 */
        for ( i = k/2+1, j = 1, c = k/2-1;c >= 0; i++ , j++ , c-- ) {
            a[i] = j;
            a[c] = j;
        }
        String s = Arrays.toString(a);
        System.out.println(s);
    }
        private static int inputVal(int variableName) {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

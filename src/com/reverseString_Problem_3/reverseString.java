package com.reverseString_Problem_3;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);

    }

    public static String reversString(String string) {


        //Reversing using the two-pointer method
        int start = 0;
        int end = string.length()-1;

        char[] characters = string.toCharArray();

        while(start < end) {
            swap(characters, start, end);
            start++;
            end--;
        }

        return new String(characters);
    }

    private static void swap(char[] array, int start, int end) {
        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}

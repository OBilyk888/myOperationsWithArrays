package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] array = {1, 3, 5, 2, 8};

        System.out.println(array);

        System.out.println(Arrays.toString(array));

        Arrays.sort(array, 0 , 4 );

        System.out.println(Arrays.toString(array));

        int key = Arrays.binarySearch(array, 5);

        System.out.println(key);

        System.out.println(Arrays.binarySearch(array, 0) );

    }
}

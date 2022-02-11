package com.vtb;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IndexStorage indexStorage = new IndexStorage(10);
        System.out.println(indexStorage.get(5));
        System.out.println(indexStorage.get(4));
        System.out.println(indexStorage.get(-1));
        System.out.println(Arrays.toString(indexStorage.reverse()));

        int[] exArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(exArray);
        System.out.println(arrayIndexStorage.get(5));
        System.out.println(arrayIndexStorage.get(4));
        //System.out.println(arrayIndexStorage.get(80));
        System.out.println(Arrays.toString(arrayIndexStorage.reverse()));
    }

}

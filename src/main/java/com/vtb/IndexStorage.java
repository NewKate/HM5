package com.vtb;

public class IndexStorage {

    private int size;

    public IndexStorage(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Размер массива должен быть больше нуля!");
        }
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int i) {
        return (i % 2 == 0) ? i : -i;
    }

    public int[] reverse() {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[array.length - 1 - i] = get(i);
        }
        return array;
    }
}

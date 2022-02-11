package com.vtb;

public class ArrayIndexStorage extends IndexStorage {

    private int[] array;

    public ArrayIndexStorage(int[] inArray) {
        super(inArray.length);
        array = new int[size()];
        for (int i = 0; i < size(); i++) {
            array[i] = inArray[i];
        }
    }

    @Override
    public int get(int i) {
        if (i > array.length - 1 || i < 0) {
            throw new IndexOutOfBoundsException("Значение введенного индекса вне границ массива");
        }
        return array[i];
    }

}

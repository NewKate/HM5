package com.vtb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.HashMap;

public class StorageTest {

    @Test
    public void CheckIndexStorageSizeTest() {
        for (int i = 1; i < 10; i++) {
            IndexStorage indexStorage = new IndexStorage(i);
            Assertions.assertEquals(i, indexStorage.size());
        }
    }

    @Test
    public void CheckIndexStorageValueTest() {

        IndexStorage indexStorage = new IndexStorage(15);
        Assertions.assertEquals(0, indexStorage.get(0));
        Assertions.assertEquals(-1, indexStorage.get(1));
        Assertions.assertEquals(6, indexStorage.get(6));

    }

    @Test
    public void ArrayReverseValueTest() {
        int[] exArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(exArray);

        int[] revArray = arrayIndexStorage.reverse();
        ArrayIndexStorage revArrayIndexStorage = new ArrayIndexStorage(revArray);

        Assertions.assertEquals(arrayIndexStorage.get(0), revArrayIndexStorage.get(11));
        Assertions.assertEquals(arrayIndexStorage.get(11), revArrayIndexStorage.get(0));
    }

    @Test
    public void CheckWrongStorageSizeTest() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            IndexStorage indexStorage = new IndexStorage(-5);
        });
        Assertions.assertEquals("Размер массива должен быть больше нуля!", exception.getMessage());

    }

    @Test
    public void CheckWrongGetValueTest() {
        int[] exArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(exArray);
        IndexOutOfBoundsException exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayIndexStorage.get(-5);
        });
        Assertions.assertEquals("Значение введенного индекса вне границ массива", exception.getMessage());

        exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayIndexStorage.get(100);
        });
        Assertions.assertEquals("Значение введенного индекса вне границ массива", exception.getMessage());
    }
}
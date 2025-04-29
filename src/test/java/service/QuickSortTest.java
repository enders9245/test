package service;

import org.junit.Assert;
import org.junit.Test;


public class QuickSortTest {

    @Test
    public void testSort() {
        QuickSort sorter = new QuickSort();
        int[] input = {5, 3, 8, 4, 2};
        sorter.sort(input);
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 8}, input);
    }

    @Test
    public void testEmptyArray() {
        QuickSort sorter = new QuickSort();
        int[] input = {};
        sorter.sort(input);
        Assert.assertArrayEquals(new int[]{}, input);
    }

    @Test
    public void testSingleElement() {
        QuickSort sorter = new QuickSort();
        int[] input = {1};
        sorter.sort(input);
        Assert.assertArrayEquals(new int[]{1}, input);
    }
}

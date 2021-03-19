package com.xq.javalib.algorithm;

public class Algorithm6 {


    public static void main(String[] args) {

        int[] array = {44, 4, 7, 22, 66, 5, 3};

        Algorithm6 a = new Algorithm6();
//        a.bubbleSort(array);
//        a.selectSort(array);
//        a.insertSort(array);
        a.quickSort(array, 0, array.length - 1);

        a.show(array);
    }

    /**
     * 冒泡排序
     * 每趟冒出一个最大数/最小数
     * 每次运行数量：总数量-运行的趟数(已冒出)
     */
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /***
     * 选择排序
     * 每趟选择一个最大数/最小数
     * 每次运行数量：总数量-运行的趟数(已选出)
     */
    public void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int miniIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[miniIndex] > array[j]) {
                    miniIndex = j;
                }
            }
            int temp = array[miniIndex];
            array[miniIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * 插入排序
     * 每趟选择一个待插入的数
     * 每次运行把待插入的数放在比它大/小后面
     */
//   44, 4, 7, 22, 66, 5, 3
    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    /**
     * 快速排序
     * 选择一个基准数将数组利用递归二分，直到数组不能再分为止；
     */
//   44, 4, 7, 22, 66, 5, 3
    public void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;
        if (low > high) {
            return;
        }
        int l = low;
        int h = high;
        int base = array[low];
        while (l < h) {
            while (base <= array[h] && l < h) {
                h--;
            }
            while (base >= array[l] && l < h) {
                l++;
            }
            if (l < h) {
                int  temp = array[h];
                array[h] = array[l];
                array[l] = temp;
            }
        }
        array[low] = array[l];
        array[l] = base;
        quickSort(array, low, h - 1);
        quickSort(array, h + 1, high);
    }

    public void show(int[] array) {
        for (int v : array) {
            System.out.print(v + "\t");
        }
        System.out.print("\n");
    }
}
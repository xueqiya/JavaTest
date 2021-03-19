package com.xq.javalib.algorithm;

public class Algorithm5 {


    public static void main(String[] args) {

        int[] array = {44, 4, 7, 22, 66, 5, 3};

        Algorithm5 a = new Algorithm5();
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
        for (int i = 0; i < array.length - 1; i++) {
            int miniIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[miniIndex] > array[j]) {
                    miniIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[miniIndex];
            array[miniIndex] = temp;
        }
    }

    /**
     * 插入排序
     * 每趟选择一个待插入的数
     * 每次运行把待插入的数放在比它大/小后面
     */
    public void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }

    /**
     * 快速排序
     * 选择一个基准数将数组利用递归二分，直到数组不能再分为止；
     */

//     44, 4, 7, 22, 66, 5, 3
//     44, 4, 7, 22, 3, 5, 66
//     5, 4, 7, 22, 3, 44, 66
    public void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = array[low];
        while (i < j) {
            while (temp <= array[j] && i < j) {
                j--;
            }
            while (temp >= array[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
        array[low] = array[i];
        array[i] = temp;
        show(array);
        quickSort(array, low, j - 1);
        quickSort(array, j + 1, high);
    }

    public void show(int[] array) {
        for (int v : array) {
            System.out.print(v + "\t");
        }
        System.out.print("\n");
    }
}

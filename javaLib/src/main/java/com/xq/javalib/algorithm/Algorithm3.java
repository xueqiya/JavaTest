package com.xq.javalib.algorithm;

public class Algorithm3 {


    public static void main(String[] args) {

        int[] array = {4, 44, 7, 22, 66, 5, 3};

        Algorithm3 a = new Algorithm3();
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
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
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
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (i != minIndex) {
                    int t = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = t;
                }
            }
        }
    }

    /**
     * 插入排序
     * 每趟选择一个待插入的数
     * 每次运行把待插入的数放在比它大/小后面
     */
    public void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
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
        quickSort(array, low, j - 1);
        quickSort(array, j + 1, high);
    }

    public void show(int[] array) {
        for (int v : array) {
            System.out.print(v + "\t");
        }
    }
}

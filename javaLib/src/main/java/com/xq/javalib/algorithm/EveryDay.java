package com.xq.javalib.algorithm;

public class EveryDay {


    public static void main(String[] args) {

        int[] array = {4, 44, 7, 22, 66, 5, 3};

        EveryDay a = new EveryDay();
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

    }

    /***
     * 选择排序
     * 每趟选择一个最大数/最小数
     * 每次运行数量：总数量-运行的趟数(已选出)
     */
    public void selectSort(int[] array) {

    }

    /**
     * 插入排序
     * 每趟选择一个待插入的数
     * 每次运行把待插入的数放在比它大/小后面
     */
    public void insertSort(int[] array) {

    }

    /**
     * 快速排序
     * 选择一个基准数将数组利用递归二分，直到数组不能再分为止；
     */
    public void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;

    }

    public void show(int[] array) {
        for (int v : array) {
            System.out.print(v + "\t");
        }
    }
}

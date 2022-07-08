package com.cykj;

import java.util.Arrays;

public class homework0706 {
    public static void main(String[] args) {

        /*
        * 定义一维数组int[] array = {5,3,6,4,9,2,8,1,7}，对它进行升序排序，得到一个有序的数组并输出到控制台
        * 思路：1.交换类排序：冒泡排序O(N^2) 稳定排序   快速排序O(NlogN) 不稳定排序（非原序）{3,3,2}
        *2.插入类排序：直接插入O（N^2），折半插入，希尔排序
        *3.选择类排序：简单选择，树形选择，堆排序（未完成）
        * */
        //冒泡排序优化:设置一个标志，如果数组已经排序，提前提出
        int[] array = {5,3,6,4,9,2,8,1,7};
        Sort sort = new Sort();
        sort.bubbleSort(array);
        sort.bubbleSort2(array);
        sort.bubbleSort3(array);
        sort.quickSort(array,1,array.length-1);
        sort.insertSort(array);

    }
}

class Sort {
    //冒泡排序
    public void  bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    int tem = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //设置flag，若某一趟数组 数值都没有交换，说明已经排序好（外层优化
    public void bubbleSort2(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false; //标志
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    int tem = array[j];
                    array[j+1] = array[j];
                    array[j] = tem;
                    flag = true;
                }
                if (flag == false){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //设置有序无序边界，只需对无序进行排序（外+内优化
    public void bubbleSort3(int[] array){
        int lastChangeIndex = 0; //最后交换位置
        int sortBorder = array.length - 1; //无序数列的边界，每次只需比较到这里
        for (int i = 0; i < sortBorder; i++) {
            boolean flag = false; //标志
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    int tem = array[j];
                    array[j+1] = array[j];
                    array[j] = tem;
                    flag = true;
                    lastChangeIndex = j; //最后一次交换位置
                }
                sortBorder = lastChangeIndex; //最后一次交换位置赋值给边界
                if (flag == false){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //快速排序：冒泡排序的改进，递归的想法
    public void quickSort(int[] array,int begin,int end){
        if (begin > end)
            return ;
        int pivot = array[begin]; //基准数（中心轴）,一般为第一个元素
        int low = begin; //初始化一般为0
        int high = end; //初始化一般为arr.length-1
        while (low != high){
            while (array[high] >= pivot && high>low) //从右往左找到小于基准数的索引
                high --;
            while (array[low] <= pivot && high>low) //从左往右找到大于基准数的索引
                low ++;
            if (high > low){ //交换数值
                int t = array[low];
                array[low] = array[high];
                array[low] = t;
            }
            array[begin] = array[low]; //移动基准数，分割为两个数组，基准数左边小于基准数，右边大于基准数
            array[low] = pivot;

            quickSort(array,begin,low-1);
            quickSort(array,low+1,end);
        }
    }
    //插入排序
    public void insertSort(int[] array ){
        for (int i = 1; i < array.length-1; i++) {
            //外层循环，从第二个开始比较
            for (int j =i; j >= 0 ; j--) {
                //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

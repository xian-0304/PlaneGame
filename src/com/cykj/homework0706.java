package com.cykj;

import java.util.Arrays;

public class homework0706 {
    public static void main(String[] args) {

        /*
        * ����һά����int[] array = {5,3,6,4,9,2,8,1,7}�����������������򣬵õ�һ����������鲢���������̨
        * ˼·��1.����������ð������O(N^2) �ȶ�����   ��������O(NlogN) ���ȶ����򣨷�ԭ��{3,3,2}
        *2.����������ֱ�Ӳ���O��N^2�����۰���룬ϣ������
        *3.ѡ�������򣺼�ѡ������ѡ�񣬶�����δ��ɣ�
        * */
        //ð�������Ż�:����һ����־����������Ѿ�������ǰ���
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
    //ð������
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
    //����flag����ĳһ������ ��ֵ��û�н�����˵���Ѿ�����ã�����Ż�
    public void bubbleSort2(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false; //��־
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
    //������������߽磬ֻ����������������+���Ż�
    public void bubbleSort3(int[] array){
        int lastChangeIndex = 0; //��󽻻�λ��
        int sortBorder = array.length - 1; //�������еı߽磬ÿ��ֻ��Ƚϵ�����
        for (int i = 0; i < sortBorder; i++) {
            boolean flag = false; //��־
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    int tem = array[j];
                    array[j+1] = array[j];
                    array[j] = tem;
                    flag = true;
                    lastChangeIndex = j; //���һ�ν���λ��
                }
                sortBorder = lastChangeIndex; //���һ�ν���λ�ø�ֵ���߽�
                if (flag == false){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //��������ð������ĸĽ����ݹ���뷨
    public void quickSort(int[] array,int begin,int end){
        if (begin > end)
            return ;
        int pivot = array[begin]; //��׼���������ᣩ,һ��Ϊ��һ��Ԫ��
        int low = begin; //��ʼ��һ��Ϊ0
        int high = end; //��ʼ��һ��Ϊarr.length-1
        while (low != high){
            while (array[high] >= pivot && high>low) //���������ҵ�С�ڻ�׼��������
                high --;
            while (array[low] <= pivot && high>low) //���������ҵ����ڻ�׼��������
                low ++;
            if (high > low){ //������ֵ
                int t = array[low];
                array[low] = array[high];
                array[low] = t;
            }
            array[begin] = array[low]; //�ƶ���׼�����ָ�Ϊ�������飬��׼�����С�ڻ�׼�����ұߴ��ڻ�׼��
            array[low] = pivot;

            quickSort(array,begin,low-1);
            quickSort(array,low+1,end);
        }
    }
    //��������
    public void insertSort(int[] array ){
        for (int i = 1; i < array.length-1; i++) {
            //���ѭ�����ӵڶ�����ʼ�Ƚ�
            for (int j =i; j >= 0 ; j--) {
                //�ڴ�ѭ������ǰ���ź�������ݱȽϣ�������������С��ǰ����򽻻�
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

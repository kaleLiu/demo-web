package com.kale.web.sort;

/**
 * Created by kaleLiu on 2017/4/8 0008.
 */
public class SortService {
    //˽�й��췽������ֹʵ����
    private SortService() {
        super();
    }

    //ð�ݷ�����
    public static void bubbleSort(int[] numbers) {
        int temp; // ��¼��ʱ�м�ֵ
        int size = numbers.length; // �����С
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) { // ����������λ��
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    //��������
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int base = numbers[start]; // ѡ���Ļ�׼ֵ����һ����ֵ��Ϊ��׼ֵ��
            int temp; // ��¼��ʱ�м�ֵ
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end))
                    i++;
                while ((numbers[j] > base) && (j > start))
                    j--;
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j)
                quickSort(numbers, start, j);
            if (end > i)
                quickSort(numbers, i, end);
        }
    }
    //ѡ������
    public static void selectSort(int[] numbers) {
        int size = numbers.length, temp;
        for (int i = 0; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (numbers[j] < numbers[k])
                    k = j;
            }
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
    }
    //��������
    // @param numbers
    public static void insertSort(int[] numbers) {
        int size = numbers.length, temp, j;
        for (int i = 1; i < size; i++) {
            temp = numbers[i];
            for (j = i; j > 0 && temp < numbers[j - 1]; j--)
                numbers[j] = numbers[j - 1];
            numbers[j] = temp;
        }
    }
    //�鲢����
    public static void mergeSort(int[] numbers, int left, int right) {
        int t = 1;// ÿ��Ԫ�ظ���
        int size = right - left + 1;
        while (t < size) {
            int s = t;// ����ѭ��ÿ��Ԫ�ظ���
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                merge(numbers, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right)
                merge(numbers, i, i + (s - 1), right);
        }
    }
    //�鲢�㷨ʵ��
    private static void merge(int[] data, int p, int q, int r) {
        int[] B = new int[data.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (data[s] <= data[t]) {
                B[k] = data[s];
                s++;
            } else {
                B[k] = data[t];
                t++;
            }
            k++;
        }
        if (s == q + 1)
            B[k++] = data[t++];
        else
            B[k++] = data[s++];
        for (int i = p; i <= r; i++)
            data[i] = B[i];
    }
}

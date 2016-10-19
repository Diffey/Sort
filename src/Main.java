import java.util.Arrays;

/**
 * Created by diffey on 16/10/19.
 */
public class Main {
    public static void main(String[] args) {
        int[] oArr = {1, 4, 13, 2, 3, 4, 0, 99, -2, 7};
        int[] oArr2 = {0, 5, 3, 21, -7, 4, 0, 99, -2};
        int[] oArr3 = {1, 4, 13, 2, 3, 4, 0, 99, -2, 1111};

        //插入排序
        int[] arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.insertSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.insertSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.insertSort(arr));

        //希尔排序
        arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.shellSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.shellSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.shellSort(arr));

        //冒泡排序
        arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.bubbleSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.bubbleSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.bubbleSort(arr));

        //快速排序
        arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.selectSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.selectSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.quickSort(arr));

        //选择排序
        arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.quickSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.quickSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.selectSort(arr));

        //堆排序
        arr = Arrays.copyOf(oArr, oArr.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.heapSort(arr));
        arr = Arrays.copyOf(oArr2, oArr2.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.heapSort(arr));
        arr = Arrays.copyOf(oArr3, oArr3.length);
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.heapSort(arr));
    }
}

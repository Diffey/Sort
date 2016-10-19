/**
 * Created by diffey on 16/10/19.
 */
public class Main {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {1, 4, 13, 2, 3, 4, 0, 99, -2, 7};
        PrintUtil.printArray(arr);
        PrintUtil.printArray(Sort.insertSort(arr));

        //希尔排序
        int[] arr2 = {1, 4, 13, 2, 3, 4, 0, 99, -2, 7};
        PrintUtil.printArray(arr2);
        PrintUtil.printArray(Sort.shellSort(arr2));


    }
}

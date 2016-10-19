/**
 * Created by diffey on 16/10/19.
 */
public class Sort {

    /**
     * 直接插入排序
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }


    /**
     * 希尔排序
     *
     * @param arr
     * @return
     */
    public static int[] shellSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int d = arr.length / 2;
        int tmp = 0;
        while (d > 0) {
            for (int i = 0; i < d; i++) {
                for (int j = i + d; j < arr.length; j += d) {
                    for (int k = j - d; k >= 0; k -= d) {
                        if (arr[k + d] < arr[k]) {
                            tmp = arr[k + d];
                            arr[k + d] = arr[k];
                            arr[k] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
            d /= 2;
        }
        return arr;
    }
}

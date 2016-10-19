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

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int tmp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * 快速排序
     *
     * @param arr
     * @return
     */
    public static int[] quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        return quick(arr, 0, arr.length - 1);
    }

    private static int[] quick(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int mid = adjust(arr, start, end);
        quick(arr, start, mid - 1);
        quick(arr, mid + 1, end);
        return arr;
    }

    private static int adjust(int[] arr, int start, int end) {
        int x = arr[start];
        while (start < end) {
            while (start < end && arr[end] > x) {
                end--;
            }
            if (start < end) {
                arr[start] = arr[end];
                start++;
            }
            while (start < end && arr[start] < x) {
                start++;
            }
            if (start < end) {
                arr[end] = arr[start];
                end--;
            }
        }
        arr[start] = x;
        return start;
    }
}

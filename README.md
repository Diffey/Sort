# Sort
几大排序算法的Java实现

# 一 排序算法
### 1.1 插入排序

代码实现参见Sort.insertSort(int [] arr);

### 1.2 希尔排序

代码实现参见Sort.shellSort(int [] arr);

### 1.3 冒泡排序

代码实现参见Sort.bubbleSort(int [] arr);

### 1.4 快速排序

代码实现参见Sort.quickSort(int [] arr);

### 1.5 选择排序

代码实现参见Sort.selectSort(int [] arr);

### 1.6 堆排序

代码实现参见Sort.heapSort(int [] arr);

### 1.7 归并排序

代码实现参见Sort.mergeSort(int [] arr);

# 二 性能测试
测试代码参见PerformancTest类,分别对以上算法的实现,进行了随机数组测试。
我电脑上一次运行结果如下:
对一万个随机数排序时间
插入排序对10000个随机数排序时间: 43毫秒
希尔排序对10000个随机数排序时间: 3毫秒
冒泡排序对10000个随机数排序时间: 174毫秒
快速排序对10000个随机数排序时间: 2毫秒
选择排序对10000个随机数排序时间: 39毫秒
堆排序对10000个随机数排序时间: 102毫秒
归并排序对10000个随机数排序时间: 3毫秒

对十万个随机数排序时间
插入排序对100000个随机数排序时间: 3905毫秒
希尔排序对100000个随机数排序时间: 11毫秒
冒泡排序对100000个随机数排序时间: 16491毫秒
快速排序对100000个随机数排序时间: 8毫秒
选择排序对100000个随机数排序时间: 2970毫秒
堆排序对100000个随机数排序时间: 11467毫秒
归并排序对100000个随机数排序时间: 17毫秒



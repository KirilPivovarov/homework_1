package ua.com.devEduction.SimpleArrays;


import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class OperationArrays {

    public int[] sortHeap(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;
    }

    private void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public int[] ShellSort(int[] Arrays) {
        int h = 1;
        int n = Arrays.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < Arrays.length; i++) {
                for (int j = i; j >= h && Arrays[j] > Arrays[j - h]; j -= h) {
                    int temp = Arrays[j];
                    Arrays[j] = Arrays[j - h];
                    Arrays[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return sixth(Arrays);
    }

    private int partion(int[] arr, int low, int high) {
        int pivotkey = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivotkey) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivotkey) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivotkey;
        return low;
    }

    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotloc = partion(arr, low, high);
            quickSort(arr, low, pivotloc - 1);
            quickSort(arr, pivotloc + 1, high);
        }
        return arr;
    }

    public int[] sortMerge(int[] arrayA, int length) {
        if (length < 2) {
            return null;
        }
        int mid = length / 2;
        int[] arrsyL = new int[mid];
        int[] arrayR = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            arrsyL[i] = arrayA[i];
        }
        for (int i = mid; i < length; i++) {
            arrayR[i - mid] = arrayA[i];
        }
        sortMerge(arrsyL, mid);
        sortMerge(arrayR, length - mid);




        return mergeArray(arrsyL, arrayR);
    }

    private int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;


        for (int i = 0; i < arrayC.length; i++) {
            if(positionA == arrayA.length){
                arrayC[i] = arrayB[positionB];
                positionB++;
            }else if(positionB == arrayB.length){
                arrayC[i] = arrayA[positionA];
                positionA++;
        }else if(arrayA[positionA] > arrayB[positionB]){
                arrayC[i] = arrayB[positionB];
                positionB++;
            }else if(arrayA[positionA] < arrayB[positionB]){
                arrayC[i] = arrayA[positionA];
                positionA++;
            }
        }
        return arrayC;
    }




    public int[] BubbleSort(int[] Arrays) {
        for (int lengthIn = Arrays.length; lengthIn > 0; lengthIn--) {
            for (int currSwap = 0; currSwap < lengthIn - 1; currSwap++) {
                if (Arrays[currSwap] > Arrays[currSwap + 1]) {
                    int curElement = Arrays[currSwap];
                    Arrays[currSwap] = Arrays[currSwap + 1];
                    Arrays[currSwap + 1] = curElement;
                }
            }
        }
        return Arrays;
    }

    public int[] selectionSort(int[] Arrays) {
        int min;

        for (int OutIterations = 0; OutIterations < Arrays.length - 1; OutIterations++) {
            min = OutIterations;
            for (int CountInIterations = OutIterations; CountInIterations < Arrays.length; CountInIterations++) {
                if (Arrays[CountInIterations] < Arrays[min]) {
                    min = CountInIterations;
                }
            }
            int temp = Arrays[OutIterations];
            Arrays[OutIterations] = Arrays[min];
            Arrays[min] = temp;
        }
        return Arrays;
    }

    public int[] insertionSort(int[] arr) {
        int j, value;

        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    public int first(int[] Arrays) {
        int result = MAX_VALUE;

        for (int array : Arrays) {
            if (array < result) {
                result = array;
            }
        }
        return result;
    }

    public int second(int[] Arrays) {
        int result = MIN_VALUE;
        for (int array : Arrays) {
            if (array > result) {
                result = array;
            }
        }
        return result;
    }

    public int third(int[] Arrays) {
        int min = Arrays[0];
        int result = 0;

        for (int i = 0; i < Arrays.length; i++) {
            if (min > Arrays[i]) {
                result = i;
            }
        }
        return result;
    }

    public int fourth(int[] Arrays) {
        int max = Arrays[0];
        int result = 0;
        for (int i = 0; i < Arrays.length; i++) {
            if (Arrays[i] > max) {
                result = i;
                max = Arrays[i];
            }
        }
        return result;
    }

    public int fifth(int[] Arrays) {
        int sum = 0;

        for (int i = 0; i < Arrays.length; i++) {
            if (i % 2 != 0) {
                sum += Arrays[i];
            }
        }
        return sum;
    }

    public int[] sixth(int[] Arrays) {
        int[] reversArrays = new int[Arrays.length];
        int j = Arrays.length - 1;
        for (int i = 0; i < reversArrays.length; i++, j--) {
            reversArrays[i] = Arrays[j];
        }
        return reversArrays;
    }

    public int seventh(int[] Arrays) {
        int sum = 0;
        for (int currentElement : Arrays) {
            if (currentElement % 2 != 0) {
                sum++;
            }
        }
        return sum;
    }

    public int[] eighth(int[] Arrays) {
        int half = Arrays.length / 2;
        int div = half + Arrays.length % 2;
      int[] arr1 = new int[half];
        for (int i = 0; i < half; i++) {
            arr1[i] = Arrays[i];
        }
        int[] arr2 = new int[div];
        for (int i = 0; i < div; i++) {
            arr2[i] = Arrays[Arrays.length - div + i];
        }
        for (int i = 0; i < div; i++) {
            Arrays[i] = arr2[i];
            if(i == half){
            }else{
               Arrays[Arrays.length - half + i] = arr1[i];
            }
        }
        return Arrays;
        }
}

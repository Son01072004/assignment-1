public class MergeSortALU {
    private static void mergeSort (int[] arr, int l, int m, int r){
        // l: left - m: middle - r: right
        // can tim kich thuoc cua 2 mang con ban dau duoc tach
        int n1 = m - l + 1;
        int n2 = r - m;
        // mang con thu nhat : ar[l...m]
        // mang con thu hai : arr[m + 1...r]
        // tao cac mang cin ben trai va ben phai
        // khai bao mang rong voi kich thuoc co dinh san
        int[] left = new int[n1];
        int[] right = new int[n2];
        // copy du lieu vao 2 manng con trai phai vua tao
        for (int i = 0; i < n1; i++){
            left[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++){
            right[j] = arr[m+1+j];
        }

        int i = 0, j = 0;
        int k = 0;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;
            // de quy - goi chinh ham do trong ham
            MergeSortALU.sort(arr, l, m);
            MergeSortALU.sort(arr, m + 1, r);
            // goi ham merge da viet
            MergeSortALU.mergeSort(arr, l, m, r);
        }
    }
    public static void printResult(int[] arr){
        System.out.println("Mang sau khi xap xep theo thuat toan merge sort");
        for(int i : arr){
            System.out.println(i);
        }
    }
}

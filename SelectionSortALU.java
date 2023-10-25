public class SelectionSortALU {
    public static void selectionSort (int[] arr) {
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            // thuat toan nay mau chot la tim duoc min max
            int min_indx = i;
            for (int j = i + 1; j < count; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                    // tim duoc vi tri cua phan tu nho nhat (tim duoc phan tu nho nhat)
                }
            }
            // hoan doi vi tri giua cac cap so
            // dua thang nho nhat ve dau mang
            int temp = arr[min_indx];
            arr[min_indx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printResult(int[] arr){
            System.out.println("Mang sau khi xap xep theo thuat toan selection sort ");
            for(int i : arr){
                System.out.println(i);
            }
        }
    }

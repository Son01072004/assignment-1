public class BubbleSortALU {
    // thuat toan sap xep noi bot
    // doi tuong thao tac la Array
    public static void bubbleSort(int[] arr, int n){
        // mang chua cac so nguyen ngau nhien
        // n: kich thuoc cua mang
        int i, j, z;
        boolean swapped; // dau hieu nhan biet da xap xep cac cap so trong mang
        for (i = 0; i < n - 1; i++){
            swapped = false;
            for (j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    z = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = z;
                    swapped = true;
                }
            }
            // neu khong co 2 phan tu tro len se bi roi vao vong lap vo han
            if(!swapped){
                break;
            }
        }
    }

    public static void printResult(int[] array){
        System.out.println("Mang sau khi da duoc xap xep theo thuat toan BubbleSort");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}


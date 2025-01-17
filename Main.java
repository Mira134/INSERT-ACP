import java.io.*;

class Insertion{
    /*Function to sort array using insertion sort */
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 1;i < n;++i){
            int key = arr[i];
            int j = i - 1;

            /*Move elements of arr[0..i-1], that are greater than key,to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }}
        /*A utility function to print array of size n */
        static void printArray(int arr[]){
            int n = arr.length;
            for(int i = 0;i < n;++i){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
            public static void main(String args[]){
            int arr[] = {689,349,60,132,7};

            Insertion ob = new Insertion();
            ob.sort(arr);

            printArray(arr);
        }
    }

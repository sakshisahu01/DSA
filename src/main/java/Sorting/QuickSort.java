package Sorting;

import static java.util.Arrays.sort;

public class QuickSort {
    public static void quicksort(int[] arr, int low, int high) {
        if(low<high){
            int p=partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr, p+1,high);
        }



    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=0; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return  i+1;
    }

    public static void main(String[] args) {
        int arr[]={5,5,6,7,2,1};

        quicksort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.println(num + " ");
        }



    }



}



package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.strategy;

public class SelectionSort implements Sorting{
    int tmp = 0;

    @Override
    public int[] sort(int[] arr) {
        int tmp = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            i = j;
            for(int k = 0; k < arr.length; k++){
                if(arr[j] > arr[k]){
                    j = k;
                }
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return arr;
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.strategy;

public class BubbleSort implements Sorting{
    @Override
    public int [] sort(int[] arr) {
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int k = (arr.length - 1); k >= (i + 1); k--){
                if(arr[k-1] > arr[k]){
                    tmp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        return arr;
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.strategy;

public class InsertionSort implements Sorting{
    @Override
    public int [] sort(int[] arr) {
        int key = 0;
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            key = arr[j];
            i = j - 1;
            while(i>=0 && arr[i] > key){
                arr[i+1] = arr[i];
                i = i - 1;
                arr[i+1] = key;
            }
        }
        return arr;
    }
}

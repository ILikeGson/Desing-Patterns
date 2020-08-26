package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.strategy;

public class SortingStrategy {
    Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }
    public int[] sort(int arr []){
        sorting.sort(arr);
        return arr;
    }
}

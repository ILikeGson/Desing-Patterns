package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        SortingStrategy sortingStrategy = new SortingStrategy();
        Sorting bubbleSort = new BubbleSort();

        sortingStrategy.setSorting(bubbleSort);
        int array [] = {1 , 5, 2, 25, 21, 10};
        System.out.println(Arrays.toString(sortingStrategy.sort(array)));



        Sorting insertinSort = new InsertionSort();
        sortingStrategy.setSorting(bubbleSort);
        int array2 [] = {1 , 5, 2, 25, 21, 10};
        System.out.println(Arrays.toString(sortingStrategy.sort(array2)));


        Sorting selectionSort = new SelectionSort();
        sortingStrategy.setSorting(bubbleSort);
        int array3 [] = {1 , 5, 2, 25, 21, 10};
        System.out.println(Arrays.toString(sortingStrategy.sort(array3)));

    }
}

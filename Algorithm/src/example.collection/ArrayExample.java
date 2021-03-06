package example.collection;

import example.collection.util.PrinterUtil;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        // 1차원 배열 생성 방법 #1
        int[] array1 = new int[10];
        array1[0] = 10;
        PrinterUtil.print(array1);

        // 1차원 배열 생성 방법 #2
        int[] array2 = { 1, 3, 4, 5, 2 };
        PrinterUtil.print(array2);

        // 2차원 배열 생성 방법 #1
        int[][] array3 = { {1, 2}, {3, 4} };
        for(int[] inner:array3)
            PrinterUtil.print(inner);

        // 배열 채우기
        int[] array4 = new int[10];
        Arrays.fill(array4, 10);
        PrinterUtil.print(array4);

        // 배열 정렬
        int[] array5 = {3, 2, 4, 7, 9, 3};
        Arrays.sort(array5);
        PrinterUtil.print(array5);
    }
}

package _02_03_before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {

    public static void main(String[] args) {
        Double[] doubles = {2.4, 3.5, 14.5};
        Integer[] numbers = {1, 5, 7};
        List<Double> wordList = convertArrayToList(doubles);
        List<Integer> numberList = convertArrayToList(numbers);
        System.out.println(wordList);
        System.out.println(numberList);
    }
    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}

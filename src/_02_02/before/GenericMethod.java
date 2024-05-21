package _02_02.before;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pears"};
        Integer[] numbers = {1, 5, 7};
        List<String> wordList = convertArrayToList(words);
        List<Integer> numberList = convertArrayToList(numbers);
        System.out.println(wordList);
        System.out.println(numberList);

    }
   private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
   }
}

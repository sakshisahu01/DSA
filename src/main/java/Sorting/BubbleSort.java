package Sorting;

public class BubbleSort {
    public void sort(int[] numbers) {
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int index = 0; index < (numbers.length - 1); index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }
    }

}

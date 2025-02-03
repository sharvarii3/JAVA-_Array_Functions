import java.util.*;

class ArrayFunctions {

    // Function to display an array
    void display(List<Integer> array) {
        System.out.println("Array: " + array);
    }

    // Function to classify even and odd numbers into separate arrays
    void evenOdd() {
        userInput inputHandler = new userInput();
        int[] numbers = inputHandler.arrayInput();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // Function to find two neighboring numbers with the smallest difference
    int ConsecutiveDiff() {
        userInput inputHandler = new userInput();
        int[] numbers = inputHandler.arrayInput();

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        Arrays.sort(numbers);
        int minDiff = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i + 1] - numbers[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        System.out.println("Smallest difference is between index " + minIndex + " and " + (minIndex + 1));
        return minIndex;
    }

    // Function to convert an array to an ArrayList
    List<Integer> convertToArrayList(int[] array) {
        return Arrays.stream(array).boxed().toList();
    }

    // Function to convert an ArrayList to an array
    int[] convertToArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

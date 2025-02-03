import java.util.*;

class userInput {
    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        
        return array;
    }
}

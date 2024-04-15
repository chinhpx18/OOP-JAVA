public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int size = bubbleSort.getInteger("Enter the size of the array: ");
        int[] array = bubbleSort.random(size);

        // Display unsorted array
        System.out.print("Unsorted array: ");
        bubbleSort.display(array);

        // Sort the entire array in-place
        bubbleSort.bubbleSort(array);

        // Display sorted array
        System.out.print("\nSorted array: ");
        bubbleSort.display(array);
    }
}
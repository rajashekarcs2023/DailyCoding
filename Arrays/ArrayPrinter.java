package Arrays;

public class ArrayPrinter {

    // Function to print elements of an array
    public void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    // Main function where the array is declared and printArray is called
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] myArray = {1, 2, 3, 4, 5};

        // Create an instance of ArrayPrinter
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        // Call the printArray function
        arrayPrinter.printArray(myArray);
    }
}

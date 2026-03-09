package labs.example.arrays;

public class ArrayOperations {

    public void createNewArray(int value){
        int size = 10;                          //determine the size of the array
        int[] newArray = new int[10];
    

        for (int i = 0; i < size; i++) {
            newArray[i] = value;
        }
    
        for (int i = 0; i < size; i++) {
            newArray[i] = newArray[i] + i;
        }

        displayArray(newArray, size);

    }

    private void displayArray(int[] array, int size) {
        
        System.out.println("I created a new array and it now has " + size + " items in it.");
        System.out.println("The array items and their values are listed below:");

        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

}

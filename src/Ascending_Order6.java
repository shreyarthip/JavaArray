public class Ascending_Order6 {

    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 8, 7, 1};   //Initialize array
        int temp = 0;

        System.out.println("Elements of original array: ");  //Displaying elements of original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {   //Sort the array in ascending order
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}

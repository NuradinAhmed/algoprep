public class removeEven {
    public static int[] removeEven(int[] arr) {
        int oddElements = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            oddElements++;
        }
        //Top one verifies the array elements and increaments

      //  int[] result = new int[oddElements];
        int [] result = new int[oddElements];
        int result_index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
           //     result_index++;
           // result[result_index++] = arr[i];
             //   result_index = arr[i];

            result[result_index++] = arr[i];

        }



    return result;
    }

    public static void main(String args[]) {

        int size = 10;
        int[] arr = new int[size]; //declaration and instantiation

        System.out.print("Before removing Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // assigning values
            System.out.print(arr[i] +  " ");
        }
        System.out.println();

        int[] newArr =  removeEven(arr); // calling removeEven

        System.out.print("After removing Even Numbers: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] +  " "); // prinitng array
        }
    }


}

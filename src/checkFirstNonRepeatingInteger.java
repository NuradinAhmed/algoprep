public class checkFirstNonRepeatingInteger {
    //Returns first unique integer from array

    public static int findFirstUnique(int[] arr)
    {
        //Inside inner loop check each index in the outerloop if its repeated in array. if its
        // not repeated in the array then this first integer is unique and return
        boolean isRepeated = false;

        for(int i = 0; i < arr.length; i++) {
            //we will compare the above index by traversing in this inner loop to see if its bein repated
            //if its repeated then we break out and then reset by looping through outer loop on the next index
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }

            } //we need to breakout from the inner loop when we find a repeating integer

            // this will be executed if it went through all of the elements found an index not repeated
            //then return the i index of the array as the first non-repeated element
            if(isRepeated == false){
                return arr[i];

            }else {
                //the we need to reset the isRepeated to false so we can go back up and repeat the process on
                //on the next index in outer for loop
                isRepeated = false;
            }
        }//end of outer loop
        return -1; //And return -1 means nothing in java, you are just returning a int value, thats it.The only meaningful explanation for returning -1 seems to be, that the code calling your function expects a return type of int
    }

        public static String arrayToString(int arr[]){
            if (arr.length > 0){
                String result = "";
                for(int i = 0; i < arr.length; i++) {
                    result += arr[i] + " ";
                }
                return result;
            }
            else {
                return "Empty Array!";
            }
        }

        public static void  main(String args[]) {

            int[] arr = {2, 54, 7, 2, 6, 54};

            System.out.println("Array: " + arrayToString(arr));

            int unique = findFirstUnique(arr);
            System.out.print("First Unique in an Array: " + unique);

        }
    }


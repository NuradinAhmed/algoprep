public class ProductArray
    {
        public static int[] findProduct(int arr[]) {

            int len = arr.length;

            int[] left = new int[len];
            int[] right = new int[len];
            int[] result = new int[len];


            //for left
            left[0] = 1;
            for(int i = 1; i < arr.length; i++) {
                left[i] = left[i - 1] * arr[i - 1];
            }


            //for right
            right[len - 1] = 1;
            for(int i = len - 2; i >= 0; i--){
                right[i] = right[i + 1] * arr[i + 1];
            }

            //finally multiple the right and left computations
            for(int i = 0; i < arr.length; i++){
                result[i] = right[i] * left[i];
            }

            //return the result
            return result;
        }
//        {
//            int num = arr.length;
//            int i = 1;
//            int temp = 1;
//
//            // Allocation of result array
//            int result[] = new int[n];
//
//            // Initializing the result array by 1
//            for(int j=0; j < n; j++)
//                result[j] = 1;
//
//            // Product of elements on left side excluding arr[i]
//            for (i = 0; i < n; i++)
//            {
//                result[i] = temp;
//                temp = temp * arr[i];
//            }
//
//            // Initializing temp to 1 for product on right side
//            temp = 1;
//
//            // Product of elements on right side excluding arr[i]
//            for (i = n - 1; i >= 0; i--)
//            {
//                result[i] *= temp;
//                temp *= arr[i];
//            }
//
//            return result;
//        }



        public static String arrayToString(int arr[]){
            if (arr.length > 0){
                String result = "";
                for(int i = 0; i < arr.length; i++) {
                    result = result + (arr[i] + " ");
                }
                return result;
            }
            else {
                return "Empty Array!";
            }
        }

        public static void main(String args[]) {

            int[] arr = {-1, 2, -3, 4, -5};

            System.out.println("Array before product: " + arrayToString(arr));

            int[] prodArray = findProduct(arr);

            System.out.println("Array after product: " + arrayToString(prodArray));
        }
    }


public class advanceMultipNestedLoop {


    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        double pie = 3.14;

        for (int var = 0; var < n; var++) {
            int j = 1;
            System.out.println("Pie: " + pie);
            while(j < var) {
                sum += 1;
                j *= 2;
            }
        } //end of for loop
        System.out.println("Sum: " + sum);
    } //end of main
} //end of class
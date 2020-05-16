public class multipNestedLoops {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        double pie = 3.14;
        int var = 1;

        while(var < n) {
            System.out.println("Pie: " + pie);
            for(int j = 0; j < var; j++) {
                sum++;
            }
            //var = var * 2;
            var *= 2;
        }
        System.out.println("Sum: "+ sum);
    }
}

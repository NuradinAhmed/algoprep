public class basicMultipNestedLoop {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        double pie = 3.14;
        int var = 1;

        while(var < n) {
            System.out.println("pie: "+ pie);

            for(int j = 1; j < n; j = j * 2) {
                sum++;
            }

            var *= 3;
        }
        System.out.println("Sum: "+ sum);
    }
}

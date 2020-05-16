package com.company;

public class Main {

    public static void main(String[] args) {
	//

        int n = 10; //O(1)
        int sum = 0; // O(1)
        double pie = 3.14; // O(1)

        //the time complexity for this would be O(n^2) b/c my rested loop would be repeating each time the outer loop runs. ntimes
        for(int var = n; var >= 1; var = var - 3){
            System.out.println("Pie " + pie);

            for(int j = n; j >= 0; j = j - 1) {
                sum++;
            }
            System.out.println("Sum " + sum);
        }
        System.out.println("Sum"+ sum);
    }
}


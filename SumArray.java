//Ameer Ahmed

//Write a Java program to sum values of an array.

class Array {

    public static void main (String [] args) {

        int [] values = {11,6,8,4};

        int sum0 = values[0] + values[1];
        int sum1 = values[1] + values[2];
        int sum2 = values[2] + values[3];
        int sum3 = values[0] + values[3];

        System.out.println("Adding the 0th index + the 1st index: " + sum0);
        System.out.println("Adding the 1st index + the 2nd index: " + sum1);
        System.out.println("Adding the 2nd index + the 3rd index: " + sum2);
        System.out.println("Adding the 0th index + the 3rd index: " + sum3);

        //total value of array

        int total = 0;

        for (int i : values)
            total += i;
        System.out.println("The total value for the array is: " + total);

    }
}
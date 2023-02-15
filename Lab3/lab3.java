import java.util.*;

public class lab3 {

    // Function for calculating mean

    public static double mean(int[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Function for calculating median
    
    public static double median(int[] array) {
        Arrays.sort(array);
        double median = 0;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (double) array[array.length/2];
        return median;
    }
    
    // Function for calculating mode

    public static int mode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = array[i];
                maxCount = count;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the max no. of elements need to be kept in array : ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.println("What you want to calculate, Select option :");
        System.out.println("1. Mean");
        System.out.println("2. Median");
        System.out.println("3. Mode");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                double mean = mean(array);
                System.out.println("Mean is : " + mean);
                break;
            case 2:
                double median = median(array);
                System.out.println("Median is : " + median);
                break;
            case 3:
                int mode = mode(array);
                System.out.println("Mode is : " + mode);
                break;
            default:
                System.out.println("Invalid option");
        }
        
        scanner.close();
    }
}
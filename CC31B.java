
package cc3.pkg1b;

import java.util.Scanner;
public class CC31B {

    static double mean(int arr[]) {
        //mean = sum / arr.length
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    
   static double mode(int a[]) {
    int maxValue = 0;
    int maxCount = 0;
    for (int i = 0; i < a.length; ++i) {
        int count = 0;
        for (int j = 0; j < a.length; ++j) {
            if (a[j] == a[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
        }
    }

    return maxValue;
}
       public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int x = a.nextInt();
        int []array = new int [x];
        System.out.println("Enter Elements of array:");
        for(int i = 0; i <array.length; i++){
            array[i] = a.nextInt();
        }
        System.out.println("Mean is:" + mean(array));
        System.out.println("Mode is:" + mode(array));
    }
}

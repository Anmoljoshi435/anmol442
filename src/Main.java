//This program is used for removing all the dublicate elements from array.

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = remove(arr);
        System.out.println("The array elements without repetion is :");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}



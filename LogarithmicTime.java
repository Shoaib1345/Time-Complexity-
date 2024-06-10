/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineartime;

/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
public class LogarithmicTime {
       public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        System.out.println(binarySearch(array, target));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Narrow down to the right half
            } else {
                right = mid - 1; // Narrow down to the left half
            }
        }

        return -1; // Element not found
    }
    
}

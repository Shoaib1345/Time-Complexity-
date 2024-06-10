/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lineartime;

/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
public class LinearTime {
    public static void main(String[] args) {
        // TODO code application logic here
        
          int[] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // This loop runs n times, so the time complexity is O(n).
        }
        return sum;
    }
    
}

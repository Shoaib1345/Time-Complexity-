/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineartime;

/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
public class QuadraticTime {
    public static void main(String[] args) {
        int n = 3;
        printPairs(n);
    }

    public static void printPairs(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("(" + i + ", " + j + ")"); // These nested loops run n^2 times, so the time complexity is O(n^2).
            }
        }
    }
}


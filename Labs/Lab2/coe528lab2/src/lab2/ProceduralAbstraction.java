/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author kevinbhawan
 */
public class ProceduralAbstraction {
    
    
    
    //Requires: None
//Modifies: None
//Effects: Returns the smallest positive integer n for which n!
// (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
// integer x. Otherwise returns 1.
public static int reverseFactorial(int x) {
    int n = 1;
    int factorial = 1;

    if (x < 0) {
        throw new IllegalArgumentException("Factorial is defined only for positive integers.");
    }

    while (factorial < x) {
        n = n + 1;
        factorial = factorial * n;
    }

    return n;
}


//Requires: None
//Modifies: None
//Effects: If the matrix arr satisfies Nice property, prints the sum and
// returns true. Otherwise returns false.
public static boolean isMatrixNice(int[][] arr) {
    
    
    
    if (!(arr.length == arr[0].length)) {
        return false;
    }
    
    int referenceSum = 0;
    for (int i = 0; i < arr[0].length; i++) {
        
        referenceSum = arr[0][i] + referenceSum;
    }
    
    for (int i = 0; i < arr.length; i++) {
        int rowSum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            rowSum = rowSum + arr[i][j];
        }
        if (!(rowSum == referenceSum)) {
            return false;
        }
        
        
    }
    
    for (int j = 0; j < arr[0].length; j++) {
        int columnSum = 0;
        for (int k = 0; k < arr[j].length; k++) {
            columnSum = columnSum + arr[j][k];
        }
        if (!(columnSum == referenceSum)) {
            return false;
        }
    }
    
    int firstDiagonalSum = 0;
    for (int i = 0; i < arr.length; i++) {
        firstDiagonalSum = firstDiagonalSum + arr[i][i];
    }
    if (!(firstDiagonalSum == referenceSum)) {
        return false;
    }
    
    int secondDiagonalSum = 0;
    for (int i = 0; i < arr.length; i++) {
        secondDiagonalSum = secondDiagonalSum + arr[i][arr.length - 1 - i];
    }
    
    System.out.println("Sum: " + referenceSum);
    return true;
    
    
}


public static void main(String[] args) {
        System.out.println(reverseFactorial(24));   
        System.out.println(reverseFactorial(119));  
        System.out.println(reverseFactorial(1));    
        int[][] matrix1 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        System.out.println("Matrix 1:");
        if (isMatrixNice(matrix1)) {
            System.out.println("The matrix is nice.");
        } else {
            System.out.println("The matrix is not nice.");
        }
}
}
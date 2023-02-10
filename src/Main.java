/*
Question : Write a program to print multiplication of two matrices enter by user.
 */
import java.util.Scanner;
public class Main {
    static void result(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    static void multiplication(int[][] arr,int[][] arr1){
       
          int[][] mul = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
               
                   mul[i][j] = arr[i][j] * arr1[i][j];
               
            }
        }
        result(mul);
    }
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of first row and column :");
        System.out.println("Enter the number of row :");
        a = sc.nextInt();
        System.out.println("Enter the number of column :");
        b = sc.nextInt();
        System.out.println("Enter the value of matrix :");
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Firstly, printing the original value of matrix :");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Enter the details of second row and column :");
        System.out.println("Enter the number of row :");
        c = sc.nextInt();
        System.out.println("Enter the number of column :");
        d = sc.nextInt();
        System.out.println("Enter the value of matrix :");
        int[][] arr1 = new int[c][d];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Secondly, printing the original value of second matrix :");
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Printing the result :");
        multiplication(arr,arr1);
    }
}

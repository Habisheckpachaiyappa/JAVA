import java.util.Scanner;

public class Matadd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int cols1 = scanner.nextInt();
        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int cols2 = scanner.nextInt();
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        if (rows1!= rows2 || cols1!= cols2) {
            System.out.println("Matrix addition is not possible");
            return;
        }

        int[][] sumMat = addMatrices(mat1, mat2);
        System.out.println("Mat Sum = ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] sumMat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sumMat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sumMat;
    }
}
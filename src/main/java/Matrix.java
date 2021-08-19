import java.util.Scanner;
    public class Matrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //int[][] a = inputMatrix();
            int[][] a = ThucHanh07.generateMatrix(4, 4, 0, 20);
            ThucHanh07.printMatrix(a);
            //Bài 1:
            System.out.println("Bài 1");
            System.out.print("Input X: ");
            int x = scanner.nextInt();
            if (ThucHanh07.findElement(a, x)) {
                System.out.format("Có phần tử %d trong ma trận.\n", x);
            } else System.out.format("Không có phần tử %d trong ma trận.\n", x);
            //Bài 2
            System.out.println("Bài 2");
            if (ThucHanh07.isPrimeMatric(a)) {
                System.out.println("Đây là mãng toàn số nguyên tố.");
            } else System.out.println("Đây là mãng ko phải toàn số nguyên tố");

            //Bài 3
            System.out.println("Bài 3");
            int max = ThucHanh07.findMax(a);
            System.out.format("Phần tử có giá trị lớn nhất là %d\n", max);

            //Bài 4
            System.out.println("Bài 4a");
            int sumRowd = ThucHanh07.sumRow(a);
            System.out.format("Tổng các phần tử trên dòng: %d\n",sumRowd);
            int sumColumnc = ThucHanh07.sumColumn(a);
            System.out.format("Tổng các phần tử trên cột: %d\n", sumColumnc);

            System.out.println("Bài 4b");
            int sumMainDiagonal = ThucHanh07.sumMainDiagonal(a);
            System.out.format("Tổng các phần tử trên đường chéo chính: %d\n", sumMainDiagonal);
            int sumAuxiliaryDiagonal = ThucHanh07.sumAuxiliaryDiagonal(a);
            System.out.format("Tổng các phần tử trên đường chéo phụ: %d\n", sumAuxiliaryDiagonal);

            System.out.println("Bài 4c");
            int sumHalfAboveMainDiagonal = ThucHanh07.sumHalfAboveMainDiagonal(a);
            System.out.format("Tổng các phần tử Nửa trên đường chéo chính: %d\n", sumHalfAboveMainDiagonal);
            int sumHalfUnderneathMainDiagonal = ThucHanh07.sumHalfUnderneathMainDiagonal(a);
            System.out.format("Tổng các phần tử Nửa dưới đường chéo chính: %d\n", sumHalfUnderneathMainDiagonal);

            System.out.println("Bài 4d");
            int sumHalfAboveAuxiliaryDiagonal = ThucHanh07.sumHalfAboveAuxiliaryDiagonal(a);
            System.out.format("Tổng các phần tử Nửa trên đường chéo phụ: %d\n", sumHalfAboveAuxiliaryDiagonal);
            int sumHalfUnderneathAuxiliaryDiagonal = ThucHanh07.sumHalfUnderneathAuxiliaryDiagonal(a);
            System.out.format("Tổng các phần tử Nửa dưới đường chéo phụ: %d\n", sumHalfUnderneathAuxiliaryDiagonal);

        }

    }


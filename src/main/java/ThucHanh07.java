import java.util.Scanner;

public class ThucHanh07 {
    public static int[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số dòng: ");
        int r = scanner.nextInt();

        System.out.print("Số cột: ");
        int c = scanner.nextInt();

        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d,%d]:", i, j);
                ret[i][j] = scanner.nextInt();
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%5d ", a[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor((Math.random() * (max - min)));
            }
        }

        return ret;
    }

    //Bài 1: Tìm xem ma trận kích thước m x n có chứa phần tử có giá trị x hay không
    public static boolean findElement(int[][] a, int x) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    //Bài 2: Ma trận a có phải là ma trận toàn các số nguyên tố hay không?
    public static boolean isPrimeNumber(int n) {
        boolean result = true;
        if (n <= 1) {
            result = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean isPrimeMatric(int[][] a) {
        boolean ret = true;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (!isPrimeNumber(a[i][i])) {
                    ret = false;
                }
            }
        }
        return ret;
    }

    //Bài 3: Tìm giá trị lớn nhất trong ma trận (gọi là max)
    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    //Bài 4: Tính tổng các phần tử trên:
    //a. Tổng dòng d:
    public static int sumRow(int[][] a) {
        Scanner sc = new Scanner(System.in);
        int row;
        do {
            System.out.print("Nhập dòng d: ");
            row = sc.nextInt();
        } while (row <= 0);
        int sumRowd = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            sumRowd += a[row - 1][i];
        }
        return sumRowd;
    }

    //a. Tổng cột c:
    public static int sumColumn(int[][] a) {
        Scanner sc = new Scanner(System.in);
        int column;
        do {
            System.out.print("Nhập cột c: ");
            column = sc.nextInt();
        } while (column <= 0);
        int sumColumn = 0;
        for (int j = 0, c = a[0].length; j < c; j++) {
            sumColumn += a[j][column - 1];
        }
        return sumColumn;
    }

    //b. Đường chéo chính (ma trận vuông)
    public static int sumMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += a[i][j];
                }
            }

        }
        return sum;
    }

    //b. Đường chéo phụ (ma trận vuông)
    public static int sumAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            sum += a[i][r - 1 - i];
        }
        return sum;
    }

    //c. Nửa trên đường chéo chính (ma trận vuông)
    public static int sumHalfAboveMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = i, c = a[0].length; j < c; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    //c. Nửa dưới đường chéo chính (ma trận vuông)
    public static int sumHalfUnderneathMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j <= i; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    //d. Nửa trên đường chéo phụ (ma trận vuông)
    public static int sumHalfAboveAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j <= r - 1 - i; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    //d. Nửa dưới đường chéo phụ (ma trận vuông)
    public static int sumHalfUnderneathAuxiliaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = r - 1 - i, c = a[0].length; j < c; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }
}
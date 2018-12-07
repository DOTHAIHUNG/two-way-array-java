import java.util.Scanner;

public class twoWayArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so hang cua mang 2 chieu:");
        int x = sc.nextInt();

        System.out.println("Nhap so cot cua mang 2 chieu:");
        int y = sc.nextInt();

        double[][] twoWayArray = new double[x][y];
        double maxValue = twoWayArray[0][0];
        int indexOfRow = 0;
        int indexOfColumn = 0;

        for (int row = 0; row < twoWayArray.length; row++) {
            for (int column = 0; column < twoWayArray[row].length; column++) {
                System.out.println("Nhap gia tri tai vi tri " + row + " " + column);
                twoWayArray[row][column] = sc.nextDouble();
            }
        }

        for (double[] doubles : twoWayArray) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < twoWayArray.length; row++) {
            for (int column = 0; column < twoWayArray[row].length; column++) {
                if (twoWayArray[row][column] > maxValue) {
                    maxValue = twoWayArray[row][column];
                    indexOfRow = row;
                    indexOfColumn = column;
                }
            }
        }
        System.out.println("Gia tri lon nhat la " + maxValue + " nam tai hang  " + (indexOfRow + 1) + " va cot " + (indexOfColumn + 1));
    }
}

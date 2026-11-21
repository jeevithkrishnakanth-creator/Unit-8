public class Checkerboard {
    public static void main(String[] args) {
        int[][] checkerboard = new int[8][8];

        for (int row = 0; row < checkerboard.length; row++) {
            for (int col = 0; col < checkerboard.length; col++) {
                checkerboard[row][col] = row + col;
            }
        }

        for (int[] array : checkerboard) {
            for (int number : array) {
                if (number % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}

public class Task5 {
    public static void main(String args[]) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = (array.length-1)-i; j <= (array.length-1)-i; j++) {
                int indexSum = i + j;
                int number = array[i][j];
                if (indexSum < number) {
                    System.out.print(number + "\t");
                }
            }
        }



    }
}

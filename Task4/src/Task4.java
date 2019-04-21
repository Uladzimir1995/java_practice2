public class Task4 {

    public static void main(String[] args){

        int[] array  = {1, -4, 2, -5, 0, 6};

        int accounter = 0 ;

        for(int i =0;i<array.length;i++) {

            int a = array[i];

            if (a < 0) {
                accounter = accounter + 1;
                System.out.println("Число" + a + "меньше нуля");
            }
        }
        System.out.println("Колво отрицательных чисел" + accounter);




    }


}
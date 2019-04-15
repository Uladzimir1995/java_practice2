public class Task6 {

    public static void main(String args[]) {
        CheckPosition first = new CheckPosition("first", 3, 3);
        CheckPosition second = new CheckPosition("second", 6, 6);
        CheckPosition third = new CheckPosition("third", 9, 9);
        CheckPosition fourth = new CheckPosition("fourth", 12, 12);
        CheckPosition fifth = new CheckPosition("fifth", 15, 15);

        CheckPosition[] array = {first, second, third, fourth, fifth};
        CheckService checkService = new CheckService();
        Integer sum = checkService.calculate(array);
        System.out.println(sum);
    }

}
public class Task4 {

    public static void main(String[] args) {


        String number = "100001";
        Integer result = 0;
        Integer system = 8;
        for (int i = 0; i < number.length(); i++) {
            Integer num = Integer.valueOf(number.substring(i, i + 1));
            int x = (number.length() - (i + 1));
            int exp = (int) Math.pow(2, x);
            result = result + num * exp;
        }
        System.out.println(result);

        String str = "";
        while (true) {
            int ost = result % 8;
            result = result / 8;
            str = str + ost;
            if (result == 0) {
                break;
            }
        }
        String resultNumber = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resultNumber = resultNumber + str.charAt(i);
        }
        System.out.println("result is " + resultNumber);
    }}

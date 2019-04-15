public class CheckService {

    public Integer calculate(CheckPosition[] array) {
        Integer sum = 0;
        CheckPosition checkPosition = array[0];
        sum = sum + (checkPosition.getCount() * checkPosition.getPrice());
        if (array.length == 1) {
            return sum;
        } else {
            CheckPosition[] newArray = new CheckPosition[array.length - 1];
            for (int i = array.length - newArray.length; i < array.length; i++) {
                newArray[i - 1] = array[i];
            }
            sum = sum + calculate(newArray);
        }
        return sum;
    }

}
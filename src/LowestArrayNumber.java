/**
 * Created by Matt on 7/7/2017.
 */
public class LowestArrayNumber {
    public static void main(String[] args) {
        int[] array1 = {100, 56, 22, 50, 10, 63, 15};

        int highNum = 100;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < highNum) {
                highNum = array1[i];
            }
        }
        System.out.println(highNum);

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> plusNumbver = new ArrayList<>();
        for (int plusNumbver1 : intList) {
            if (plusNumbver1 > 0 && plusNumbver1 % 2 == 0) {
                plusNumbver.add(plusNumbver1);
            }
        }
        Collections.sort(plusNumbver);
        System.out.println(plusNumbver);
    }
}
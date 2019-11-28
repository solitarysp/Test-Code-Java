import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.entrySet().removeIf(integerIntegerEntry -> integerIntegerEntry.getValue() == 2);
        System.out.println(map);
    }

    static int TinhTheKy(int year) {
        return (int) ((year - 1) / 100) + 1;
    }

    static int adjacentElementsProduct(int[] inputArray) {
        int max = -10000000;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int result = inputArray[i] * inputArray[i + 1];
            if (result > max) {
                max = result;
            }
        }
        return max;
    }

    static int shapeArea(int n) {
        return (n * n) + ((n - 1) * (n - 1));
    }



}

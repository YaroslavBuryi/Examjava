import java.util.HashMap;
import java.util.Map;
public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        int count = countUniqueElements(array);
        System.out.println("Количество уникальных элементов: " + count);
    }
    public static int countUniqueElements(int[] array) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        for (int num : array) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }
        int uniqueCount = 0;
        for (int num : array) {
            if (elementCountMap.get(num) == 1) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}


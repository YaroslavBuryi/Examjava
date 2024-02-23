import java.util.ArrayList;
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(120);
        numbers.add(80);
        numbers.add(200);
        numbers.add(90);
        List<String> filteredNumbers = filterNumbersGreaterThan100(numbers);
        System.out.println("Числа больше 100 в виде строк:");
        for (String number : filteredNumbers) {
            System.out.println(number);
        }
    }
    public static List<String> filterNumbersGreaterThan100(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 100) {
                result.add(String.valueOf(number)); // Преобразуем Integer в String и добавляем в список
            }
        }
        return result;
    }
}

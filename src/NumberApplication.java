import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberApplication {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap();

        Scanner number = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = number.nextInt();

        for (int i = 0; i < 10; i++) {
            numbers.put(String.valueOf(i), 0);
        }

        char[] chars = String.valueOf(x).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer n = numbers.get((String.valueOf(chars[i])));
            numbers.put(String.valueOf(chars[i]), n + 1);
        }

        String last = "";

        for (Map.Entry<String, Integer> entry : numbers.descendingMap().entrySet()) {
            String i = entry.getKey();
            Integer n = entry.getValue();
            for (int j = 0; j < n; j++) {
                last = last.concat(String.valueOf(i));
            }
        }

        if (Integer.valueOf(last) > 100000) {
            System.out.println(-1);
        } else {
            System.out.println(Integer.valueOf(last));
        }
    }
}
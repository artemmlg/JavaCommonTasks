package tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class HowManyLettersInString{
    public static void main(String[] args) {
        duplicateCharCount("Assart");
    }

    private static void duplicateCharCount(String inputString) {
        Map<Character, Integer> mappedValue = new LinkedHashMap<>();

        for (char chars : inputString.toCharArray()) {
            if (!mappedValue.containsKey(chars)) {
                mappedValue.put(chars, 1);
            } else {
                mappedValue.put(chars, mappedValue.get(chars) + 1);
            }
        }

        System.out.println("Characters count In " + inputString);

        for (Character character : mappedValue.keySet()) {
            if (mappedValue.get(character) > 0) {
                System.out.println(character + " : " + mappedValue.get(character));
            }
        }
    }
}
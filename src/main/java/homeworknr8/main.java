package homeworknr8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class main {
    public static ArrayList<String> getToDoList() {
        ArrayList<String> toDoList = new ArrayList<>();

        toDoList.add("Сходить в школу");
        toDoList.add("Сделать домашнее задание");
        toDoList.add("Сходить в магазин");

        return toDoList;
    }

    public static void main(String[] args) {
        ArrayList<String> toDoList = getToDoList();
        System.out.println("Сегодня мне нужно сделать следующие вещи:");
        for (String item : toDoList) {
            System.out.println(item);
            HashSet<String> uniqueValues = getUniqueValues(toDoList);
            System.out.println("Уникальные значения из списка:");
            for (String value : uniqueValues) {
                System.out.println(value);
            }

            HashMap<String, String> englishToRomanianDictionary = new HashMap<>();
            englishToRomanianDictionary.put("apple", "măr");
            englishToRomanianDictionary.put("banana", "banană");
            englishToRomanianDictionary.put("car", "mașină");
            englishToRomanianDictionary.put("house", "casă");
            englishToRomanianDictionary.put("book", "carte");
            englishToRomanianDictionary.put("computer", "calculator");
            englishToRomanianDictionary.put("dog", "câine");
            englishToRomanianDictionary.put("cat", "pisică");
            englishToRomanianDictionary.put("sun", "soare");
            englishToRomanianDictionary.put("moon", "lună");

            System.out.println("Англо-румынский словарь:");
            for (String word : englishToRomanianDictionary.keySet()) {
                String translation = englishToRomanianDictionary.get(word);
                System.out.println(word + " - " + translation);
            }
        }
    }

    private static HashSet<String> getUniqueValues(ArrayList<String> toDoList) {
        return null;
    }
}

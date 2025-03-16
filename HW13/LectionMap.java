import java.util.*;

public class LectionMap {
    public static void main(String[] args){
        System.out.println("ДЗ 13.8. Об'єднання двох множин");
        TreeSet<Integer> treeSetA = new TreeSet<>();
        treeSetA.add(1);
        treeSetA.add(2);
        treeSetA.add(3);
        TreeSet<Integer> treeSetB = new TreeSet<>();
        treeSetB.add(3);
        treeSetB.add(4);
        treeSetB.add(5);
        TreeSet<Integer> resultSetThree = joinTwoSets(treeSetA, treeSetB);
        System.out.println("Об'єднана множина: " + resultSetThree);

        System.out.println("ДЗ 13.7. Перевірка на перетин множин");
        Set<Integer> setsA = new LinkedHashSet<>();
        setsA.add(1);
        setsA.add(2);
        setsA.add(3);
        setsA.add(4);
        Set<Integer> setsB = new LinkedHashSet<>();
        setsB.add(7);
        setsB.add(5);
        setsB.add(6);
        System.out.println(checkIntersectionSets(setsA, setsB));

        //доробити
        System.out.println("ДЗ 13.6. Повернути елемент, який зустрічається найчастіше");
        System.out.println(elementMostFrequently(new String[]{"a", "b", "a"}));

        //доробити
        System.out.println("ДЗ 13.5. Парні рядки");
        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));

        //доробити
        System.out.println("ДЗ 13.4. Акцентуємося на роботу зі значеннями");
        System.out.println(mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(mergeStringsByFirstChar(new String[]{}));

        System.out.println("ДЗ 13.3. Підрахунок слів");
        System.out.println(countWords(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(countWords(new String[]{"c", "b", "a"}));
        System.out.println(countWords(new String[]{"c", "c", "c", "c"}));

        System.out.println("ДЗ 13.2. Масив в Map");
        System.out.println(createMap(new String[]{"code", "bug"}));
        System.out.println(createMap(new String[]{"man", "moon", "main"}));
        System.out.println(createMap(new String[]{"man", "moon", "good", "night"}));

        System.out.println("ДЗ 13.1. Визначення довжини рядка");
        System.out.println(getLengthOfStrings(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(getLengthOfStrings(new String[]{"this", "and", "that", "and"}));
        System.out.println(getLengthOfStrings(new String[]{"code", "code", "code", "bug"}));
    }
    //ДЗ 13.8. Об'єднання двох множин
    public static TreeSet<Integer> joinTwoSets(TreeSet<Integer> treeSetA, TreeSet<Integer> treeSetB) {
        TreeSet<Integer> resultSetThree = new TreeSet<>(treeSetA);
        resultSetThree.addAll(treeSetB);
        return resultSetThree;
    }
    //ДЗ 13.7. Перевірка на перетин множин
    public static boolean checkIntersectionSets(Set<Integer> setsA, Set<Integer> setsB) {
        for (Integer element : setsA) {
            if (setsB.contains(element)) {
                return true;
            }
        }
        return false;
    }
    //ДЗ 13.6. Повернути елемент, який зустрічається найчастіше
    public static Map<String, String> elementMostFrequently(String[] words) {
        Map<String, String> pairRowsSymbols = new HashMap<>();

        return pairRowsSymbols;
    }
    //ДЗ 13.5. Парні рядки
    public static Map<String, String> buildResultString(String[] words) {
        Map<String, String> pairRowsSymbols = new HashMap<>();

        return pairRowsSymbols;
    }
    //ДЗ 13.4. Акцентуємося на роботу зі значеннями
    public static Map<String, String> mergeStringsByFirstChar(String[] words) {
        Map<String, String> differentSymbols = new HashMap<>();

        return differentSymbols;
    }
    //ДЗ 13.3. Підрахунок слів
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> countWords = new HashMap<>();
        for (String word : words) {
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        return countWords;
    }
    //ДЗ 13.2. Масив в Map
    public static Map<String, String> createMap(String[] words){
        Map<String, String> arrayWords = new HashMap<>();
        for (String word : words) {
                String firstChar = String.valueOf(word.charAt(0));
                String lastChar = String.valueOf(word.charAt(word.length() - 1));
                arrayWords.put(firstChar, lastChar);
        }
        return arrayWords;
    }
    //ДЗ 13.1. Визначення довжини рядка
    public static Map<String, Integer> getLengthOfStrings(String[] words){
        Map<String, Integer> lengthWords = new HashMap<>();
        for (String word : words) {
            lengthWords.put(word, word.length());
        }
        return lengthWords;
    }
}

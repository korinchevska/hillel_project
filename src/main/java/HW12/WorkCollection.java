package HW12;

import java.util.*;
public class WorkCollection {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 14, 15, 92, 6));
        System.out.println("Collection of numbers: " + numbers);
        List<String> fullName = new ArrayList<>(Arrays.asList("Olha", "Korinchevska", "Dmitrivna"));
        System.out.println("Full name: " + fullName);
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(1, 1, 3, 3, 4, 5, 4, 6, 7, 1));
        System.out.println("Unique numbers : " + uniqueNumbers);
        Map<String, String> cityCode = new HashMap<>();
        cityCode.put("Вінниця ", " 432");
        cityCode.put("Дніпро ", " 56(2)");
        cityCode.put("Донецьк ", " 62(2)");
        cityCode.put("Житомир ", " 412");
        cityCode.put("Запоріжжя ", " 61(2)");
        cityCode.put("Івано-Франківськ ", " 342(2)");
        cityCode.put("Київ ", " 44");
        cityCode.put("Кропивницький ", " 522");
        cityCode.put("Луганськ ", " 642");
        cityCode.put("Луцьк ", " 332(2)");
        cityCode.put("Львів ", " 32(2)");
        cityCode.put("Миколаїв ", " 512");
        cityCode.put("Одеса ", " 48(2)");
        cityCode.put("Полтава ", " 532(2)");
        cityCode.put("Рівне ", " 362(2)");
        cityCode.put("Сімферополь ", " 652");
        cityCode.put("Суми ", " 542");
        cityCode.put("Тернопіль ", " 352");
        cityCode.put("Ужгород ", " 312(2)");
        cityCode.put("Харків ", " 57(2)");
        cityCode.put("Херсон ", " 552");
        cityCode.put("Хмельницький ", " 382(2)");
        cityCode.put("Черкаси ", " 472");
        cityCode.put("Чернівці ", " 372(2)");
        cityCode.put("Чернігів ", " 462(2)");
        System.out.println("Телефоні коди міст України: " + cityCode);

    }
}

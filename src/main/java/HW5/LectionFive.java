package HW5;

public class LectionFive {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true; // Спим, если не рабочий день или отпуск
        } else {
            return false; // Не спим, если рабочий день и нет отпуска
        }
    }
    public static void main(String[] args) {
        // Тесты
        System.out.println(sleepIn(false, false)); // Ожидаем true
        System.out.println(sleepIn(true, false));  // Ожидаем false
        System.out.println(sleepIn(false, true));  // Ожидаем true
    }

}

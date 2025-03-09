import java.util.Scanner;

public class Lection8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String input = scanner.nextLine();
        System.out.println(notString(input));
        System.out.println(front3(input));

    }
    public static String front3(String str) {
        if(str.length() >= 3){
            String word = str.substring(0, 3);
            return word + word + word;
        }
        return str + str + str;
    }
    public static String notString(String str) {
        if (str.startsWith("not"))
        return str;
        else
        return "not " + str;
    }
}

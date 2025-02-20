
public class homeString {
    public static void main(String[] args) {
        System.out.println("ДЗ 7.1. Рядок, створений з n повторень останніх n символів");
        System.out.println(sevenAndOne("Hello", 3));
        System.out.println(sevenAndOne("Hello", 2));
        System.out.println(sevenAndOne("Hello", 1));
        System.out.println("ДЗ 7.2. Заміксуємо рядки");
        System.out.println(sevenAndTwo("abc", "xyz"));
        System.out.println(sevenAndTwo("Hi", "There"));
        System.out.println(sevenAndTwo("xxxx", "There"));
        System.out.println("ДЗ 7.3. Xyz у середині рядка");
        System.out.println(sevenAndThree("AAxyzBB"));
        System.out.println(sevenAndThree("AxyzBB"));
        System.out.println(sevenAndThree("AxyzBBB"));
        System.out.println("ДЗ 7.4. ZipZap");
        System.out.println(sevenAndFour("zipXzap"));
        System.out.println(sevenAndFour("zopzop"));
        System.out.println(sevenAndFour("zzzopzop"));
        System.out.println("ДЗ 7.5. Xyz");
        System.out.println(sevenAndFive("abcxyz"));
        System.out.println(sevenAndFive("abc.xyz"));
        System.out.println(sevenAndFive("xyz.abc"));
    }
    //ДЗ 7.1. Рядок, створений з n повторень останніх n символів
    public static String sevenAndOne(String str, int count) {
        String repeated = "";
        str = str.substring(str.length() - count);
        for (int i = 0; i < count; i++){
            repeated = repeated + str;
        }
        return repeated;
    }

    //ДЗ 7.2. Заміксуємо рядки
    public static String sevenAndTwo(String srt1, String srt2) {
        int minLength = Math.min(srt1.length(),srt2.length());
        String mixed = "";
        for(int i = 0; i < minLength ; i++) {
            mixed = mixed + srt1.charAt(i) + srt2.charAt(i);
        }
        return mixed = mixed + srt2.substring(minLength) + srt1.substring(minLength);

    }
   ///ДЗ 7.3. Xyz у середині рядка
    public static boolean sevenAndThree(String str) {
        String line = "xyz";
        int len = str.length();
        int middle = len / 2;
        if (len < 3)
        return false;
        if (len % 2 != 0) {
            if (line.equals(str.substring(middle-1,middle+2))) {
                return true;
            } else {
                return false;
            }
        } else if (line.equals(str.substring(middle-1,middle+2)) ||
        line.equals(str.substring(middle-2,middle+1))) {
            return true;
        } else
        return false;

    }

    //ДЗ 7.4. ZipZap
    public static String sevenAndFour(String str) {
        String sample = "";
        if (str.length() <= 2) return str;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
                sample += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
                i += 2;
            } else {
                sample += str.substring(i, i + 1);
            }
        }
        return sample;
    }
    //ДЗ 7.5. Xyz
    public static boolean sevenAndFive(String str) {
            for(int i=0; i < str.length()-2; i++) {
                if(str.substring(i,i+3).equals("xyz")) {
                    if(i==0) {
                        return true;
                    }
                    else if(str.charAt(i-1) != '.') {
                        return true;
                    }
                }
            }
            return false;
    }

    }


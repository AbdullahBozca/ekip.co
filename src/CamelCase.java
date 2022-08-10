import java.util.Locale;

public class CamelCase {
    public static void main(String[] args) {
        String str="cats AND*Dogs-are Awesome";
        String[] strArr = str.split("[\\W_]+");
        System.out.println("CamelCase = " + camelCase(strArr));
    }
    public static String camelCase(String[] strArr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }
}

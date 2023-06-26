package string;

public class skip_char_2 {
    static String skip(String str, char ch) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == ch) {
            return skip(str.substring(1), ch);
        } else {
            return str.charAt(0) + skip(str.substring(1), ch);
        }
    }

    public static void main(String[] args) {
        String str = "abcdabaabdc";
        System.out.println(skip(str, 'a'));
    }
}

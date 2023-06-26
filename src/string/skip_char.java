package string;

public class skip_char {
    static void skip(String str, char ch, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        if (str.charAt(0) == ch) {
            skip(str.substring(1), ch, res);
        } else {
            skip(str.substring(1), ch, res + str.charAt(0));
        }
    }

    public static void main(String[] args) {
        String str = "abcdabcdabcde";
        skip(str, 'a', "");
    }
}

package string;

public class skip_string {
    static String skip(String str, String target) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith(target)) {
            return skip(str.substring(target.length()), target);
        } else {
            return str.charAt(0) + skip(str.substring(1), target);
        }
    }

    public static void main(String[] args) {
        String str = "abcxabcxabcxabc";
        System.out.println(skip(str, "abc"));
    }
}

package string;
// skip the part of string that contains "app" but not "apple"...
public class skip_string_2 {
    static String skip(String str, String skip, String notSkip) {
        if (str.isEmpty()) {
            return "";
        } else if (str.startsWith(skip) && !str.startsWith(notSkip)) {
            return skip(str.substring(skip.length()), skip, notSkip);
        } else {
            return str.charAt(0) + skip(str.substring(1), skip, notSkip);
        }
    }

    public static void main(String[] args) {
        String str = "xappxapplexapplexappx";
        System.out.println(skip(str, "app", "apple"));
    }
}

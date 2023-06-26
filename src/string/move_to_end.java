package string;

public class move_to_end {
    static String move(String str, char ch, String res) {
        if (str.isEmpty())
            return "";
        if (str.charAt(0) == ch) {
            res+= move(str.substring(1), ch, res) + ch;
        }
        else {
            res+= str.charAt(0) + move(str.substring(1), ch, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(move("Abcdecde", 'c', ""));
    }
}

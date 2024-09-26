public class SearchInStrings {
    public static void main(String[] args) {
        String name = "chandanOP";
        char key = 'd';
        // System.out.println(search(name, key));
        System.out.println(search2(name, key));
    }

    static boolean search(String str, char key) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    static boolean search2(String str, char key) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (key == ch) {
                return true;
            }
        }

        return false;
    }
}

package Arrays;

public class CountDuplicatetring {
    public static void main(String[] args) {
        String str = "sasasssssfcvcvcvcfdfererfvb";
        int len = str.length();

        while (len > 0) {
            int count = 1;
            for (int j = 1; j < len; j++) {
                if (str.charAt(0) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(0) + " : " + count);
            }

            String character = String.valueOf(str.charAt(0)).trim();
            str = str.replaceAll(character, "");
            len -= count;
        }
    }
}

package Arrays;

public class TimChuoiLapTrongMang {
    public static void main(String[] args) {
        char[] str = "abcdgfhfklmnhkgf".toCharArray();
        int count = 0;

        System.out.println("Duplicate character is: ");

        for(int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if(str[i] == str[j]) {
                    count ++;
                }
            }
            if(count == 1){
                System.out.print(str[i]);
            }
            count = 0 ;
        }
    }
}

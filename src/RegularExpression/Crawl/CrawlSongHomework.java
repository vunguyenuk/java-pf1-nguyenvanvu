package RegularExpression.Crawl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CrawlSongHomework {
    public static void main(String[] args) {
        try {
            String str = "<a class=\"name_song\" href=\"nct.com/concobebe\">Con co be be - Dung</a>\n" +
                    "<a class=\"name_song\" href=\"nct.com/backimthang\">Bac kim thang - Dung</a>\n" +
                    "<a class=\"name_song\" href=\"nct.com/sont1\">Yeu anh - Son</a>\n" +
                    "<a class=\"name_song\" href=\"nct.com/song2\">Yeu em - Loc</a>\n" +
                    "<a class=\"name_song\" href=\"nct.com/song3\">Lac troi - Vu</a>";

            Pattern pattern = Pattern.compile("name_song\".*?>(.*? - .*?)</a>");
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }

        } catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());
        }
    }
}

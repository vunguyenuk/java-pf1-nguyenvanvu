package RegularExpression.Crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewspaper {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", "");

            System.out.println(content);
            Pattern pattern = Pattern.compile("data-linktype=\"newsdetail\" .*? >(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()){
                System.out.println(matcher.group(1));
            }

        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

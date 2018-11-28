package RegularExpression;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongWithFiles {
    public static void main(String[] args) {
        try{
            File file = new File("src/CrawlSong");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null){
                Pattern pattern = Pattern.compile("name_song\".*?>(.*? - .*?)</a>");
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()){
                    System.out.println(matcher.group(1));
                }
            }
        } catch (Exception e){
            System.out.println("Exception Error: " + e.getMessage());
        }
    }
}

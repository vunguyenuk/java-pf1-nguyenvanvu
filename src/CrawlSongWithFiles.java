import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongWithFiles {
    public static void main(String[] args) {
        try{
            FileInputStream fstream = new FileInputStream("/home/vunv/Desktop/Test");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

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

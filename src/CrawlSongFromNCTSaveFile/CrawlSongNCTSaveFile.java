package CrawlSongFromNCTSaveFile;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongNCTSaveFile {
    public static void writeSong(File receive, String content) throws Exception {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileOutputStream(receive), true);
            Pattern pattern = Pattern.compile(".*?\\\"name_song\".*?>(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()){
                pw.write(matcher.group(1) + "\n");
            }

        } finally {
            pw.close();
        }
    }

    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.nhaccuatui.com");
            File receivePath = new File("src/CrawlSongFromNCTSaveFile/CrawlSongFromNCT");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+ ", "");

            try{
                writeSong(receivePath, content);
                System.out.println("Write file is done!");
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

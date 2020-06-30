import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private List <String> lyrics;


    public Song(String title, String artist, List <String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List <String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List <String> lyrics) {
        this.lyrics = lyrics;
    }

    public static List<String> parseLyrics (String lyrics){
//        List<String>parsedLyricsList = new ArrayList<>(Arrays.asList(lyrics.split(" ")));
//        return parsedLyricsList;
        //instructor solution:
        return Arrays.asList(lyrics.split(" "));
    }

//    public static void main(String[] args) {
//        System.out.println(parseLyrics("Hello my love, i heard a kiss from you."));
//    }

}

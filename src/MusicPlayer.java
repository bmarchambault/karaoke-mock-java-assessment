import javax.imageio.IIOException;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {
    private String voice = "";

    public MusicPlayer (){};
    public MusicPlayer(String voice){
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void play(Album album) {
        for (Song song : album.getSongs()) {
            play(song);
        }
    }

    @Override
    public void play(Song song){
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("say" + "now playing..." + song.getTitle() + " by" + song.getArtist());
            sleep(INTRO_PAUSE);
            for (String lyric : song.getLyrics()) {
                if (voice.isEmpty()) {
                    r.exec("say " + lyric);
                } else {
                    r.exec("say -v" + voice + " " + lyric);
                }
                sleep(WORD_CADENCE);
            }
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}

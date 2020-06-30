import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
//        this.songs =  new ArrayList<>();//wrong
        this.songs = songs;
    }
//    public void addSong(Song title) {
//        Song.setTitle(title);//for this to work, need to extend song... not what we're dong though
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    //never tested to see if it worked:
//    private void printTrackListings (List<Song> song){
//        for(int i = 0; i < song.size(); i++){
//            System.out.println(name + " track listing... \n" + i +". " + songs.get(i) +"\n");
//        }

        //instructor solution:
        public void printTrackListings() {
            System.out.println(name.toUpperCase() + " track listing...");
            for (int i = 0; i < songs.size(); i += 1) {
                System.out.println((i + 1) + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
            }
        }



    public static void main(String[] args) {

    }
}

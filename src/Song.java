public class Song {

    private String title;
    private String artist;
    private double length;

    public Song() {
        title = "Suavemente";
        artist = "Elvis Crespo";
        length = 2.5;
    }

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        String k = "{title: " + title + " artist: " + artist + " length: " + length + "}";
        return k;
    }




}

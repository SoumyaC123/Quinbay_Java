class Song {
    String title;
    String artist;
    int duration;
    void play() {
    System.out.println("Playing song");
    }
    void printDetails() {
    System.out.println("This is " + title +
    " by " + artist);
    }
   }
   public class ex_42_A  {
    public static void main(String[] args) {
    Song song = new Song(); // Create an instance of the Song class.
    song.artist = "KK";
    song.title = "teri yaadon mein";
    song.play();
    song.printDetails();
    }
}

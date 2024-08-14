class Episode {
    int seriesNumber;
    int episodeNumber;

    void play() {
        System.out.println("Playing episode...");
    } //  Add play method

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}

public class ex_42_B  {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();  // This line now works correctly.
        episode.skipIntro();
    }
}


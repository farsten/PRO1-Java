package ex4;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes;

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
        this.episodes = new ArrayList<>();
    }

    public ArrayList<Episode> everyEpisode() {
        return episodes;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public int totalLength() {
        int total = 0;
        for (Episode episode : episodes) {
            total += episode.getLengthMinutes();
        }
        return total;
    }

    public ArrayList<String> getGuestActors() {
        ArrayList<String> guestActors = new ArrayList<>();
        for (Episode episode : episodes) {
            for (String guest : episode.getGuestActors()) {
                if (!guestActors.contains(guest)) {
                    guestActors.add(guest);
                }
            }
        }
return guestActors;
    }
}

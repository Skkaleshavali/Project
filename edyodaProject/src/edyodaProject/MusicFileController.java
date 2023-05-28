package edyodaProject;

import java.util.ArrayList;
import java.util.List;

public class MusicFileController {
    private List<MusicFile> musicFiles = new ArrayList<>();

    public void uploadMusicFile(MusicFile musicFile) {
        // Perform music file upload logic
        musicFiles.add(musicFile);
    }
}



package edyodaProject;
import java.util.*;
public class HomePageController {
    private List<User> users = new ArrayList<>();
    private List<MusicFile> musicFiles = new ArrayList<>();
    private List<AccessPermission> accessPermissions = new ArrayList<>();

    public List<MusicFile> getHomePage(String userEmail) {
        // Fetch the user from the list based on the provided email
        User user = getUserByEmail(userEmail);
        if (user == null) {
            throw new IllegalArgumentException("Invalid user email!");
        }

        // Fetch the relevant music files for the logged-in user
        List<MusicFile> relevantMusicFiles = new ArrayList<>();
        for (MusicFile musicFile : musicFiles) {
            if (musicFile.getUser().equals(user) || musicFile.getVisibility().equals("public")) {
                relevantMusicFiles.add(musicFile);
            } else {
                for (AccessPermission permission : accessPermissions) {
                    if (permission.getUser().equals(user) && permission.getMusicFile().equals(musicFile)) {
                        relevantMusicFiles.add(musicFile);
                        break;
                    }
                }
            }
        }

        return relevantMusicFiles;
    }

    private User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}




package edyodaProject;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        // Perform user registration logic
        users.add(user);
    }

    public boolean loginUser(User user) {
        // Perform user login logic (e.g., check email and password)
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}




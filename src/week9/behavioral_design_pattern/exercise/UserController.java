package week9.behavioral_design_pattern.exercise;

public class UserController {
    private UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void saveUser(User user) {
        userStorage.store(user);
    }
}

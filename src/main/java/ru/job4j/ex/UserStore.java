package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (User i : users) {
            if (i.getUsername().equals(login)) {
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("Пользователь не найден!");
        }
        return null;
    }


    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("User is not valid and shorter than three symbols!");
        }
        return false;
    }

        public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        try {
            User user = findUser(users, "Petr Arsentev");

        } catch ( UserNotFoundException us) {
            us.printStackTrace();

        }
            if (validate(user)) {
                System.out.println("This user has an access");
        }
    }
}

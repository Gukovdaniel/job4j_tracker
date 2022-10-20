package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("Пользователь не найден!");
        }
        return null;
    }


    public static boolean validate(User user) throws UserInvalidException {
        if (String.length(user) < 3) {
            throw new UserInvalidException("Имя меньше трех символов");
        } if (user.isValid()) {
               throw new UserInvalidException("Пользователь не валидный!");
            }
        return false;
    }

        public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}

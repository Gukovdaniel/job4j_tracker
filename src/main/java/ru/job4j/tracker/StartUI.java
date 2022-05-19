package ru.job4j.tracker;

public class StartUI {

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit the Item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name item ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно!");
        } else {
            System.out.println("Ошибка замены заявки");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete the Item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно!");
        } else {
            System.out.println("Ошибка удаления заявки!!!");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем " + name + " не найдены.");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            if (action.execute(input, tracker)) {
                run = true;
            } else {
                run = false;
            }
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
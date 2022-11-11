package ru.job4j.tracker;

public class SingleTracker {

    private static Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findByName(String key) {
        return null;
    }

    public Item[] findAll() {
        return null;
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }
}

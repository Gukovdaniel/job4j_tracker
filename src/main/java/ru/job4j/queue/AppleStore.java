package ru.job4j.queue;

import java.util.Queue;

/**
 * поле Queue хранит в себе очередь клиентов, которые пришли в магазин;
 *
 * - поле count хранит в себе количество доступного к покупке товара;
 * метод getLastHappyCustomer() должен вернуть имя последнего счастливого обладателя желаемого товара;
 */

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = queue.size(); i > count; i--) {
            queue.poll();
        }
        return queue.peek().toString();
    }

    public String getLastUpsetCustomer() {
        for (int i = queue.size(); i > count - 1; i--) {
            queue.poll();
        }
        return queue.peek().toString();
    }
}

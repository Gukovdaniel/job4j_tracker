package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу простейшего банковского сервиса, который может
 * выполнять функции добавления/удаления клиента, добавление к клинту его аккаунта,
 * поиск клиента по его пасспорту и его реквизитам а также перевод денег на другой аккаунт
 * @author gukov,job4j
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение сервиса осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод принимает на вход объект типа User
     * и записывает его в карточку users, сопостовляя user и новый список ArrayList
     * @param user - Объект типа User
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
        }

    /**
     * Метод удаляет пользователя
     * @param passport - входящий параметр паспорт типа String, удаление происходит
     *                 через создание нового объекта User по входящему параметру паспорт
     * @return - возвращает булево значение если удаление прошло успешно
     */
    public boolean deleteUser(String passport) {
           return (users.remove(new User(passport, "")) != null);
        }

    /**
     * метод добавляет аккаунт в систему
     * @param passport - паспортные данные из класса User
     * @param account - объект класса Account
     */
    public void addAccount(String passport, Account account) {
            User user = findByPassport(passport);
            if (user != null) {
              List<Account> accounts = users.get(user);
              if (!accounts.contains(account)) {
                  accounts.add(account);
              }
            }
        }

    /**
     * метод находит пользователя в системе по паспорту
     * @param passport - паспортные данные из класса User
     * @return - метод возвращает объект типа User если таковой имеется или возвращает ноль если такого нет
     */
    public User findByPassport(String passport) {
            for (User key : users.keySet()) {
                if (key.getPassport().equals(passport)) {
                    return key;
                }
            }
            return null;
        }

    /**
     * метод находит пользователя в системе по паспорту и реквизитам счета
     * @param passport - паспортные данные из класса User
     * @param requisite - реквизиты счета класса Account
     * @return - метод возвращает объект типа User если таковой имеется или возвращает ноль если такого нет
     */
    public Account findByRequisite(String passport, String requisite) {
            User user = findByPassport(passport);
            if (user != null) {
                for (Account key : users.get(user)) {
                    if (key.getRequisite().equals(requisite)) {
                        return key;
                    }
                }
            }
                return null;
            }

    /**
     * метод переносит определенную сумму с одного счета на другой
     * @param srcPassport - паспорт отправителя
     * @param srcRequisite - реквизиты отправителя
     * @param destPassport - паспорт получателя
     * @param destRequisite - реквизиты получателя
     * @param amount - сумма которую хотим перевести
     * @return - возвращает булево значение true при успешном переводе и false при ошибке перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                     String destPassport, String destRequisite, double amount) {
            boolean rsl = false;
            Account account = findByRequisite(srcPassport, srcRequisite);
            Account account1 = findByRequisite(destPassport, destRequisite);
            if (account != null && account1 != null && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                account1.setBalance(account1.getBalance() + amount);
                rsl = true;
            }
            return rsl;
        }

    /**
     * метод позволяет получить список аккаунтов привязанных к пользователю
     * @param user - пользователь у которого запрашивается список его аккантов
     * @return - возвращает список аккаунтов пользователя
     */
    public List<Account> getAccounts(User user) {
            return users.get(user);
        }
    }


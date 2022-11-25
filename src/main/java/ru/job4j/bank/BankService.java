package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class BankService {
        private final Map<User, List<Account>> users = new HashMap<>();

        public void addUser(User user) {
            if (!users.containsKey(user)) {
                users.put(user, new ArrayList<>());
            }
        }

        public boolean deleteUser(String passport) {
            users.remove(passport);
            return false;
        }

        public void addAccount(String passport, Account account) {
            User user = findByPassport(passport);
            if (!this.users.containsKey(account)) {
                this.users.put(user, (List<Account>) account);
            }
        }

        public User findByPassport(String passport) {
            for (User key : users.keySet()) {
                if (key.equals(passport)) {
                    users.get(key);
                }
            }
            return null;
        }

        public Account findByRequisite(String passport, String requisite) {
            User user = findByPassport(passport);
            if (!user.equals(null)) {
                this.users.get(user).contains(requisite);
            }
                return null;
            }

        public boolean transferMoney(String srcPassport, String srcRequisite,
                                     String destPassport, String destRequisite, double amount) {
            boolean rsl = false;
            Account account = findByRequisite(srcPassport, srcRequisite);
            Account account1 = findByRequisite(destPassport, destRequisite);
            User user1 = findByPassport(destPassport);
            if (this.users.get(user1).contains(account1) && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                account1.setBalance(account1.getBalance() + amount);
                rsl = true;
            }
            return rsl;
        }

        public List<Account> getAccounts(User user) {
            return users.get(user);
        }
    }


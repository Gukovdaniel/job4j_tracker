package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class BankService {
        private final Map<User, List<Account>> users = new HashMap<>();

        public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
        }

        public boolean deleteUser(String passport) {
           return (users.remove(new User(passport, "")) != null);
        }

        public void addAccount(String passport, Account account) {
            User user = findByPassport(passport);
            if (user != null) {
              List<Account> accounts = users.get(user);
              if (!accounts.contains(account)) {
                  accounts.add(account);
              }
            }
        }

        public User findByPassport(String passport) {
            for (User key : users.keySet()) {
                if (key.equals(passport)) {
                    return key;
                }
            }
            return null;
        }

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

        public List<Account> getAccounts(User user) {
            return users.get(user);
        }
    }


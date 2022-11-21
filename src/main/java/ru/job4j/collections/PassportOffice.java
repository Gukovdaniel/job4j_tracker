package ru.job4j.collections;

import java.util.HashMap;
import java.util.Map;

    public class PassportOffice {
        private Map<String, Citizen> citizens = new HashMap<>();

        public boolean add(Citizen citizen) {
            boolean rsl = false;
            if (!citizens.containsKey(citizens.keySet())) {
                citizens.put(citizen.getPassport(), citizen);
                rsl = true;
            }
            return rsl;
        }

        public Citizen get(String passport) {
            return citizens.get(passport);
        }
    }

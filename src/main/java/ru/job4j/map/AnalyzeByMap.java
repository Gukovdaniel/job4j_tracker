package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double result = 0;
        int count = 0;
        for (Pupil p : pupils) {
            for (Subject n : p.subjects()) {
                result += n.score();
                count++;
            }
        }
        return result / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List listA = new ArrayList();
        for (Pupil p : pupils) {
            double result = 0;
            for (Subject n : p.subjects()) {
                result += n.score();
            }
            Label label = new Label(p.name(), result / p.subjects().size());
            listA.add(label);
        }
        return listA;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                Integer score = temp.getOrDefault(subject.name(), 0);
                temp.put(subject.name(), score + subject.score());
            }
        }
            List<Label> result = new ArrayList<>();
           for (String s : temp.keySet()) {
               result.add(new Label(s, temp.get(s) / pupils.size()));
            }
            return result;
        }

        public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil p : pupils) {
            double sum = 0;
            for (Subject s : p.subjects()) {
                sum += s.score();
            }
            result.add(new Label(p.name(), sum));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil p : pupils) {
            for (Subject n : p.subjects()) {
                Integer score = temp.getOrDefault(n.name(), 0);
                temp.put(n.name(), score + n.score());
            }
        }
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : temp.entrySet()) {
            result.add(new Label(e.getKey(), e.getValue()));
            }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}
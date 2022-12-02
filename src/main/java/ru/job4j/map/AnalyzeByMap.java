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
            int count = 0;
            for (Subject n : p.subjects()) {
                result += n.score();
                count++;
            }
            Label label = new Label(p.name(), result / count);
            listA.add(label);
        }
        return listA;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List listA = new ArrayList();
        Map<String, Integer> subject = new LinkedHashMap<>();
        int result = 0;
        for (Pupil p : pupils) {
            for (Subject n : p.subjects()) {
                result += n.score();
                subject.put(n.name(), result);
                result = 0;
            }
            //Label label = new Label(___, ___);
                //listA.add(label);

            }
        return listA;
    }

    //чтобы реализовать данный метод, нам необходимо будет собрать временную Map<String, Integer>
    // (в качестве реализации используем LinkedHashMap) - в качестве ключа используем название предмета, в
    // качестве значения - сумма баллов по этому предмету, которую мы получим у каждого ученика. Далее мы перебираем
    // пары ключ-значение в цикле и на их основе создаем объекты типа Label - в качестве первого параметра передаем ключ
    // карты, в качестве второго - значение карты разделенное на количество учеников. Созданный объект добавляем в
    // результирующий список, его мы и вернем в конце метода.

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}
package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report2 = new HtmlReport();
        TextReport report = new TextReport();
        JSONReport report1 = new JSONReport();
        String text = report1.gen("Report name", "Report body");
        System.out.println(text);
    }
}

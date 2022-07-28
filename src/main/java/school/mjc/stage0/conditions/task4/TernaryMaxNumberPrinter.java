package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        String result;
        System.out.println(first > second ? "1. Greatest from 2.": "");
        System.out.println(first > third ? "1. Greatest from 3.": "");
        System.out.println(second > first ? "2. Greatest from 1.": "");
    }
}

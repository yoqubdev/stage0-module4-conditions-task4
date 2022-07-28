package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        result = (first > second && first >third) ? first : 0;
        result = (second > first && second >third) ? second : 0;
        result = (third > first && third >second) ? third : 0;
        System.out.println(result);
    }
}

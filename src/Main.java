public class Main {
    public static void main(String[] args) {
        //Задача 4
        float targetWeight = 7f;
        float minStep = 0.25f;
        float maxStep = 0.5f;
        float maxDayCount = targetWeight / minStep;
        float minDayCount = targetWeight / maxStep;
        float averageDayCount = (maxDayCount + minDayCount) / 2f;
        System.out.println("Задача 4");
        System.out.println("Если спортсмен будет терять по " + minStep + " кг в день, то потребуется " + maxDayCount + " дней");
        System.out.println("Если спортсмен будет терять по " + maxStep + " кг в день, то потребуется " + minDayCount + " дней");
        System.out.println("В среднем потребуется " + averageDayCount + " день");
    }
}
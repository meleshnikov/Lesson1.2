public class Main {
    public static void main(String[] args) {
        //Задача 5
        float salaryMasha = 67760f;
        float salaryDen = 83690f;
        float salaryKris = 76230f;
        float salaryCoefficient = 1.1f;
        float newSalaryMasha = salaryMasha * salaryCoefficient;
        float newSalaryDen = salaryDen * salaryCoefficient;
        float newSalaryKris = salaryKris * salaryCoefficient;
        byte monthsCount = 12;
        float annualSalaryMasha = salaryMasha * monthsCount;
        float annualSalaryDen = salaryDen * monthsCount;
        float annualSalaryKris = salaryKris * monthsCount;
        float newAnnualSalaryMasha = newSalaryMasha * monthsCount;
        float newAnnualSalaryDen = newSalaryDen * monthsCount;
        float newAnnualSalaryKris = newSalaryKris * monthsCount;
        float incomeMasha = newAnnualSalaryMasha - annualSalaryMasha;
        float incomeDen = newAnnualSalaryDen - annualSalaryDen;
        float incomeKris = newAnnualSalaryKris - annualSalaryKris;
        System.out.println("Задача 5");
        System.out.println("Маша теперь получает " + newSalaryMasha + " руб. Годовой доход вырос на " + incomeMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " руб. Годовой доход вырос на " + incomeDen + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + " руб. Годовой доход вырос на " + incomeKris + " рублей");
    }
}
public class Main {
    public static void main(String[] args) {
        //Задача 2
        float boxerWeight1 = 78.2f; //вес первого боксера в кг
        float boxerWeight2 = 82.7f; //вес второго боксера в кг
        float totalWeight = boxerWeight1 + boxerWeight2; //суммарный вес
        float difWeight = boxerWeight2 - boxerWeight1; //разница между весами
        System.out.println("Задача 2");
        System.out.println("Вес первого бойца = " + boxerWeight1 + "кг");
        System.out.println("Вес второго бойца = " + boxerWeight2 + "кг");
        System.out.println("Общий вес двух бойцов = " +  totalWeight + "кг");
        System.out.println("Разница между весами бойцов = " +   difWeight + "кг");
    }
}
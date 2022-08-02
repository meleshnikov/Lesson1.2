public class Main {
    public static void main(String[] args) {
        //Задача 3
        float bananaWeight = 80f; //масса одного банана в г
        float milkDensity = 105f/100f; //плотность молока в г/мл
        float iceCreamWeight = 100f; //масса одного мороженного в г
        float eggWeight = 70f; //масса одного яйца в г
        float milkVolume = 200f; //объем молока в мл
        byte bananaQty = 5; //Количество бананов
        byte iceCreamQty = 2; //количество мороженных
        byte eggsQty = 4; //количество яиц
        float breakfastWeight = bananaWeight * bananaQty + milkDensity*milkVolume + iceCreamWeight * iceCreamQty
                + eggWeight * eggsQty; //общая масса завтрака в г
        short grPerKg = 1000;
        float breakfastWeightKg = breakfastWeight / (float)grPerKg;
        System.out.println("Задача 3");
        System.out.println("Масса завтрака составляет " + breakfastWeight + "г (" + breakfastWeightKg + "кг)");
    }
}
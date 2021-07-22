package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(260);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("260 rubles are " + dollar + " dollar.");
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = outEuro == expectedEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        float inDollar = 140;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToEuro(inDollar);
        boolean passedDollar = outDollar == expectedDollar;
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}


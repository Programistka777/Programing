public class Main {
    public static void main(String[] args) {
        // Створення змінних примітивних типів
        byte firstByte = 10;
        byte secondByte = 20;

        short firstShort = 1_000;
        short secondShort = 2_000;

        int firstInt = 100000;
        int secondInt = 200000;

        long firstLong = 1000000000L;
        long secondLong = 2000000000L;

        float firstFloat = 5.5f;
        float secondFloat = 10.5f;

        double firstDouble = 10.5;
        double secondDouble = 20.5;

        char firstChar = 'A';
        char secondChar = 'B';

        // Обчислення сум
        int sumByte = firstByte + secondByte;
        int sumShort = firstShort + secondShort;
        int sumInt = firstInt + secondInt;
        long sumLong = firstLong + secondLong;
        float sumFloat = firstFloat + secondFloat;
        double sumDouble = firstDouble + secondDouble;

        int sumCharsAscii = firstChar + secondChar;

        // Сумування всіх результатів
        long sum = sumByte + sumShort + sumInt + sumLong + (long) sumFloat + (long) sumDouble + sumCharsAscii;

        // Виведення результату в консоль
        System.out.println("long sum: " + sum);

    }
}
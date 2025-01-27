public class PracticalTasks {

    // 1. Метод для вывода трёх слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Метод проверки суммы чисел
    public static void checkSumSign() {
        int a = 5; 
        int b = -7; 
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод проверки цвета
    public static void printColor() {
        int value = 50; 

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод сравнения чисел
    public static void compareNumbers() {
        int a = 6; 
        int b = 3; 

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка суммы на диапазон
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Проверка числа на положительность
    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Проверка числа на отрицательность
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки указанное количество раз
    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    // 9. Проверка на високосный год
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Инверсия массива 0 и 1
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    // 11. Заполнение массива числами от 1 до 100
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12. Умножение чисел массива, меньших 6, на 2
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13. Заполнение диагональных элементов массива единицами
    public static void fillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1; // Главная диагональ
            matrix[i][matrix.length - 1 - i] = 1; // Побочная диагональ
        }
    }

    // 14. Создание массива с заданной длиной и значением
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        // Пример вызова методов
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println("Сумма в диапазоне: " + isSumInRange(7, 8));
        checkPositiveOrNegative(-5);
        System.out.println("Число отрицательное: " + isNegative(-3));

        printStringMultipleTimes("Hello", 3);
        System.out.println("Год високосный: " + isLeapYear(2024));

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array);
        System.out.println("Инвертированный массив: " + java.util.Arrays.toString(array));

        int[] filledArray = fillArray();
        System.out.println("Заполненный массив: " + java.util.Arrays.toString(filledArray));

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(numbers);
        System.out.println("Массив после умножения: " + java.util.Arrays.toString(numbers));

        int[][] matrix = new int[5][5];
        fillDiagonals(matrix);
        System.out.println("Матрица с диагоналями:");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        int[] customArray = createArray(10, 7);
        System.out.println("Массив с заданными значениями: " + java.util.Arrays.toString(customArray));
    }
}

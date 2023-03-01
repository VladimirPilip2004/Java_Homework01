package HW_01;

// Задача 2. Вывести все простые числа от 1 до 1000

public class HomeWork_012 {
    public static void main(String[] args) { // Выводим список всех простых чисел
        for (int i = 1; i < 1000; i++)
            if (simpleNums(i))
                System.out.print(i + " ");
    }
    //Проверка простого числа 
    public static boolean simpleNums(int num) {
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
} 
package HW_01;
import java.util.Scanner;

// Задача 3. Реализовать простой калькулятор (+ - / *)

public class HomeWork_013 {
    public static void main(String[] args) { // Ввод данных
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Выберите действие (+ - / *): ");
        String action = sc.nextLine();

        System.out.print("Введите 2-ое число: ");
        int num2 = Integer.parseInt(sc.nextLine());

        sc.close();

        System.out.print(num1 + " " + action + " " + num2 + " = ");

        switch (action) { // Выбор действия
            case "+":
                System.out.println(num1 + num2);
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Неверный ввод. Попробуйте заново!");
        }
    } 
} 
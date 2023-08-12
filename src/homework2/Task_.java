package homework2;

import java.util.Scanner;

public class Task_
{
    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные
    public static void main (String [] args)
    {
        System.out.println("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        if (a < 0)
            {
                for (int x = 1; x <= a; x++)
                b += x;
                {
                    System.out.println(b);
                }
            }
        else
        {
            System.out.println("Введено не верное число!");
        }


    }
}

package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1
{
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль

    public static void main (String [] args)
    {
        int[][] arr = generateArray2();
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Введите число");
        if (scanner.hasNextInt())
        {
            x = scanner.nextInt();
            for (int i = 0; i < arr.length; i++)
            {
                for ( int j = 0; j < arr.length; j++)
                {
                    arr[i][j] += x;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
        else
        {
            System.out.println("Введено не число");
        }

    }
    public static int[][] generateArray2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 0");
        int sizearr = 0;
        if (scanner.hasNextInt())
        {
            sizearr = scanner.nextInt();
        }
        else
        {
            System.out.println("Введено не число, повторите ввод");
        }
        if (sizearr < 0)
        {
            System.out.println("Введено не верное число, повторите ввод");
        }
        int [][] array = new int[sizearr][sizearr];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                array[i][j] = Math.round((float) (Math.random() * 10));
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;

    }


}

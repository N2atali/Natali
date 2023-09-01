package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1
{
    //Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
    //массива (просто целое число). После того, как размер массива задан, заполнить его
    //одним из двух способов: используя Math.random(), или каждый элемент массива вводится
    //пользователем вручную. Попробовать оба варианта.
    //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void main (String [] args)
    {
        int[] array = generateArray();
        System.out.println("Ваш массив:");
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length];
        for (int i = 0, x = array.length - 1; x >= 0; i++, x--)
        {
            array2[i] = array[x];
            System.out.println("Ваш массив в обратном порядке: " + Arrays.toString(array2));
        }

    }

    public static int[] generateArray()
    {
        boolean work = true;
        while (true)
        {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите размер массива");
            int sizearr;
            if (scanner.hasNextInt())
            {
                sizearr = scanner.nextInt();
                int[] array;
                if (sizearr <= 0)
                {
                    System.out.println("Массив не может быть меньше 0, повторите ввод.");
                    continue;
                }
                else
                {
                    array = new int[sizearr];
                    for (int i = 0; i < sizearr; i++)
                    {
                        array[i] = Math.round((float) (Math.random() * 10));
                    }
                }
                return array;

            }
            else
            {
                System.out.println("Введено не число, повторите ввод.");
                continue;
            }
        }


    }
}

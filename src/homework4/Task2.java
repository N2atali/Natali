package homework4;

import java.util.Arrays;

import static homework4.Task1.generateArray;

public class Task2
{
    //Найти минимальный-максимальный элементы и вывести в консоль.

    public static void main (String [] args)
    {
        int [] arr = generateArray ();
        System.out.println("Ваш массив");
        System.out.println(Arrays.toString(arr));
        int min = minA(arr);
        int max = maxA(arr);
        System.out.println("Минимальный элемент массива равен:" + min + ", а максимальный элемент равен:" + max);
    }
    public static int minA(int [] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;

    }
    public static int maxA(int [] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

}

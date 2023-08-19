package homework4;

import java.util.Arrays;

import static homework4.Task1.generateArray;

public class Task4
{
   // Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет
    public static void main (String [] args)
    {
        int [] arr = generateArray ();
        System.out.println("Ващ массив");
        System.out.println(Arrays.toString(arr));
        int x = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                x++;
                System.out.println("В массиве " + x + " нулевых элементов");
            }

        }
        if (x == 0)
        {
            System.out.println("В массиве нет нулевых элементов");
        }
    }
}

package homework4;

import java.util.Arrays;

import static homework4.Task1.generateArray;

public class Task6
{
    //Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //число больше предыдущего)

    public static void main (String [] args)
    {
        int [] arr = generateArray ();
        System.out.println("Ващ массив");
        System.out.println(Arrays.toString(arr));
        int x = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] < arr[i++])
            {
                x++;
            }
        }
        if (x == arr.length - 1)
        {
            System.out.println("Ваш массив с возрастающей последовательностью");
        }
        else
        {
            System.out.println("Ваш массив не с возрастающей последовательностью");
        }

    }
}

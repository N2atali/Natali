package homework4;

import java.util.Arrays;

import static homework4.Task1.generateArray;
import static homework4.Task2.maxA;
import static homework4.Task2.minA;

public class Task3
    //Найти индексы минимального и максимального элементов и вывести в консоль.
{
    public static void main (String [] args)
    {
        int [] arr = generateArray ();
        System.out.println("Ващ массив");
        System.out.println(Arrays.toString(arr));
        int min = minA(arr);
        int max = maxA(arr);
        int minI = 0;
        int maxI = 0;
        for ( int i = 0; i < arr.length; i++)
        {
            if (arr[i] == min)
            {
                minI = i;
            }
            if (arr[i] == max)
            {
                maxI = i;
            }
        }
        System.out.println("Индексы минималеньго элемента:" + minI + " , индексы максимального элемента:" + maxI);
    }

}

package homework4;

import java.util.Arrays;

import static homework4.Task1.generateArray;

public class Task5
{
    //Пройти по массиву и поменять местами элементы первый и последний, второй и
    //предпоследний и т.д.

    public static void main (String [] args)
    {
        int [] arr = generateArray ();
        System.out.println("Ващ массив");
        System.out.println(Arrays.toString(arr));
        int a = arr.length - 1;
        int b;
        for ( int i = 0; i < arr.length / 2; i++)
        {
            b = arr[i];
            arr[i] = arr[a];
            arr[a] = b;
            a--;
        }
        System.out.println("Измененный масив: " + Arrays.toString(arr));
    }
}

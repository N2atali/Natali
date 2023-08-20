package homework5;

import java.util.Arrays;

public class Task2
    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    // двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White).

{
    public static void main (String [] args)
    {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i = i + 2)
        {
            for ( int j = 0; j < arr.length; j = j + 2)
            {
                arr[i][j] = "B";
                arr[i][j+1] = "W";
            }
        }
        for (int i = 1; i < arr.length; i = i + 2)
        {
            for (int j = 0; j < arr.length; j = j + 2)
            {
                arr[i][j] = "W";
                arr[i][j+1] = "B";
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

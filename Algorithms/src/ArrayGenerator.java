import java.util.Random;

/*
* Author: Aliaksandr Hladkou
*
* Array generator to initialize a specific type of an array
* */

public class ArrayGenerator {

    public int[] increasing(int size)
    {
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = i;
        return array;
    }

    public int[] decreasing(int size)
    {
        int[] array = new int[size];
        int bound = size - 1;

        for (int i = bound; i >= 0; i--)
            array[i] = bound-i;
        return array;
    }

    public int[] randomly(int size)
    {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);
        return array;
    }

    public int[] shuffle(int[] array)
    {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            int rand = random.nextInt(array.length-1);
            int temp = array[rand];
            array[rand] = array[i];
            array[i] = temp;
        }

        return array;
    }
}

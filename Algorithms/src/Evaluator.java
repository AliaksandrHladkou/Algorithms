/*
* Author: Aliaksandr Hladkou
*
* Evaluating data
* */

public class Evaluator {

    public int getSmallest(int[] data)
    {
        int smallest = data[0];

        for (int i = 1; i < data.length; i++)
            if (data[i] < smallest)
                smallest = data[i];

        return smallest;
    }

    public int getLargest(int[] data)
    {
        int largest = data[0];

        for (int i = 1; i < data.length; i++)
            if (data[i] > largest)
                largest = data[i];

        return largest;
    }

    public static void main (String[] args)
    {
        int[] array = new int[]{4, 3, 5, 2, 10};
        Evaluator evaluator = new Evaluator();
        System.out.println(evaluator.getSmallest(array));
        System.out.println(evaluator.getLargest(array));
    }
}

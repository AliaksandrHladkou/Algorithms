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

    public int getGCD(int first, int second)
    {
        if (first < 0 || second < 0)
            throw new ArithmeticException();
        else if (first == 0 || second == 0)
            return Math.abs(first-second);

        while (first % second != 0)
        {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return second;
    }

    public int getLCM(int first, int second)
    {
        if (first == 0 || second == 0)
            return 0;
        int max = Math.max(Math.abs(first), Math.abs(second));
        int min = Math.min(Math.abs(first), Math.abs(second));
        int lcm = max;

        while (lcm % min != 0)
        {
            lcm += max;
        }

        return lcm;
    }

    public static void main (String[] args)
    {
        int[] array = new int[]{4, 3, 5, 2, 10};
        Evaluator evaluator = new Evaluator();
        System.out.println(evaluator.getSmallest(array));
        System.out.println(evaluator.getLargest(array));
        System.out.println("GCD is: " + evaluator.getGCD(array[1], array[4]));
        System.out.println("LCM is: " + evaluator.getLCM(array[0], array[4]));
    }
}

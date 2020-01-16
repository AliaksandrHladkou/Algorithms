/*
* Author: Aliaksandr Hladkou
*
* Evaluating numbers
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

    public boolean isPrime(int number)
    {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void main (String[] args)
    {
        int[] array = new int[]{4, 3, -5, 2, 10};
        Evaluator evaluator = new Evaluator();
        System.out.println("The smallest number is: " + evaluator.getSmallest(array));
        System.out.println("The largest number is: " + evaluator.getLargest(array));
        System.out.println("GCD is: " + evaluator.getGCD(array[1], array[4]));
        System.out.println("LCM is: " + evaluator.getLCM(array[0], array[4]));
        System.out.println();

        ArrayGenerator generator = new ArrayGenerator();
        int[] incArray = generator.increasing(100);

        for (int i = 0; i < incArray.length; i++)
            if (evaluator.isPrime(incArray [i]))
                System.out.println("The number " + incArray[i] + " is prime");
            else
                System.out.println("The number " + incArray[i] + " is NOT prime");
    }
}

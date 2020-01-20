/*
* Author: Aliaksandr Hladkou
*
* Examples of number manipulation and evaluation.
* */
public class MainEngine {
    public static void main (String[] args)
    {
        Evaluator evaluator = new Evaluator();
        ArrayGenerator generator = new ArrayGenerator();
        int[] incArray = generator.increasing(100);
        int[] decArray = generator.decreasing(10);
        int[] array = generator.randomly(100);

        System.out.println("The smallest number in random array is: " + evaluator.getSmallest(array));
        System.out.println("The largest number in random array is: " + evaluator.getLargest(array));
        System.out.println(String.format("GCD of %1$s and %2$s is: ", array[1], array[4])
                + evaluator.getGCD(array[1], array[4]));
        System.out.println(String.format("LCM of %1$s and %2$s is: ", array[0], array[4])
                + evaluator.getLCM(array[0], array[4]));


        System.out.println("Determining prime numbers in increasing array: ");
        for (int i = 0; i < incArray.length; i++)
            if (evaluator.isPrime(incArray [i]))
                System.out.println("The number " + incArray[i] + " is prime");
            else
                System.out.println("The number " + incArray[i] + " is NOT prime");

        printArray(decArray);
        generator.shuffle(decArray);
        System.out.println();
        printArray(decArray);
    }

    private static void printArray(int[] array)
    {
        for (int item : array)
            System.out.print(item + " ");
    }
}

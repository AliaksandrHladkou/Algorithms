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
}

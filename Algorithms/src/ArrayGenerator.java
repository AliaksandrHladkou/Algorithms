public class ArrayGenerator {
    private int[] array;

    public int[] increasing(int size)
    {
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = i;
        return array;
    }
}

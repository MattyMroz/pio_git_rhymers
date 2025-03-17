package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int INT = -1;
    public static int Max = 12;
    private int[] numbers = new int[Max];

    public int total = INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == INT;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (isEmpty())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return INT;
        return numbers[total--];
    }

}

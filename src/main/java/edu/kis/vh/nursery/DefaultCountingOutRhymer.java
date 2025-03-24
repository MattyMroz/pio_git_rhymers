package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_INDICATOR = -1;
    private static final int MAX_SIZE = 12;
    private int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (isEmpty())
            return EMPTY_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY_INDICATOR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}

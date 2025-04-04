package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        // TODO: brak komentarza wyjaśniającego logikę biznesową (dlaczego odrzucamy elementy większe od peek)
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}

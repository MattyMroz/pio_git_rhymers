package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(10);
        Assert.assertEquals(10, rhymer.peek());
        Assert.assertEquals(0, rhymer.reportRejected());

        rhymer.countIn(5);
        Assert.assertEquals(5, rhymer.peek());
        Assert.assertEquals(0, rhymer.reportRejected());

        rhymer.countIn(15);
        Assert.assertEquals(5, rhymer.peek());
        Assert.assertEquals(1, rhymer.reportRejected());

        rhymer.countIn(20);
        Assert.assertEquals(5, rhymer.peek());
        Assert.assertEquals(2, rhymer.reportRejected());
    }

    @Test
    public void testCountOut() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(15);
        rhymer.countIn(10);
        rhymer.countIn(5);

        Assert.assertEquals(5, rhymer.countOut());
        Assert.assertEquals(10, rhymer.countOut());
        Assert.assertEquals(15, rhymer.countOut());
        Assert.assertTrue(rhymer.isEmpty());
    }

    @Test
    public void testReportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();

        Assert.assertEquals(0, rhymer.reportRejected());

        rhymer.countIn(5);
        Assert.assertEquals(0, rhymer.reportRejected());

        rhymer.countIn(10);
        rhymer.countIn(15);
        rhymer.countIn(20);

        Assert.assertEquals(3, rhymer.reportRejected());
    }
}
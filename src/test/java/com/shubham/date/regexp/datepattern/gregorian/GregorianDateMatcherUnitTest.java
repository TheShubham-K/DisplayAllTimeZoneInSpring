package com.shubham.date.regexp.datepattern.gregorian;

import com.shubham.regexp.datepattern.DateMatcher;
import com.shubham.date.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import com.shubham.regexp.datepattern.gregorian.GregorianDateMatcher;
import org.junit.Test;

public class GregorianDateMatcherUnitTest {

    private final DateMatcher matcher = new GregorianDateMatcher();

    private final GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenUsingGregorianDateMatcher_thenFormatConstraintsSatisfied() {
        testHelper.assertFormat();
    }

    @Test
    public void whenUsingGregorianDateMatcher_thenRangeConstraintsSatisfied() {
        testHelper.assertRange();
    }

    @Test
    public void whenYearIsLeap_thenFebruaryHas29Days() {
        testHelper.assertFebruary29th();
    }

    @Test
    public void whenMonthIsFebruary_thenMonthContainsUpTo28Days() {
        testHelper.assertFebruaryGeneralDates();
    }

    @Test
    public void whenMonthIsShort_thenMonthContainsUpTo30Days() {
        testHelper.assertMonthsOf30Days();
    }

    @Test
    public void whenMonthIsLong_thenMonthContainsUpTo31Days() {
        testHelper.assertMonthsOf31Dates();
    }
}

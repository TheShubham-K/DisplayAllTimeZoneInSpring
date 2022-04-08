package com.shubham.date.regexp.datepattern.gregorian;

import com.shubham.regexp.datepattern.DateMatcher;
import com.shubham.date.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import com.shubham.regexp.datepattern.gregorian.MonthsOf31DaysMatcher;
import org.junit.Test;

public class MonthsOf31DaysMatcherUnitTest {

    private DateMatcher matcher = new MonthsOf31DaysMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsLong_thenMonthContainsUpTo31Days() {
        testHelper.assertMonthsOf31Dates();
    }
}
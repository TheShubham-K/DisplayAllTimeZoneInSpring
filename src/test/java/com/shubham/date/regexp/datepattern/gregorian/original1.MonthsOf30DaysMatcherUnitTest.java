package com.shubham.date.regexp.datepattern.gregorian;

import com.shubham.regexp.datepattern.DateMatcher;
import com.shubham.date.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import com.shubham.regexp.datepattern.gregorian.MonthsOf30DaysMatcher;
import org.junit.Test;

public class MonthsOf30DaysMatcherUnitTest {

    private DateMatcher matcher = new MonthsOf30DaysMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsShort_thenMonthContainsUpTo30Days() {
        testHelper.assertMonthsOf30Days();
    }
}
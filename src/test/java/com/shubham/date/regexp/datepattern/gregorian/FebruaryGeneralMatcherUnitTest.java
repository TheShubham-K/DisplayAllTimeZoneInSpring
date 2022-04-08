package com.shubham.date.regexp.datepattern.gregorian;

import com.shubham.date.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import com.shubham.regexp.datepattern.DateMatcher;
import com.shubham.regexp.datepattern.gregorian.FebruaryGeneralMatcher;
import org.junit.Test;

public class FebruaryGeneralMatcherUnitTest {

    private final DateMatcher matcher = new FebruaryGeneralMatcher();

    private final GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsFebruary_thenMonthContainsUpTo28Days() {
        testHelper.assertFebruaryGeneralDates();
    }
}
package com.shubham.date.regexp.datepattern.gregorian;

import com.shubham.date.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import com.shubham.regexp.datepattern.DateMatcher;
import com.shubham.regexp.datepattern.gregorian.February29thMatcher;
import org.junit.Test;

public class February29thMatcherUnitTest {

    private DateMatcher matcher = new February29thMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenYearIsLeap_thenYearHasFebruary29th() {
        testHelper.assertFebruary29th();
    }
}

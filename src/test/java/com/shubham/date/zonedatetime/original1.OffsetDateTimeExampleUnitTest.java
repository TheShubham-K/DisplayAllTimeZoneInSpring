package com.shubham.date.zonedatetime;

import static org.junit.Assert.assertTrue;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import com.shubham.Zonedatetime.OffsetDateTimeExample;
import org.junit.Test;

public class OffsetDateTimeExampleUnitTest {

    OffsetDateTimeExample offsetDateTimeExample = new OffsetDateTimeExample();

    @Test
    public void givenZoneOffset_whenGetCurrentTime_thenResultHasZone() {
        String offset = "+02:00";
        OffsetDateTime time = offsetDateTimeExample.getCurrentTimeByZoneOffset(offset);

        assertTrue(time.getOffset()
            .equals(ZoneOffset.of(offset)));
    }
}

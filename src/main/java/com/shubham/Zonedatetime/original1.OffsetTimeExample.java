package com.shubham.Zonedatetime;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeExample {

    public OffsetTime getCurrentTimeByZoneOffset(String offset) {
        ZoneOffset zoneOffSet = ZoneOffset.of(offset);
        return OffsetTime.now(zoneOffSet);
    }
}

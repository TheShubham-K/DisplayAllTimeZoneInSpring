package com.shubham.Zonedatetime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {

    public OffsetDateTime getCurrentTimeByZoneOffset(String offset) {
        ZoneOffset zoneOffSet= ZoneOffset.of(offset);
        return OffsetDateTime.now(zoneOffSet);
    }
}

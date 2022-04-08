package com.shubham.Zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {

    public ZonedDateTime getCurrentTimeByZoneId(String region) {
        ZoneId zone = ZoneId.of(region);
        return ZonedDateTime.now(zone);
    }

    public ZonedDateTime convertZonedDateTime(ZonedDateTime sourceDate, String destZone) {

        ZoneId destZoneId = ZoneId.of(destZone);
        return sourceDate.withZoneSameInstant(destZoneId);
    }
}

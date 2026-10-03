package com.example.opponotificationrelay;
import java.time.*;
/** Civil-time buckets keep the original offset during DST overlap. */
final class HealthTime {
    static long bucket(long stamp,int minutes,ZoneId zone){
        if(minutes!=30&&minutes!=60)throw new IllegalArgumentException("BUCKET_WIDTH");
        ZonedDateTime local=Instant.ofEpochMilli(stamp).atZone(zone);
        ZonedDateTime rounded=local.withMinute((local.getMinute()/minutes)*minutes).withSecond(0).withNano(0);
        long bucket=rounded.toInstant().toEpochMilli();
        // A partial-hour fallback may make the nominal hour start use the earlier offset.
        if(!rounded.getOffset().equals(local.getOffset())){
            java.time.zone.ZoneOffsetTransition transition=zone.getRules().previousTransition(local.toInstant().plusNanos(1));
            if(transition!=null){long boundary=transition.getInstant().toEpochMilli();if(boundary>bucket&&boundary<=stamp)bucket=boundary;}
        }
        return bucket;
    }
}

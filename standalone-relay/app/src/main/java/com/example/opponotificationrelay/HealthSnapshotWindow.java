package com.example.opponotificationrelay;
import java.time.*;
/** Immutable view demand. History stays on disk; dense samples only cover the selected day and prior night. */
final class HealthSnapshotWindow {
    final LocalDate start,end,anchor,detailStart,detailEnd;
    final long from,to,detailFrom,detailTo;final ZoneId zone;
    HealthSnapshotWindow(LocalDate start,LocalDate end,LocalDate anchor){
        zone=ZoneId.systemDefault();this.anchor=anchor;detailStart=anchor.minusDays(1);detailEnd=anchor.plusDays(1);
        this.start=start.isBefore(detailStart)?start:detailStart;this.end=end.isAfter(detailEnd)?end:detailEnd;
        if(!this.start.isBefore(this.end)||java.time.temporal.ChronoUnit.DAYS.between(this.start,this.end)>733)throw new IllegalArgumentException("SNAPSHOT_RANGE");
        from=this.start.atStartOfDay(zone).toInstant().toEpochMilli();to=this.end.atStartOfDay(zone).toInstant().toEpochMilli();detailFrom=detailStart.atStartOfDay(zone).toInstant().toEpochMilli();detailTo=detailEnd.atStartOfDay(zone).toInstant().toEpochMilli();
    }
    static HealthSnapshotWindow home(LocalDate day){return new HealthSnapshotWindow(day.minusDays(62),day.plusDays(1),day);}
    boolean detail(long stamp){return stamp>=detailFrom&&stamp<detailTo;}
    boolean detail(LocalDate day){return !day.isBefore(detailStart)&&day.isBefore(detailEnd);}
    boolean same(HealthSnapshotWindow other){return other!=null&&zone.equals(other.zone)&&start.equals(other.start)&&end.equals(other.end)&&anchor.equals(other.anchor)&&from==other.from&&to==other.to;}
}

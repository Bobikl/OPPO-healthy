package com.example.opponotificationrelay;

import java.io.IOException;
import java.time.*;

/** Identity and time interval frozen for one local analysis, including every read and commit. */
final class OsaAnalysisScope {
    final String device;
    final LocalDate date;
    final ZoneId zone;
    final int from,to;
    OsaAnalysisScope(String device,LocalDate date,ZoneId zone){
        this.device=device;this.date=date;this.zone=zone;
        from=Math.toIntExact(date.minusDays(1).atTime(20,0).atZone(zone).toEpochSecond());
        to=Math.toIntExact(date.atTime(20,0).atZone(zone).toEpochSecond());
    }
    boolean current(String device,LocalDate date,ZoneId zone,boolean cancelled){
        return !cancelled&&this.device.equalsIgnoreCase(device)&&this.date.equals(date)&&this.zone.equals(zone);
    }
    void check(String device,LocalDate date,ZoneId zone,boolean cancelled)throws IOException{
        if(!current(device,date,zone,cancelled))throw new IOException("OSA_SYNC_CANCELLED");
    }
}

package com.example.opponotificationrelay;
import java.time.*;
public final class OsaAnalysisScopeTest {
    static int checks;
    static void check(boolean value){checks++;if(!value)throw new AssertionError("SCOPE_"+checks);}
    public static void main(String[] args)throws Exception{
        LocalDate date=LocalDate.of(2026,10,24);ZoneId zone=ZoneId.of("Asia/Singapore");
        OsaAnalysisScope scope=new OsaAnalysisScope("AA:BB",date,zone);
        check(scope.current("aa:bb",date,zone,false));
        check(!scope.current("AA:CC",date,zone,false));
        check(!scope.current("AA:BB",date.plusDays(1),zone,false));
        check(!scope.current("AA:BB",date,ZoneId.of("UTC"),false));
        check(!scope.current("AA:BB",date,zone,true));
        check(scope.to-scope.from==86400);
        check(Instant.ofEpochSecond(scope.from).atZone(zone).toLocalTime().equals(LocalTime.of(20,0)));
        try{scope.check("AA:BB",date,ZoneId.of("UTC"),false);throw new AssertionError("missing rejection");}
        catch(java.io.IOException expected){check("OSA_SYNC_CANCELLED".equals(expected.getMessage()));}
        scope.check("AA:BB",date,zone,false);
        OsaAnalysisScope dst=new OsaAnalysisScope("AA:BB",LocalDate.of(2026,3,8),ZoneId.of("America/New_York"));
        check(dst.to-dst.from==23*3600);
        check(scope.from==new OsaAnalysisScope("AA:BB",date,zone).from);
        System.out.println("OsaAnalysisScopeTest: "+checks+" checks passed");
    }
}

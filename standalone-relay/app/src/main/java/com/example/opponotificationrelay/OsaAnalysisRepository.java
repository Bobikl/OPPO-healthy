package com.example.opponotificationrelay;
import android.content.Context;import android.database.Cursor;import java.time.*;import java.util.*;import java.io.IOException;
/** Reads independent watch rows, never imported official risk results. */
public final class OsaAnalysisRepository {
 private OsaAnalysisRepository(){}
 private static void guard(Context c,String device,java.util.function.BooleanSupplier cancel,long until)throws IOException{if(cancel.getAsBoolean()||!device.equals(RelayConfig.getTargetMac(c)))throw new IOException("OSA_SYNC_CANCELLED");if(android.os.SystemClock.elapsedRealtime()>=until)throw new IOException("OSA_SYNC_DEADLINE");}
 public static void refresh(Context c,String device,LocalDate date,java.util.function.BooleanSupplier cancel)throws Exception {
  long deadline=android.os.SystemClock.elapsedRealtime()+180000;ZoneId zone=ZoneId.systemDefault();int from=(int)date.minusDays(1).atTime(20,0).atZone(zone).toEpochSecond(),to=(int)Math.min(System.currentTimeMillis()/1000,date.atTime(20,0).atZone(zone).toEpochSecond());
  for(HealthSyncProtocol.Kind kind:new HealthSyncProtocol.Kind[]{HealthSyncProtocol.Kind.SLEEP_STAGE,HealthSyncProtocol.Kind.OXYGEN}){
   int next=from;boolean complete=false;for(int page=0;page<48;page++){
    guard(c,device,cancel,deadline);HealthSyncProtocol.Request request=HealthSyncProtocol.range(kind,next,to);byte[] bytes=read(c,device,request,cancel,deadline);HealthSyncProtocol.Summary result=HealthSyncProtocol.parse(request,bytes);HealthArchive.get(c).save(device,request,bytes,Collections.emptyMap());
    if(!result.more){complete=true;break;}if(result.end<=next||result.end>=to)throw new IOException("OSA_INPUT_CURSOR");next=result.end;
   }if(!complete)throw new IOException("OSA_INPUT_PAGE_LIMIT");
  }
  List<OsaWatchProtocol.Samples> pages=new ArrayList<>();int next=from;boolean complete=false;for(int page=0;page<24;page++){
   OsaWatchProtocol.Request request=OsaWatchProtocol.sensor(next,to);OsaWatchProtocol.Samples result=OsaWatchProtocol.sensor(request,OsaWatchSync.read(c,device,request,cancel,deadline));pages.add(result);if(!result.more){complete=true;break;}if(result.end<=next||result.end>=to)throw new IOException("OSA_INPUT_CURSOR");next=result.end;
  }if(!complete)throw new IOException("OSA_INPUT_PAGE_LIMIT");guard(c,device,cancel,deadline);try(OsaInputStore store=new OsaInputStore(c)){store.commit(device,"sensor",from,to,pages);}
 }
 private static byte[] read(Context c,String device,HealthSyncProtocol.Request request,java.util.function.BooleanSupplier cancel,long deadline)throws Exception{
  RfcommWearTransport t=RfcommWearTransport.getInstance(c);long until=Math.min(deadline,android.os.SystemClock.elapsedRealtime()+30000);java.util.concurrent.CountDownLatch done=new java.util.concurrent.CountDownLatch(1);byte[][] bytes={null};boolean[] accepted={false};long generation=-1;boolean queued=false;
  while(!queued){guard(c,device,cancel,until);OafHealthChannel.Snapshot state=t.healthSettings();if(!state.connected&&!state.busy)t.requestHealthSettings();else if(state.connected&&!state.busy){generation=t.healthConnection();queued=t.readHealthHistory(request,(ok,body,message)->{accepted[0]=ok;bytes[0]=body;done.countDown();});}if(!queued)Thread.sleep(100);}
  while(!done.await(100,java.util.concurrent.TimeUnit.MILLISECONDS))guard(c,device,cancel,until);guard(c,device,cancel,deadline);if(!accepted[0]||generation!=t.healthConnection()||bytes[0]==null)throw new IOException("OSA_INPUT_RESPONSE");return bytes[0];
 }
 public static OsaAnalysisInput load(Context context,String device,LocalDate date)throws Exception{
  ZoneId zone=ZoneId.systemDefault();int from=(int)date.minusDays(1).atTime(20,0).atZone(zone).toEpochSecond(),to=(int)date.atTime(20,0).atZone(zone).toEpochSecond();
  TreeMap<Integer,Integer> sleep=new TreeMap<>(),oxygen=new TreeMap<>();String canonical=HealthArchive.device(device);
  try(Cursor c=HealthArchive.get(context).getReadableDatabase().rawQuery("SELECT kind,stamp,body FROM records WHERE device=? AND kind IN ('SLEEP_STAGE','OXYGEN') AND stamp>=? AND stamp<? ORDER BY stamp LIMIT 6001",new String[]{canonical,""+from,""+to})){
   int rows=0;while(c.moveToNext()){if(++rows>6000)throw new IOException("OSA_INPUT_LIMIT");int stamp=c.getInt(1);HealthProto.Node n=HealthProto.parse(c.getBlob(2));if(c.getString(0).equals("SLEEP_STAGE"))sleep.put(stamp,n.number(2,0));else{
    byte[] offsets=n.bytes(2),values=n.bytes(3);if(offsets==null||values==null||offsets.length!=values.length)throw new IOException("OSA_OXYGEN_SHAPE");
    for(int i=0;i<values.length;i++){int sec=(offsets[i]&255)>>>2,value=(values[i]&255)>>>3;if(sec>59)throw new IOException("OSA_OXYGEN_TIME");int packed=OsaAnalysisInput.packedSpo2(offsets[i]&255,values[i]&255);if(packed>0)oxygen.put(stamp+sec,packed);}
   }}
  }
  try(OsaInputStore store=new OsaInputStore(context)){return OsaAnalysisInput.build(sleep,store.samples(device,"sensor",from,to),oxygen);}
 }
}

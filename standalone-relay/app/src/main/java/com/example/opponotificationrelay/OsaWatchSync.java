package com.example.opponotificationrelay;
import android.content.Context;import android.os.SystemClock;import java.io.IOException;import java.util.*;import java.util.concurrent.*;import java.util.function.BooleanSupplier;
/** One bounded read attempt; transport serializes it with existing health operations. */
public final class OsaWatchSync {
 private OsaWatchSync(){}
 public static final class Result {public final boolean active;public final int sensor,hrv;public final String hrvError;Result(boolean active,int sensor,int hrv,String error){this.active=active;this.sensor=sensor;this.hrv=hrv;this.hrvError=error;}}
 private static void guard(Context c,String device,BooleanSupplier cancelled,long deadline)throws IOException{if(cancelled.getAsBoolean()||!device.equals(RelayConfig.getTargetMac(c)))throw new IOException("OSA_SYNC_CANCELLED");if(SystemClock.elapsedRealtime()>=deadline)throw new IOException("OSA_SYNC_DEADLINE");}
 static byte[] read(Context c,String device,OsaWatchProtocol.Request request,BooleanSupplier cancelled,long deadline)throws Exception {
  RfcommWearTransport transport=RfcommWearTransport.getInstance(c);long until=Math.min(deadline,SystemClock.elapsedRealtime()+30000);CountDownLatch done=new CountDownLatch(1);boolean[] accepted={false};byte[][] body={null};String[] detail={""};boolean queued=false;long generation=-1;
  while(!queued){guard(c,device,cancelled,until);OafHealthChannel.Snapshot state=transport.healthSettings();if(!state.connected&&!state.busy)transport.requestHealthSettings();else if(state.connected&&!state.busy){generation=transport.healthConnection();queued=transport.readOsa(request,(ok,value,message)->{accepted[0]=ok;body[0]=value;detail[0]=message;done.countDown();});}if(!queued)Thread.sleep(100);}
  while(!done.await(100,TimeUnit.MILLISECONDS))guard(c,device,cancelled,until);
  guard(c,device,cancelled,deadline);if(!accepted[0]||generation!=transport.healthConnection()||body[0]==null)throw new IOException("OSA_WATCH_RESPONSE_"+request.cid+"_"+(detail[0]!=null&&detail[0].matches("[A-Z_]{1,64}")?detail[0]:"UNCONFIRMED"));request.validate(body[0]);return body[0];
 }
 public static Result sync(Context context,BooleanSupplier cancelled)throws Exception {
  Context c=context.getApplicationContext();String device=RelayConfig.getTargetMac(c);if(device==null||device.isEmpty())throw new IOException("OSA_NO_DEVICE");long deadline=SystemClock.elapsedRealtime()+120000;int end=(int)(System.currentTimeMillis()/1000),start=end-86400;
  boolean active=OsaWatchProtocol.activation(read(c,device,OsaWatchProtocol.queryActivation(),cancelled,deadline));List<OsaWatchProtocol.Samples> sensor=new ArrayList<>();int next=start,count=0;boolean complete=false;
  for(int page=0;page<12;page++){OsaWatchProtocol.Request request=OsaWatchProtocol.sensor(next,end);OsaWatchProtocol.Samples data=OsaWatchProtocol.sensor(request,read(c,device,request,cancelled,deadline));sensor.add(data);count+=data.timestamps.length;if(!data.more){complete=true;break;}if(data.end<=next||data.end>=end)throw new IOException("OSA_SENSOR_CURSOR");next=data.end;}
  if(!complete)throw new IOException("OSA_SENSOR_PAGE_LIMIT");guard(c,device,cancelled,deadline);try(OsaInputStore store=new OsaInputStore(c)){store.commit(device,"sensor",start,end,sensor);}
  int hrvCount=0;String hrvError="";
  try{
   OsaWatchProtocol.Request query=OsaWatchProtocol.hrvIndex(start,end);OsaWatchProtocol.Index index=OsaWatchProtocol.packetIndex(query,read(c,device,query,cancelled,deadline));List<OsaWatchProtocol.Samples> hrv=new ArrayList<>();int cursor=index.start;if(index.count>12)throw new IOException("OSA_HRV_PAGE_LIMIT");
   for(int page=1;page<=index.count;page++){OsaWatchProtocol.Request request=OsaWatchProtocol.hrvPacket(page,cursor,end,index.session);OsaWatchProtocol.Samples data=OsaWatchProtocol.hrv(request,read(c,device,request,cancelled,deadline));if(data.timestamps.length==0&&page<index.count)throw new IOException("OSA_HRV_CURSOR");hrv.add(data);hrvCount+=data.timestamps.length;if(data.end<cursor)throw new IOException("OSA_HRV_CURSOR");cursor=data.end;}
   guard(c,device,cancelled,deadline);try(OsaInputStore store=new OsaInputStore(c)){store.commit(device,"hrv",start,end,hrv);}
  }catch(IOException e){hrvError=e.getMessage()==null?"OSA_HRV_UNAVAILABLE":e.getMessage();FileLogger.w("OsaSync",hrvError);if(hrvError.equals("OSA_SYNC_CANCELLED"))throw e;}
  return new Result(active,count,hrvCount,hrvError);
 }
}

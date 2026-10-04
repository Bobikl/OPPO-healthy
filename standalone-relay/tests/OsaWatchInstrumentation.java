package com.example.opponotificationrelay;
import android.app.*;import android.os.*;import android.content.*;
public final class OsaWatchInstrumentation extends Instrumentation {
 public void onCreate(Bundle args){super.onCreate(args);start();}
 public void onStart(){Bundle out=new Bundle();int result=Activity.RESULT_CANCELED;
  try{Context c=getTargetContext();runOnMainSync(()->c.startActivity(new Intent(c,SnoreMonitoringActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)));Thread.sleep(1500);String device=RelayConfig.getTargetMac(c);int end=(int)(System.currentTimeMillis()/1000),start=end-86400;long deadline=SystemClock.elapsedRealtime()+45000;
   OsaWatchProtocol.Request q=OsaWatchProtocol.hrvIndex(start,end);byte[] raw=OsaWatchSync.read(c,device,q,()->false,deadline);OsaWatchProtocol.Index index=OsaWatchProtocol.packetIndex(q,raw);out.putInt("indexCount",index.count);out.putInt("indexStart",index.start);out.putInt("sessionLength",index.session.length());
   if(index.count>0){q=OsaWatchProtocol.hrvPacket(1,index.start,end,index.session);raw=OsaWatchSync.read(c,device,q,()->false,deadline);OsaWatchProtocol.Samples page=OsaWatchProtocol.hrv(q,raw);out.putInt("firstPacketCount",page.values.length);out.putInt("firstPacketStart",page.start);out.putInt("firstPacketEnd",page.end);}
   out.putString("status","OSA_WATCH_PROBE_PASS");result=Activity.RESULT_OK;
  }catch(Throwable e){out.putString("status","OSA_WATCH_PROBE_FAILED");out.putString("error",e.getClass().getSimpleName()+":"+e.getMessage());}finally{finish(result,out);}
 }
}

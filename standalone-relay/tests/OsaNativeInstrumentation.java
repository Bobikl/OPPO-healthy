package com.example.opponotificationrelay;
import android.app.*;import android.os.*;import java.io.*;import java.util.concurrent.atomic.AtomicReference;
import com.heytap.health.osahssdkself.bean.*;
import com.heytap.health.sleep.formula.formula.jni.OsaAlgorithm;
import com.heytap.health.sleep.formula.formula.jni.HealthLogProxy;
/** Synthetic samples only. Never starts microphone or writes health records. */
public final class OsaNativeInstrumentation extends Instrumentation {
 private int checks;
 public void onCreate(Bundle args){super.onCreate(args);start();}
 private void check(boolean ok,String name){checks++;if(!ok)throw new AssertionError(name);}
 private interface Action {void run()throws Exception;}
 private void rejects(String code,Action a)throws Exception {try{a.run();throw new AssertionError("accepted "+code);}catch(IOException e){check(code.equals(e.getMessage()),code);}}
 public void onStart(){Bundle result=new Bundle();int status=Activity.RESULT_CANCELED;StringBuilder details=new StringBuilder();
  try {
   AtomicReference<Throwable> failure=new AtomicReference<>();runOnMainSync(()->{try{rejects("OSA_MAIN_THREAD",()->OsaNativeAdapter.begin(false));}catch(Throwable e){failure.set(e);}});if(failure.get()!=null)throw new AssertionError(failure.get());
   check(OsaAlgorithm.initHealthLog(new HealthLogProxy(){public void debug(String s){}public void error(String s){}public void info(String s){}})==0,"OSALib logger JNI");
   OsaAlgorithm.recycleGlobalRef();check(true,"OSALib release JNI");
   for(int cycle=0;cycle<4;cycle++){
    boolean unprocessed=(cycle%2)==1;OsaNativeAdapter nativeSession=OsaNativeAdapter.begin(unprocessed);
    try {
     rejects("OSA_SESSION_BUSY",()->OsaNativeAdapter.begin(false));
     rejects("OSA_FRAME_SIZE",()->nativeSession.process(new short[17]));
     rejects("OSA_FRAME_SIZE",()->nativeSession.process(null));
     AtomicReference<Throwable> threadError=new AtomicReference<>();Thread other=new Thread(()->{try{rejects("OSA_WRONG_THREAD",()->nativeSession.process(new short[1024]));}catch(Throwable e){threadError.set(e);}});other.start();other.join(3000);check(!other.isAlive()&&threadError.get()==null,"cross-thread rejected");
     short[] samples=new short[1024];for(int frame=0;frame<4096;frame++){
      if(cycle>=2)for(int i=0;i<samples.length;i++)samples[i]=(short)(800*Math.sin((frame*1024L+i)*2*Math.PI*200/8000));
      SnoreInfoBean info=nativeSession.process(samples);check(info!=null,"native frame "+frame);
     }
     check(nativeSession.samples()==4096L*1024,"sample count");
     OsaSummaryBean summary=nativeSession.finish();check(summary!=null,"native summary");
     details.append("cycle=").append(cycle).append(" mode=").append(unprocessed?"UNPROCESSED":"MIC").append(" summaryCode=").append(summary.resultCode).append(" totalSignalLen=").append(summary.totalSignalLen).append('\n');
     rejects("OSA_SESSION_CLOSED",()->nativeSession.process(new short[1024]));
     nativeSession.close();check(true,"idempotent close");
    } finally {nativeSession.close();}
   }
   try(OsaNativeAdapter abandoned=OsaNativeAdapter.begin(false)){abandoned.process(new short[1024]);}
   try(OsaNativeAdapter next=OsaNativeAdapter.begin(false)){check(next.samples()==0,"abort releases global owner");}
   check(getTargetContext().getPackageManager().checkPermission("android.permission.RECORD_AUDIO",getTargetContext().getPackageName())==android.content.pm.PackageManager.PERMISSION_DENIED,"microphone untouched");
   status=Activity.RESULT_OK;result.putString("stream",details+"OSA_NATIVE_PASS checks="+checks+"; synthetic fixtures are not health results\n");
  }catch(Throwable e){result.putString("stream",android.util.Log.getStackTraceString(e));}
  finish(status,result);
 }
}

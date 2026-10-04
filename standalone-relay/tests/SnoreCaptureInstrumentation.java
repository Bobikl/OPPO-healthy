package com.example.opponotificationrelay;
import android.app.*;import android.os.*;import android.content.*;import android.widget.*;import android.view.*;import java.io.*;import java.util.*;import java.util.concurrent.atomic.AtomicBoolean;
public final class SnoreCaptureInstrumentation extends Instrumentation {
 private int checks;private final List<String> ids=new ArrayList<>();
 public void onCreate(Bundle args){super.onCreate(args);start();}
 private void check(boolean ok,String reason){checks++;if(!ok)throw new AssertionError(reason);}
 private final SnoreCaptureSession.Listener listener=new SnoreCaptureSession.Listener(){public void started(String id){ids.add(id);}public void progress(String id,long n){}};
 static final class FakeSource implements SnoreCaptureSession.Source {
  int emitted,max;boolean closed,started,fail;AtomicBoolean stop;
  FakeSource(int max,boolean fail){this.max=max;this.fail=fail;}
  public int audioSource(){return 1;}public void start(){started=true;}
  public int read(short[] b,int offset,int count)throws IOException{
   if(emitted>=max){if(stop!=null){stop.set(true);throw new IOException("SNORE_AUDIO_READ");}if(fail)throw new IOException("SNORE_AUDIO_READ");return -1;}
   int n=Math.min(Math.min(count,137),max-emitted);Arrays.fill(b,offset,offset+n,(short)25);emitted+=n;return n;
  }
  public void check(){}public void requestStop(){}public void close(){closed=true;}
 }
 private static int buttons(View v,String text){int n=v instanceof Button&&((Button)v).getText().toString().equals(text)?1:0;if(v instanceof ViewGroup)for(int i=0;i<((ViewGroup)v).getChildCount();i++)n+=buttons(((ViewGroup)v).getChildAt(i),text);return n;}
 public void onStart(){Bundle result=new Bundle();int code=Activity.RESULT_CANCELED;Context context=getTargetContext();SnoreSessionStore store=null;Activity activity=null;
  try {
   context.deleteDatabase("snore-fixture.db");store=new SnoreSessionStore(context,"snore-fixture.db","snore-fixture-files");
   String abandoned=store.create("TEST_DEVICE",1,1700000000000L);ids.add(abandoned);
   try{store.create("SECOND",1,1700000000000L);throw new AssertionError("duplicate active");}catch(IOException expected){check("SNORE_ALREADY_RECORDING".equals(expected.getMessage()),"single active database constraint");}
   check(!store.delete(abandoned),"active session cannot be deleted");
   try(SnoreWavWriter wav=new SnoreWavWriter(store.file(abandoned,true),store.file(abandoned,false))){wav.write(new short[1024],1024);}
   store.close();store=new SnoreSessionStore(context,"snore-fixture.db","snore-fixture-files");store.recoverAbandoned();SnoreSessionStore.Session recovered=store.get(abandoned);check(recovered.state.equals("INTERRUPTED")&&recovered.samples==1024,"restart recovers recorded bytes without claiming success");check(recovered.device.equals("TEST_DEVICE")&&recovered.scope.equals("local"),"immutable local ownership");
   store.recoverAbandoned();check(store.get(abandoned).samples==1024,"recovery idempotent");
   FakeSource shortSource=new FakeSource(4096,false);String shortId=SnoreCaptureSession.run(store,shortSource,"TEST_DEVICE",()->false,listener);SnoreSessionStore.Session shortRow=store.get(shortId);
   check(shortSource.started&&shortSource.closed,"source start and release");check(shortRow.samples==4096,"partial reads assembled without padding");check(shortRow.state.equals("TOO_SHORT"),"short audio never reports a risk result");check(!shortRow.summary.isEmpty(),"native summary saved separately");check(store.file(shortId,false).length()==44+4096*2,"saved PCM length");
   FakeSource failedSource=new FakeSource(2048,true);String failId=SnoreCaptureSession.run(store,failedSource,"TEST_DEVICE",()->false,listener);SnoreSessionStore.Session failed=store.get(failId);check(failed.state.equals("INTERRUPTED")&&failed.reason.equals("SNORE_AUDIO_READ"),"read failure classified");check(failed.samples==2048&&failed.summary.isEmpty()&&failedSource.closed,"interrupted capture preserved without fabricated summary");
   AtomicBoolean stop=new AtomicBoolean();FakeSource stopped=new FakeSource(2048,false);stopped.stop=stop;String stopId=SnoreCaptureSession.run(store,stopped,"TEST_DEVICE",stop::get,listener);check(store.get(stopId).state.equals("TOO_SHORT")&&store.get(stopId).reason.equals("USER_STOP"),"stop unblocking read remains a normal stop");
   try(OsaNativeAdapter occupied=OsaNativeAdapter.begin(false)){FakeSource blocked=new FakeSource(1024,false);String blockedId=SnoreCaptureSession.run(store,blocked,"TEST_DEVICE",()->false,listener);check(store.get(blockedId).state.equals("FAILED")&&store.get(blockedId).reason.equals("OSA_SESSION_BUSY"),"native failure releases durable session slot");check(blocked.closed&&!blocked.started,"native busy does not start source");}
   check(store.delete(shortId)&&store.get(shortId)==null&&!store.file(shortId,false).exists(),"delete removes completed audio and metadata");
   try{store.file("../outside",false);throw new AssertionError("unsafe path");}catch(IOException expected){check(true,"invalid file identifier rejected");}
   check(context.getPackageManager().checkPermission("android.permission.RECORD_AUDIO",context.getPackageName())==android.content.pm.PackageManager.PERMISSION_DENIED,"tests did not grant microphone permission");
   activity=startActivitySync(new Intent(context,SnoreMonitoringActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));Activity screen=activity;waitForIdleSync();runOnMainSync(()->check(buttons(screen.getWindow().getDecorView(),"开始睡眠录音")==1,"explicit recording entry rendered"));
   check(!SnoreRecordingService.isRunning(),"opening screen never starts recording");
   code=Activity.RESULT_OK;result.putString("stream","SNORE_CAPTURE_PASS checks="+checks+"; synthetic capture only\n");
  }catch(Throwable e){result.putString("stream",android.util.Log.getStackTraceString(e));}
  finally{if(activity!=null){Activity a=activity;runOnMainSync(a::finish);}if(store!=null){try{store.recoverAbandoned();for(String id:ids)store.delete(id);}catch(Exception ignored){}store.close();}context.deleteDatabase("snore-fixture.db");new File(context.getFilesDir(),"snore-fixture-files").delete();}
  finish(code,result);
 }
}

package com.example.opponotificationrelay;
import android.content.*;import android.app.job.*;import android.net.*;import android.os.*;
import java.io.*;import java.lang.reflect.*;import java.util.*;
/** Device VM regression using an isolated preference namespace and a recording JobScheduler. */
public final class CloudSchedulingProbe {
 static int checks;static void check(boolean ok,String what){checks++;if(!ok)throw new AssertionError(what);}
 static final class Jobs extends JobScheduler {
  final Map<Integer,JobInfo> jobs=new HashMap<>();int submitted;
  public int schedule(JobInfo job){jobs.put(job.getId(),job);submitted++;return RESULT_SUCCESS;}
  public int enqueue(JobInfo job,JobWorkItem item){return schedule(job);}
  public void cancel(int id){jobs.remove(id);}public void cancelAll(){jobs.clear();}
  public List<JobInfo> getAllPendingJobs(){return new ArrayList<>(jobs.values());}
  public JobInfo getPendingJob(int id){return jobs.get(id);}
 }
 static final class TestContext extends ContextWrapper {
  final String prefix="cloud-schedule-test-"+UUID.randomUUID()+"-";final Jobs jobs=new Jobs();BroadcastReceiver power;
  TestContext(Context base){super(base);}
  public Context getApplicationContext(){return this;}
  public SharedPreferences getSharedPreferences(String name,int mode){return super.getSharedPreferences(prefix+name,mode);}
  public Object getSystemService(String name){return Context.JOB_SCHEDULER_SERVICE.equals(name)?jobs:super.getSystemService(name);}
  public Intent registerReceiver(BroadcastReceiver receiver,IntentFilter filter){return registerReceiver(receiver,filter,0);}
  public Intent registerReceiver(BroadcastReceiver receiver,IntentFilter filter,int flags){if(receiver!=null)power=receiver;return new Intent(Intent.ACTION_BATTERY_CHANGED).putExtra(BatteryManager.EXTRA_PLUGGED,BatteryManager.BATTERY_PLUGGED_AC);}
  public void unregisterReceiver(BroadcastReceiver receiver){if(power==receiver)power=null;}
  void power(boolean on){power.onReceive(this,new Intent(on?Intent.ACTION_POWER_CONNECTED:Intent.ACTION_POWER_DISCONNECTED));}
 }
 public static void main(String[] args){TestContext c=null;int exit=1;
  try{
   Looper.prepareMainLooper();Class<?> at=Class.forName("android.app.ActivityThread");Object thread=at.getMethod("systemMain").invoke(null);
   Context system=(Context)at.getMethod("getSystemContext").invoke(thread);
   Context raw=system.createPackageContext("com.example.opponotificationrelay",Context.CONTEXT_IGNORE_SECURITY);
   Field op=raw.getClass().getDeclaredField("mOpPackageName");op.setAccessible(true);op.set(raw,"com.example.opponotificationrelay");
   Field attribution=raw.getClass().getDeclaredField("mAttributionSource");attribution.setAccessible(true);attribution.set(raw,new AttributionSource.Builder(android.os.Process.myUid()).setPackageName("com.example.opponotificationrelay").build());
   c=new TestContext(raw);
   check(HealthAccountStore.exists(c),"logged-in device required");
   CloudSyncState.prefs(c).edit().putBoolean("enabled",true).putBoolean("category.activity",true).putString("mode","manual").commit();
   CloudSyncState.mode(c,"charging");check(c.jobs.jobs.isEmpty(),"already charging does not sync on mode selection");
   CloudSyncState.change(c,"category.workout",true);check(c.jobs.jobs.isEmpty(),"enabling category while charging does not sync");
   c.power(true);check(c.jobs.jobs.isEmpty(),"same charging session ignored");
   c.power(false);c.power(true);JobInfo charging=c.jobs.getPendingJob(CloudSyncScheduler.JOB);
   check(charging!=null&&charging.isRequireCharging(),"next plug-in schedules constrained job");
   check(charging.getExtras().getLong("revision")==CloudSyncState.revision(c),"job bound to current settings");
   int before=c.jobs.submitted;c.power(true);check(c.jobs.submitted==before,"duplicate power event ignored");
   c.jobs.cancel(CloudSyncScheduler.JOB);CloudSyncScheduler.schedule(c,false);check(c.jobs.jobs.isEmpty(),"completion does not schedule hourly charging job");
   c.power(false);c.power(true);check(c.jobs.submitted==before+1,"later charging session triggers once");
   CloudSyncState.mode(c,"wifi");check(c.jobs.jobs.isEmpty(),"selecting Wi-Fi waits for next connection");
   Field active=CloudSyncTriggers.class.getDeclaredField("active");active.setAccessible(true);Object observer=active.get(null);
   Field known=CloudSyncTriggers.class.getDeclaredField("networks");known.setAccessible(true);Set<Network> networks=(Set<Network>)known.get(observer);
   Field callback=CloudSyncTriggers.class.getDeclaredField("wifi");callback.setAccessible(true);ConnectivityManager.NetworkCallback wifi=(ConnectivityManager.NetworkCallback)callback.get(observer);
   Network network=c.getSystemService(ConnectivityManager.class).getAllNetworks()[0];networks.add(network);wifi.onAvailable(network);check(c.jobs.jobs.isEmpty(),"initial existing Wi-Fi notification ignored");
   wifi.onLost(network);wifi.onAvailable(network);JobInfo wifiJob=c.jobs.getPendingJob(CloudSyncScheduler.JOB);
   check(wifiJob!=null&&wifiJob.getRequiredNetwork().hasTransport(NetworkCapabilities.TRANSPORT_WIFI),"next Wi-Fi connection schedules constrained job");
   before=c.jobs.submitted;wifi.onAvailable(network);check(c.jobs.submitted==before,"duplicate Wi-Fi event ignored");
   c.jobs.cancel(CloudSyncScheduler.JOB);CloudSyncScheduler.schedule(c,false);check(c.jobs.jobs.isEmpty(),"no hourly Wi-Fi repeat");
   CloudSyncState.mode(c,"daily");check(c.jobs.getPendingJob(CloudSyncScheduler.JOB).getMinLatencyMillis()>0,"daily waits until future time");
   CloudSyncState.change(c,"category.sleep",true);check(c.jobs.getPendingJob(CloudSyncScheduler.JOB).getMinLatencyMillis()>0,"category selection keeps daily wait");
   CloudSyncState.mode(c,"manual");check(c.jobs.jobs.isEmpty(),"manual cancels automatic jobs");
   CloudSyncState.change(c,"category.vitals",true);check(c.jobs.jobs.isEmpty(),"manual category selection does not sync");
   CloudSyncScheduler.connection(c,"wifi");CloudSyncScheduler.connection(c,"charging");check(c.jobs.jobs.isEmpty(),"events do not sync in manual mode");
   CloudSyncScheduler.manual(c);check(c.jobs.getPendingJob(CloudSyncScheduler.MANUAL)!=null,"explicit manual action retained");
   Thread.currentThread().interrupt();try{CloudSyncState.result(c,"fixture",CloudCategory.ACTIVITY,"cancelled",1,false);check(Thread.currentThread().isInterrupted(),"interrupted status write does not block or crash");}finally{Thread.interrupted();}
   check(CloudSyncState.result(c,"fixture",CloudCategory.ACTIVITY).contains("cancelled"),"cancelled status visible");
   CloudSyncState.change(c,"enabled",false);check(c.jobs.jobs.isEmpty(),"master off cancels all jobs");
   System.out.println("CLOUD_SCHEDULING_PASS checks="+checks);exit=0;
  }catch(Throwable e){System.out.println("CLOUD_SCHEDULING_FAILED "+e.getClass().getSimpleName()+": "+e.getMessage());}
  finally{if(c!=null){CloudSyncState.prefs(c).edit().putBoolean("enabled",false).commit();CloudSyncTriggers.refresh(c,true);c.getBaseContext().deleteSharedPreferences(c.prefix+CloudSyncState.FILE);}}
  System.exit(exit);
 }
}

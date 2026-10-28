package com.example.opponotificationrelay;
import android.content.Context;
import android.os.Handler;
import java.lang.reflect.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
/** Real HealthDataManager lifecycle, with versioned in-memory source fixtures and no Android I/O. */
public final class HealthHomeCacheTest {
 static int checks;
 static void check(boolean ok,String name){checks++;if(!ok)throw new AssertionError(name);}
 static void await(HealthDataManager manager,BooleanSupplier ready)throws Exception{
  long until=System.nanoTime()+3_000_000_000L;
  while(System.nanoTime()<until){Handler.drain();if(ready.getAsBoolean()&&!manager.hasPendingRequests()){Thread.sleep(20);Handler.drain();if(ready.getAsBoolean()&&!manager.hasPendingRequests())return;}Thread.sleep(5);}
  throw new AssertionError("CACHE_FIXTURE_TIMEOUT");
 }
 static HealthMetricsData snapshot(HealthDataManager manager,HealthSnapshotWindow window)throws Exception{
  Method method=HealthDataManager.class.getDeclaredMethod("snapshot",HealthSnapshotWindow.class);method.setAccessible(true);return (HealthMetricsData)method.invoke(manager,window);
 }
 static void awaitLocal(HealthDataManager manager,LocalDate target)throws Exception{
  long until=System.nanoTime()+3_000_000_000L;while(System.nanoTime()<until){Handler.drain();HealthMetricsData value=manager.snapshot();if(value!=null&&target.equals(value.window.anchor)&&manager.locallyReady(value))return;Thread.sleep(5);}throw new AssertionError("LOCAL_DATE_TIMEOUT");
 }
 public static void main(String[] args)throws Exception{
  Context context=new Context();HealthDataManager manager=HealthDataManager.get(context);List<HealthMetricsData> notifications=new ArrayList<>();
  HealthDataManager.Listener listener=(value,message,busy)->{if(value!=null)notifications.add(value);};TimeZone original=TimeZone.getDefault();
  try{
   LocalDate day=LocalDate.now();HealthSnapshotWindow home=HealthSnapshotWindow.home(day);
   manager.add(listener);manager.request(day,false,false);await(manager,()->manager.snapshot()!=null&&home.same(manager.snapshot().window));
   HealthMetricsData first=manager.snapshot();int reads=HealthMetricsStore.loads.get();check(first.find(day).sunshineMinutes==20,"INITIAL_SUNSHINE_RECORD");
   check(manager.presentationReady(first,HealthPageReadiness.Content.SUMMARY,day),"CURRENT_SUMMARY_PRESENTABLE");
   check(!manager.presentationReady(first,HealthPageReadiness.Content.SUMMARY,day.minusDays(1)),"WRONG_DATE_NEVER_PRESENTABLE_EVEN_SETTLED");
   manager.remove(listener);check(manager.snapshot()==first,"STOPPING_HOME_RETAINS_SNAPSHOT");
   manager.add(listener);check(notifications.get(notifications.size()-1)==first,"REENTER_HOME_PUBLISHES_CACHE_IMMEDIATELY");
   manager.request(day,false,false);await(manager,()->manager.snapshot()==first);check(HealthMetricsStore.loads.get()==reads,"REENTER_HOME_DOES_NOT_REBUILD_UNCHANGED_CACHE");
   HealthMetricsData.Period period=new HealthMetricsData.Period(day,0);manager.request(period,day,false);
   await(manager,()->manager.snapshot()!=null&&!home.same(manager.snapshot().window));
   int detailReads=HealthMetricsStore.loads.get();check(reads==1&&detailReads==2,"EACH_WINDOW_BUILT_ONCE_BEFORE_PUBLISH initial="+reads+" detail="+detailReads);check(snapshot(manager,home)==first,"DETAIL_VIEW_PRESERVES_HOME_CACHE");
   manager.remove(listener);check(snapshot(manager,home)==first,"STOPPING_DETAIL_PRESERVES_HOME_CACHE");
   manager.add(listener);manager.request(day,false,false);await(manager,()->manager.snapshot()==first);
   check(HealthMetricsStore.loads.get()==detailReads,"RETURN_FROM_DETAIL_REUSES_HOME_CACHE");
   HealthSnapshotWindow wristHome=new HealthSnapshotWindow(home.start,home.end,home.anchor,HealthSnapshotWindow.Content.WRIST_SUMMARY);
   check(!home.same(wristHome),"WRIST_SUMMARY_CANNOT_ALIAS_COMPLETE_HOME");check(snapshot(manager,wristHome)==null,"COMPLETE_HOME_NOT_RELABELED_AS_WRIST");
   HealthArchive.version++;manager.local();await(manager,()->manager.snapshot()!=first);HealthMetricsData revised=manager.snapshot();
   check(HealthMetricsStore.loads.get()==detailReads+1,"NEW_RECORD_REVISION_REBUILDS_HOME");check(snapshot(manager,home)==revised,"REVISED_HOME_REPLACES_CACHE");
   check(snapshot(manager,HealthSnapshotWindow.home(day.minusDays(1)))==null,"DIFFERENT_SELECTED_DATE_CANNOT_REUSE_HOME");
   check(OfficialSettingsClient.reads.get()==0,"FRESH_PAGES_DO_NOT_REREAD_IMPORTED_HISTORY");
   Field queue=HealthDataManager.class.getDeclaredField("snapshots");queue.setAccessible(true);CountDownLatch entered=new CountDownLatch(1),release=new CountDownLatch(1);
   ((ExecutorService)queue.get(manager)).execute(()->{entered.countDown();try{release.await(3,TimeUnit.SECONDS);}catch(InterruptedException e){Thread.currentThread().interrupt();}});
   check(entered.await(2,TimeUnit.SECONDS),"CAN_DELAY_DATE_SNAPSHOT");LocalDate previousDay=day.minusDays(1);manager.request(new HealthMetricsData.Period(previousDay,0),previousDay,false);
   check(!manager.settled(revised),"PREVIOUS_DATE_SNAPSHOT_NOT_READY_FOR_NEW_SELECTION");release.countDown();await(manager,()->manager.snapshot()!=null&&manager.snapshot().window.anchor.equals(previousDay)&&manager.settled(manager.snapshot()));
   check(manager.settled(manager.snapshot()),"NEW_DATE_SETTLES_AFTER_READERS_COMPLETE");
   AtomicInteger stableEvents=new AtomicInteger();HealthDataManager.Listener readyListener=(value,message,busy)->{if(manager.settled(value))stableEvents.incrementAndGet();};manager.add(readyListener);await(manager,()->manager.settled(manager.snapshot()));
   int stableBefore=stableEvents.get();manager.local();await(manager,()->manager.settled(manager.snapshot())&&stableEvents.get()>stableBefore);check(stableEvents.get()>stableBefore,"UNCHANGED_FINAL_LOAD_STILL_SIGNALS_READY");manager.remove(readyListener);
   manager.request(day,false,false);await(manager,()->manager.snapshot()!=null&&home.same(manager.snapshot().window)&&manager.settled(manager.snapshot()));
   HealthMetricsData currentHome=manager.snapshot();RelayConfig.target="AA:BB:CC:DD:EE:02";check(snapshot(manager,home)==null,"DIFFERENT_DEVICE_CANNOT_REUSE_HOME");
   check(!manager.presentationReady(currentHome,HealthPageReadiness.Content.SUMMARY,day),"OLD_DEVICE_NEVER_PRESENTABLE_EVEN_SETTLED");
   manager.request(day,false,false);await(manager,()->manager.snapshot()!=null&&manager.snapshot().device.equals(RelayConfig.target));
   HealthMetricsData secondDevice=manager.snapshot();check(secondDevice!=revised,"DEVICE_CHANGE_REBUILDS_DATA");
   TimeZone.setDefault(TimeZone.getTimeZone("Pacific/Honolulu"));check(snapshot(manager,home)==null,"TIME_ZONE_CHANGE_INVALIDATES_HOME");
   TimeZone.setDefault(original);manager.historyChanged();check(snapshot(manager,home)==null,"HISTORY_REPLACEMENT_INVALIDATES_HOME");
   await(manager,()->manager.snapshot()!=null&&manager.snapshot()!=secondDevice);check(manager.snapshot().officialLoaded,"HISTORY_REPLACEMENT_RELOADS_LOCAL_CACHE");
   CountDownLatch reading=new CountDownLatch(1),resume=new CountDownLatch(1);Field readsQueue=HealthDataManager.class.getDeclaredField("worker");readsQueue.setAccessible(true);
   ((ExecutorService)readsQueue.get(manager)).execute(()->{reading.countDown();try{resume.await(5,TimeUnit.SECONDS);}catch(InterruptedException e){Thread.currentThread().interrupt();}});
   check(reading.await(2,TimeUnit.SECONDS),"CAN_DELAY_HISTORY_IMPORT");
   try{for(int offset:new int[]{-1,-2,-3,-2,-1,0}){LocalDate target=day.plusDays(offset);manager.requestOxygenDay(target);awaitLocal(manager,target);
    check(manager.locallyReady(manager.snapshot()),"EVERY_CLICK_HAS_LOCAL_SNAPSHOT");check(manager.hasPendingRequests()&&!manager.settled(manager.snapshot()),"LOCAL_READY_DOES_NOT_CLAIM_IMPORT_FINISHED");
   }
   for(int offset:new int[]{-7,-14,-21,-14,-7,0}){LocalDate target=day.plusDays(offset);manager.request(new HealthMetricsData.Period(target,1),target,false,HealthSnapshotWindow.Content.WRIST_SUMMARY);awaitLocal(manager,target);
    check(manager.snapshot().window.content==HealthSnapshotWindow.Content.WRIST_SUMMARY,"WRIST_READ_PLAN_PRESERVED");
    check(manager.presentationReady(manager.snapshot(),HealthPageReadiness.Content.SUMMARY,target),"COVERED_WEEK_READY_DURING_IMPORT");
    check(!manager.settled(manager.snapshot()),"SUMMARY_READY_DOES_NOT_CLAIM_IMPORT_FINISHED");
   }
   HealthMetricsStore.coverage=false;HealthMetricsStore.version++;manager.local();
   long limit=System.nanoTime()+3_000_000_000L;while(System.nanoTime()<limit&&manager.snapshot().summaryComplete){Handler.drain();Thread.sleep(5);}
   check(!manager.snapshot().summaryComplete,"UNCOVERED_CACHE_STAYS_EXPLICIT");
   check(!manager.presentationReady(manager.snapshot(),HealthPageReadiness.Content.SUMMARY,day),"UNCOVERED_WEEK_NOT_EARLY_READY");
   HealthMetricsStore.coverage=true;
   }finally{resume.countDown();}
   await(manager,()->manager.snapshot()!=null&&day.equals(manager.snapshot().window.anchor)&&manager.settled(manager.snapshot()));
   AtomicInteger initialPartial=new AtomicInteger();HealthDataManager.Listener nextPage=(value,message,busy)->{if(value!=null)initialPartial.incrementAndGet();};
   manager.add(nextPage);check(initialPartial.get()==0,"NEW_PAGE_NOT_GIVEN_UNREQUESTED_PARTIAL_SNAPSHOT");manager.remove(nextPage);
   manager.request(new HealthMetricsData.Period(day,0),day,false);await(manager,()->manager.snapshot()!=null&&manager.snapshot().window.content==HealthSnapshotWindow.Content.ALL&&manager.settled(manager.snapshot()));
   check(manager.snapshot().window.content==HealthSnapshotWindow.Content.ALL,"NEXT_DETAIL_REQUEST_RESTORES_COMPLETE_CONTENT");
   java.util.concurrent.atomic.AtomicReference<Map<LocalDate,Float>> calendar=new java.util.concurrent.atomic.AtomicReference<>();
   java.util.concurrent.atomic.AtomicReference<String> calendarError=new java.util.concurrent.atomic.AtomicReference<>();
   LocalHealthCalendar.seed=day.minusDays(1);manager.calendar("sunshine",(dates,error)->{calendar.set(dates);calendarError.set(error);});
   await(manager,()->calendar.get()!=null);check(calendar.get().containsKey(day.minusDays(1)),"LOCAL_CALENDAR_RETAINED_WHEN_HISTORY_FAILS");
   check(!calendarError.get().isEmpty(),"PARTIAL_CALENDAR_DOES_NOT_CLAIM_COMPLETE");
   LocalHealthCalendar.seed=null;calendar.set(null);manager.calendar("sunshine",(dates,error)->{calendar.set(dates);calendarError.set(error);});
   await(manager,()->calendar.get()!=null);check(calendar.get().isEmpty()&&!calendarError.get().isEmpty(),"CALENDAR_FAILURE_WITHOUT_VALID_DATES_STAYS_ERROR");
   System.out.println("HEALTH_HOME_CACHE_PASS checks="+checks+" offline=true");
  }finally{
   manager.remove(listener);for(String name:new String[]{"worker","snapshots"}){Field field=HealthDataManager.class.getDeclaredField(name);field.setAccessible(true);((ExecutorService)field.get(manager)).shutdownNow();}
   TimeZone.setDefault(original);
  }
 }
}

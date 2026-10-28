"""Host regression of the actual health manager with isolated Android boundary fixtures."""
from pathlib import Path
import os,re,sqlite3,subprocess,sys
sys.stdout.reconfigure(encoding="utf-8")
ROOT=Path(__file__).resolve().parents[1]
SOURCE=ROOT/"app/src/main/java/com/example/opponotificationrelay"
BUILD=Path(sys.argv[1]) if len(sys.argv)>1 else ROOT/"tests/build/health-home"
BUILD.mkdir(parents=True,exist_ok=True)
JAVA=Path(os.environ.get("JAVA_HOME",r"C:\Program Files (x86)\jdk-17.0.6+10"))/"bin"
SDK=Path(os.environ.get("ANDROID_HOME",r"D:\Android\Sdk"))/"platforms/android-35/android.jar"
manager=(SOURCE/"HealthDataManager.java").read_text(encoding="utf-8")
projection=re.search(r'getInt\("detail_projection",0\)!=(\d+)',manager).group(1)
stubs={
 "android/content/Context.java":'package android.content; public class Context { private final SharedPreferences prefs=new SharedPreferences(); public Context getApplicationContext(){return this;} public SharedPreferences getSharedPreferences(String name,int mode){return prefs;} }',
 "android/content/SharedPreferences.java":'package android.content; public class SharedPreferences { public int getInt(String name,int fallback){return '+projection+';} public Editor edit(){return new Editor();} public static class Editor { public Editor putInt(String name,int value){return this;} public void apply(){} } }',
 "android/os/Looper.java":'package android.os; public class Looper { public static Looper getMainLooper(){return new Looper();} }',
 "android/os/Handler.java":'package android.os; import java.util.concurrent.ConcurrentLinkedQueue; public class Handler { private static final ConcurrentLinkedQueue<Runnable> queue=new ConcurrentLinkedQueue<>(); public Handler(Looper l){} public boolean post(Runnable r){queue.add(r);return true;} public static void drain(){Runnable r;while((r=queue.poll())!=null)r.run();} }',
 "android/os/SystemClock.java":'package android.os; public class SystemClock { public static long elapsedRealtime(){return System.nanoTime()/1000000;} }',
 "com/example/opponotificationrelay/Fixtures.java":r"""package com.example.opponotificationrelay;
import android.content.Context;import org.json.*;import java.time.*;import java.util.*;import java.io.*;import java.util.concurrent.atomic.AtomicInteger;
final class RelayConfig {static String target="AA:BB:CC:DD:EE:01";static String getTargetMac(Context c){return target;}}
final class HealthArchive {static final HealthArchive instance=new HealthArchive();static volatile long version=1;static HealthArchive get(Context c){return instance;}long revision(String mac){return version;}void importOfficialActivity(String mac,JSONObject value){} }
final class HealthMetricsStore {static final HealthMetricsStore instance=new HealthMetricsStore();static final AtomicInteger loads=new AtomicInteger();static volatile long version=1;static volatile boolean coverage=true;static HealthMetricsStore get(Context c){return instance;}void ensureZone(String mac,ZoneId zone){}long revision(String mac){return version;}void invalidateRanges(){version++;}boolean fresh(String mac,long start,long end,boolean raw,long age){return true;}void save(String mac,JSONObject value,boolean raw){}HealthMetricsData load(Context c,String mac,HealthSnapshotWindow window){loads.incrementAndGet();HealthMetricsData value=new HealthMetricsData();value.device=mac;value.window=window;value.officialLoaded=true;value.summaryComplete=coverage;value.day(window.anchor).sunshineMinutes=20;value.day(window.anchor).sunshineTarget=20;return value;} }
final class OfficialSettingsClient {static final AtomicInteger reads=new AtomicInteger();OfficialSettingsClient(Context c){}JSONObject health(String mac,long start,long end,boolean raw,String zone)throws Exception{reads.incrementAndGet();throw new IOException("READ_UNAVAILABLE");}JSONObject calendar(String device,String metric,String zone)throws Exception{throw new IOException("READ_UNAVAILABLE");} }
final class OfficialHistoryStore {static boolean available(Context c){return true;}}
final class LocalHealthCalendar {static LocalDate seed;static void read(Context c,String device,String metric,ZoneId zone,Map<LocalDate,Float> dates){if(seed!=null)dates.put(seed,1f);} }
final class HealthCalendar {static boolean closing(Object listener){return false;}}
final class FileLogger {static void w(String tag,String code){} }
"""}
files=[]
for name,text in stubs.items():
 target=BUILD/"fixtures"/name;target.parent.mkdir(parents=True,exist_ok=True);target.write_text(text,encoding="utf-8");assert target.read_text(encoding="utf-8")==text;files.append(str(target))
classes=BUILD/"classes";classes.mkdir(exist_ok=True)
actual=[SOURCE/(name+".java") for name in ["HealthDataManager","HealthMetricsData","HealthSnapshotWindow","HealthReadWindow","HealthTime","DailyActivityData","HealthProto","HealthSetting","HealthPageReadiness","OxygenChartData"]]
subprocess.run([str(JAVA/"javac.exe"),"-J-Dfile.encoding=UTF-8","-encoding","UTF-8","-cp",str(SDK),"-d",str(classes),*files,*map(str,actual),str(ROOT/"tests/HealthHomeCacheTest.java")],check=True)
subprocess.run([str(JAVA/"java.exe"),"-Dfile.encoding=UTF-8","-cp",str(classes)+os.pathsep+str(SDK),"com.example.opponotificationrelay.HealthHomeCacheTest"],check=True,timeout=20)

# Execute the actual Java query literals against an isolated SQLite database.
reader=(SOURCE/"RootHealthDataReader.java").read_text(encoding="utf-8")
def query(kind):
 match=re.search(r'result\.put\("'+kind+r'",uniqueRows\(db,"([^"]+)"',reader)
 if not match:raise AssertionError("Missing sunshine projection: "+kind)
 return match.group(1)
with sqlite3.connect(":memory:") as db:
 db.execute("CREATE TABLE DBSunshineStat(ssoid TEXT,data_client TEXT,date INTEGER,total_duration INTEGER,target_duration INTEGER,sunshine_type INTEGER,modified_timestamp INTEGER)")
 device="AA:BB:CC:DD:EE:01"
 db.executemany("INSERT INTO DBSunshineStat VALUES(?,?,?,?,?,?,?)",[
  ("fixture",device.lower(),20260401,17,20,1,100),
  ("fixture",device,20261012,8,20,1,100),
  ("fixture",device,20261012,9,20,1,200),
  ("other",device,20261013,99,20,1,300),
  ("fixture","AA:BB:CC:DD:EE:02",20261013,99,20,1,300),
 ])
 normal=db.execute(query("sunshineDays"),("fixture",device,"20260901","20261014")).fetchall()
 assert normal[0]==(20261012,9,20,1) and all(row[0]==20261012 for row in normal),"CURRENT_ACCOUNT_DEVICE_AND_NEWEST_REVISION"
 previous=db.execute(query("latestSunshine"),("fixture",device,"20260901")).fetchall()
 assert previous==[(20260401,17,20,1)],"PREDECESSOR_OUTSIDE_HOME_WINDOW"
 assert not db.execute(query("latestSunshine"),("fixture",device,"20200101")).fetchall(),"EMPTY_PREDECESSOR"
 db.execute("INSERT INTO DBSunshineStat VALUES(?,?,?,?,?,?,?)",("fixture",device,20260830,0,20,1,250))
 assert db.execute(query("latestSunshine"),("fixture",device,"20260901")).fetchall()==[(20260830,0,20,1)],"REAL_ZERO_PREDECESSOR_RETAINED"
 assert not db.execute(query("sunshineDays"),("other",device,"20261014","20261015")).fetchall(),"NO_FUTURE_ROWS"
 print("HEALTH_SUNSHINE_SQL_PASS checks=5 offline=true")

cache_source=(SOURCE/"HealthMetricsStore.java").read_text(encoding="utf-8")
match=re.search(r'rawQuery\("(SELECT i\.body FROM items[^"\n]+i\.kind=\'sunshineDays\'[^"\n]+)"',cache_source)
assert match,"CACHE_PREDECESSOR_QUERY_MISSING"
cache_sql=match.group(1)
with sqlite3.connect(":memory:") as db:
 db.executescript("CREATE TABLE scopes(device TEXT PRIMARY KEY,scope TEXT);CREATE TABLE items(device TEXT,scope TEXT,kind TEXT,stamp INTEGER,body TEXT,PRIMARY KEY(device,scope,kind,stamp));")
 device="AA:BB:CC:DD:EE:01";db.execute("INSERT INTO scopes VALUES(?,?)",(device,"current"))
 # Different page predecessors coexist, keyed by their actual measurement date.
 db.executemany("INSERT INTO items VALUES(?,?,?,?,?)",[
  (device,"current","sunshineDays",20260601,"june"),
  (device,"current","sunshineDays",20260301,"march"),
  (device,"other","sunshineDays",20260701,"other-account"),
  ("AA:BB:CC:DD:EE:02","current","sunshineDays",20260701,"other-device"),
 ])
 assert db.execute(cache_sql,(device,"20260801")).fetchall()==[("june",)],"HISTORICAL_VIEW_CANNOT_ERASE_HOME_PREDECESSOR"
 assert db.execute(cache_sql,(device,"20260401")).fetchall()==[("march",)],"HISTORICAL_VIEW_OWNS_CORRECT_PREDECESSOR"
 assert not db.execute(cache_sql,(device,"20260201")).fetchall(),"CACHE_BEFORE_FIRST_RECORD_EMPTY"
 assert not db.execute(cache_sql,("AA:BB:CC:DD:EE:03","20260801")).fetchall(),"CACHE_OTHER_DEVICE_EXCLUDED"
 assert db.execute(cache_sql,(device,"20260601")).fetchall()==[("march",)],"PREDECESSOR_DATE_IS_EXCLUSIVE"
 print("HEALTH_SUNSHINE_CACHE_SQL_PASS checks=5 offline=true")

match=re.search(r'rawQuery\("(SELECT stamp,body FROM records WHERE device=\? AND kind=\'WRIST_INDEX\'[^\"]+)"',cache_source)
assert match,"WRIST_NATIVE_QUERY_MISSING"
with sqlite3.connect(":memory:") as db:
 db.execute("CREATE TABLE records(device TEXT,kind TEXT,stamp INTEGER,body BLOB)")
 db.executemany("INSERT INTO records VALUES(?,?,?,?)",[
  ("watch","WRIST_INDEX",100,b"first"),("watch","WRIST_INDEX",200,b"last"),
  ("watch","WRIST_INDEX",300,b"exclusive"),("other","WRIST_INDEX",150,b"other-watch"),
  ("watch","SUNSHINE",150,b"other-kind"),
 ])
 sql=match.group(1)
 assert db.execute(sql,("watch","100","300")).fetchall()==[(100,b"first"),(200,b"last")],"WRIST_RANGE_AND_DEVICE"
 assert db.execute(sql,("watch","201","300")).fetchall()==[],"EMPTY_RANGE_REMAINS_EMPTY"
 assert db.execute(sql,("watch","200","301")).fetchall()==[(200,b"last"),(300,b"exclusive")],"HISTORICAL_WINDOW"
 assert db.execute(sql,("other","100","300")).fetchall()==[(150,b"other-watch")],"WATCH_ISOLATION"
 assert db.execute(sql,("missing","100","300")).fetchall()==[],"UNKNOWN_WATCH_NO_DATA"
 print("HEALTH_WRIST_CACHE_SQL_PASS checks=5 offline=true")

match=re.search(r'rawQuery\("(SELECT stamp,body FROM records WHERE device=\? AND kind=\'WRIST_RAW\'[^\"]+)"',cache_source)
assert match,"WRIST_RAW_QUERY_MISSING"
with sqlite3.connect(":memory:") as db:
 db.execute("CREATE TABLE records(device TEXT,kind TEXT,stamp INTEGER,body BLOB,PRIMARY KEY(device,kind,stamp))")
 db.executemany("INSERT INTO records VALUES(?,?,?,?)",[("watch","WRIST_RAW",100,b"first"),("watch","WRIST_RAW",200,b"second"),("watch","WRIST_RAW",300,b"next-day"),("other","WRIST_RAW",150,b"other-device"),("watch","WRIST_INDEX",150,b"relative")])
 sql=match.group(1)
 assert db.execute(sql,("watch","100","300")).fetchall()==[(100,b"first"),(200,b"second")],"RAW_DAY_AND_DEVICE"
 assert db.execute(sql,("watch","300","400")).fetchall()==[(300,b"next-day")],"RAW_NEXT_DAY_EXCLUSIVE_BOUNDARY"
 assert not db.execute(sql,("watch","201","300")).fetchall(),"RAW_EMPTY_RANGE"
 assert not db.execute(sql,("missing","100","300")).fetchall(),"RAW_UNKNOWN_DEVICE"
 print("HEALTH_WRIST_RAW_SQL_PASS checks=4 offline=true")

match=re.search(r'rawQuery\("(SELECT r.start,r.end FROM ranges r JOIN scopes[^\"]+)"',cache_source)
assert match,"SUMMARY_COVERAGE_QUERY_MISSING"
with sqlite3.connect(":memory:") as db:
 db.execute("CREATE TABLE scopes(device TEXT PRIMARY KEY,scope TEXT)")
 db.execute("CREATE TABLE ranges(device TEXT,scope TEXT,kind TEXT,start INTEGER,end INTEGER,read_at INTEGER)")
 db.executemany("INSERT INTO scopes VALUES(?,?)",[("watch","current"),("other","current")])
 db.executemany("INSERT INTO ranges VALUES(?,?,?,?,?,?)",[("watch","current","bins",100,200,10),("watch","current","bins",200,300,20),("watch","current","bins",0,400,0),("watch","stale","bins",0,400,30),("watch","current","raw3",0,400,30),("other","current","bins",0,400,30)])
 sql=match.group(1)
 assert db.execute(sql,("watch","bins","0","100","300")).fetchall()==[(100,200),(200,300)],"ONLY_COMMITTED_CURRENT_SUMMARY_SPANS"
 assert db.execute(sql,("watch","bins","15","100","300")).fetchall()==[(200,300)],"FRESHNESS_IS_SEPARATE_FROM_COVERAGE"
 assert not db.execute(sql,("missing","bins","0","100","300")).fetchall(),"UNKNOWN_DEVICE_UNCOVERED"
 assert db.execute(sql,("watch","raw3","0","100","300")).fetchall()==[(0,400)],"RAW_COVERAGE_SEPARATE"
 db.execute("UPDATE ranges SET read_at=0 WHERE device='watch' AND scope='current' AND kind='bins'")
 assert not db.execute(sql,("watch","bins","0","100","300")).fetchall(),"INVALIDATED_RANGES_NOT_COMPLETE"
 print("HEALTH_SUMMARY_COVERAGE_SQL_PASS checks=5 offline=true")

match=re.search(r'rawQuery\("(SELECT i\.body FROM items[^"\n]+i\.kind=\'sleepWrist\'[^"\n]+)"',cache_source)
assert match,"WRIST_SUMMARY_QUERY_MISSING"
with sqlite3.connect(":memory:") as db:
 db.executescript("CREATE TABLE scopes(device TEXT PRIMARY KEY,scope TEXT);CREATE TABLE items(device TEXT,scope TEXT,kind TEXT,stamp INTEGER,body TEXT);")
 db.execute("INSERT INTO scopes VALUES('watch','current')")
 db.executemany("INSERT INTO items VALUES(?,?,?,?,?)",[("watch","current","sleepWrist",20261001,"before"),("watch","current","sleepWrist",20261005,"first"),("watch","current","sleepWrist",20261011,"last"),("watch","current","sleepWrist",20261012,"after"),("watch","old","sleepWrist",20261006,"old-account"),("other","current","sleepWrist",20261006,"other-watch"),("watch","current","heart",20261006,"unrelated")])
 sql=match.group(1)
 assert db.execute(sql,("watch","20261005","20261012")).fetchall()==[("first",),("last",)],"WRIST_ONLY_CURRENT_ACCOUNT_DEVICE_WINDOW"
 assert not db.execute(sql,("watch","20261002","20261005")).fetchall(),"WRIST_UNOBSERVED_REMAINS_EMPTY"
 assert not db.execute(sql,("missing","20261005","20261012")).fetchall(),"WRIST_UNKNOWN_DEVICE_EMPTY"
 print("HEALTH_WRIST_SUMMARY_SQL_PASS checks=3 offline=true")

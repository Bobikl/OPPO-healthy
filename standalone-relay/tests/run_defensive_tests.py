"""Run actual failure paths with isolated platform fixtures; no phone or network access."""
from pathlib import Path
import os
import subprocess
import sys

ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / "app/src/main/java/com/example/opponotificationrelay"
BUILD = Path(sys.argv[1]) if len(sys.argv) > 1 else ROOT / "tests/build/defensive"
JAVA = Path(os.environ.get("JAVA_HOME", r"C:\Program Files (x86)\jdk-17.0.6+10")) / "bin"
SDK = Path(os.environ.get("ANDROID_HOME", r"D:\Android\Sdk")) / "platforms/android-35/android.jar"
JSON = Path(os.environ.get("JSON_JAR", r"D:\Android\AndroidStudio\plugins\grazie\lib\org.json-json.jar"))
if not JSON.is_file():
    raise SystemExit("Set JSON_JAR to an installed org.json implementation for isolated tests.")
BUILD.mkdir(parents=True, exist_ok=True)
stubs = {
    "android/content/SharedPreferences.java": r'''package android.content;
import java.util.*;
public class SharedPreferences {public final Map<String,Object> values=new HashMap<>();public String getString(String k,String d){return (String)values.getOrDefault(k,d);}public long getLong(String k,long d){return ((Number)values.getOrDefault(k,d)).longValue();}public boolean getBoolean(String k,boolean d){return (Boolean)values.getOrDefault(k,d);}public Editor edit(){return new Editor();}public class Editor {public Editor putString(String k,String v){values.put(k,v);return this;}public Editor putLong(String k,long v){values.put(k,v);return this;}public Editor putBoolean(String k,boolean v){values.put(k,v);return this;}public Editor remove(String k){values.remove(k);return this;}public boolean commit(){return true;}public void apply(){}}}''',
    "android/content/res/AssetManager.java": r'''package android.content.res;import java.io.*;public class AssetManager {public static int added;public AssetManager(){}public int addAssetPath(String path){added++;return added;}public InputStream open(String name){return new ByteArrayInputStream("{}".getBytes(java.nio.charset.StandardCharsets.UTF_8));}}''',
    "android/content/res/Resources.java": r'''package android.content.res;public class Resources {private final AssetManager assets;public Resources(){assets=new AssetManager();}public Resources(AssetManager a,android.util.DisplayMetrics d,Configuration c){assets=a;}public AssetManager getAssets(){return assets;}public Theme newTheme(){return new Theme();}public int getIdentifier(String n,String t,String p){return 1;}public Configuration getConfiguration(){return null;}public android.util.DisplayMetrics getDisplayMetrics(){return null;}public void addLoaders(android.content.res.loader.ResourcesLoader... loaders){}public static class Theme {public void applyStyle(int i,boolean f){}}}''',
    "android/os/ParcelFileDescriptor.java": r'''package android.os;public class ParcelFileDescriptor implements AutoCloseable {public static final int MODE_READ_ONLY=1;public static ParcelFileDescriptor open(java.io.File f,int mode){return new ParcelFileDescriptor();}public void close(){}}''',
    "android/content/res/loader/ResourcesLoader.java": r'''package android.content.res.loader;public class ResourcesLoader {public static int created;public ResourcesLoader(){if(android.os.Build.VERSION.SDK_INT<30)throw new AssertionError("API 30 loader used on API 29");created++;}public void addProvider(ResourcesProvider p){}}''',
    "android/content/res/loader/ResourcesProvider.java": r'''package android.content.res.loader;public class ResourcesProvider {public static ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p){return new ResourcesProvider();}public void close(){}}''',
    "android/content/Context.java": r'''package android.content;
import android.content.pm.*;import android.content.res.*;import java.io.*;import java.util.*;
public class Context {public static final int MODE_PRIVATE=0;public static final String LAYOUT_INFLATER_SERVICE="layout_inflater";public static File directory;private final Map<String,SharedPreferences> prefs=new HashMap<>();public Context getApplicationContext(){return this;}public SharedPreferences getSharedPreferences(String n,int m){return prefs.computeIfAbsent(n,k->new SharedPreferences());}public PackageManager getPackageManager(){return new PackageManager();}public ApplicationInfo getApplicationInfo(){return getPackageManager().getPackageInfo("",0).applicationInfo;}public File getFilesDir(){return directory;}public File getCodeCacheDir(){return directory;}public AssetManager getAssets(){return new AssetManager();}public Resources getResources(){return new Resources();}public Resources.Theme getTheme(){return getResources().newTheme();}public void setTheme(int id){}public Context createConfigurationContext(Configuration c){return this;}public Object getSystemService(String n){return null;}}''',
    "android/content/ContextWrapper.java": r'''package android.content;public class ContextWrapper extends Context {private final Context base;public ContextWrapper(Context c){base=c;}public Context getBaseContext(){return base;}public Context getApplicationContext(){return base.getApplicationContext();}}''',
    "android/content/ContentValues.java": r'''package android.content;import java.util.*;public class ContentValues extends HashMap<String,Object>{public Integer getAsInteger(String key){return ((Number)get(key)).intValue();}}''',
    "android/content/pm/ApplicationInfo.java": r'''package android.content.pm;public class ApplicationInfo {public int uid=10577;public String sourceDir="fixture.apk";public boolean enabled=true;}''',
    "android/content/pm/PackageInfo.java": r'''package android.content.pm;public class PackageInfo {public ApplicationInfo applicationInfo=new ApplicationInfo();public String versionName="6.6.7_097c6ef_260803";public long getLongVersionCode(){return 6060700;}}''',
    "android/content/pm/PackageManager.java": r'''package android.content.pm;public class PackageManager {public static final int MATCH_DISABLED_COMPONENTS=512;public PackageInfo getPackageInfo(String p,int f){return new PackageInfo();}public static class NameNotFoundException extends Exception{}}''',
    "android/app/Activity.java": r'''package android.app;public class Activity extends android.content.Context {public boolean isFinishing(){return false;}public boolean isDestroyed(){return false;}}''',
    "android/os/Build.java": r'''package android.os;public class Build {public static final String[] SUPPORTED_ABIS={"arm64-v8a"};public static class VERSION {public static int SDK_INT=35;}}''',
    "android/os/Process.java": r'''package android.os;public class Process {public static boolean is64Bit(){return true;}public static int myUid(){return 10001;}}''',
    "android/os/SystemClock.java": r'''package android.os;public class SystemClock {public static long elapsedRealtime(){return System.nanoTime()/1000000;}}''',
    "android/os/Looper.java": r'''package android.os;public class Looper {public static Looper getMainLooper(){return new Looper();}}''',
    "android/os/Handler.java": r'''package android.os;public class Handler {private static final java.util.List<Runnable> timers=new java.util.ArrayList<>();public Handler(Looper l){}public boolean post(Runnable r){r.run();return true;}public boolean postDelayed(Runnable r,long ms){if(ms<1000)throw new AssertionError("Unexpected polling");timers.add(r);return true;}public void removeCallbacks(Runnable r){timers.remove(r);}public static void fireTimeouts(){for(Runnable r:new java.util.ArrayList<>(timers))r.run();}}''',
    "android/util/Log.java": r'''package android.util;public class Log {public static int e(String tag,String message,Throwable e){throw new AssertionError(message,e);}}''',
    "android/util/Base64.java": r'''package android.util;public class Base64 {public static final int NO_WRAP=2;public static String encodeToString(byte[] b,int f){return java.util.Base64.getEncoder().encodeToString(b);}}''',
    "android/webkit/CookieManager.java": r'''package android.webkit;public class CookieManager {private static final CookieManager instance=new CookieManager();public static boolean throwRemove,throwFlush;public static ValueCallback<Boolean> pending;public static CookieManager getInstance(){return instance;}public void removeAllCookies(ValueCallback<Boolean> c){if(throwRemove)throw new IllegalStateException("COOKIE_FAILURE");pending=c;}public void flush(){if(throwFlush)throw new IllegalStateException("FLUSH_FAILURE");}}''',
    "android/webkit/WebStorage.java": r'''package android.webkit;public class WebStorage {public static WebStorage getInstance(){return new WebStorage();}public void deleteAllData(){}}''',
    "android/database/Cursor.java": r'''package android.database;public interface Cursor extends AutoCloseable {boolean moveToFirst();boolean moveToNext();int getInt(int i);long getLong(int i);String getString(int i);byte[] getBlob(int i);void close();}''',
    "android/database/sqlite/SQLiteOpenHelper.java": r'''package android.database.sqlite;public abstract class SQLiteOpenHelper {public SQLiteOpenHelper(android.content.Context c,String n,Object f,int v){}public void onConfigure(SQLiteDatabase d){}public void setWriteAheadLoggingEnabled(boolean b){}public SQLiteDatabase getWritableDatabase(){return SQLiteDatabase.archive;}public SQLiteDatabase getReadableDatabase(){return SQLiteDatabase.archive;}public abstract void onCreate(SQLiteDatabase d);public abstract void onUpgrade(SQLiteDatabase d,int a,int b);}''',
    "android/database/sqlite/SQLiteDatabase.java": r'''package android.database.sqlite;
import android.content.ContentValues;import android.database.Cursor;import java.util.*;
public class SQLiteDatabase implements AutoCloseable {public static final int CONFLICT_IGNORE=4,CONFLICT_REPLACE=5;public static final SQLiteDatabase archive=new SQLiteDatabase();public final Map<String,List<ContentValues>> rows=new HashMap<>();private boolean transaction;public boolean committed;public void beginTransaction(){transaction=true;committed=false;}public void setTransactionSuccessful(){committed=true;}public void endTransaction(){transaction=false;}public boolean inTransaction(){return transaction;}public void execSQL(String s){}public void execSQL(String s,Object[] a){}public long insertOrThrow(String table,String n,ContentValues v){rows.computeIfAbsent(table,k->new ArrayList<>()).add(v);return 1;}public long insertWithOnConflict(String t,String n,ContentValues v,int mode){return insertOrThrow(t,n,v);}public int update(String t,ContentValues v,String w,String[] a){return 0;}public int delete(String t,String w,String[] a){return 0;}public Cursor rawQuery(String sql,String[] args){final boolean scalar=sql.contains("coalesce(max(sequence)");return new Cursor(){public boolean moveToFirst(){return scalar;}public boolean moveToNext(){return false;}public int getInt(int i){return 0;}public long getLong(int i){return 0;}public String getString(int i){return "";}public byte[] getBlob(int i){return new byte[0];}public void close(){}};}public void close(){}}''',
    "com/example/opponotificationrelay/DefensiveFixtures.java": r'''package com.example.opponotificationrelay;
import android.content.*;import android.database.sqlite.SQLiteDatabase;import java.io.*;import java.util.*;import org.json.*;
final class HealthAccountStore {static Exception failure;static JSONObject session;static boolean current=true;static long generation(){return 1;}static JSONObject load(Context c)throws Exception{if(failure!=null)throw failure;return session;}static boolean valid(long g){return current&&g==1;}static boolean exists(Context c){return session!=null;}static JSONObject validate(JSONObject s){return s;}}
final class RelayConfig {static JSONObject credentials(Context c)throws Exception{return new JSONObject().put("mac","AA:BB:CC:DD:EE:01");}static SharedPreferences getPrefs(Context c){return c.getSharedPreferences("relay",0);}static String getTargetMac(Context c){return "AA:BB:CC:DD:EE:01";}}
final class DeviceIdentityStore {static DeviceIdentity read(Context c){return null;}}
final class CloudSyncEngine {static String accountKey(String s){return "scope";}}
final class CloudStream {String id="heart";JSONObject mapping=new JSONObject(),wireTypes=new JSONObject();String field(String f){return f;}String modifiedColumn(){return "modified";}long modified(JSONObject r){return 1;}boolean has(String f){return false;}}
final class CloudStore {String scope="scope",account="fixture";int nativePendingCount(CloudStream s){return 0;}void supersedeNativeReady(CloudStream s,String p){}long producerCursor(CloudStream s){return 0;}void producerCursor(CloudStream s,long n){}boolean replayNative(CloudStream s,String v,long n){return false;}JSONObject remote(CloudStream s,JSONObject r){return null;}void check(){}void enqueueNative(CloudStream s,JSONObject r,String v,long n){}}
final class CloudNativeProjection {static JSONObject project(String i,String a,String d,long s,long r,byte[] b,String z,String m){return null;}}
final class OfficialHistoryStore {static final Object LOCK=new Object();static boolean failLaunch;static String response="known_receipt";static File current(Context c){return null;}static JSONObject json(File f){return new JSONObject();}static SQLiteDatabase open(File f){return new SQLiteDatabase();}static void release(Process p){}static void requireAllowed(Context c){}static JSONObject read(Context c,JSONObject r){return new JSONObject();}static Process launch(Context c,ProcessBuilder b)throws IOException{if(failLaunch)throw new IOException("BUSINESS_FAILED");return new Process(){public OutputStream getOutputStream(){return new ByteArrayOutputStream();}public InputStream getInputStream(){return new ByteArrayInputStream(response.getBytes(java.nio.charset.StandardCharsets.UTF_8));}public InputStream getErrorStream(){return new ByteArrayInputStream(new byte[0]);}public int waitFor(){return 0;}public int exitValue(){return 0;}public void destroy(){}};}}
final class OfficialDataLease {static boolean failRelease;static int releases;static ServiceLease<android.os.IBinder> open(Context c,int uid)throws Exception{return ServiceLease.acquire(new ServiceLease.Connector<android.os.IBinder>(){public boolean bind(ServiceLease.Callback<android.os.IBinder> cb){cb.connected((android.os.IBinder)java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{android.os.IBinder.class},(p,m,a)->m.getName().equals("isBinderAlive")?true:null));return true;}public void unbind()throws Exception{releases++;if(failRelease)throw new IOException("LEASE_RELEASE_FAILED");}},100);}}
final class FileLogger {static final List<String> warnings=new ArrayList<>();static void i(String t,String m){}static void w(String t,String m){warnings.add(m);}}
final class SettingsImportStore {static SettingsImportPlan.Local snapshot(Context c){return null;}}
final class OfficialUiResources {static void ensureReady(Context c){}static Context wrapAccount(Context c){return c;}}
final class HealthAccountClient {static JSONObject login(JSONObject s,CloudHttp h){return s;}}
final class SnoreRecordingService {static boolean isRunning(){return false;}}
final class OsaAnalysisRepository {static void refresh(Context c,OsaAnalysisScope s,java.util.function.BooleanSupplier b){}static OsaAnalysisInput load(Context c,OsaAnalysisScope s){return new OsaAnalysisInput();}}
final class OsaAnalysisInput {int oxygenSeconds,sleepMinutes,sensorMinutes;long start,end;}
final class OsaSnoreInput {static Object load(Context c,String d,long a,long b){return null;}}
final class OsaRiskAdapter {static com.heytap.health.sleep.formula.formula.result.OsaResultBean watch(String m,OsaAnalysisInput i,Object s){return null;}static boolean valid(com.heytap.health.sleep.formula.formula.result.OsaResultBean r){return false;}}
final class OsaInputStore implements AutoCloseable {OsaInputStore(Context c){}void commit(String d,String kind,int a,int b,List<OsaWatchProtocol.Samples> s){}public void close(){}}
final class RfcommWearTransport {static final RfcommWearTransport instance=new RfcommWearTransport();static boolean changeGeneration;static byte[] response;long generation=1;static RfcommWearTransport getInstance(Context c){return instance;}OafHealthChannel.Snapshot healthSettings(){return new OafHealthChannel.Snapshot(true,false);}void requestHealthSettings(){}long healthConnection(){return generation;}boolean readOsa(OsaWatchProtocol.Request r,OafHealthChannel.ReadResult cb){cb.done(true,response,"");if(changeGeneration)generation++;return true;}}
final class OafHealthChannel {interface ReadResult{void done(boolean ok,byte[] body,String detail);}static class Snapshot {boolean connected,busy;Snapshot(boolean c,boolean b){connected=c;busy=b;}}}
''',
}
files = []
for name, text in stubs.items():
    path = BUILD / "fixtures" / name
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text, encoding="utf-8")
    if path.read_text(encoding="utf-8") != text:
        raise AssertionError("UTF8_READBACK_FAILED: " + name)
    files.append(str(path))
classes = BUILD / "classes"
classes.mkdir(exist_ok=True)
classpath = os.pathsep.join(map(str, [JSON, SDK, ROOT / "tests/build", ROOT / "official-account/compile-only-api.jar", ROOT / "official-osa/compile-only-api.jar"]))
actual = [SOURCE / (name + ".java") for name in ("CloudHttp", "CloudNativeProducer", "HealthArchive", "OfficialSettingsClient", "AccountSdk", "OsaLocalAnalysis", "OsaWatchSync")]
subprocess.run([str(JAVA / "javac.exe"), "-J-Dfile.encoding=UTF-8", "-encoding", "UTF-8", "-cp", classpath, "-d", str(classes), *files, *map(str, actual), str(ROOT / "tests/DefensiveRegressionTest.java")], check=True)
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(classes) + os.pathsep + classpath, "com.example.opponotificationrelay.DefensiveRegressionTest"], check=True, timeout=25)

resource_stubs = {
    "com/example/opponotificationrelay/ResourceFixtures.java": "package com.example.opponotificationrelay;final class OfficialUiScale {static float density(android.content.Context c){return 1;}}",
    "com/oplus/aiunit/vision/e88.java": "package com.oplus.aiunit.vision;public class e88 {public static void d(android.content.Context c){}}",
}
resource_files = [name for name in files if "DefensiveFixtures.java" not in name]
for name, text in resource_stubs.items():
    path = BUILD / "fixtures" / name
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text, encoding="utf-8")
    if path.read_text(encoding="utf-8") != text:
        raise AssertionError("UTF8_READBACK_FAILED: " + name)
    resource_files.append(str(path))
resource_classes = BUILD / "resources"
resource_classes.mkdir(exist_ok=True)
subprocess.run([str(JAVA / "javac.exe"), "-J-Dfile.encoding=UTF-8", "-encoding", "UTF-8", "-cp", classpath, "-d", str(resource_classes), *resource_files, str(SOURCE / "OfficialUiResources.java"), str(SOURCE / "AccountVisualAssets.java"), str(ROOT / "tests/ResourceCompatibilityTest.java")], check=True)
for api in (29, 35):
    subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(resource_classes) + os.pathsep + classpath, "com.example.opponotificationrelay.ResourceCompatibilityTest", str(api), str(BUILD / ("resource-files-" + str(api)))], check=True, timeout=10)

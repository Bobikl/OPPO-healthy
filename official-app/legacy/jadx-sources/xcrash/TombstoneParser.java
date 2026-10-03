package xcrash;

import android.os.Build;
import android.text.TextUtils;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneTrainData;
import com.oplus.aiunit.vision.qqk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class TombstoneParser {
    public static final String keyCode = "code";
    public static final String keyFaultAddr = "fault addr";
    public static final String keyForeground = "foreground";
    public static final String keyMemoryInfo = "memory info";
    public static final String keyMemoryNear = "memory near";
    public static final String keyModel = "Model";
    public static final String keyNetworkInfo = "network info";
    public static final String keyOtherThreads = "other threads";
    public static final String keyProcessId = "pid";
    public static final String keyProcessName = "pname";
    public static final String keyRegisters = "registers";
    public static final String keySignal = "signal";
    public static final String keyThreadId = "tid";
    public static final String keyThreadName = "tname";
    public static final Pattern a = Pattern.compile("^(.*):\\s'(.*?)'$");
    public static final Pattern b = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20850c = Pattern.compile("^pid:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    public static final Pattern d = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f20851e = Pattern.compile("^(\\d{20})_(.*)__(.*)$");
    public static final String keyTombstoneMaker = "Tombstone maker";
    public static final String keyCrashType = "Crash type";
    public static final String keyStartTime = "Start time";
    public static final String keyCrashTime = "Crash time";
    public static final String keyAppId = "App ID";
    public static final String keyAppVersion = "App version";
    public static final String keyRooted = "Rooted";
    public static final String keyApiLevel = "API level";
    public static final String keyOsVersion = "OS version";
    public static final String keyKernelVersion = "Kernel version";
    public static final String keyAbiList = "ABI list";
    public static final String keyManufacturer = "Manufacturer";
    public static final String keyBrand = "Brand";
    public static final String keyBuildFingerprint = "Build fingerprint";
    public static final String keyAbi = "ABI";
    public static final String keyAbortMessage = "Abort message";
    public static final Set<String> f = new HashSet(Arrays.asList(keyTombstoneMaker, keyCrashType, keyStartTime, keyCrashTime, keyAppId, keyAppVersion, keyRooted, keyApiLevel, keyOsVersion, keyKernelVersion, keyAbiList, keyManufacturer, keyBrand, "Model", keyBuildFingerprint, keyAbi, keyAbortMessage));
    public static final String keyBacktrace = "backtrace";
    public static final String keyBuildId = "build id";
    public static final String keyStack = "stack";
    public static final String keyMemoryMap = "memory map";
    public static final String keyLogcat = "logcat";
    public static final String keyOpenFiles = "open files";
    public static final String keyJavaStacktrace = "java stacktrace";
    public static final String keyXCrashError = "xcrash error";
    public static final String keyXCrashErrorDebug = "xcrash error debug";
    public static final Set<String> g = new HashSet(Arrays.asList(keyBacktrace, keyBuildId, keyStack, keyMemoryMap, keyLogcat, keyOpenFiles, keyJavaStacktrace, keyXCrashError, keyXCrashErrorDebug));
    public static final Set<String> h = new HashSet(Arrays.asList("foreground"));

    public enum Status {
        UNKNOWN,
        HEAD,
        SECTION
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(Map<String, String> map) {
        if (TextUtils.isEmpty(map.get(keyAppId))) {
            map.put(keyAppId, b.a());
        }
        if (TextUtils.isEmpty(map.get(keyTombstoneMaker))) {
            map.put(keyTombstoneMaker, "xCrash 3.1.0");
        }
        if (TextUtils.isEmpty(map.get(keyRooted))) {
            map.put(keyRooted, qqk.q() ? "Yes" : SceneTrainData.KEY_NO);
        }
        if (TextUtils.isEmpty(map.get(keyApiLevel))) {
            map.put(keyApiLevel, String.valueOf(Build.VERSION.SDK_INT));
        }
        if (TextUtils.isEmpty(map.get(keyOsVersion))) {
            map.put(keyOsVersion, Build.VERSION.RELEASE);
        }
        if (TextUtils.isEmpty(map.get(keyBuildFingerprint))) {
            map.put("Model", Build.FINGERPRINT);
        }
        if (TextUtils.isEmpty(map.get(keyManufacturer))) {
            map.put(keyManufacturer, Build.MANUFACTURER);
        }
        if (TextUtils.isEmpty(map.get(keyBrand))) {
            map.put(keyBrand, Build.BRAND);
        }
        if (TextUtils.isEmpty(map.get("Model"))) {
            map.put("Model", qqk.m());
        }
        if (TextUtils.isEmpty(map.get(keyAbiList))) {
            map.put(keyAbiList, qqk.c());
        }
    }

    public static Map<String, String> b(String str, String str2) throws IOException {
        HashMap map = new HashMap();
        if (str != null) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            d(map, bufferedReader, true);
            bufferedReader.close();
        }
        if (str2 != null) {
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(str2));
            d(map, bufferedReader2, false);
            bufferedReader2.close();
        }
        c(map, str);
        if (TextUtils.isEmpty((String) map.get(keyAppVersion))) {
            String strB = b.b();
            if (TextUtils.isEmpty(strB)) {
                strB = "unknown";
            }
            map.put(keyAppVersion, strB);
        }
        a(map);
        return map;
    }

    public static void c(Map<String, String> map, String str) {
        String strSubstring;
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(map.get(keyCrashTime))) {
            map.put(keyCrashTime, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(new File(str).lastModified())));
        }
        String str2 = map.get(keyStartTime);
        String str3 = map.get(keyAppVersion);
        String str4 = map.get(keyProcessName);
        String str5 = map.get(keyCrashType);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            String strSubstring2 = str.substring(str.lastIndexOf(47) + 1);
            if (!strSubstring2.isEmpty() && strSubstring2.startsWith("tombstone_")) {
                String strSubstring3 = strSubstring2.substring(10);
                if (strSubstring3.endsWith(".java.xcrash")) {
                    if (TextUtils.isEmpty(str5)) {
                        map.put(keyCrashType, "java");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 12);
                } else if (strSubstring3.endsWith(".native.xcrash")) {
                    if (TextUtils.isEmpty(str5)) {
                        map.put(keyCrashType, "native");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 14);
                } else {
                    if (!strSubstring3.endsWith(".anr.xcrash")) {
                        return;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        map.put(keyCrashType, "anr");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 11);
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    Matcher matcher = f20851e.matcher(strSubstring);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        if (TextUtils.isEmpty(str2)) {
                            map.put(keyStartTime, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(Long.parseLong(matcher.group(1), 10) / 1000)));
                        }
                        if (TextUtils.isEmpty(str3)) {
                            map.put(keyAppVersion, matcher.group(2));
                        }
                        if (TextUtils.isEmpty(str4)) {
                            map.put(keyProcessName, matcher.group(3));
                        }
                    }
                }
            }
        }
    }

    public static void d(Map<String, String> map, BufferedReader bufferedReader, boolean z) throws IOException {
        int i;
        StringBuilder sb = new StringBuilder();
        Status status = Status.UNKNOWN;
        String strG = z ? g(bufferedReader) : bufferedReader.readLine();
        int i2 = 1;
        int i3 = strG == null ? 1 : 0;
        String str = null;
        String str2 = "";
        boolean z2 = false;
        boolean zEquals = false;
        while (i3 == 0) {
            String strG2 = z ? g(bufferedReader) : bufferedReader.readLine();
            int i4 = strG2 == null ? i2 : 0;
            int i5 = a.a[status.ordinal()];
            if (i5 == i2) {
                if (strG.equals("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***")) {
                    status = Status.HEAD;
                } else if (strG.equals("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---")) {
                    status = Status.SECTION;
                    sb.append(strG);
                    sb.append('\n');
                    str2 = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";
                    str = keyOtherThreads;
                    i = 1;
                    z2 = false;
                    zEquals = false;
                } else {
                    i = 1;
                    if (strG.length() > 1 && strG.endsWith(":")) {
                        status = Status.SECTION;
                        String strSubstring = strG.substring(0, strG.length() - 1);
                        if (g.contains(strSubstring)) {
                            z2 = strSubstring.equals(keyBacktrace) || strSubstring.equals(keyBuildId) || strSubstring.equals(keyStack) || strSubstring.equals(keyMemoryMap) || strSubstring.equals(keyOpenFiles) || strSubstring.equals(keyJavaStacktrace) || strSubstring.equals(keyXCrashErrorDebug);
                            zEquals = strSubstring.equals(keyXCrashError);
                            str = strSubstring;
                            str2 = "";
                        } else {
                            if (strSubstring.equals(keyMemoryInfo)) {
                                str = strSubstring;
                            } else if (strSubstring.startsWith("memory near ")) {
                                sb.append(strG);
                                sb.append('\n');
                                str = keyMemoryNear;
                            } else {
                                str = strSubstring;
                                str2 = "";
                                z2 = false;
                                zEquals = false;
                            }
                            zEquals = true;
                            str2 = "";
                            z2 = false;
                        }
                    }
                }
                i2 = i;
                strG = strG2;
                i3 = i4;
            } else if (i5 == 2) {
                if (strG.startsWith("pid: ")) {
                    Matcher matcher = b.matcher(strG);
                    if (matcher.find() && matcher.groupCount() == 4) {
                        e(map, "pid", matcher.group(1));
                        e(map, "tid", matcher.group(2));
                        e(map, keyThreadName, matcher.group(3));
                        e(map, keyProcessName, matcher.group(4));
                    } else {
                        Matcher matcher2 = f20850c.matcher(strG);
                        if (matcher2.find() && matcher2.groupCount() == 2) {
                            e(map, "pid", matcher2.group(1));
                            e(map, keyProcessName, matcher2.group(2));
                        }
                    }
                } else if (strG.startsWith("signal ")) {
                    Matcher matcher3 = d.matcher(strG);
                    if (matcher3.find() && matcher3.groupCount() == 3) {
                        e(map, keySignal, matcher3.group(1));
                        e(map, "code", matcher3.group(2));
                        e(map, keyFaultAddr, matcher3.group(3));
                    }
                } else {
                    Matcher matcher4 = a.matcher(strG);
                    if (matcher4.find() && matcher4.groupCount() == 2 && f.contains(matcher4.group(1))) {
                        e(map, matcher4.group(1), matcher4.group(2));
                    }
                }
                if (strG2 != null && (strG2.startsWith("    r0 ") || strG2.startsWith("    x0 ") || strG2.startsWith("    eax ") || strG2.startsWith("    rax "))) {
                    status = Status.SECTION;
                    str = keyRegisters;
                    str2 = "";
                    z2 = true;
                    zEquals = false;
                }
                if (strG2 == null || strG2.isEmpty()) {
                    status = Status.UNKNOWN;
                }
            } else if (i5 == 3) {
                if (strG.equals(str2) || i4 != 0) {
                    if (h.contains(str) && sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    f(map, str, sb.toString(), zEquals);
                    sb.setLength(0);
                    status = Status.UNKNOWN;
                } else {
                    if (z2) {
                        if (str.equals(keyJavaStacktrace) && strG.startsWith(" ")) {
                            strG = strG.trim();
                        } else if (strG.startsWith("    ")) {
                            strG = strG.substring(4);
                        }
                    }
                    sb.append(strG);
                    sb.append('\n');
                }
            }
            i = 1;
            i2 = i;
            strG = strG2;
            i3 = i4;
        }
    }

    public static void e(Map<String, String> map, String str, String str2) {
        f(map, str, str2, false);
    }

    public static void f(Map<String, String> map, String str, String str2, boolean z) {
        if (str == null || str.isEmpty() || str2 == null) {
            return;
        }
        String str3 = map.get(str);
        if (!z) {
            if (str3 == null || (str3.isEmpty() && !str2.isEmpty())) {
                map.put(str, str2);
                return;
            }
            return;
        }
        if (str3 != null) {
            str2 = str3 + str2;
        }
        map.put(str, str2);
    }

    public static String g(BufferedReader bufferedReader) throws IOException {
        try {
            bufferedReader.mark(2);
            for (int i = 0; i < 2; i++) {
                try {
                    int i2 = bufferedReader.read();
                    if (i2 == -1) {
                        bufferedReader.reset();
                        return null;
                    }
                    if (i2 > 0) {
                        bufferedReader.reset();
                        return bufferedReader.readLine();
                    }
                } catch (Exception unused) {
                    bufferedReader.reset();
                    return bufferedReader.readLine();
                }
            }
            bufferedReader.reset();
            return null;
        } catch (Exception unused2) {
            return bufferedReader.readLine();
        }
    }
}

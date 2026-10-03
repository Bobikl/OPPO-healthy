package com.oplusos.vfxmodelviewer.view;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Hardware;", "", "()V", "CPU_TYPE", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Hardware {
    private static int CPU_AVERAGE_FREQ = 0;
    private static int CPU_CORE_COUNT = 0;
    private static int CPU_MAX_FREQ = 0;
    private static int RAM = 0;

    @NotNull
    public static final String TAG = "Hardware";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String CPU_NAME = "";

    @NotNull
    private static CPU_TYPE CPU_T = CPU_TYPE.NONE;
    private static int CPU_NUMBER = -1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Hardware$CPU_TYPE;", "", "(Ljava/lang/String;I)V", "NONE", "QCOM", "MTK", "OTHER", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum CPU_TYPE {
        NONE,
        QCOM,
        MTK,
        OTHER
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0006\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Hardware$Companion;", "", "()V", "CPU_AVERAGE_FREQ", "", "CPU_CORE_COUNT", "CPU_MAX_FREQ", "CPU_NAME", "", "CPU_NUMBER", "CPU_T", "Lcom/oplusos/vfxmodelviewer/view/Hardware$CPU_TYPE;", "RAM", "TAG", "calculateCPUFreq", "", "getCPUAverageFreq", "getCPUName", "getCPUNumber", "getCPUType", "getCpuCoreCount", "getCpuMaxFreq", "getCpuMaxFreqByIndex", "coreIndex", "getMTKCPUNumber", "getQcomCPUNumber", "getRam", "readFileInt", "filePath", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void calculateCPUFreq() {
            int cpuCoreCount = getCpuCoreCount();
            if (cpuCoreCount == 0) {
                return;
            }
            int i = 0;
            Hardware.CPU_MAX_FREQ = 0;
            if (cpuCoreCount > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    int cpuMaxFreqByIndex = getCpuMaxFreqByIndex(i);
                    i2 += cpuMaxFreqByIndex;
                    if (Hardware.CPU_MAX_FREQ < cpuMaxFreqByIndex) {
                        Hardware.CPU_MAX_FREQ = cpuMaxFreqByIndex;
                    }
                    if (i3 >= cpuCoreCount) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                i = i2;
            }
            Hardware.CPU_AVERAGE_FREQ = MathKt.roundToInt(i / cpuCoreCount);
        }

        private final int getCpuMaxFreqByIndex(int coreIndex) {
            return readFileInt("/sys/devices/system/cpu/cpu" + coreIndex + "/cpufreq/cpuinfo_max_freq");
        }

        private final int getMTKCPUNumber() {
            String str = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(str, "name");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            try {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = lowerCase.substring(2, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return Integer.parseInt(strSubstring);
            } catch (Exception e) {
                LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
                return 0;
            }
        }

        private final int getQcomCPUNumber() throws Throwable {
            String cPUName = getCPUName();
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            if (cPUName == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = cPUName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            int iLastIndexOf$default = StringsKt.lastIndexOf$default(lowerCase, "sm", 0, false, 6, (Object) null);
            if (iLastIndexOf$default >= 0) {
                int i = iLastIndexOf$default + 2;
                int i2 = iLastIndexOf$default + 6;
                try {
                    if (lowerCase == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring = lowerCase.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return Integer.parseInt(strSubstring);
                } catch (Exception e) {
                    LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
                }
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.io.BufferedReader] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private final int readFileInt(String filePath) throws Throwable {
            Throwable th;
            BufferedReader bufferedReader;
            Exception e;
            int i;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((String) filePath)), 50);
                    try {
                        String line = bufferedReader.readLine();
                        Intrinsics.checkNotNullExpressionValue(line, "line");
                        i = Integer.parseInt(line);
                        bufferedReader.close();
                        filePath = bufferedReader;
                    } catch (Exception e2) {
                        e = e2;
                        LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        i = 0;
                        filePath = bufferedReader;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (filePath != 0) {
                        filePath.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th3) {
                filePath = 0;
                th = th3;
                if (filePath != 0) {
                    filePath.close();
                }
                throw th;
            }
            return i;
        }

        public final int getCPUAverageFreq() {
            if (Hardware.CPU_AVERAGE_FREQ > 0) {
                return Hardware.CPU_AVERAGE_FREQ;
            }
            calculateCPUFreq();
            return Hardware.CPU_AVERAGE_FREQ;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        @NotNull
        public final String getCPUName() throws Throwable {
            BufferedReader bufferedReader;
            Exception e;
            if (Hardware.CPU_NAME.length() > 0) {
                return Hardware.CPU_NAME;
            }
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    Hardware.CPU_NAME = "Unknown";
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")));
                    try {
                        List lines = TextStreamsKt.readLines(bufferedReader);
                        int size = lines.size();
                        if (size > 0) {
                            String str = (String) lines.get(size - 1);
                            if (StringsKt.startsWith$default(str, Hardware.TAG, false, 2, (Object) null)) {
                                List listSplit$default = StringsKt.split$default(str, new String[]{": "}, false, 0, 6, (Object) null);
                                if (listSplit$default.size() >= 2) {
                                    Hardware.CPU_NAME = (String) listSplit$default.get(1);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
                        if (bufferedReader != null) {
                        }
                        return Hardware.CPU_NAME;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                throw th;
            }
            bufferedReader.close();
            return Hardware.CPU_NAME;
        }

        public final int getCPUNumber() {
            if (Hardware.CPU_NUMBER > 0) {
                return Hardware.CPU_NUMBER;
            }
            CPU_TYPE cPUType = getCPUType();
            if (cPUType == CPU_TYPE.MTK) {
                Hardware.CPU_NUMBER = getMTKCPUNumber();
            } else if (cPUType == CPU_TYPE.QCOM) {
                Hardware.CPU_NUMBER = getQcomCPUNumber();
            }
            return Hardware.CPU_NUMBER;
        }

        @NotNull
        public final CPU_TYPE getCPUType() {
            if (Hardware.CPU_T != CPU_TYPE.NONE) {
                return Hardware.CPU_T;
            }
            Hardware.CPU_T = CPU_TYPE.OTHER;
            String str = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(str, "cpuName");
            if (new Regex("qcom").containsMatchIn(str)) {
                Hardware.CPU_T = CPU_TYPE.QCOM;
            } else if (new Regex("mt").containsMatchIn(str)) {
                Hardware.CPU_T = CPU_TYPE.MTK;
            }
            return Hardware.CPU_T;
        }

        public final int getCpuCoreCount() {
            if (Hardware.CPU_CORE_COUNT > 0) {
                return Hardware.CPU_CORE_COUNT;
            }
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.oplusos.vfxmodelviewer.view.Hardware$Companion$getCpuCoreCount$files$1
                    @Override // java.io.FilenameFilter
                    public boolean accept(@Nullable File dir, @Nullable String name) {
                        return name != null && Pattern.matches("cpu[0-9]", name);
                    }
                });
                if (fileArrListFiles != null) {
                    Hardware.CPU_CORE_COUNT = fileArrListFiles.length;
                }
            } catch (Exception e) {
                LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
            }
            return Hardware.CPU_CORE_COUNT;
        }

        public final int getCpuMaxFreq() {
            if (Hardware.CPU_MAX_FREQ > 0) {
                return Hardware.CPU_MAX_FREQ;
            }
            calculateCPUFreq();
            return Hardware.CPU_MAX_FREQ;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007b  */
        public final int getRam() throws Throwable {
            BufferedReader bufferedReader;
            Throwable th;
            Exception e;
            if (Hardware.RAM > 0) {
                return Hardware.RAM;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/meminfo")), 100);
                try {
                    try {
                        String line = bufferedReader.readLine();
                        Intrinsics.checkNotNullExpressionValue(line, "str");
                        List listSplit$default = StringsKt.split$default(line, new String[]{" kB", " "}, false, 0, 6, (Object) null);
                        Hardware.RAM = Integer.parseInt(listSplit$default.size() >= 2 ? (String) listSplit$default.get(listSplit$default.size() - 2) : "0");
                    } catch (Exception e2) {
                        e = e2;
                        LogUtils.INSTANCE.e(Hardware.TAG, e.toString());
                        if (bufferedReader != null) {
                        }
                        return Hardware.RAM;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
            bufferedReader.close();
            return Hardware.RAM;
        }
    }
}

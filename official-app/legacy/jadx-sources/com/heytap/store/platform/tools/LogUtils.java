package com.heytap.store.platform.tools;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.util.Formatter;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010'\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u0019\u0010(\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010-\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\bJ \u00100\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\bJ\u0016\u00101\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\bJ\"\u00102\u001a\u00020$2\u0006\u0010%\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\bH\u0002J\b\u00103\u001a\u00020\bH\u0002J\u0006\u0010!\u001a\u00020$J\u000e\u00104\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0016\u00104\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u00105\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0016\u00105\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00066"}, d2 = {"Lcom/heytap/store/platform/tools/LogUtils;", "", "()V", "A", "", "getA", "()I", "BOTTOM_BORDER", "", "D", "getD", ExifInterface.LONGITUDE_EAST, "getE", "I", "getI", "LEFT_BORDER", "MAX_LEN", "MIN_STACK_OFFSET", "TOP_BORDER", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getV", ExifInterface.LONGITUDE_WEST, "getW", "defaultTag", "getDefaultTag", "()Ljava/lang/String;", "setDefaultTag", "(Ljava/lang/String;)V", "lineSeparator", "logSwitch", "", "getLogSwitch", "()Z", "setLogSwitch", "(Z)V", "d", "", "msg", "tag", MapSchema.FIELD_NAME_ENTRY, "getStackOffset", UTraceSQLiteHelperKt.TRACE_TABLE_NAME, "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)I", "i", "printBottom", "flag", "printLog", "printTop", "processMsgBody", "processTagAndHead", "v", "w", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class LogUtils {
    public static final LogUtils INSTANCE = new LogUtils();
    private static final int MIN_STACK_OFFSET = 3;

    @NotNull
    private static String defaultTag = "LogUtil";
    private static final String lineSeparator = System.getProperty("line.separator", "/n");
    private static final int V = 2;
    private static final int D = 3;
    private static final int I = 4;
    private static final int W = 5;
    private static final int E = 6;
    private static final int A = 7;
    private static final String TOP_BORDER = "╔═══════════════════════════════════════════════════════════════════════════════════════════════════";
    private static final String LEFT_BORDER = "║ ";
    private static final String BOTTOM_BORDER = "╚═══════════════════════════════════════════════════════════════════════════════════════════════════";
    private static final int MAX_LEN = 1000;
    private static boolean logSwitch = true;

    private LogUtils() {
    }

    public static /* synthetic */ void printLog$default(LogUtils logUtils, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = logUtils.processTagAndHead();
        }
        logUtils.printLog(i, str, str2);
    }

    private final void processMsgBody(String msg, int flag, String tag) {
        printTop(flag, tag);
        printLog$default(this, flag, tag, null, 4, null);
        int length = msg.length() / MAX_LEN;
        if (length == 0) {
            printLog(flag, tag, msg);
        } else {
            int i = 0;
            int i2 = 0;
            do {
                int i3 = MAX_LEN;
                String strSubstring = msg.substring(i, i + i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                printLog(flag, tag, strSubstring);
                i += i3;
                i2++;
            } while (i2 < length);
        }
        printBottom(flag, tag);
    }

    public static /* synthetic */ void processMsgBody$default(LogUtils logUtils, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = defaultTag;
        }
        logUtils.processMsgBody(str, i, str2);
    }

    private final String processTagAndHead() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        StackTraceElement[] elements = threadCurrentThread.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(elements, "elements");
        StackTraceElement targetElement = elements[getStackOffset(elements)];
        Formatter formatter = new Formatter();
        StringBuilder sb = new StringBuilder();
        sb.append("In Thread: ");
        Thread threadCurrentThread2 = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "Thread.currentThread()");
        sb.append(threadCurrentThread2.getName());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(targetElement, "targetElement");
        String string2 = formatter.format("%s [%s(%s:%d)]", string, targetElement.getMethodName(), targetElement.getFileName(), Integer.valueOf(targetElement.getLineNumber())).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "head.toString()");
        return string2;
    }

    public final void d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        d(defaultTag, msg);
    }

    public final void e(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(defaultTag, msg);
    }

    public final int getA() {
        return A;
    }

    public final int getD() {
        return D;
    }

    @NotNull
    public final String getDefaultTag() {
        return defaultTag;
    }

    public final int getE() {
        return E;
    }

    public final int getI() {
        return I;
    }

    public final boolean getLogSwitch() {
        return logSwitch;
    }

    public final int getStackOffset(@NotNull StackTraceElement[] trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        for (int i = MIN_STACK_OFFSET; i < trace.length; i++) {
            if (!Intrinsics.areEqual(trace[i].getClassName(), LogUtils.class.getName())) {
                return i;
            }
        }
        return 2;
    }

    public final int getV() {
        return V;
    }

    public final int getW() {
        return W;
    }

    public final void i(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        i(defaultTag, msg);
    }

    public final void printBottom(int flag, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Log.println(flag, tag, BOTTOM_BORDER);
    }

    public final void printLog(int flag, @NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.println(flag, tag, LEFT_BORDER + msg);
    }

    public final void printTop(int flag, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Log.println(flag, tag, TOP_BORDER);
    }

    public final void setDefaultTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        defaultTag = str;
    }

    public final void setLogSwitch(boolean z) {
        logSwitch = z;
    }

    public final void v(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        v(defaultTag, msg);
    }

    public final void w(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        w(defaultTag, msg);
    }

    public final void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (logSwitch) {
            processMsgBody(msg, D, tag);
        }
    }

    public final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (logSwitch) {
            processMsgBody(msg, E, tag);
        }
    }

    public final void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (logSwitch) {
            processMsgBody(msg, I, tag);
        }
    }

    public final void setLogSwitch() {
        logSwitch = false;
    }

    public final void v(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (logSwitch) {
            processMsgBody(msg, V, tag);
        }
    }

    public final void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (logSwitch) {
            processMsgBody(msg, W, tag);
        }
    }
}

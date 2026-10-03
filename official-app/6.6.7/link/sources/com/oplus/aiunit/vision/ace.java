package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/ace;", "", "<init>", "()V", "Companion", "a", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
public final class ace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String TAG = "PayLog.deeplink";
    public static final boolean a;
    public static final boolean b;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ace$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ace$a;", "", "", "message", "", "c", "d", "i", "", "f", "e", "g", "h", "TAG", "Ljava/lang/String;", "isDevMode", "Z", "isLoggable", "mIsLogPrintFile", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void c(@Nullable String message) {
            if (!f() || message == null) {
                return;
            }
            Log.d("PayLog.deeplink:" + e(), message);
        }

        @JvmStatic
        public final void d(@Nullable String message) {
            if (!f() || message == null) {
                return;
            }
            Log.e("PayLog.deeplink:" + e(), message);
        }

        public final String e() {
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            int length = stackTrace.length;
            for (int i = 2; i < length; i++) {
                if (!Intrinsics.areEqual(stackTrace[i].getClass(), ace.class)) {
                    String className = stackTrace[i].getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "callingClass");
                    Intrinsics.checkNotNullExpressionValue(className, "callingClass");
                    String strSubstring = className.substring(StringsKt.lastIndexOf$default(className, d14.POINT_REGEX, 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "callingClass");
                    return strSubstring;
                }
            }
            return "";
        }

        public final boolean f() {
            return ace.a || ace.b;
        }

        public final boolean g() {
            String strA = moj.a("persist.sys.assert.panic");
            Intrinsics.checkNotNullExpressionValue(strA, "getSystemProperty(\"persist.sys.assert.panic\")");
            String strA2 = moj.a(SystemSettingsUtilsKt.LOG_ON_MKT);
            Intrinsics.checkNotNullExpressionValue(strA2, "getSystemProperty(\"persist.sys.assert.enable\")");
            return StringsKt.equals(strA, "true", true) || StringsKt.equals(strA2, "true", true);
        }

        public final boolean h() {
            return Log.isLoggable(ace.TAG, 2);
        }

        @JvmStatic
        public final void i(@Nullable String message) {
            if (!f() || message == null) {
                return;
            }
            Log.w("PayLog.deeplink:" + e(), message);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        a = companion.h();
        b = companion.g();
    }

    @JvmStatic
    public static final void c(@Nullable String str) {
        INSTANCE.c(str);
    }

    @JvmStatic
    public static final void d(@Nullable String str) {
        INSTANCE.d(str);
    }

    @JvmStatic
    public static final void e(@Nullable String str) {
        INSTANCE.i(str);
    }
}

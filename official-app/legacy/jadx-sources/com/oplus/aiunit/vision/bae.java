package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/bae;", "", "<init>", "()V", "Companion", "a", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
public final class bae {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String TAG = "PayLog.deeplink";
    public static final boolean a;
    public static final boolean b;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bae$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/bae$a;", "", "", "message", "", "c", "d", "i", "", "f", MapSchema.FIELD_NAME_ENTRY, b2n.f, b2n.g, "TAG", "Ljava/lang/String;", "isDevMode", "Z", "isLoggable", "mIsLogPrintFile", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
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
                if (!Intrinsics.areEqual(stackTrace[i].getClass(), bae.class)) {
                    String callingClass = stackTrace[i].getClassName();
                    Intrinsics.checkNotNullExpressionValue(callingClass, "callingClass");
                    Intrinsics.checkNotNullExpressionValue(callingClass, "callingClass");
                    String callingClass2 = callingClass.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) callingClass, ".", 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(callingClass2, "this as java.lang.String).substring(startIndex)");
                    Intrinsics.checkNotNullExpressionValue(callingClass2, "callingClass");
                    return callingClass2;
                }
            }
            return "";
        }

        public final boolean f() {
            return bae.a || bae.b;
        }

        public final boolean g() {
            String strA = qkj.a("persist.sys.assert.panic");
            Intrinsics.checkNotNullExpressionValue(strA, "getSystemProperty(\"persist.sys.assert.panic\")");
            String strA2 = qkj.a(SystemSettingsUtilsKt.LOG_ON_MKT);
            Intrinsics.checkNotNullExpressionValue(strA2, "getSystemProperty(\"persist.sys.assert.enable\")");
            return StringsKt__StringsJVMKt.equals(strA, SpeechConstant.TRUE_STR, true) || StringsKt__StringsJVMKt.equals(strA2, SpeechConstant.TRUE_STR, true);
        }

        public final boolean h() {
            return Log.isLoggable(bae.TAG, 2);
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

package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import io.protostuff.MapSchema;
import java.lang.reflect.Method;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0087\bø\u0001\u0000J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u000f\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\"\u0010\u001dR$\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/i0;", "", "Landroid/content/Context;", "context", "", FragmentStyle.DEBUG, "", b2n.f, "", "tag", "msg", "a", "Lkotlin/Function0;", "b", "f", "n", "c", "", "throwable", "d", "j", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "()V", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "BIZ_TAG", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "setDebugMode", "(Z)V", "debugMode", "<set-?>", "i", "isLogOn", b2n.g, "isDebugging", "isInitialized", "<init>", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class i0 {

    @NotNull
    public static final i0 INSTANCE = new i0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String BIZ_TAG = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile boolean debugMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isLogOn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean isDebugging;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isInitialized;

    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (debugMode || isDebugging) {
            Log.d(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
        }
    }

    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i0 i0Var = INSTANCE;
        if (i0Var.e() || i0Var.h()) {
            j(tag, msg.invoke());
        }
    }

    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.e(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Log.e(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg, throwable);
    }

    @JvmStatic
    public static final void f(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isLogOn || debugMode) {
            Log.i(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
        }
    }

    @JvmStatic
    public static final void g(@NotNull Context context, boolean debug) {
        String string;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        if (isInitialized) {
            return;
        }
        String str = context.getApplicationInfo().packageName;
        Intrinsics.checkNotNull(str);
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0 || (i = iLastIndexOf$default + 1) >= str.length()) {
            string = "AIUnit-SDK";
        } else {
            StringBuilder sb = new StringBuilder("AIUnit-SDK(");
            String strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append(')');
            string = sb.toString();
        }
        BIZ_TAG = string;
        debugMode = debug;
        l();
        m();
        isInitialized = true;
    }

    @JvmStatic
    public static final void j(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.d(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
    }

    @JvmStatic
    public static final void k(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
    }

    @JvmStatic
    public static final void l() {
        isDebugging = Log.isLoggable("AIUnit", 3);
        k(BIZ_TAG, "refreshDebugSwitch: isDebugging = " + isDebugging);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006e A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:3:0x0006, B:5:0x005f, B:7:0x006a, B:10:0x0070, B:9:0x006e), top: B:18:0x0006 }] */
    @JvmStatic
    @SuppressLint({"PrivateApi"})
    public static final void m() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            Boolean bool = Boolean.FALSE;
            Object objInvoke = method.invoke(cls, "persist.sys.assert.panic", bool);
            Object objInvoke2 = method.invoke(cls, SystemSettingsUtilsKt.LOG_ON_MKT, bool);
            k(BIZ_TAG, "refreshLogSwitch: qeOff = " + objInvoke + ", qeOffMtk = " + objInvoke2);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) objInvoke).booleanValue()) {
                isLogOn = true;
            } else {
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) objInvoke2).booleanValue() || isDebugging) {
                    isLogOn = true;
                }
            }
            k(BIZ_TAG, "refreshLogSwitch: isLogOn = " + isLogOn);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Log.e(BIZ_TAG, "refreshLogSwitch exception", thM5290exceptionOrNullimpl);
        }
    }

    @JvmStatic
    public static final void n(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.w(BIZ_TAG + Soundex.SILENT_MARKER + tag, msg);
    }

    public final boolean e() {
        return debugMode;
    }

    public final boolean h() {
        return isDebugging;
    }

    public final boolean i() {
        return isLogOn;
    }
}

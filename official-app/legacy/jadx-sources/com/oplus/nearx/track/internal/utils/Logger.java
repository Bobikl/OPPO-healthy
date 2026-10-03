package com.oplus.nearx.track.internal.utils;

import android.util.Log;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gs9;
import com.oplus.aiunit.vision.pe8;
import com.oplus.aiunit.vision.v45;
import com.oplus.aiunit.vision.xkj;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 -2\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b,\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ?\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ?\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J-\u0010\u0017\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0017\u0010%\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001b\u0010*\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+¨\u0006."}, d2 = {"Lcom/oplus/nearx/track/internal/utils/Logger;", "", "Lcom/oplus/aiunit/vision/gs9;", "logHook", "", "n", "", "tag", "format", "", "throwable", "", "obj", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "o", "a", "i", "q", "c", b2n.f, LogFieldKey.MESSAGE_KEY, "objs", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "args", b2n.g, "([Ljava/lang/Object;)Ljava/lang/Throwable;", "", "Z", "getEnableLog", "()Z", "setEnableLog", "(Z)V", "enableLog", "b", "isDebugByProp", "isPrintLog", "d", "Lkotlin/Lazy;", "f", "()Ljava/lang/String;", "cacheProcessFlag", "Lcom/oplus/aiunit/vision/gs9;", "<init>", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class Logger {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean enableLog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isDebugByProp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isPrintLog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy cacheProcessFlag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public gs9 logHook;

    public Logger(boolean z) {
        this.enableLog = z;
        this.isDebugByProp = xkj.INSTANCE.d("persist.sys.assert.panic", false);
        this.isPrintLog = this.enableLog || GlobalConfigHelper.INSTANCE.e();
        this.cacheProcessFlag = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.oplus.nearx.track.internal.utils.Logger$cacheProcessFlag$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return '[' + ProcessUtil.INSTANCE.b() + ']';
            }
        });
        this.logHook = v45.INSTANCE.a();
    }

    public static /* synthetic */ void b(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.a(str, str2, th, objArr);
    }

    public static /* synthetic */ void d(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.c(str, str2, th, objArr);
    }

    public static /* synthetic */ void j(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.i(str, str2, th, objArr);
    }

    public static /* synthetic */ void l(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.k(str, str2, th, objArr);
    }

    public static /* synthetic */ void p(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.o(str, str2, th, objArr);
    }

    public static /* synthetic */ void r(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.q(str, str2, th, objArr);
    }

    public final void a(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.d(m(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.d(m(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
        }
    }

    public final void c(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.e(m(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.e(m(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
        }
    }

    public final String e(String format, Object... objs) {
        Throwable thH = h(Arrays.copyOf(objs, objs.length));
        if (thH != null) {
            objs = Arrays.copyOf(objs, objs.length - 1);
            Intrinsics.checkNotNullExpressionValue(objs, "copyOf(obj, obj.size - 1)");
        }
        if (objs != null && objs.length != 0 && format != null) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objs, objs.length);
                format = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            } catch (Throwable unused) {
                format = "";
            }
        }
        String str = format != null ? format : "";
        if (thH == null) {
            return str;
        }
        return str + "  " + Log.getStackTraceString(thH);
    }

    public final String f() {
        return (String) this.cacheProcessFlag.getValue();
    }

    public final String g() {
        return (GlobalConfigHelper.INSTANCE.j() && !ProcessUtil.INSTANCE.g()) ? f() : "";
    }

    public final Throwable h(Object... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        Object obj = args[args.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public final void i(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.i(m(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.i(m(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
        }
    }

    public final void k(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        String str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            if (tag.length() == 0) {
                str = "Track.Core" + g();
            } else {
                str = "Track.Core." + tag + g();
            }
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.d(str, format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.d(str, e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
            pe8.d().h(str, e(format, Arrays.copyOf(obj, obj.length)));
        }
    }

    public final String m(String tag) {
        if (tag == null || tag.length() == 0) {
            return "Track" + g();
        }
        return "Track." + tag + g();
    }

    public final void n(@NotNull gs9 logHook) {
        Intrinsics.checkNotNullParameter(logHook, "logHook");
        this.logHook = logHook;
    }

    public final void o(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.v(m(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.v(m(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
        }
    }

    public final void q(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.isPrintLog) {
            gs9 gs9Var = this.logHook;
            Boolean boolValueOf = gs9Var != null ? Boolean.valueOf(gs9Var.w(m(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
            if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                Log.w(m(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
            }
        }
    }

    public /* synthetic */ Logger(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

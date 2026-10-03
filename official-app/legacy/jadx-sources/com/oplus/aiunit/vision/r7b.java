package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.common.LogLevel;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002\u000f\u001cB\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ?\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J-\u0010\u0015\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/r7b;", "", "Lcom/oplus/aiunit/vision/r7b$b;", "logHook", "", "j", "", "tag", "format", "", "throwable", "", "obj", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "a", b2n.f, LogFieldKey.MESSAGE_KEY, "c", "i", "objs", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "args", "f", "([Ljava/lang/Object;)Ljava/lang/Throwable;", "Lcom/oplus/aiunit/vision/r7b$b;", "Lcom/heytap/common/LogLevel;", "b", "Lcom/heytap/common/LogLevel;", "logLevel", "Ljava/lang/String;", "tagPrefix", "<init>", "(Lcom/heytap/common/LogLevel;Ljava/lang/String;)V", "Companion", "lib_utils_release"}, k = 1, mv = {1, 4, 0})
public final class r7b {
    public static final String d = "TapHttp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public b logHook;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LogLevel logLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String tagPrefix;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000bJA\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\r\u0010\u000bJA\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\u000bJA\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/r7b$b;", "", "", "tag", "format", "", "error", "", "obj", "", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "lib_utils_release"}, k = 1, mv = {1, 4, 0})
    public interface b {
        boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r7b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void b(r7b r7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        r7bVar.a(str, str2, th, objArr);
    }

    public static /* synthetic */ void d(r7b r7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        r7bVar.c(str, str2, th, objArr);
    }

    public static /* synthetic */ void h(r7b r7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        r7bVar.g(str, str2, th, objArr);
    }

    public static /* synthetic */ void l(r7b r7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        r7bVar.k(str, str2, th, objArr);
    }

    public static /* synthetic */ void n(r7b r7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        r7bVar.m(str, str2, th, objArr);
    }

    public final void a(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        if (this.logLevel.compareTo(LogLevel.LEVEL_DEBUG) > 0) {
            return;
        }
        b bVar = this.logHook;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.d(i(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            Log.d(i(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
        }
    }

    public final void c(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        if (this.logLevel.compareTo(LogLevel.LEVEL_ERROR) > 0) {
            return;
        }
        b bVar = this.logHook;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.e(i(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            Log.e(i(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
        }
    }

    public final String e(String format, Object... objs) {
        Throwable thF = f(Arrays.copyOf(objs, objs.length));
        if (thF != null) {
            objs = Arrays.copyOf(objs, objs.length - 1);
            Intrinsics.checkExpressionValueIsNotNull(objs, "Arrays.copyOf(obj, obj.size - 1)");
        }
        if (objs != null && objs.length != 0 && format != null) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Object[] objArrCopyOf = Arrays.copyOf(objs, objs.length);
                format = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            } catch (Throwable unused) {
                format = "";
            }
        }
        String str = format != null ? format : "";
        if (thF == null) {
            return str;
        }
        return str + "  " + Log.getStackTraceString(thF);
    }

    public final Throwable f(Object... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        Object obj = args[args.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public final void g(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        if (this.logLevel.compareTo(LogLevel.LEVEL_INFO) > 0) {
            return;
        }
        b bVar = this.logHook;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.i(i(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            Log.i(i(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
        }
    }

    public final String i(String tag) {
        if (tag == null || tag.length() == 0) {
            return this.tagPrefix;
        }
        return this.tagPrefix + '.' + tag;
    }

    public final void j(@NotNull b logHook) {
        Intrinsics.checkParameterIsNotNull(logHook, "logHook");
        this.logHook = logHook;
    }

    public final void k(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        if (this.logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        b bVar = this.logHook;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.v(i(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            Log.v(i(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
        }
    }

    public final void m(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        if (this.logLevel.compareTo(LogLevel.LEVEL_WARNING) > 0) {
            return;
        }
        b bVar = this.logHook;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.w(i(tag), format, throwable, Arrays.copyOf(obj, obj.length))) : null;
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            Log.w(i(tag), e(format, Arrays.copyOf(obj, obj.length)), throwable);
        }
    }

    public r7b(@NotNull LogLevel logLevel, @NotNull String tagPrefix) {
        Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
        Intrinsics.checkParameterIsNotNull(tagPrefix, "tagPrefix");
        this.logLevel = logLevel;
        this.tagPrefix = tagPrefix;
    }

    public /* synthetic */ r7b(LogLevel logLevel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LogLevel.LEVEL_WARNING : logLevel, (i & 2) != 0 ? d : str);
    }
}

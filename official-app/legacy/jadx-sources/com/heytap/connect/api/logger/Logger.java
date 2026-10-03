package com.heytap.connect.api.logger;

import android.util.Log;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ?\u0010 \u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b \u0010\u001eJ?\u0010!\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b!\u0010\u001eJ?\u0010\"\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\"\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/heytap/connect/api/logger/Logger;", "", "", "tag", "mixTag", "(Ljava/lang/String;)Ljava/lang/String;", "format", "", "objs", "formatLog", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "", "tr", "getStackTraceString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "args", "getThrowableToLog", "([Ljava/lang/Object;)Ljava/lang/Throwable;", "Lcom/heytap/connect/api/logger/LogLevel;", "level", "", "init", "(Lcom/heytap/connect/api/logger/LogLevel;)V", "Lcom/heytap/connect/api/logger/Logger$ILogHook;", "logHook", "setLogHook", "(Lcom/heytap/connect/api/logger/Logger$ILogHook;)V", "throwable", "obj", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/connect/api/logger/Logger$ILogHook;", "TAG_PREFIX", "Ljava/lang/String;", "logLevel", "Lcom/heytap/connect/api/logger/LogLevel;", "<init>", "()V", "ILogHook", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class Logger {

    @Nullable
    private static ILogHook logHook;

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static final String TAG_PREFIX = "NearX.Connect";

    @NotNull
    private static LogLevel logLevel = LogLevel.LEVEL_WARNING;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000bJA\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\r\u0010\u000bJA\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\u000bJA\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/heytap/connect/api/logger/Logger$ILogHook;", "", "", "tag", "format", "", "error", "", "obj", "", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "connect_release"}, k = 1, mv = {1, 5, 1})
    public interface ILogHook {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static /* synthetic */ boolean d$default(ILogHook iLogHook, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                if ((i & 8) != 0) {
                    objArr = new Object[0];
                }
                return iLogHook.d(str, str2, th, objArr);
            }

            public static /* synthetic */ boolean e$default(ILogHook iLogHook, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                if ((i & 8) != 0) {
                    objArr = new Object[0];
                }
                return iLogHook.e(str, str2, th, objArr);
            }

            public static /* synthetic */ boolean i$default(ILogHook iLogHook, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                if ((i & 8) != 0) {
                    objArr = new Object[0];
                }
                return iLogHook.i(str, str2, th, objArr);
            }

            public static /* synthetic */ boolean v$default(ILogHook iLogHook, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                if ((i & 8) != 0) {
                    objArr = new Object[0];
                }
                return iLogHook.v(str, str2, th, objArr);
            }

            public static /* synthetic */ boolean w$default(ILogHook iLogHook, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                if ((i & 8) != 0) {
                    objArr = new Object[0];
                }
                return iLogHook.w(str, str2, th, objArr);
            }
        }

        boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

        boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);
    }

    private Logger() {
    }

    public static /* synthetic */ void d$default(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.d(str, str2, th, objArr);
    }

    public static /* synthetic */ void e$default(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.e(str, str2, th, objArr);
    }

    private final String formatLog(String format, Object... objs) {
        Throwable throwableToLog = getThrowableToLog(Arrays.copyOf(objs, objs.length));
        if (throwableToLog != null) {
            objs = Arrays.copyOf(objs, objs.length - 1);
            Intrinsics.checkNotNullExpressionValue(objs, "copyOf(obj, obj.size - 1)");
        }
        if (!(objs.length == 0) && format != null) {
            try {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objs, objs.length);
                format = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            } catch (Throwable unused) {
                format = "";
            }
        }
        String str = format != null ? format : "";
        if (throwableToLog == null) {
            return str;
        }
        return ((Object) str) + "  " + getStackTraceString(throwableToLog);
    }

    private final String getStackTraceString(Throwable tr) {
        if (tr == null) {
            return "";
        }
        for (Throwable cause = tr; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        tr.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    private final Throwable getThrowableToLog(Object... args) {
        boolean z;
        if (args != null) {
            z = args.length == 0;
        }
        if (z) {
            return null;
        }
        Object obj = args[args.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static /* synthetic */ void i$default(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.i(str, str2, th, objArr);
    }

    public static /* synthetic */ void init$default(Logger logger, LogLevel logLevel2, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel2 = LogLevel.LEVEL_WARNING;
        }
        logger.init(logLevel2);
    }

    private final String mixTag(String tag) {
        if (tag == null || tag.length() == 0) {
            return TAG_PREFIX;
        }
        return TAG_PREFIX + '.' + ((Object) tag);
    }

    public static /* synthetic */ void v$default(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.v(str, str2, th, objArr);
    }

    public static /* synthetic */ void w$default(Logger logger, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            objArr = new Object[0];
        }
        logger.w(str, str2, th, objArr);
    }

    public final void d(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        ILogHook iLogHook = logHook;
        if (iLogHook != null) {
            iLogHook.d(mixTag(tag), format, throwable, Arrays.copyOf(obj, obj.length));
            return;
        }
        if (logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mixTag(tag));
        sb.append(", ");
        sb.append(formatLog(format, Arrays.copyOf(obj, obj.length)));
        sb.append(StringUtil.SPACE);
        if (throwable == null) {
            obj2 = throwable;
            obj2 = "";
        }
        obj2 = throwable;
        sb.append(obj2);
        System.out.println((Object) sb.toString());
    }

    public final void e(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        ILogHook iLogHook = logHook;
        if (iLogHook != null) {
            iLogHook.e(mixTag(tag), format, throwable, Arrays.copyOf(obj, obj.length));
            return;
        }
        if (logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mixTag(tag));
        sb.append(", ");
        sb.append(formatLog(format, Arrays.copyOf(obj, obj.length)));
        sb.append(StringUtil.SPACE);
        if (throwable == null) {
            obj2 = throwable;
            obj2 = "";
        }
        obj2 = throwable;
        sb.append(obj2);
        System.out.println((Object) sb.toString());
    }

    public final void i(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        ILogHook iLogHook = logHook;
        if (iLogHook != null) {
            iLogHook.i(mixTag(tag), format, throwable, Arrays.copyOf(obj, obj.length));
            return;
        }
        if (logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mixTag(tag));
        sb.append(", ");
        sb.append(formatLog(format, Arrays.copyOf(obj, obj.length)));
        sb.append(StringUtil.SPACE);
        if (throwable == null) {
            obj2 = throwable;
            obj2 = "";
        }
        obj2 = throwable;
        sb.append(obj2);
        System.out.println((Object) sb.toString());
    }

    public final void init(@NotNull LogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        logLevel = level;
    }

    public final void setLogHook(@NotNull ILogHook logHook2) {
        Intrinsics.checkNotNullParameter(logHook2, "logHook");
        Log.w(TAG_PREFIX, "setLogHook," + logHook2 + StringUtil.SPACE);
        logHook = logHook2;
    }

    public final void v(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        ILogHook iLogHook = logHook;
        if (iLogHook != null) {
            iLogHook.v(mixTag(tag), format, throwable, Arrays.copyOf(obj, obj.length));
            return;
        }
        if (logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mixTag(tag));
        sb.append(", ");
        sb.append(formatLog(format, Arrays.copyOf(obj, obj.length)));
        sb.append(StringUtil.SPACE);
        if (throwable == null) {
            obj2 = throwable;
            obj2 = "";
        }
        obj2 = throwable;
        sb.append(obj2);
        System.out.println((Object) sb.toString());
    }

    public final void w(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        ILogHook iLogHook = logHook;
        if (iLogHook != null) {
            iLogHook.w(mixTag(tag), format, throwable, Arrays.copyOf(obj, obj.length));
            return;
        }
        if (logLevel.compareTo(LogLevel.LEVEL_VERBOSE) > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mixTag(tag));
        sb.append(", ");
        sb.append(formatLog(format, Arrays.copyOf(obj, obj.length)));
        sb.append(StringUtil.SPACE);
        if (throwable == null) {
            obj2 = throwable;
            obj2 = "";
        }
        obj2 = throwable;
        sb.append(obj2);
        System.out.println((Object) sb.toString());
    }
}

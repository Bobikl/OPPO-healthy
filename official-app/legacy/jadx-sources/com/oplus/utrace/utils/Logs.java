package com.oplus.utrace.utils;

import android.content.Context;
import android.util.Log;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\"\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\"\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\"\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J&\u0010%\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190'H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\"\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/oplus/utrace/utils/Logs;", "", "()V", "LOG_SUFFIX_NON", "", "LOG_SUFFIX_NULL", "debuggable", "", "getDebuggable", "()Z", "setDebuggable", "(Z)V", "logger", "Lcom/oplus/utrace/utils/ILogger;", "getLogger", "()Lcom/oplus/utrace/utils/ILogger;", "setLogger", "(Lcom/oplus/utrace/utils/ILogger;)V", "reentry", "Ljava/lang/ThreadLocal;", "appendWhenDebug", "message", "initHlog", "levelFit", "d", "", "tag", "throwable", "", MapSchema.FIELD_NAME_ENTRY, "i", "init", "context", "Landroid/content/Context;", "println", "priority", "", "processLog", "block", "Lkotlin/Function1;", "w", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logs.kt\ncom/oplus/utrace/utils/Logs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
public final class Logs {

    @NotNull
    private static final String LOG_SUFFIX_NON = "_U_NON";

    @NotNull
    private static final String LOG_SUFFIX_NULL = "_U_NULL";

    @Nullable
    private static ILogger logger;

    @NotNull
    public static final Logs INSTANCE = new Logs();
    private static boolean debuggable = CommonUtils.forcedValue(0, false);

    @NotNull
    private static final ThreadLocal<Boolean> reentry = new ThreadLocal<>();

    private Logs() {
    }

    public static /* synthetic */ String appendWhenDebug$default(Logs logs, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return logs.appendWhenDebug(str, z, z2);
    }

    private final void processLog(String message, Function1<? super String, Unit> block) {
        String strTransformLogMessage;
        ThreadLocal<Boolean> threadLocal = reentry;
        Boolean bool = threadLocal.get();
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return;
        }
        threadLocal.set(bool2);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (message == null || (strTransformLogMessage = UtilsKt.transformLogMessage(message, true)) == null) {
                strTransformLogMessage = "";
            }
            block.invoke(strTransformLogMessage);
            Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        reentry.remove();
    }

    @NotNull
    public final String appendWhenDebug(@NotNull String message, boolean initHlog, boolean levelFit) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!debuggable || !levelFit) {
            return message;
        }
        if (initHlog) {
            return message + " _U_NON";
        }
        return message + " _U_NULL";
    }

    public final void d(@NotNull final String tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (debuggable) {
            processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.d.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Log.d(tag, it);
                    ILogger logger2 = Logs.INSTANCE.getLogger();
                    if (logger2 != null) {
                        logger2.d(tag, it);
                    }
                }
            });
        }
    }

    public final void e(@NotNull final String tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.e.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.e(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null));
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.e(tag, it);
                }
            }
        });
    }

    public final boolean getDebuggable() {
        return debuggable;
    }

    @Nullable
    public final ILogger getLogger() {
        return logger;
    }

    public final void i(@NotNull final String tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.i.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.i(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null));
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.i(tag, it);
                }
            }
        });
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void println(final int priority, @Nullable final String tag, @Nullable String message) {
        if (debuggable || priority >= 4) {
            processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.println.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    int i = priority;
                    String str = tag;
                    Logs logs = Logs.INSTANCE;
                    Log.println(i, str, logs.appendWhenDebug(it, logs.getLogger() != null, priority >= 4));
                    ILogger logger2 = logs.getLogger();
                    if (logger2 != null) {
                        logger2.println(priority, tag, it);
                    }
                }
            });
        }
    }

    public final void setDebuggable(boolean z) {
        debuggable = z;
    }

    public final void setLogger(@Nullable ILogger iLogger) {
        logger = iLogger;
    }

    public final void w(@NotNull final String tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.w.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.w(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null));
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.w(tag, it);
                }
            }
        });
    }

    public final void e(@NotNull final String tag, @Nullable String message, @Nullable final Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.e.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.e(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null), throwable);
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.e(tag, it, throwable);
                }
            }
        });
    }

    public final void i(@NotNull final String tag, @Nullable String message, @Nullable final Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.i.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.i(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null), throwable);
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.i(tag, it, throwable);
                }
            }
        });
    }

    public final void w(@NotNull final String tag, @Nullable String message, @Nullable final Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.w.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = tag;
                Logs logs = Logs.INSTANCE;
                Log.w(str, Logs.appendWhenDebug$default(logs, it, logs.getLogger() != null, false, 4, null), throwable);
                ILogger logger2 = logs.getLogger();
                if (logger2 != null) {
                    logger2.w(tag, it, throwable);
                }
            }
        });
    }

    public final void d(@NotNull final String tag, @Nullable String message, @Nullable final Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (debuggable) {
            processLog(message, new Function1<String, Unit>() { // from class: com.oplus.utrace.utils.Logs.d.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Log.d(tag, it, throwable);
                    ILogger logger2 = Logs.INSTANCE.getLogger();
                    if (logger2 != null) {
                        logger2.d(tag, it, throwable);
                    }
                }
            });
        }
    }
}

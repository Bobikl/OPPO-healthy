package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0003J\u0018\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0018H\u0003J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\"\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\"\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0007J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J$\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160$H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006%"}, d2 = {"Lcom/oplus/utrace/utils/SharedPreferencesUtil;", "", "()V", "context", "Landroid/content/Context;", "editor", "Landroid/content/SharedPreferences$Editor;", "instance", "Landroid/content/SharedPreferences;", "sp", "getSp", "()Landroid/content/SharedPreferences;", "getBoolean", "", Node.I_KEY, "", "getInt", "", "getLong", "", "getString", "initSp", "", "initSpSync", "Lkotlin/Pair;", "putBoolean", "value", "sync", "putInt", "putLong", "putString", "reload", "remove", "setContext", "withEditor", "block", "Lkotlin/Function1;", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class SharedPreferencesUtil {

    @NotNull
    public static final SharedPreferencesUtil INSTANCE = new SharedPreferencesUtil();

    @Nullable
    private static Context context;

    @Nullable
    private static volatile SharedPreferences.Editor editor;

    @Nullable
    private static volatile SharedPreferences instance;

    private SharedPreferencesUtil() {
    }

    @JvmStatic
    public static final boolean getBoolean(@NotNull String key) {
        SharedPreferences sp;
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (!(!StringsKt.isBlank(key)) || (sp = INSTANCE.getSp()) == null) {
            return false;
        }
        return sp.getBoolean(key, false);
    }

    @JvmStatic
    public static final int getInt(@NotNull String key) {
        SharedPreferences sp;
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (!(!StringsKt.isBlank(key)) || (sp = INSTANCE.getSp()) == null) {
            return 0;
        }
        return sp.getInt(key, 0);
    }

    @JvmStatic
    public static final long getLong(@NotNull String key) {
        SharedPreferences sp;
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (!(!StringsKt.isBlank(key)) || (sp = INSTANCE.getSp()) == null) {
            return 0L;
        }
        return sp.getLong(key, 0L);
    }

    private final SharedPreferences getSp() {
        return (SharedPreferences) initSpSync().getFirst();
    }

    @JvmStatic
    @Nullable
    public static final String getString(@NotNull String key) {
        String string;
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (!(!StringsKt.isBlank(key))) {
            return null;
        }
        SharedPreferences sp = INSTANCE.getSp();
        return (sp == null || (string = sp.getString(key, "")) == null) ? "" : string;
    }

    @JvmStatic
    private static final void initSp() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Context context2 = context;
            obj = Result.constructor-impl(context2 != null ? context2.getSharedPreferences("utrace", 4) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.d("UTrace.Sdk.SpUtil", "initSp() context=" + context + " exception=" + th2);
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        instance = (SharedPreferences) obj;
        SharedPreferences sharedPreferences = instance;
        editor = sharedPreferences != null ? sharedPreferences.edit() : null;
    }

    @JvmStatic
    private static final Pair<SharedPreferences, SharedPreferences.Editor> initSpSync() {
        if (instance == null && UtilsKt.isUserUnlocked()) {
            synchronized (INSTANCE) {
                if (instance == null) {
                    initSp();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return TuplesKt.to(instance, editor);
    }

    @JvmStatic
    public static final void putBoolean(@NotNull final String key, final boolean value, boolean sync) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (StringsKt.isBlank(key)) {
            return;
        }
        withEditor(sync, new Function1<SharedPreferences.Editor, Unit>() { // from class: com.oplus.utrace.utils.SharedPreferencesUtil.putBoolean.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SharedPreferences.Editor) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SharedPreferences.Editor editor2) {
                Intrinsics.checkNotNullParameter(editor2, "it");
                editor2.putBoolean(key, value);
            }
        });
    }

    public static /* synthetic */ void putBoolean$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        putBoolean(str, z, z2);
    }

    @JvmStatic
    @SuppressLint({"ApplySharedPref"})
    public static final void putInt(@NotNull final String key, final int value, boolean sync) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (StringsKt.isBlank(key)) {
            return;
        }
        withEditor(sync, new Function1<SharedPreferences.Editor, Unit>() { // from class: com.oplus.utrace.utils.SharedPreferencesUtil.putInt.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SharedPreferences.Editor) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SharedPreferences.Editor editor2) {
                Intrinsics.checkNotNullParameter(editor2, "it");
                editor2.putInt(key, value);
            }
        });
    }

    public static /* synthetic */ void putInt$default(String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        putInt(str, i, z);
    }

    @JvmStatic
    public static final void putLong(@NotNull final String key, final long value, boolean sync) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (StringsKt.isBlank(key)) {
            return;
        }
        withEditor(sync, new Function1<SharedPreferences.Editor, Unit>() { // from class: com.oplus.utrace.utils.SharedPreferencesUtil.putLong.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SharedPreferences.Editor) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SharedPreferences.Editor editor2) {
                Intrinsics.checkNotNullParameter(editor2, "it");
                editor2.putLong(key, value);
            }
        });
    }

    public static /* synthetic */ void putLong$default(String str, long j, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        putLong(str, j, z);
    }

    @JvmStatic
    @SuppressLint({"ApplySharedPref"})
    public static final void putString(@NotNull final String key, @NotNull final String value, boolean sync) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.isBlank(key)) {
            return;
        }
        withEditor(sync, new Function1<SharedPreferences.Editor, Unit>() { // from class: com.oplus.utrace.utils.SharedPreferencesUtil.putString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SharedPreferences.Editor) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SharedPreferences.Editor editor2) {
                Intrinsics.checkNotNullParameter(editor2, "it");
                editor2.putString(key, value);
            }
        });
    }

    public static /* synthetic */ void putString$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        putString(str, str2, z);
    }

    @JvmStatic
    public static final void reload() {
        if (UtilsKt.isUserUnlocked()) {
            synchronized (INSTANCE) {
                initSp();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @JvmStatic
    public static final void remove(@NotNull final String key, boolean sync) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        if (StringsKt.isBlank(key)) {
            return;
        }
        withEditor(sync, new Function1<SharedPreferences.Editor, Unit>() { // from class: com.oplus.utrace.utils.SharedPreferencesUtil.remove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SharedPreferences.Editor) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SharedPreferences.Editor editor2) {
                Intrinsics.checkNotNullParameter(editor2, "it");
                editor2.remove(key);
            }
        });
    }

    public static /* synthetic */ void remove$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        remove(str, z);
    }

    @JvmStatic
    public static final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        context = context2;
    }

    @JvmStatic
    private static final void withEditor(boolean sync, Function1<? super SharedPreferences.Editor, Unit> block) {
        SharedPreferences.Editor editor2 = (SharedPreferences.Editor) initSpSync().getSecond();
        if (editor2 != null) {
            block.invoke(editor2);
            if (sync) {
                editor2.commit();
            } else {
                editor2.apply();
            }
        }
    }
}

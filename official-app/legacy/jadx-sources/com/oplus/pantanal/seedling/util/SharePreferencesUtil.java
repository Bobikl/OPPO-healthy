package com.oplus.pantanal.seedling.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/oplus/pantanal/seedling/util/SharePreferencesUtil;", "", "()V", "TAG", "", "editor", "Landroid/content/SharedPreferences$Editor;", "sharePreferences", "Landroid/content/SharedPreferences;", "getAll", "", "initSP", "", "context", "Landroid/content/Context;", "putInt", "key", "value", "", EventType.STATE_PACKAGE_CHANGED_REMOVE, "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharePreferencesUtil {

    @NotNull
    public static final SharePreferencesUtil INSTANCE = new SharePreferencesUtil();

    @NotNull
    private static final String TAG = "SharePreferencesUtil";

    @Nullable
    private static SharedPreferences.Editor editor;

    @Nullable
    private static SharedPreferences sharePreferences;

    private SharePreferencesUtil() {
    }

    @JvmStatic
    @Nullable
    public static final Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = sharePreferences;
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        return null;
    }

    @JvmStatic
    public static final synchronized void initSP(@NotNull Context context) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (sharePreferences == null) {
            Logger.INSTANCE.i(TAG, "initSP");
            try {
                Result.Companion companion = Result.INSTANCE;
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("seedlingSupportSdk", 0);
                sharePreferences = sharedPreferences;
                editor = sharedPreferences != null ? sharedPreferences.edit() : null;
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e(TAG, "getPrefs error: " + thM5290exceptionOrNullimpl);
            }
        } else {
            Logger.INSTANCE.i(TAG, "initSP already init");
        }
    }

    @JvmStatic
    public static final void putInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor2 = editor;
        if (editor2 != null) {
            editor2.putInt(key, value);
        }
        SharedPreferences.Editor editor3 = editor;
        if (editor3 != null) {
            editor3.commit();
        }
    }

    @JvmStatic
    public static final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor2 = editor;
        if (editor2 != null) {
            editor2.remove(key);
        }
        SharedPreferences.Editor editor3 = editor;
        if (editor3 != null) {
            editor3.commit();
        }
    }
}

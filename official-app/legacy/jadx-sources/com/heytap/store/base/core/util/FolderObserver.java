package com.heytap.store.base.core.util;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/base/core/util/FolderObserver;", "", "()V", "changeCallback", "Lkotlin/Function0;", "", "getChangeCallback", "()Lkotlin/jvm/functions/Function0;", "setChangeCallback", "(Lkotlin/jvm/functions/Function0;)V", "isPad", "", "()Z", "setPad", "(Z)V", "observer", "com/heytap/store/base/core/util/FolderObserver$observer$1", "Lcom/heytap/store/base/core/util/FolderObserver$observer$1;", "getIsFold", "context", "Landroid/content/Context;", "initObserver", "unregisterObserver", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FolderObserver {

    @NotNull
    public static final FolderObserver INSTANCE = new FolderObserver();

    @Nullable
    private static Function0<Unit> changeCallback;
    private static boolean isPad;

    @NotNull
    private static final FolderObserver$observer$1 observer;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.heytap.store.base.core.util.FolderObserver$observer$1] */
    static {
        final Handler handler = new Handler();
        observer = new ContentObserver(handler) { // from class: com.heytap.store.base.core.util.FolderObserver$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                FolderObserver folderObserver = FolderObserver.INSTANCE;
                folderObserver.getIsFold(ContextGetterUtils.INSTANCE.getApp());
                Function0<Unit> changeCallback2 = folderObserver.getChangeCallback();
                if (changeCallback2 == null) {
                    return;
                }
                changeCallback2.invoke();
            }
        };
    }

    private FolderObserver() {
    }

    @Nullable
    public final Function0<Unit> getChangeCallback() {
        return changeCallback;
    }

    public final boolean getIsFold(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        try {
            boolean zAreEqual = Intrinsics.areEqual(Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode"), "1");
            isPad = zAreEqual;
            return zAreEqual;
        } catch (Exception unused) {
            isPad = false;
            return false;
        }
    }

    public final void initObserver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getIsFold(context);
        context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("oplus_system_folding_mode"), true, observer);
    }

    public final boolean isPad() {
        return isPad;
    }

    public final void setChangeCallback(@Nullable Function0<Unit> function0) {
        changeCallback = function0;
    }

    public final void setPad(boolean z) {
        isPad = z;
    }

    public final void unregisterObserver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getContentResolver().unregisterContentObserver(observer);
    }
}

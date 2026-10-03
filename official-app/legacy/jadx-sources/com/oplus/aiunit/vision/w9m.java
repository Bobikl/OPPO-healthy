package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.cardwidget.util.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "", "packageName", "key", "", "defaultValue", "a", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0})
public final class w9m {
    public static final boolean a(@NotNull Context context, @NotNull String packageName, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            return context.getPackageManager().getApplicationInfo(packageName, 128).metaData.getBoolean(key);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e(com.coloros.sceneservice.m.a.TAG, "getBooleanMetaValue error:" + thM5290exceptionOrNullimpl);
            }
            return z;
        }
    }
}

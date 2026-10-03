package com.oplus.nearx.track.internal.storage;

import android.content.ContentProvider;
import android.content.Context;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/BaseStorageProvider;", "Landroid/content/ContentProvider;", "()V", "onCreate", "", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseStorageProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
        if (globalConfigHelper.j()) {
            return true;
        }
        if (context.getApplicationContext() == null) {
            globalConfigHelper.r(context);
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
        globalConfigHelper.r(applicationContext);
        return true;
    }
}

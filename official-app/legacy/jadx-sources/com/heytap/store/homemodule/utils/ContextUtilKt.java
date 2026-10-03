package com.heytap.store.homemodule.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.coloros.sceneservice.i.e;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\u001a\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¨\u0006\f"}, d2 = {"getStoreContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getStoreResource", "Landroid/content/res/Resources;", "getStoreStringResource", "", e.RESOURCE_ID, "", "scanForActivity", "Landroid/app/Activity;", "cont", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ContextUtilKt {
    public static final Context getStoreContext() {
        return ContextGetterUtils.INSTANCE.getApp().getApplicationContext();
    }

    public static final Resources getStoreResource() {
        return ContextGetterUtils.INSTANCE.getApp().getApplicationContext().getResources();
    }

    @NotNull
    public static final String getStoreStringResource(int i) {
        String string = getStoreResource().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getStoreResource().getString(resourceId)");
        return string;
    }

    @Nullable
    public static final Activity scanForActivity(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}

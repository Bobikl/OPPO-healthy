package com.heytap.store.business.component.utils;

import android.content.Context;
import com.heytap.store.base.core.util.OStoreScreenAdapterUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"isPad", "", "context", "Landroid/content/Context;", "isIncludeFoldWindow", "isPadLandScape", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ScreenParamUtilKt {
    public static final boolean isPad(boolean z) {
        return isPad(ContextGetterUtils.INSTANCE.getApp());
    }

    public static /* synthetic */ boolean isPad$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return isPad(z);
    }

    public static final boolean isPadLandScape() {
        return isPad$default(false, 1, null) && (ContextGetterUtils.INSTANCE.getApp().getResources().getConfiguration().orientation == 2);
    }

    public static final boolean isPad(@Nullable Context context) {
        if (context == null) {
            context = ContextGetterUtils.INSTANCE.getApp();
        }
        if (context == null) {
            return false;
        }
        return !OStoreScreenAdapterUtil.INSTANCE.isSmallScreen(context);
    }
}

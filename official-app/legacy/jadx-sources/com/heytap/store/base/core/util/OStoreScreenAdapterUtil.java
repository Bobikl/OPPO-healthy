package com.heytap.store.base.core.util;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/util/OStoreScreenAdapterUtil;", "", "()V", "getScreenType", "", "context", "Landroid/content/Context;", "isExpandedScreen", "", "isMediumScreen", "isSmallScreen", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreScreenAdapterUtil {

    @NotNull
    public static final OStoreScreenAdapterUtil INSTANCE = new OStoreScreenAdapterUtil();

    private OStoreScreenAdapterUtil() {
    }

    public final int getScreenType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getResources().getConfiguration().screenWidthDp;
        if (i >= 840) {
            return 840;
        }
        return i >= 600 ? 600 : 300;
    }

    public final boolean isExpandedScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getScreenType(context) == 840;
    }

    public final boolean isMediumScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getScreenType(context) == 600;
    }

    public final boolean isSmallScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getScreenType(context) == 300;
    }
}

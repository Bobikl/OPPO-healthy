package com.heytap.store.business.component.utils;

import android.util.SparseArray;
import com.heytap.store.business.component.utils.video.OStoreVideoPlayOperator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\"\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"CONTENT_TYPE_H5", "", "CONTENT_TYPE_MAIN", "CONTENT_TYPE_NATIVE", "showPosition", "", "Landroid/util/SparseArray;", "Lcom/heytap/store/business/component/utils/video/OStoreVideoPlayOperator;", "title", "", "position", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStoreBannerVideoManagerKt {
    public static final int CONTENT_TYPE_H5 = 1;
    public static final int CONTENT_TYPE_MAIN = 2;
    public static final int CONTENT_TYPE_NATIVE = 0;

    public static final void showPosition(@NotNull SparseArray<OStoreVideoPlayOperator> sparseArray, @NotNull String title, int i) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
    }

    public static /* synthetic */ void showPosition$default(SparseArray sparseArray, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        showPosition(sparseArray, str, i);
    }
}

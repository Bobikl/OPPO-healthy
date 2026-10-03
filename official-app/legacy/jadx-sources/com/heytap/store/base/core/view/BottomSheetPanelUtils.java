package com.heytap.store.base.core.view;

import android.content.Context;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.platform.tools.SizeUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/base/core/view/BottomSheetPanelUtils;", "", "()V", "getHeight", "", "context", "Landroid/content/Context;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BottomSheetPanelUtils {

    @NotNull
    public static final BottomSheetPanelUtils INSTANCE = new BottomSheetPanelUtils();

    private BottomSheetPanelUtils() {
    }

    public final int getHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int screenHeight = DisplayUtil.getScreenHeight(context);
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        return screenHeight > sizeUtils.dp2px(580.0f) ? sizeUtils.dp2px(540.0f) : screenHeight - sizeUtils.dp2px(40.0f);
    }
}

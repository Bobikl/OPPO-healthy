package com.coui.component.responsiveui.layoutgrid;

import androidx.annotation.DimenRes;
import com.support.responsiveui.R$dimen;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/coui/component/responsiveui/layoutgrid/MarginType;", "", "compatId", "", "mediumId", "expandedId", "(Ljava/lang/String;IIII)V", "resId", "", "MARGIN_SMALL", "MARGIN_LARGE", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum MarginType {
    MARGIN_SMALL(R$dimen.layout_grid_margin_compat_small, R$dimen.layout_grid_margin_medium_small, R$dimen.layout_grid_margin_expanded_small),
    MARGIN_LARGE(R$dimen.layout_grid_margin_compat_large, R$dimen.layout_grid_margin_medium_large, R$dimen.layout_grid_margin_expanded_large);


    @NotNull
    private final int[] resId;

    MarginType(@DimenRes int i, int i2, int i3) {
        this.resId = new int[]{i, i2, i3};
    }

    @NotNull
    /* JADX INFO: renamed from: resId, reason: from getter */
    public final int[] getResId() {
        return this.resId;
    }
}

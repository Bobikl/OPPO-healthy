package com.heytap.store.base.core.util;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/base/core/util/Stroke;", "", "()V", "color", "", "getColor", "()I", "setColor", "(I)V", "dashGap", "", "getDashGap", "()F", "setDashGap", "(F)V", "dashWidth", "getDashWidth", "setDashWidth", Fields.WIDTH_FIELD, "getWidth", "setWidth", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Stroke {
    private float dashGap;
    private float dashWidth;
    private int width = -1;
    private int color = -1;

    public final int getColor() {
        return this.color;
    }

    public final float getDashGap() {
        return this.dashGap;
    }

    public final float getDashWidth() {
        return this.dashWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setDashGap(float f) {
        this.dashGap = f;
    }

    public final void setDashWidth(float f) {
        this.dashWidth = f;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}

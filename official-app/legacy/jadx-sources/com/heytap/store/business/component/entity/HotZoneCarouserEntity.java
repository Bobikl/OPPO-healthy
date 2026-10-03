package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/business/component/entity/HotZoneCarouserEntity;", "", "()V", "startX", "", "getStartX", "()F", "setStartX", "(F)V", "startY", "getStartY", "setStartY", "urlLists", "", "", "getUrlLists", "()Ljava/util/List;", "setUrlLists", "(Ljava/util/List;)V", "viewWidth", "", "getViewWidth", "()I", "setViewWidth", "(I)V", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HotZoneCarouserEntity {
    private float startX;
    private float startY;

    @Nullable
    private List<String> urlLists;
    private int viewWidth;

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    @Nullable
    public final List<String> getUrlLists() {
        return this.urlLists;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    public final void setStartX(float f) {
        this.startX = f;
    }

    public final void setStartY(float f) {
        this.startY = f;
    }

    public final void setUrlLists(@Nullable List<String> list) {
        this.urlLists = list;
    }

    public final void setViewWidth(int i) {
        this.viewWidth = i;
    }
}

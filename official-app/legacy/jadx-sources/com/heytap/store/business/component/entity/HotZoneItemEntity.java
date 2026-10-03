package com.heytap.store.business.component.entity;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/store/business/component/entity/HotZoneItemEntity;", "", "()V", "endX", "", "getEndX", "()F", "setEndX", "(F)V", "endY", "getEndY", "setEndY", "level", "", "getLevel", "()I", "setLevel", "(I)V", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "originalPosition", "getOriginalPosition", "setOriginalPosition", "startX", "getStartX", "setStartX", "startY", "getStartY", "setStartY", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HotZoneItemEntity {
    private float endX;
    private float endY;
    private int level;

    @Nullable
    private String link;
    private int originalPosition = -1;
    private float startX;
    private float startY;

    public final float getEndX() {
        return this.endX;
    }

    public final float getEndY() {
        return this.endY;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final void setEndX(float f) {
        this.endX = f;
    }

    public final void setEndY(float f) {
        this.endY = f;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setOriginalPosition(int i) {
        this.originalPosition = i;
    }

    public final void setStartX(float f) {
        this.startX = f;
    }

    public final void setStartY(float f) {
        this.startY = f;
    }
}

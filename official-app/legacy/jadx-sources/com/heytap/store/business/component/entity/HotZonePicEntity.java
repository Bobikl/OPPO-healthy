package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/business/component/entity/HotZonePicEntity;", "", "()V", "imgHeight", "", "getImgHeight", "()I", "setImgHeight", "(I)V", "imgWidth", "getImgWidth", "setImgWidth", "originalPosition", "getOriginalPosition", "setOriginalPosition", "startX", "", "getStartX", "()F", "setStartX", "(F)V", "startY", "getStartY", "setStartY", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HotZonePicEntity {
    private int imgHeight;
    private int imgWidth;
    private int originalPosition = -1;
    private float startX;
    private float startY;

    @Nullable
    private String url;

    public final int getImgHeight() {
        return this.imgHeight;
    }

    public final int getImgWidth() {
        return this.imgWidth;
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

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setImgHeight(int i) {
        this.imgHeight = i;
    }

    public final void setImgWidth(int i) {
        this.imgWidth = i;
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

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}

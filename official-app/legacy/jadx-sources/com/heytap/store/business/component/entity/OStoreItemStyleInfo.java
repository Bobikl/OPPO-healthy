package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\r8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\r8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\r8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001e\u0010!\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreItemStyleInfo;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundPic", "getBackgroundPic", "setBackgroundPic", "fieldMaxNum", "", "getFieldMaxNum", "()I", "setFieldMaxNum", "(I)V", "fieldNumPerLine", "getFieldNumPerLine", "setFieldNumPerLine", "fieldShowLine", "getFieldShowLine", "setFieldShowLine", "indicatorColor", "getIndicatorColor", "setIndicatorColor", "indicatorPageColor", "getIndicatorPageColor", "setIndicatorPageColor", "lanternStyle", "getLanternStyle", "setLanternStyle", "picSize", "getPicSize", "()Ljava/lang/Integer;", "setPicSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreItemStyleInfo {
    private int lanternStyle;

    @Nullable
    private Integer picSize;

    @NotNull
    private String backgroundColor = "";

    @NotNull
    private String backgroundPic = "";
    private int fieldNumPerLine = -1;
    private int fieldMaxNum = -1;
    private int fieldShowLine = -1;

    @NotNull
    private String indicatorColor = "";

    @NotNull
    private String indicatorPageColor = "";

    @NotNull
    public final String getBackgroundColor() {
        String str = this.backgroundColor;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBackgroundPic() {
        String str = this.backgroundPic;
        return str == null ? "" : str;
    }

    public final int getFieldMaxNum() {
        return this.fieldMaxNum;
    }

    public final int getFieldNumPerLine() {
        return this.fieldNumPerLine;
    }

    public final int getFieldShowLine() {
        return this.fieldShowLine;
    }

    @NotNull
    public final String getIndicatorColor() {
        String str = this.indicatorColor;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getIndicatorPageColor() {
        String str = this.indicatorPageColor;
        return str == null ? "" : str;
    }

    public final int getLanternStyle() {
        return this.lanternStyle;
    }

    @Nullable
    public final Integer getPicSize() {
        return this.picSize;
    }

    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setBackgroundPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundPic = str;
    }

    public final void setFieldMaxNum(int i) {
        this.fieldMaxNum = i;
    }

    public final void setFieldNumPerLine(int i) {
        this.fieldNumPerLine = i;
    }

    public final void setFieldShowLine(int i) {
        this.fieldShowLine = i;
    }

    public final void setIndicatorColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorColor = str;
    }

    public final void setIndicatorPageColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorPageColor = str;
    }

    public final void setLanternStyle(int i) {
        this.lanternStyle = i;
    }

    public final void setPicSize(@Nullable Integer num) {
        this.picSize = num;
    }
}

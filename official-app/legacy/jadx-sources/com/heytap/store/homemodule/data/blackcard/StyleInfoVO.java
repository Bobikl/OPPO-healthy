package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/StyleInfoVO;", "", "fieldNumPerLine", "", "fieldShowLine", "fieldNumPage", "(III)V", "getFieldNumPage", "()I", "setFieldNumPage", "(I)V", "getFieldNumPerLine", "setFieldNumPerLine", "getFieldShowLine", "setFieldShowLine", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StyleInfoVO {
    private int fieldNumPage;
    private int fieldNumPerLine;
    private int fieldShowLine;

    public StyleInfoVO() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ StyleInfoVO copy$default(StyleInfoVO styleInfoVO, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = styleInfoVO.fieldNumPerLine;
        }
        if ((i4 & 2) != 0) {
            i2 = styleInfoVO.fieldShowLine;
        }
        if ((i4 & 4) != 0) {
            i3 = styleInfoVO.fieldNumPage;
        }
        return styleInfoVO.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFieldNumPerLine() {
        return this.fieldNumPerLine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFieldShowLine() {
        return this.fieldShowLine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFieldNumPage() {
        return this.fieldNumPage;
    }

    @NotNull
    public final StyleInfoVO copy(int fieldNumPerLine, int fieldShowLine, int fieldNumPage) {
        return new StyleInfoVO(fieldNumPerLine, fieldShowLine, fieldNumPage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleInfoVO)) {
            return false;
        }
        StyleInfoVO styleInfoVO = (StyleInfoVO) other;
        return this.fieldNumPerLine == styleInfoVO.fieldNumPerLine && this.fieldShowLine == styleInfoVO.fieldShowLine && this.fieldNumPage == styleInfoVO.fieldNumPage;
    }

    public final int getFieldNumPage() {
        return this.fieldNumPage;
    }

    public final int getFieldNumPerLine() {
        return this.fieldNumPerLine;
    }

    public final int getFieldShowLine() {
        return this.fieldShowLine;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fieldNumPerLine) * 31) + Integer.hashCode(this.fieldShowLine)) * 31) + Integer.hashCode(this.fieldNumPage);
    }

    public final void setFieldNumPage(int i) {
        this.fieldNumPage = i;
    }

    public final void setFieldNumPerLine(int i) {
        this.fieldNumPerLine = i;
    }

    public final void setFieldShowLine(int i) {
        this.fieldShowLine = i;
    }

    @NotNull
    public String toString() {
        return "StyleInfoVO(fieldNumPerLine=" + this.fieldNumPerLine + ", fieldShowLine=" + this.fieldShowLine + ", fieldNumPage=" + this.fieldNumPage + ')';
    }

    public StyleInfoVO(int i, int i2, int i3) {
        this.fieldNumPerLine = i;
        this.fieldShowLine = i2;
        this.fieldNumPage = i3;
    }

    public /* synthetic */ StyleInfoVO(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}

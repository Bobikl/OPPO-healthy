package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/business/component/entity/PicCubeDetail;", "", "rowNum", "", "picJson", "", "pic", "originalPosition", "(ILjava/lang/String;Ljava/lang/String;I)V", "getOriginalPosition", "()I", "setOriginalPosition", "(I)V", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "getPicJson", "setPicJson", "getRowNum", "setRowNum", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PicCubeDetail {
    private int originalPosition;

    @Nullable
    private String pic;

    @Nullable
    private String picJson;
    private int rowNum;

    public PicCubeDetail(int i, @Nullable String str, @Nullable String str2, int i2) {
        this.rowNum = i;
        this.picJson = str;
        this.pic = str2;
        this.originalPosition = i2;
    }

    public static /* synthetic */ PicCubeDetail copy$default(PicCubeDetail picCubeDetail, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = picCubeDetail.rowNum;
        }
        if ((i3 & 2) != 0) {
            str = picCubeDetail.picJson;
        }
        if ((i3 & 4) != 0) {
            str2 = picCubeDetail.pic;
        }
        if ((i3 & 8) != 0) {
            i2 = picCubeDetail.originalPosition;
        }
        return picCubeDetail.copy(i, str, str2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRowNum() {
        return this.rowNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPicJson() {
        return this.picJson;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    @NotNull
    public final PicCubeDetail copy(int rowNum, @Nullable String picJson, @Nullable String pic, int originalPosition) {
        return new PicCubeDetail(rowNum, picJson, pic, originalPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicCubeDetail)) {
            return false;
        }
        PicCubeDetail picCubeDetail = (PicCubeDetail) other;
        return this.rowNum == picCubeDetail.rowNum && Intrinsics.areEqual(this.picJson, picCubeDetail.picJson) && Intrinsics.areEqual(this.pic, picCubeDetail.pic) && this.originalPosition == picCubeDetail.originalPosition;
    }

    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getPicJson() {
        return this.picJson;
    }

    public final int getRowNum() {
        return this.rowNum;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.rowNum) * 31;
        String str = this.picJson;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pic;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.originalPosition);
    }

    public final void setOriginalPosition(int i) {
        this.originalPosition = i;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setPicJson(@Nullable String str) {
        this.picJson = str;
    }

    public final void setRowNum(int i) {
        this.rowNum = i;
    }

    @NotNull
    public String toString() {
        return "PicCubeDetail(rowNum=" + this.rowNum + ", picJson=" + ((Object) this.picJson) + ", pic=" + ((Object) this.pic) + ", originalPosition=" + this.originalPosition + ')';
    }

    public /* synthetic */ PicCubeDetail(int i, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, i2);
    }
}

package com.heytap.store.business.component.action;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006&"}, d2 = {"Lcom/heytap/store/business/component/action/PagingNavigationActionData;", "", "type", "", "detailId", "", "innerPosition", TypedValues.Custom.S_STRING, "", CityBean.POS, "(IJILjava/lang/String;I)V", "getDetailId", "()J", "setDetailId", "(J)V", "getInnerPosition", "()I", "setInnerPosition", "(I)V", "getPos", "setPos", "getString", "()Ljava/lang/String;", "setString", "(Ljava/lang/String;)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PagingNavigationActionData {
    private long detailId;
    private int innerPosition;
    private int pos;

    @NotNull
    private String string;
    private int type;

    public PagingNavigationActionData() {
        this(0, 0L, 0, null, 0, 31, null);
    }

    public static /* synthetic */ PagingNavigationActionData copy$default(PagingNavigationActionData pagingNavigationActionData, int i, long j2, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pagingNavigationActionData.type;
        }
        if ((i4 & 2) != 0) {
            j2 = pagingNavigationActionData.detailId;
        }
        long j3 = j2;
        if ((i4 & 4) != 0) {
            i2 = pagingNavigationActionData.innerPosition;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str = pagingNavigationActionData.string;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            i3 = pagingNavigationActionData.pos;
        }
        return pagingNavigationActionData.copy(i, j3, i5, str2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDetailId() {
        return this.detailId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInnerPosition() {
        return this.innerPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getString() {
        return this.string;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPos() {
        return this.pos;
    }

    @NotNull
    public final PagingNavigationActionData copy(int type, long detailId, int innerPosition, @NotNull String string, int pos) {
        Intrinsics.checkNotNullParameter(string, "string");
        return new PagingNavigationActionData(type, detailId, innerPosition, string, pos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingNavigationActionData)) {
            return false;
        }
        PagingNavigationActionData pagingNavigationActionData = (PagingNavigationActionData) other;
        return this.type == pagingNavigationActionData.type && this.detailId == pagingNavigationActionData.detailId && this.innerPosition == pagingNavigationActionData.innerPosition && Intrinsics.areEqual(this.string, pagingNavigationActionData.string) && this.pos == pagingNavigationActionData.pos;
    }

    public final long getDetailId() {
        return this.detailId;
    }

    public final int getInnerPosition() {
        return this.innerPosition;
    }

    public final int getPos() {
        return this.pos;
    }

    @NotNull
    public final String getString() {
        return this.string;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.detailId)) * 31) + Integer.hashCode(this.innerPosition)) * 31) + this.string.hashCode()) * 31) + Integer.hashCode(this.pos);
    }

    public final void setDetailId(long j2) {
        this.detailId = j2;
    }

    public final void setInnerPosition(int i) {
        this.innerPosition = i;
    }

    public final void setPos(int i) {
        this.pos = i;
    }

    public final void setString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.string = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "PagingNavigationActionData(type=" + this.type + ", detailId=" + this.detailId + ", innerPosition=" + this.innerPosition + ", string=" + this.string + ", pos=" + this.pos + ')';
    }

    public PagingNavigationActionData(int i, long j2, int i2, @NotNull String string, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.type = i;
        this.detailId = j2;
        this.innerPosition = i2;
        this.string = string;
        this.pos = i3;
    }

    public /* synthetic */ PagingNavigationActionData(int i, long j2, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1L : j2, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? -1 : i3);
    }
}

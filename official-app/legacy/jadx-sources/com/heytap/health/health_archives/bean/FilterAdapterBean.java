package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/health_archives/bean/FilterAdapterBean;", "", "value", "", "isCheck", "", "(Ljava/lang/String;Z)V", "()Z", "setCheck", "(Z)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FilterAdapterBean {
    private boolean isCheck;

    @Nullable
    private String value;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterAdapterBean() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FilterAdapterBean copy$default(FilterAdapterBean filterAdapterBean, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterAdapterBean.value;
        }
        if ((i & 2) != 0) {
            z = filterAdapterBean.isCheck;
        }
        return filterAdapterBean.copy(str, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    @NotNull
    public final FilterAdapterBean copy(@Nullable String value, boolean isCheck) {
        return new FilterAdapterBean(value, isCheck);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterAdapterBean)) {
            return false;
        }
        FilterAdapterBean filterAdapterBean = (FilterAdapterBean) other;
        return Intrinsics.areEqual(this.value, filterAdapterBean.value) && this.isCheck == filterAdapterBean.isCheck;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isCheck;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "FilterAdapterBean(value=" + this.value + ", isCheck=" + this.isCheck + ")";
    }

    public FilterAdapterBean(@Nullable String str, boolean z) {
        this.value = str;
        this.isCheck = z;
    }

    public /* synthetic */ FilterAdapterBean(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}

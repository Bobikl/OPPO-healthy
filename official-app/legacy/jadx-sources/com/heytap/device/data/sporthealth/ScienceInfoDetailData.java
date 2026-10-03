package com.heytap.device.data.sporthealth;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/device/data/sporthealth/ScienceInfoDetailData;", "", "serialNo", "", "content", "", "modifiedTimestamp", "", "(ILjava/lang/String;J)V", "getContent", "()Ljava/lang/String;", "getModifiedTimestamp", "()J", "getSerialNo", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScienceInfoDetailData {

    @NotNull
    private final String content;
    private final long modifiedTimestamp;
    private final int serialNo;

    public ScienceInfoDetailData(int i, @NotNull String content, long j2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.serialNo = i;
        this.content = content;
        this.modifiedTimestamp = j2;
    }

    public static /* synthetic */ ScienceInfoDetailData copy$default(ScienceInfoDetailData scienceInfoDetailData, int i, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scienceInfoDetailData.serialNo;
        }
        if ((i2 & 2) != 0) {
            str = scienceInfoDetailData.content;
        }
        if ((i2 & 4) != 0) {
            j2 = scienceInfoDetailData.modifiedTimestamp;
        }
        return scienceInfoDetailData.copy(i, str, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSerialNo() {
        return this.serialNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final ScienceInfoDetailData copy(int serialNo, @NotNull String content, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ScienceInfoDetailData(serialNo, content, modifiedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScienceInfoDetailData)) {
            return false;
        }
        ScienceInfoDetailData scienceInfoDetailData = (ScienceInfoDetailData) other;
        return this.serialNo == scienceInfoDetailData.serialNo && Intrinsics.areEqual(this.content, scienceInfoDetailData.content) && this.modifiedTimestamp == scienceInfoDetailData.modifiedTimestamp;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getSerialNo() {
        return this.serialNo;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.serialNo) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    @NotNull
    public String toString() {
        return "ScienceInfoDetailData(serialNo=" + this.serialNo + ", content=" + this.content + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}

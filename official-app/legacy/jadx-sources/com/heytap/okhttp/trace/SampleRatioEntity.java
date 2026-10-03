package com.heytap.okhttp.trace;

import com.heytap.nearx.cloudconfig.anotation.FieldIndex;
import com.oplus.aiunit.vision.zma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@zma
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/okhttp/trace/SampleRatioEntity;", "", "sampleRatio", "", "updatePeriod", "uploadUrl", "", "(IILjava/lang/String;)V", "getSampleRatio", "()I", "getUpdatePeriod", "getUploadUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SampleRatioEntity {

    @FieldIndex(index = 1)
    private final int sampleRatio;

    @FieldIndex(index = 2)
    private final int updatePeriod;

    @FieldIndex(index = 3)
    @NotNull
    private final String uploadUrl;

    public SampleRatioEntity() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ SampleRatioEntity copy$default(SampleRatioEntity sampleRatioEntity, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sampleRatioEntity.sampleRatio;
        }
        if ((i3 & 2) != 0) {
            i2 = sampleRatioEntity.updatePeriod;
        }
        if ((i3 & 4) != 0) {
            str = sampleRatioEntity.uploadUrl;
        }
        return sampleRatioEntity.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSampleRatio() {
        return this.sampleRatio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUpdatePeriod() {
        return this.updatePeriod;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @NotNull
    public final SampleRatioEntity copy(int sampleRatio, int updatePeriod, @NotNull String uploadUrl) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        return new SampleRatioEntity(sampleRatio, updatePeriod, uploadUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleRatioEntity)) {
            return false;
        }
        SampleRatioEntity sampleRatioEntity = (SampleRatioEntity) other;
        return this.sampleRatio == sampleRatioEntity.sampleRatio && this.updatePeriod == sampleRatioEntity.updatePeriod && Intrinsics.areEqual(this.uploadUrl, sampleRatioEntity.uploadUrl);
    }

    public final int getSampleRatio() {
        return this.sampleRatio;
    }

    public final int getUpdatePeriod() {
        return this.updatePeriod;
    }

    @NotNull
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.sampleRatio) * 31) + Integer.hashCode(this.updatePeriod)) * 31;
        String str = this.uploadUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SampleRatioEntity(sampleRatio=" + this.sampleRatio + ", updatePeriod=" + this.updatePeriod + ", uploadUrl=" + this.uploadUrl + ")";
    }

    public SampleRatioEntity(int i, int i2, @NotNull String uploadUrl) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        this.sampleRatio = i;
        this.updatePeriod = i2;
        this.uploadUrl = uploadUrl;
    }

    public /* synthetic */ SampleRatioEntity(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}

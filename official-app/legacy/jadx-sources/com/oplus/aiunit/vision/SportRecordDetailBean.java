package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yei, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/yei;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDataJson", "()Ljava/lang/String;", "setDataJson", "(Ljava/lang/String;)V", "dataJson", "b", "I", "()I", "setMaxHeartRate", "(I)V", "maxHeartRate", "c", "setBestStepRate", "bestStepRate", "<init>", "(Ljava/lang/String;II)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportRecordDetailBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String dataJson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int maxHeartRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int bestStepRate;

    public SportRecordDetailBean(@NotNull String dataJson, int i, int i2) {
        Intrinsics.checkNotNullParameter(dataJson, "dataJson");
        this.dataJson = dataJson;
        this.maxHeartRate = i;
        this.bestStepRate = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBestStepRate() {
        return this.bestStepRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordDetailBean)) {
            return false;
        }
        SportRecordDetailBean sportRecordDetailBean = (SportRecordDetailBean) other;
        return Intrinsics.areEqual(this.dataJson, sportRecordDetailBean.dataJson) && this.maxHeartRate == sportRecordDetailBean.maxHeartRate && this.bestStepRate == sportRecordDetailBean.bestStepRate;
    }

    public int hashCode() {
        return (((this.dataJson.hashCode() * 31) + Integer.hashCode(this.maxHeartRate)) * 31) + Integer.hashCode(this.bestStepRate);
    }

    @NotNull
    public String toString() {
        return "SportRecordDetailBean(dataJson=" + this.dataJson + ", maxHeartRate=" + this.maxHeartRate + ", bestStepRate=" + this.bestStepRate + ")";
    }
}

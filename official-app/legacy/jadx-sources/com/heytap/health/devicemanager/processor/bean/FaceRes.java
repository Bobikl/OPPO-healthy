package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/FaceRes;", "", "sku", "", "res", "resType", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getRes", "()Ljava/lang/String;", "getResType", "()I", "getSku", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FaceRes {

    @NotNull
    private final String res;
    private final int resType;

    @NotNull
    private final String sku;

    public FaceRes(@NotNull String sku, @NotNull String res, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(res, "res");
        this.sku = sku;
        this.res = res;
        this.resType = i;
    }

    public static /* synthetic */ FaceRes copy$default(FaceRes faceRes, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = faceRes.sku;
        }
        if ((i2 & 2) != 0) {
            str2 = faceRes.res;
        }
        if ((i2 & 4) != 0) {
            i = faceRes.resType;
        }
        return faceRes.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRes() {
        return this.res;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResType() {
        return this.resType;
    }

    @NotNull
    public final FaceRes copy(@NotNull String sku, @NotNull String res, int resType) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(res, "res");
        return new FaceRes(sku, res, resType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceRes)) {
            return false;
        }
        FaceRes faceRes = (FaceRes) other;
        return Intrinsics.areEqual(this.sku, faceRes.sku) && Intrinsics.areEqual(this.res, faceRes.res) && this.resType == faceRes.resType;
    }

    @NotNull
    public final String getRes() {
        return this.res;
    }

    public final int getResType() {
        return this.resType;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return (((this.sku.hashCode() * 31) + this.res.hashCode()) * 31) + Integer.hashCode(this.resType);
    }

    @NotNull
    public String toString() {
        return "FaceRes(sku=" + this.sku + ", res=" + this.res + ", resType=" + this.resType + ")";
    }
}

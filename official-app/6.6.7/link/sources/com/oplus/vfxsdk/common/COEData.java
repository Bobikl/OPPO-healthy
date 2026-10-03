package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015JR\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u00060"}, d2 = {"Lcom/oplus/vfxsdk/common/COEData;", "", "name", "", "v", "", "mV", "cT", "", "cV", "layers", "", "Lcom/oplus/vfxsdk/common/Layer;", "(Ljava/lang/String;IIJJ[Lcom/oplus/vfxsdk/common/Layer;)V", "getCT", "()J", "setCT", "(J)V", "getCV", "setCV", "getLayers", "()[Lcom/oplus/vfxsdk/common/Layer;", "setLayers", "([Lcom/oplus/vfxsdk/common/Layer;)V", "[Lcom/oplus/vfxsdk/common/Layer;", "getMV", "()I", "setMV", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getV", "setV", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IIJJ[Lcom/oplus/vfxsdk/common/Layer;)Lcom/oplus/vfxsdk/common/COEData;", "equals", "", "other", "hashCode", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class COEData {
    private long cT;
    private long cV;

    @Nullable
    private Layer[] layers;
    private int mV;

    @NotNull
    private String name;
    private int v;

    public COEData(@NotNull String str, int i, int i2, long j, long j2, @Nullable Layer[] layerArr) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
        this.v = i;
        this.mV = i2;
        this.cT = j;
        this.cV = j2;
        this.layers = layerArr;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMV() {
        return this.mV;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCT() {
        return this.cT;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCV() {
        return this.cV;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Layer[] getLayers() {
        return this.layers;
    }

    @NotNull
    public final COEData copy(@NotNull String name, int v, int mV, long cT, long cV, @Nullable Layer[] layers) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new COEData(name, v, mV, cT, cV, layers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof COEData)) {
            return false;
        }
        COEData cOEData = (COEData) other;
        return Intrinsics.areEqual(this.name, cOEData.name) && this.v == cOEData.v && this.mV == cOEData.mV && this.cT == cOEData.cT && this.cV == cOEData.cV && Intrinsics.areEqual(this.layers, cOEData.layers);
    }

    public final long getCT() {
        return this.cT;
    }

    public final long getCV() {
        return this.cV;
    }

    @Nullable
    public final Layer[] getLayers() {
        return this.layers;
    }

    public final int getMV() {
        return this.mV;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getV() {
        return this.v;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.name.hashCode() * 31) + Integer.hashCode(this.v)) * 31) + Integer.hashCode(this.mV)) * 31) + Long.hashCode(this.cT)) * 31) + Long.hashCode(this.cV)) * 31;
        Layer[] layerArr = this.layers;
        return iHashCode + (layerArr == null ? 0 : Arrays.hashCode(layerArr));
    }

    public final void setCT(long j) {
        this.cT = j;
    }

    public final void setCV(long j) {
        this.cV = j;
    }

    public final void setLayers(@Nullable Layer[] layerArr) {
        this.layers = layerArr;
    }

    public final void setMV(int i) {
        this.mV = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setV(int i) {
        this.v = i;
    }

    @NotNull
    public String toString() {
        return "COEData(name=" + this.name + ", v=" + this.v + ", mV=" + this.mV + ", cT=" + this.cT + ", cV=" + this.cV + ", layers=" + Arrays.toString(this.layers) + ")";
    }

    public /* synthetic */ COEData(String str, int i, int i2, long j, long j2, Layer[] layerArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? 1L : j2, layerArr);
    }
}

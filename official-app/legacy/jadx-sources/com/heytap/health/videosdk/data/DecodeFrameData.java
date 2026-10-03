package com.heytap.health.videosdk.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006&"}, d2 = {"Lcom/heytap/health/videosdk/data/DecodeFrameData;", "", "decodeResult", "", "decodeCostTime", "", "sendPacketCount", "", "frameFormat", "pictType", "(Ljava/lang/String;DILjava/lang/String;I)V", "getDecodeCostTime", "()D", "setDecodeCostTime", "(D)V", "getDecodeResult", "()Ljava/lang/String;", "setDecodeResult", "(Ljava/lang/String;)V", "getFrameFormat", "setFrameFormat", "getPictType", "()I", "setPictType", "(I)V", "getSendPacketCount", "setSendPacketCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DecodeFrameData {
    private double decodeCostTime;

    @NotNull
    private String decodeResult;

    @NotNull
    private String frameFormat;
    private int pictType;
    private int sendPacketCount;

    public DecodeFrameData() {
        this(null, 0.0d, 0, null, 0, 31, null);
    }

    public static /* synthetic */ DecodeFrameData copy$default(DecodeFrameData decodeFrameData, String str, double d, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = decodeFrameData.decodeResult;
        }
        if ((i3 & 2) != 0) {
            d = decodeFrameData.decodeCostTime;
        }
        double d2 = d;
        if ((i3 & 4) != 0) {
            i = decodeFrameData.sendPacketCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = decodeFrameData.frameFormat;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            i2 = decodeFrameData.pictType;
        }
        return decodeFrameData.copy(str, d2, i4, str3, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDecodeResult() {
        return this.decodeResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getDecodeCostTime() {
        return this.decodeCostTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSendPacketCount() {
        return this.sendPacketCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFrameFormat() {
        return this.frameFormat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPictType() {
        return this.pictType;
    }

    @NotNull
    public final DecodeFrameData copy(@NotNull String decodeResult, double decodeCostTime, int sendPacketCount, @NotNull String frameFormat, int pictType) {
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        Intrinsics.checkNotNullParameter(frameFormat, "frameFormat");
        return new DecodeFrameData(decodeResult, decodeCostTime, sendPacketCount, frameFormat, pictType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodeFrameData)) {
            return false;
        }
        DecodeFrameData decodeFrameData = (DecodeFrameData) other;
        return Intrinsics.areEqual(this.decodeResult, decodeFrameData.decodeResult) && Intrinsics.areEqual((Object) Double.valueOf(this.decodeCostTime), (Object) Double.valueOf(decodeFrameData.decodeCostTime)) && this.sendPacketCount == decodeFrameData.sendPacketCount && Intrinsics.areEqual(this.frameFormat, decodeFrameData.frameFormat) && this.pictType == decodeFrameData.pictType;
    }

    public final double getDecodeCostTime() {
        return this.decodeCostTime;
    }

    @NotNull
    public final String getDecodeResult() {
        return this.decodeResult;
    }

    @NotNull
    public final String getFrameFormat() {
        return this.frameFormat;
    }

    public final int getPictType() {
        return this.pictType;
    }

    public final int getSendPacketCount() {
        return this.sendPacketCount;
    }

    public int hashCode() {
        return (((((((this.decodeResult.hashCode() * 31) + Double.hashCode(this.decodeCostTime)) * 31) + Integer.hashCode(this.sendPacketCount)) * 31) + this.frameFormat.hashCode()) * 31) + Integer.hashCode(this.pictType);
    }

    public final void setDecodeCostTime(double d) {
        this.decodeCostTime = d;
    }

    public final void setDecodeResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.decodeResult = str;
    }

    public final void setFrameFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.frameFormat = str;
    }

    public final void setPictType(int i) {
        this.pictType = i;
    }

    public final void setSendPacketCount(int i) {
        this.sendPacketCount = i;
    }

    @NotNull
    public String toString() {
        return "DecodeFrameData(decodeResult=" + this.decodeResult + ", decodeCostTime=" + this.decodeCostTime + ", sendPacketCount=" + this.sendPacketCount + ", frameFormat=" + this.frameFormat + ", pictType=" + this.pictType + ')';
    }

    public DecodeFrameData(@NotNull String decodeResult, double d, int i, @NotNull String frameFormat, int i2) {
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        Intrinsics.checkNotNullParameter(frameFormat, "frameFormat");
        this.decodeResult = decodeResult;
        this.decodeCostTime = d;
        this.sendPacketCount = i;
        this.frameFormat = frameFormat;
        this.pictType = i2;
    }

    public /* synthetic */ DecodeFrameData(String str, double d, int i, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0.0d : d, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0 : i2);
    }
}

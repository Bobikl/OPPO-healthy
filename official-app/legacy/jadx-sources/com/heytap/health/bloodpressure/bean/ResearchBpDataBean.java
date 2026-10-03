package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ResearchBpDataBean;", "", "arrhythmiaFlg", "", "bmFlg", "cwsFlg", "deviceCode", "", "deviceSn", "diastolic", "measureTime", "", "measureUser", "pulse", "systolic", "(IIILjava/lang/String;Ljava/lang/String;IJLjava/lang/String;II)V", "getArrhythmiaFlg", "()I", "getBmFlg", "getCwsFlg", "getDeviceCode", "()Ljava/lang/String;", "getDeviceSn", "getDiastolic", "getMeasureTime", "()J", "getMeasureUser", "getPulse", "getSystolic", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchBpDataBean {
    public static final int $stable = 0;
    private final int arrhythmiaFlg;
    private final int bmFlg;
    private final int cwsFlg;

    @NotNull
    private final String deviceCode;

    @NotNull
    private final String deviceSn;
    private final int diastolic;
    private final long measureTime;

    @NotNull
    private final String measureUser;
    private final int pulse;
    private final int systolic;

    public ResearchBpDataBean(int i, int i2, int i3, @NotNull String deviceCode, @NotNull String deviceSn, int i4, long j2, @NotNull String measureUser, int i5, int i6) {
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(measureUser, "measureUser");
        this.arrhythmiaFlg = i;
        this.bmFlg = i2;
        this.cwsFlg = i3;
        this.deviceCode = deviceCode;
        this.deviceSn = deviceSn;
        this.diastolic = i4;
        this.measureTime = j2;
        this.measureUser = measureUser;
        this.pulse = i5;
        this.systolic = i6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getArrhythmiaFlg() {
        return this.arrhythmiaFlg;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSystolic() {
        return this.systolic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBmFlg() {
        return this.bmFlg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCwsFlg() {
        return this.cwsFlg;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMeasureUser() {
        return this.measureUser;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPulse() {
        return this.pulse;
    }

    @NotNull
    public final ResearchBpDataBean copy(int arrhythmiaFlg, int bmFlg, int cwsFlg, @NotNull String deviceCode, @NotNull String deviceSn, int diastolic, long measureTime, @NotNull String measureUser, int pulse, int systolic) {
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(measureUser, "measureUser");
        return new ResearchBpDataBean(arrhythmiaFlg, bmFlg, cwsFlg, deviceCode, deviceSn, diastolic, measureTime, measureUser, pulse, systolic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchBpDataBean)) {
            return false;
        }
        ResearchBpDataBean researchBpDataBean = (ResearchBpDataBean) other;
        return this.arrhythmiaFlg == researchBpDataBean.arrhythmiaFlg && this.bmFlg == researchBpDataBean.bmFlg && this.cwsFlg == researchBpDataBean.cwsFlg && Intrinsics.areEqual(this.deviceCode, researchBpDataBean.deviceCode) && Intrinsics.areEqual(this.deviceSn, researchBpDataBean.deviceSn) && this.diastolic == researchBpDataBean.diastolic && this.measureTime == researchBpDataBean.measureTime && Intrinsics.areEqual(this.measureUser, researchBpDataBean.measureUser) && this.pulse == researchBpDataBean.pulse && this.systolic == researchBpDataBean.systolic;
    }

    public final int getArrhythmiaFlg() {
        return this.arrhythmiaFlg;
    }

    public final int getBmFlg() {
        return this.bmFlg;
    }

    public final int getCwsFlg() {
        return this.cwsFlg;
    }

    @NotNull
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDiastolic() {
        return this.diastolic;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    public final String getMeasureUser() {
        return this.measureUser;
    }

    public final int getPulse() {
        return this.pulse;
    }

    public final int getSystolic() {
        return this.systolic;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.arrhythmiaFlg) * 31) + Integer.hashCode(this.bmFlg)) * 31) + Integer.hashCode(this.cwsFlg)) * 31) + this.deviceCode.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + Integer.hashCode(this.diastolic)) * 31) + Long.hashCode(this.measureTime)) * 31) + this.measureUser.hashCode()) * 31) + Integer.hashCode(this.pulse)) * 31) + Integer.hashCode(this.systolic);
    }

    @NotNull
    public String toString() {
        return "ResearchBpDataBean(arrhythmiaFlg=" + this.arrhythmiaFlg + ", bmFlg=" + this.bmFlg + ", cwsFlg=" + this.cwsFlg + ", deviceCode=" + this.deviceCode + ", deviceSn=" + this.deviceSn + ", diastolic=" + this.diastolic + ", measureTime=" + this.measureTime + ", measureUser=" + this.measureUser + ", pulse=" + this.pulse + ", systolic=" + this.systolic + ")";
    }
}

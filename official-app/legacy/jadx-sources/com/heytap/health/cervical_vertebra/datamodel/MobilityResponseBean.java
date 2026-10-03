package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/MobilityResponseBean;", "", "resultCode", "", "detectType", "angle", "", "(IIF)V", "getAngle", "()F", "getDetectType", "()I", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MobilityResponseBean {
    private final float angle;
    private final int detectType;
    private final int resultCode;

    public MobilityResponseBean(int i, int i2, float f) {
        this.resultCode = i;
        this.detectType = i2;
        this.angle = f;
    }

    public static /* synthetic */ MobilityResponseBean copy$default(MobilityResponseBean mobilityResponseBean, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mobilityResponseBean.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = mobilityResponseBean.detectType;
        }
        if ((i3 & 4) != 0) {
            f = mobilityResponseBean.angle;
        }
        return mobilityResponseBean.copy(i, i2, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDetectType() {
        return this.detectType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAngle() {
        return this.angle;
    }

    @NotNull
    public final MobilityResponseBean copy(int resultCode, int detectType, float angle) {
        return new MobilityResponseBean(resultCode, detectType, angle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobilityResponseBean)) {
            return false;
        }
        MobilityResponseBean mobilityResponseBean = (MobilityResponseBean) other;
        return this.resultCode == mobilityResponseBean.resultCode && this.detectType == mobilityResponseBean.detectType && Float.compare(this.angle, mobilityResponseBean.angle) == 0;
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getDetectType() {
        return this.detectType;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.detectType)) * 31) + Float.hashCode(this.angle);
    }

    @NotNull
    public String toString() {
        return "MobilityResponseBean(resultCode=" + this.resultCode + ", detectType=" + this.detectType + ", angle=" + this.angle + ")";
    }
}

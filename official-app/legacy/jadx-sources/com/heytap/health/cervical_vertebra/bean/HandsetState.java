package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/HandsetState;", "", "resultCode", "", "support", "isWearing", "", "isCalibration", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setCalibration", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getResultCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSupport", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/heytap/health/cervical_vertebra/bean/HandsetState;", "equals", "other", "hashCode", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HandsetState {

    @Nullable
    private Boolean isCalibration;

    @Nullable
    private final Boolean isWearing;

    @Nullable
    private final Integer resultCode;

    @Nullable
    private final Integer support;

    public HandsetState(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.resultCode = num;
        this.support = num2;
        this.isWearing = bool;
        this.isCalibration = bool2;
    }

    public static /* synthetic */ HandsetState copy$default(HandsetState handsetState, Integer num, Integer num2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = handsetState.resultCode;
        }
        if ((i & 2) != 0) {
            num2 = handsetState.support;
        }
        if ((i & 4) != 0) {
            bool = handsetState.isWearing;
        }
        if ((i & 8) != 0) {
            bool2 = handsetState.isCalibration;
        }
        return handsetState.copy(num, num2, bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSupport() {
        return this.support;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsWearing() {
        return this.isWearing;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsCalibration() {
        return this.isCalibration;
    }

    @NotNull
    public final HandsetState copy(@Nullable Integer resultCode, @Nullable Integer support, @Nullable Boolean isWearing, @Nullable Boolean isCalibration) {
        return new HandsetState(resultCode, support, isWearing, isCalibration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandsetState)) {
            return false;
        }
        HandsetState handsetState = (HandsetState) other;
        return Intrinsics.areEqual(this.resultCode, handsetState.resultCode) && Intrinsics.areEqual(this.support, handsetState.support) && Intrinsics.areEqual(this.isWearing, handsetState.isWearing) && Intrinsics.areEqual(this.isCalibration, handsetState.isCalibration);
    }

    @Nullable
    public final Integer getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final Integer getSupport() {
        return this.support;
    }

    public int hashCode() {
        Integer num = this.resultCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.support;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isWearing;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCalibration;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCalibration() {
        return this.isCalibration;
    }

    @Nullable
    public final Boolean isWearing() {
        return this.isWearing;
    }

    public final void setCalibration(@Nullable Boolean bool) {
        this.isCalibration = bool;
    }

    @NotNull
    public String toString() {
        return "HandsetState(resultCode=" + this.resultCode + ", support=" + this.support + ", isWearing=" + this.isWearing + ", isCalibration=" + this.isCalibration + ")";
    }
}

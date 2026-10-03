package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.sbe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/heytap/health/devicemanager/processor/cloudaccess/response/BenefitDataBOS;", "", "benefitNo", "", "benefitStatus", "", "effectiveTime", "", "expiredTime", "productCode", sbe.PAY_SDK_PRODUCTNAME, "productType", "(Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBenefitNo", "()Ljava/lang/String;", "getBenefitStatus", "()I", "getEffectiveTime", "()J", "getExpiredTime", "getProductCode", "getProductName", "getProductType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BenefitDataBOS {

    @NotNull
    private final String benefitNo;
    private final int benefitStatus;
    private final long effectiveTime;
    private final long expiredTime;

    @NotNull
    private final String productCode;

    @NotNull
    private final String productName;

    @NotNull
    private final String productType;

    public BenefitDataBOS(@NotNull String benefitNo, int i, long j2, long j3, @NotNull String productCode, @NotNull String productName, @NotNull String productType) {
        Intrinsics.checkNotNullParameter(benefitNo, "benefitNo");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.benefitNo = benefitNo;
        this.benefitStatus = i;
        this.effectiveTime = j2;
        this.expiredTime = j3;
        this.productCode = productCode;
        this.productName = productName;
        this.productType = productType;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBenefitNo() {
        return this.benefitNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBenefitStatus() {
        return this.benefitStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEffectiveTime() {
        return this.effectiveTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpiredTime() {
        return this.expiredTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final BenefitDataBOS copy(@NotNull String benefitNo, int benefitStatus, long effectiveTime, long expiredTime, @NotNull String productCode, @NotNull String productName, @NotNull String productType) {
        Intrinsics.checkNotNullParameter(benefitNo, "benefitNo");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productType, "productType");
        return new BenefitDataBOS(benefitNo, benefitStatus, effectiveTime, expiredTime, productCode, productName, productType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenefitDataBOS)) {
            return false;
        }
        BenefitDataBOS benefitDataBOS = (BenefitDataBOS) other;
        return Intrinsics.areEqual(this.benefitNo, benefitDataBOS.benefitNo) && this.benefitStatus == benefitDataBOS.benefitStatus && this.effectiveTime == benefitDataBOS.effectiveTime && this.expiredTime == benefitDataBOS.expiredTime && Intrinsics.areEqual(this.productCode, benefitDataBOS.productCode) && Intrinsics.areEqual(this.productName, benefitDataBOS.productName) && Intrinsics.areEqual(this.productType, benefitDataBOS.productType);
    }

    @NotNull
    public final String getBenefitNo() {
        return this.benefitNo;
    }

    public final int getBenefitStatus() {
        return this.benefitStatus;
    }

    public final long getEffectiveTime() {
        return this.effectiveTime;
    }

    public final long getExpiredTime() {
        return this.expiredTime;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return (((((((((((this.benefitNo.hashCode() * 31) + Integer.hashCode(this.benefitStatus)) * 31) + Long.hashCode(this.effectiveTime)) * 31) + Long.hashCode(this.expiredTime)) * 31) + this.productCode.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productType.hashCode();
    }

    @NotNull
    public String toString() {
        return "BenefitDataBOS(benefitNo=" + this.benefitNo + ", benefitStatus=" + this.benefitStatus + ", effectiveTime=" + this.effectiveTime + ", expiredTime=" + this.expiredTime + ", productCode=" + this.productCode + ", productName=" + this.productName + ", productType=" + this.productType + ")";
    }
}

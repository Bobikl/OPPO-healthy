package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCareRspBean;", "", "benefitDataBOS", "", "Lcom/heytap/health/devicemanager/processor/cloudaccess/response/BenefitDataBOS;", "link", "", "regTime", "", "serverTime", "(Ljava/util/List;Ljava/lang/String;JJ)V", "getBenefitDataBOS", "()Ljava/util/List;", "getLink", "()Ljava/lang/String;", "getRegTime", "()J", "getServerTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceCareRspBean {

    @Nullable
    private final List<BenefitDataBOS> benefitDataBOS;

    @NotNull
    private final String link;
    private final long regTime;
    private final long serverTime;

    public DeviceCareRspBean(@Nullable List<BenefitDataBOS> list, @NotNull String link, long j2, long j3) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.benefitDataBOS = list;
        this.link = link;
        this.regTime = j2;
        this.serverTime = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceCareRspBean copy$default(DeviceCareRspBean deviceCareRspBean, List list, String str, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceCareRspBean.benefitDataBOS;
        }
        if ((i & 2) != 0) {
            str = deviceCareRspBean.link;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = deviceCareRspBean.regTime;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = deviceCareRspBean.serverTime;
        }
        return deviceCareRspBean.copy(list, str2, j4, j3);
    }

    @Nullable
    public final List<BenefitDataBOS> component1() {
        return this.benefitDataBOS;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRegTime() {
        return this.regTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final DeviceCareRspBean copy(@Nullable List<BenefitDataBOS> benefitDataBOS, @NotNull String link, long regTime, long serverTime) {
        Intrinsics.checkNotNullParameter(link, "link");
        return new DeviceCareRspBean(benefitDataBOS, link, regTime, serverTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCareRspBean)) {
            return false;
        }
        DeviceCareRspBean deviceCareRspBean = (DeviceCareRspBean) other;
        return Intrinsics.areEqual(this.benefitDataBOS, deviceCareRspBean.benefitDataBOS) && Intrinsics.areEqual(this.link, deviceCareRspBean.link) && this.regTime == deviceCareRspBean.regTime && this.serverTime == deviceCareRspBean.serverTime;
    }

    @Nullable
    public final List<BenefitDataBOS> getBenefitDataBOS() {
        return this.benefitDataBOS;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final long getRegTime() {
        return this.regTime;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        List<BenefitDataBOS> list = this.benefitDataBOS;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.link.hashCode()) * 31) + Long.hashCode(this.regTime)) * 31) + Long.hashCode(this.serverTime);
    }

    @NotNull
    public String toString() {
        return "DeviceCareRspBean(benefitDataBOS=" + this.benefitDataBOS + ", link=" + this.link + ", regTime=" + this.regTime + ", serverTime=" + this.serverTime + ")";
    }
}

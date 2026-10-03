package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014Jj\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001c¨\u00064"}, d2 = {"Lcom/heytap/health/esim/bean/TrustSupportBean;", "", "phoneSupported", "", "watchSupported", "mspMinVersionCode", "", "imei", "", "eid", "credible", "switch84ConfigBean", "Lcom/heytap/health/esim/bean/Switch84ConfigBean;", "mspVerSupported", "hdhVerSupported", "(ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/bean/Switch84ConfigBean;ZLjava/lang/Boolean;)V", "getCredible", "()Ljava/lang/String;", "getEid", "getHdhVerSupported", "()Ljava/lang/Boolean;", "setHdhVerSupported", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getImei", "getMspMinVersionCode", "()I", "getMspVerSupported", "()Z", "setMspVerSupported", "(Z)V", "getPhoneSupported", "getSwitch84ConfigBean", "()Lcom/heytap/health/esim/bean/Switch84ConfigBean;", "setSwitch84ConfigBean", "(Lcom/heytap/health/esim/bean/Switch84ConfigBean;)V", "getWatchSupported", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/bean/Switch84ConfigBean;ZLjava/lang/Boolean;)Lcom/heytap/health/esim/bean/TrustSupportBean;", "equals", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrustSupportBean {
    public static final int $stable = 8;

    @NotNull
    private final String credible;

    @NotNull
    private final String eid;

    @Nullable
    private Boolean hdhVerSupported;

    @NotNull
    private final String imei;
    private final int mspMinVersionCode;
    private boolean mspVerSupported;
    private final boolean phoneSupported;

    @NotNull
    private Switch84ConfigBean switch84ConfigBean;
    private final boolean watchSupported;

    public TrustSupportBean(boolean z, boolean z2, int i, @NotNull String imei, @NotNull String eid, @NotNull String credible, @NotNull Switch84ConfigBean switch84ConfigBean, boolean z3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(credible, "credible");
        Intrinsics.checkNotNullParameter(switch84ConfigBean, "switch84ConfigBean");
        this.phoneSupported = z;
        this.watchSupported = z2;
        this.mspMinVersionCode = i;
        this.imei = imei;
        this.eid = eid;
        this.credible = credible;
        this.switch84ConfigBean = switch84ConfigBean;
        this.mspVerSupported = z3;
        this.hdhVerSupported = bool;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPhoneSupported() {
        return this.phoneSupported;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getWatchSupported() {
        return this.watchSupported;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMspMinVersionCode() {
        return this.mspMinVersionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEid() {
        return this.eid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCredible() {
        return this.credible;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Switch84ConfigBean getSwitch84ConfigBean() {
        return this.switch84ConfigBean;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getMspVerSupported() {
        return this.mspVerSupported;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHdhVerSupported() {
        return this.hdhVerSupported;
    }

    @NotNull
    public final TrustSupportBean copy(boolean phoneSupported, boolean watchSupported, int mspMinVersionCode, @NotNull String imei, @NotNull String eid, @NotNull String credible, @NotNull Switch84ConfigBean switch84ConfigBean, boolean mspVerSupported, @Nullable Boolean hdhVerSupported) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(credible, "credible");
        Intrinsics.checkNotNullParameter(switch84ConfigBean, "switch84ConfigBean");
        return new TrustSupportBean(phoneSupported, watchSupported, mspMinVersionCode, imei, eid, credible, switch84ConfigBean, mspVerSupported, hdhVerSupported);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustSupportBean)) {
            return false;
        }
        TrustSupportBean trustSupportBean = (TrustSupportBean) other;
        return this.phoneSupported == trustSupportBean.phoneSupported && this.watchSupported == trustSupportBean.watchSupported && this.mspMinVersionCode == trustSupportBean.mspMinVersionCode && Intrinsics.areEqual(this.imei, trustSupportBean.imei) && Intrinsics.areEqual(this.eid, trustSupportBean.eid) && Intrinsics.areEqual(this.credible, trustSupportBean.credible) && Intrinsics.areEqual(this.switch84ConfigBean, trustSupportBean.switch84ConfigBean) && this.mspVerSupported == trustSupportBean.mspVerSupported && Intrinsics.areEqual(this.hdhVerSupported, trustSupportBean.hdhVerSupported);
    }

    @NotNull
    public final String getCredible() {
        return this.credible;
    }

    @NotNull
    public final String getEid() {
        return this.eid;
    }

    @Nullable
    public final Boolean getHdhVerSupported() {
        return this.hdhVerSupported;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    public final int getMspMinVersionCode() {
        return this.mspMinVersionCode;
    }

    public final boolean getMspVerSupported() {
        return this.mspVerSupported;
    }

    public final boolean getPhoneSupported() {
        return this.phoneSupported;
    }

    @NotNull
    public final Switch84ConfigBean getSwitch84ConfigBean() {
        return this.switch84ConfigBean;
    }

    public final boolean getWatchSupported() {
        return this.watchSupported;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    public int hashCode() {
        boolean z = this.phoneSupported;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.watchSupported;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode = (((((((((((i + r2) * 31) + Integer.hashCode(this.mspMinVersionCode)) * 31) + this.imei.hashCode()) * 31) + this.eid.hashCode()) * 31) + this.credible.hashCode()) * 31) + this.switch84ConfigBean.hashCode()) * 31;
        boolean z3 = this.mspVerSupported;
        int i2 = (iHashCode + (z3 ? 1 : z3)) * 31;
        Boolean bool = this.hdhVerSupported;
        return i2 + (bool == null ? 0 : bool.hashCode());
    }

    public final void setHdhVerSupported(@Nullable Boolean bool) {
        this.hdhVerSupported = bool;
    }

    public final void setMspVerSupported(boolean z) {
        this.mspVerSupported = z;
    }

    public final void setSwitch84ConfigBean(@NotNull Switch84ConfigBean switch84ConfigBean) {
        Intrinsics.checkNotNullParameter(switch84ConfigBean, "<set-?>");
        this.switch84ConfigBean = switch84ConfigBean;
    }

    @NotNull
    public String toString() {
        return "TrustSupportBean(phoneSupported=" + this.phoneSupported + ", watchSupported=" + this.watchSupported + ", mspMinVersionCode=" + this.mspMinVersionCode + ", imei=" + this.imei + ", eid=" + this.eid + ", credible=" + this.credible + ", switch84ConfigBean=" + this.switch84ConfigBean + ", mspVerSupported=" + this.mspVerSupported + ", hdhVerSupported=" + this.hdhVerSupported + ")";
    }
}

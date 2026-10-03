package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/esim/nec/bean/BindingResult;", "", "eid", "", "iccid", "alternateSmdpFqdn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlternateSmdpFqdn", "()Ljava/lang/String;", "getEid", "getIccid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BindingResult {
    public static final int $stable = 0;

    @NotNull
    private final String alternateSmdpFqdn;

    @NotNull
    private final String eid;

    @NotNull
    private final String iccid;

    public BindingResult(@NotNull String eid, @NotNull String iccid, @NotNull String alternateSmdpFqdn) {
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(iccid, "iccid");
        Intrinsics.checkNotNullParameter(alternateSmdpFqdn, "alternateSmdpFqdn");
        this.eid = eid;
        this.iccid = iccid;
        this.alternateSmdpFqdn = alternateSmdpFqdn;
    }

    public static /* synthetic */ BindingResult copy$default(BindingResult bindingResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindingResult.eid;
        }
        if ((i & 2) != 0) {
            str2 = bindingResult.iccid;
        }
        if ((i & 4) != 0) {
            str3 = bindingResult.alternateSmdpFqdn;
        }
        return bindingResult.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEid() {
        return this.eid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIccid() {
        return this.iccid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlternateSmdpFqdn() {
        return this.alternateSmdpFqdn;
    }

    @NotNull
    public final BindingResult copy(@NotNull String eid, @NotNull String iccid, @NotNull String alternateSmdpFqdn) {
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(iccid, "iccid");
        Intrinsics.checkNotNullParameter(alternateSmdpFqdn, "alternateSmdpFqdn");
        return new BindingResult(eid, iccid, alternateSmdpFqdn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingResult)) {
            return false;
        }
        BindingResult bindingResult = (BindingResult) other;
        return Intrinsics.areEqual(this.eid, bindingResult.eid) && Intrinsics.areEqual(this.iccid, bindingResult.iccid) && Intrinsics.areEqual(this.alternateSmdpFqdn, bindingResult.alternateSmdpFqdn);
    }

    @NotNull
    public final String getAlternateSmdpFqdn() {
        return this.alternateSmdpFqdn;
    }

    @NotNull
    public final String getEid() {
        return this.eid;
    }

    @NotNull
    public final String getIccid() {
        return this.iccid;
    }

    public int hashCode() {
        return (((this.eid.hashCode() * 31) + this.iccid.hashCode()) * 31) + this.alternateSmdpFqdn.hashCode();
    }

    @NotNull
    public String toString() {
        return "BindingResult(eid=" + this.eid + ", iccid=" + this.iccid + ", alternateSmdpFqdn=" + this.alternateSmdpFqdn + ")";
    }
}

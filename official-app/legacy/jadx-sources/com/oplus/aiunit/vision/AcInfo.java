package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fa, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/fa;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ac", "b", "cc", "c", "iccid", "d", "getOperat", "operat", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AcInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("ac")
    @NotNull
    private final String ac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cc")
    @NotNull
    private final String cc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("iccid")
    @NotNull
    private final String iccid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName(HttpConst.OPERATOR)
    @NotNull
    private final String operat;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAc() {
        return this.ac;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCc() {
        return this.cc;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIccid() {
        return this.iccid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcInfo)) {
            return false;
        }
        AcInfo acInfo = (AcInfo) other;
        return Intrinsics.areEqual(this.ac, acInfo.ac) && Intrinsics.areEqual(this.cc, acInfo.cc) && Intrinsics.areEqual(this.iccid, acInfo.iccid) && Intrinsics.areEqual(this.operat, acInfo.operat);
    }

    public int hashCode() {
        return (((((this.ac.hashCode() * 31) + this.cc.hashCode()) * 31) + this.iccid.hashCode()) * 31) + this.operat.hashCode();
    }

    @NotNull
    public String toString() {
        return "AcInfo(ac=" + this.ac + ", cc=" + this.cc + ", iccid=" + this.iccid + ", operat=" + this.operat + ")";
    }
}

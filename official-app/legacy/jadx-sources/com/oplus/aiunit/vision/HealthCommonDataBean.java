package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dq8, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/dq8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "d", "()J", "startTime", "b", "I", "()I", "fatLossHr", "", "c", UserInfo.SEX_FEMALE, "()F", "maxVO2", "aerobicTe", MapSchema.FIELD_NAME_ENTRY, "Z", "()Z", "isValid", "<init>", "(JIFFZ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HealthCommonDataBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int fatLossHr;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final float maxVO2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final float aerobicTe;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isValid;

    public HealthCommonDataBean(long j2, int i, float f, float f2, boolean z) {
        this.startTime = j2;
        this.fatLossHr = i;
        this.maxVO2 = f;
        this.aerobicTe = f2;
        this.isValid = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAerobicTe() {
        return this.aerobicTe;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFatLossHr() {
        return this.fatLossHr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getMaxVO2() {
        return this.maxVO2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthCommonDataBean)) {
            return false;
        }
        HealthCommonDataBean healthCommonDataBean = (HealthCommonDataBean) other;
        return this.startTime == healthCommonDataBean.startTime && this.fatLossHr == healthCommonDataBean.fatLossHr && Float.compare(this.maxVO2, healthCommonDataBean.maxVO2) == 0 && Float.compare(this.aerobicTe, healthCommonDataBean.aerobicTe) == 0 && this.isValid == healthCommonDataBean.isValid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.startTime) * 31) + Integer.hashCode(this.fatLossHr)) * 31) + Float.hashCode(this.maxVO2)) * 31) + Float.hashCode(this.aerobicTe)) * 31;
        boolean z = this.isValid;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "HealthCommonDataBean(startTime=" + this.startTime + ", fatLossHr=" + this.fatLossHr + ", maxVO2=" + this.maxVO2 + ", aerobicTe=" + this.aerobicTe + ", isValid=" + this.isValid + ")";
    }
}

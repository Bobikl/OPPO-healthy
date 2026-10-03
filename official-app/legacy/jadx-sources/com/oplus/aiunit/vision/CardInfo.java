package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.zz2, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/zz2;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "self", "esim", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("self")
    private final boolean self;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("esim")
    private final boolean esim;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEsim() {
        return this.esim;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSelf() {
        return this.self;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) other;
        return this.self == cardInfo.self && this.esim == cardInfo.esim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.self;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.esim;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "CardInfo(self=" + this.self + ", esim=" + this.esim + ")";
    }
}

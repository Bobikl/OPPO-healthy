package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.wearable.lpa.proto.LPASyncProto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dye, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/dye;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", "self", "b", "eSim", "Lcom/heytap/wearable/lpa/proto/LPASyncProto$LPAProfile;", "Lcom/heytap/wearable/lpa/proto/LPASyncProto$LPAProfile;", "()Lcom/heytap/wearable/lpa/proto/LPASyncProto$LPAProfile;", "lpaProfile", "<init>", "(ZZLcom/heytap/wearable/lpa/proto/LPASyncProto$LPAProfile;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Profile {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean self;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean eSim;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final LPASyncProto.LPAProfile lpaProfile;

    public Profile(boolean z, boolean z2, @Nullable LPASyncProto.LPAProfile lPAProfile) {
        this.self = z;
        this.eSim = z2;
        this.lpaProfile = lPAProfile;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getESim() {
        return this.eSim;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LPASyncProto.LPAProfile getLpaProfile() {
        return this.lpaProfile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSelf() {
        return this.self;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return this.self == profile.self && this.eSim == profile.eSim && Intrinsics.areEqual(this.lpaProfile, profile.lpaProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
        boolean z2 = this.eSim;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        LPASyncProto.LPAProfile lPAProfile = this.lpaProfile;
        return i2 + (lPAProfile == null ? 0 : lPAProfile.hashCode());
    }

    @NotNull
    public String toString() {
        return "Profile(self=" + this.self + ", eSim=" + this.eSim + ", lpaProfile=" + this.lpaProfile + ")";
    }

    public /* synthetic */ Profile(boolean z, boolean z2, LPASyncProto.LPAProfile lPAProfile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, lPAProfile);
    }
}

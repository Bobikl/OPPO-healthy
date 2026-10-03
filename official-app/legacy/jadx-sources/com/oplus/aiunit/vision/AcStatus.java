package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.uj, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/uj;", "", "", "d", "c", "b", "", "toString", "", "hashCode", "other", "equals", "a", "I", "()I", "profileState", "<init>", "(I)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AcStatus {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int profileState;

    public AcStatus(int i) {
        this.profileState = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getProfileState() {
        return this.profileState;
    }

    public final boolean b() {
        int i = this.profileState;
        return i == 4 || i == 6 || i == 0;
    }

    public final boolean c() {
        int i = this.profileState;
        return i == 0 || i == 7;
    }

    public final boolean d() {
        return this.profileState == 2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcStatus) && this.profileState == ((AcStatus) other).profileState;
    }

    public int hashCode() {
        return Integer.hashCode(this.profileState);
    }

    @NotNull
    public String toString() {
        return "AcStatus(profileState=" + this.profileState + ")";
    }
}

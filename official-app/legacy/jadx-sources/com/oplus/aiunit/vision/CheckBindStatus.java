package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x83, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/x83;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSsoid", "()Ljava/lang/String;", "ssoid", "b", "getUserUniqueId", "userUniqueId", "c", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CheckBindStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("ssoid")
    @Nullable
    private final String ssoid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("userUniqueId")
    @NotNull
    private final String userUniqueId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY)
    @NotNull
    private final String accountName;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBindStatus)) {
            return false;
        }
        CheckBindStatus checkBindStatus = (CheckBindStatus) other;
        return Intrinsics.areEqual(this.ssoid, checkBindStatus.ssoid) && Intrinsics.areEqual(this.userUniqueId, checkBindStatus.userUniqueId) && Intrinsics.areEqual(this.accountName, checkBindStatus.accountName);
    }

    public int hashCode() {
        String str = this.ssoid;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.userUniqueId.hashCode()) * 31) + this.accountName.hashCode();
    }

    @NotNull
    public String toString() {
        return "CheckBindStatus(ssoid=" + this.ssoid + ", userUniqueId=" + this.userUniqueId + ", accountName=" + this.accountName + ")";
    }
}

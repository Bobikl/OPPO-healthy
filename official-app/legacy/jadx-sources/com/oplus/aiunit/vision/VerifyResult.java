package com.oplus.aiunit.vision;

import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xuk, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/xuk;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "success", "b", "Ljava/lang/String;", "()Ljava/lang/String;", ThirdPartyPresenter.TICKET, "c", "isCancel", "<init>", "(ZLjava/lang/String;Z)V", "account_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VerifyResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String ticket;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isCancel;

    public VerifyResult(boolean z, @NotNull String ticket, boolean z2) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        this.success = z;
        this.ticket = ticket;
        this.isCancel = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsCancel() {
        return this.isCancel;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyResult)) {
            return false;
        }
        VerifyResult verifyResult = (VerifyResult) other;
        return this.success == verifyResult.success && Intrinsics.areEqual(this.ticket, verifyResult.ticket) && this.isCancel == verifyResult.isCancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.ticket.hashCode()) * 31;
        boolean z2 = this.isCancel;
        return iHashCode + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "VerifyResult(success=" + this.success + ", ticket=" + this.ticket + ", isCancel=" + this.isCancel + ")";
    }
}

package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/InviteInfoResp;", "", "userName", "", "maskMobile", "status", "", "match", "(Ljava/lang/String;Ljava/lang/String;II)V", "getMaskMobile", "()Ljava/lang/String;", "getMatch", "()I", "getStatus", "setStatus", "(I)V", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InviteInfoResp {

    @NotNull
    private final String maskMobile;
    private final int match;
    private int status;

    @NotNull
    private final String userName;

    public InviteInfoResp(@NotNull String userName, @NotNull String maskMobile, int i, int i2) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(maskMobile, "maskMobile");
        this.userName = userName;
        this.maskMobile = maskMobile;
        this.status = i;
        this.match = i2;
    }

    public static /* synthetic */ InviteInfoResp copy$default(InviteInfoResp inviteInfoResp, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = inviteInfoResp.userName;
        }
        if ((i3 & 2) != 0) {
            str2 = inviteInfoResp.maskMobile;
        }
        if ((i3 & 4) != 0) {
            i = inviteInfoResp.status;
        }
        if ((i3 & 8) != 0) {
            i2 = inviteInfoResp.match;
        }
        return inviteInfoResp.copy(str, str2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaskMobile() {
        return this.maskMobile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMatch() {
        return this.match;
    }

    @NotNull
    public final InviteInfoResp copy(@NotNull String userName, @NotNull String maskMobile, int status, int match) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(maskMobile, "maskMobile");
        return new InviteInfoResp(userName, maskMobile, status, match);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteInfoResp)) {
            return false;
        }
        InviteInfoResp inviteInfoResp = (InviteInfoResp) other;
        return Intrinsics.areEqual(this.userName, inviteInfoResp.userName) && Intrinsics.areEqual(this.maskMobile, inviteInfoResp.maskMobile) && this.status == inviteInfoResp.status && this.match == inviteInfoResp.match;
    }

    @NotNull
    public final String getMaskMobile() {
        return this.maskMobile;
    }

    public final int getMatch() {
        return this.match;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((this.userName.hashCode() * 31) + this.maskMobile.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.match);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "InviteInfoResp(userName=" + this.userName + ", maskMobile=" + this.maskMobile + ", status=" + this.status + ", match=" + this.match + ")";
    }
}

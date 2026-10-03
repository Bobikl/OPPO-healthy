package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/partner/bean/InviteParam;", "", "inviteType", "", "inviteeSsoid", "", "inviteeName", "inviteePhone", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInviteType", "()I", "getInviteeName", "()Ljava/lang/String;", "getInviteePhone", "getInviteeSsoid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InviteParam {
    public static final int $stable = 0;
    private final int inviteType;

    @NotNull
    private final String inviteeName;

    @NotNull
    private final String inviteePhone;

    @NotNull
    private final String inviteeSsoid;

    public InviteParam() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ InviteParam copy$default(InviteParam inviteParam, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inviteParam.inviteType;
        }
        if ((i2 & 2) != 0) {
            str = inviteParam.inviteeSsoid;
        }
        if ((i2 & 4) != 0) {
            str2 = inviteParam.inviteeName;
        }
        if ((i2 & 8) != 0) {
            str3 = inviteParam.inviteePhone;
        }
        return inviteParam.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getInviteType() {
        return this.inviteType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInviteeSsoid() {
        return this.inviteeSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInviteeName() {
        return this.inviteeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInviteePhone() {
        return this.inviteePhone;
    }

    @NotNull
    public final InviteParam copy(int inviteType, @NotNull String inviteeSsoid, @NotNull String inviteeName, @NotNull String inviteePhone) {
        Intrinsics.checkNotNullParameter(inviteeSsoid, "inviteeSsoid");
        Intrinsics.checkNotNullParameter(inviteeName, "inviteeName");
        Intrinsics.checkNotNullParameter(inviteePhone, "inviteePhone");
        return new InviteParam(inviteType, inviteeSsoid, inviteeName, inviteePhone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteParam)) {
            return false;
        }
        InviteParam inviteParam = (InviteParam) other;
        return this.inviteType == inviteParam.inviteType && Intrinsics.areEqual(this.inviteeSsoid, inviteParam.inviteeSsoid) && Intrinsics.areEqual(this.inviteeName, inviteParam.inviteeName) && Intrinsics.areEqual(this.inviteePhone, inviteParam.inviteePhone);
    }

    public final int getInviteType() {
        return this.inviteType;
    }

    @NotNull
    public final String getInviteeName() {
        return this.inviteeName;
    }

    @NotNull
    public final String getInviteePhone() {
        return this.inviteePhone;
    }

    @NotNull
    public final String getInviteeSsoid() {
        return this.inviteeSsoid;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.inviteType) * 31) + this.inviteeSsoid.hashCode()) * 31) + this.inviteeName.hashCode()) * 31) + this.inviteePhone.hashCode();
    }

    @NotNull
    public String toString() {
        return "InviteParam(inviteType=" + this.inviteType + ", inviteeSsoid=" + this.inviteeSsoid + ", inviteeName=" + this.inviteeName + ", inviteePhone=" + this.inviteePhone + ")";
    }

    public InviteParam(int i, @NotNull String inviteeSsoid, @NotNull String inviteeName, @NotNull String inviteePhone) {
        Intrinsics.checkNotNullParameter(inviteeSsoid, "inviteeSsoid");
        Intrinsics.checkNotNullParameter(inviteeName, "inviteeName");
        Intrinsics.checkNotNullParameter(inviteePhone, "inviteePhone");
        this.inviteType = i;
        this.inviteeSsoid = inviteeSsoid;
        this.inviteeName = inviteeName;
        this.inviteePhone = inviteePhone;
    }

    public /* synthetic */ InviteParam(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}

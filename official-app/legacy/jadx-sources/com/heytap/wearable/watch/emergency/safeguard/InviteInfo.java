package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.pag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/InviteInfo;", "", pag.KEY_ENCRYPT_PHONE, "", pag.KEY_ENCRYPT_USER_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getEncryptPhone", "()Ljava/lang/String;", "getEncryptUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InviteInfo {

    @NotNull
    private final String encryptPhone;

    @NotNull
    private final String encryptUserId;

    public InviteInfo(@NotNull String encryptPhone, @NotNull String encryptUserId) {
        Intrinsics.checkNotNullParameter(encryptPhone, "encryptPhone");
        Intrinsics.checkNotNullParameter(encryptUserId, "encryptUserId");
        this.encryptPhone = encryptPhone;
        this.encryptUserId = encryptUserId;
    }

    public static /* synthetic */ InviteInfo copy$default(InviteInfo inviteInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteInfo.encryptPhone;
        }
        if ((i & 2) != 0) {
            str2 = inviteInfo.encryptUserId;
        }
        return inviteInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptPhone() {
        return this.encryptPhone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncryptUserId() {
        return this.encryptUserId;
    }

    @NotNull
    public final InviteInfo copy(@NotNull String encryptPhone, @NotNull String encryptUserId) {
        Intrinsics.checkNotNullParameter(encryptPhone, "encryptPhone");
        Intrinsics.checkNotNullParameter(encryptUserId, "encryptUserId");
        return new InviteInfo(encryptPhone, encryptUserId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteInfo)) {
            return false;
        }
        InviteInfo inviteInfo = (InviteInfo) other;
        return Intrinsics.areEqual(this.encryptPhone, inviteInfo.encryptPhone) && Intrinsics.areEqual(this.encryptUserId, inviteInfo.encryptUserId);
    }

    @NotNull
    public final String getEncryptPhone() {
        return this.encryptPhone;
    }

    @NotNull
    public final String getEncryptUserId() {
        return this.encryptUserId;
    }

    public int hashCode() {
        return (this.encryptPhone.hashCode() * 31) + this.encryptUserId.hashCode();
    }

    @NotNull
    public String toString() {
        return "InviteInfo(encryptPhone=" + this.encryptPhone + ", encryptUserId=" + this.encryptUserId + ")";
    }
}

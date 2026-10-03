package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/AddGuard;", "", "guardPhone", "", "(Ljava/lang/String;)V", "getGuardPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AddGuard {

    @NotNull
    private final String guardPhone;

    public AddGuard(@NotNull String guardPhone) {
        Intrinsics.checkNotNullParameter(guardPhone, "guardPhone");
        this.guardPhone = guardPhone;
    }

    public static /* synthetic */ AddGuard copy$default(AddGuard addGuard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addGuard.guardPhone;
        }
        return addGuard.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuardPhone() {
        return this.guardPhone;
    }

    @NotNull
    public final AddGuard copy(@NotNull String guardPhone) {
        Intrinsics.checkNotNullParameter(guardPhone, "guardPhone");
        return new AddGuard(guardPhone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddGuard) && Intrinsics.areEqual(this.guardPhone, ((AddGuard) other).guardPhone);
    }

    @NotNull
    public final String getGuardPhone() {
        return this.guardPhone;
    }

    public int hashCode() {
        return this.guardPhone.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddGuard(guardPhone=" + this.guardPhone + ")";
    }
}

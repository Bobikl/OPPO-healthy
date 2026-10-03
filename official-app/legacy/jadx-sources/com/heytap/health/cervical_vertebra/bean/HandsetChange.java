package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/HandsetChange;", "", TriggerEvent.EXTRA_UID, "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HandsetChange {

    @NotNull
    private final String uid;

    public HandsetChange(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.uid = uid;
    }

    public static /* synthetic */ HandsetChange copy$default(HandsetChange handsetChange, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handsetChange.uid;
        }
        return handsetChange.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    public final HandsetChange copy(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new HandsetChange(uid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HandsetChange) && Intrinsics.areEqual(this.uid, ((HandsetChange) other).uid);
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.uid.hashCode();
    }

    @NotNull
    public String toString() {
        return "HandsetChange(uid=" + this.uid + ")";
    }
}

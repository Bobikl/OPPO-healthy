package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.health.operation.ecg.helper.EcgHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;", "", "messageType", "", EcgHelper.PUSHEXPERTINTERPRETATION_INTENT_KEY, "Lcom/heytap/wearable/watch/emergency/safeguard/GuardPushObject;", "(ILcom/heytap/wearable/watch/emergency/safeguard/GuardPushObject;)V", "getMessageType", "()I", "getPackageObject", "()Lcom/heytap/wearable/watch/emergency/safeguard/GuardPushObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GuardPush {
    private final int messageType;

    @NotNull
    private final GuardPushObject packageObject;

    public GuardPush(int i, @NotNull GuardPushObject packageObject) {
        Intrinsics.checkNotNullParameter(packageObject, "packageObject");
        this.messageType = i;
        this.packageObject = packageObject;
    }

    public static /* synthetic */ GuardPush copy$default(GuardPush guardPush, int i, GuardPushObject guardPushObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = guardPush.messageType;
        }
        if ((i2 & 2) != 0) {
            guardPushObject = guardPush.packageObject;
        }
        return guardPush.copy(i, guardPushObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GuardPushObject getPackageObject() {
        return this.packageObject;
    }

    @NotNull
    public final GuardPush copy(int messageType, @NotNull GuardPushObject packageObject) {
        Intrinsics.checkNotNullParameter(packageObject, "packageObject");
        return new GuardPush(messageType, packageObject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardPush)) {
            return false;
        }
        GuardPush guardPush = (GuardPush) other;
        return this.messageType == guardPush.messageType && Intrinsics.areEqual(this.packageObject, guardPush.packageObject);
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final GuardPushObject getPackageObject() {
        return this.packageObject;
    }

    public int hashCode() {
        return (Integer.hashCode(this.messageType) * 31) + this.packageObject.hashCode();
    }

    @NotNull
    public String toString() {
        return "GuardPush(messageType=" + this.messageType + ", packageObject=" + this.packageObject + ")";
    }
}

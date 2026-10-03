package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallInterceptAttributionNumberSimCardSwitch;", "", "isOpen", "", "type", "", "slotId", "", "areaList", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "(ZLjava/lang/String;ILjava/util/HashSet;)V", "getAreaList", "()Ljava/util/HashSet;", "()Z", "getSlotId", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallInterceptAttributionNumberSimCardSwitch {

    @Nullable
    private final HashSet<Long> areaList;
    private final boolean isOpen;
    private final int slotId;

    @NotNull
    private final String type;

    public CallInterceptAttributionNumberSimCardSwitch(boolean z, @NotNull String type, int i, @Nullable HashSet<Long> hashSet) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isOpen = z;
        this.type = type;
        this.slotId = i;
        this.areaList = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallInterceptAttributionNumberSimCardSwitch copy$default(CallInterceptAttributionNumberSimCardSwitch callInterceptAttributionNumberSimCardSwitch, boolean z, String str, int i, HashSet hashSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = callInterceptAttributionNumberSimCardSwitch.isOpen;
        }
        if ((i2 & 2) != 0) {
            str = callInterceptAttributionNumberSimCardSwitch.type;
        }
        if ((i2 & 4) != 0) {
            i = callInterceptAttributionNumberSimCardSwitch.slotId;
        }
        if ((i2 & 8) != 0) {
            hashSet = callInterceptAttributionNumberSimCardSwitch.areaList;
        }
        return callInterceptAttributionNumberSimCardSwitch.copy(z, str, i, hashSet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSlotId() {
        return this.slotId;
    }

    @Nullable
    public final HashSet<Long> component4() {
        return this.areaList;
    }

    @NotNull
    public final CallInterceptAttributionNumberSimCardSwitch copy(boolean isOpen, @NotNull String type, int slotId, @Nullable HashSet<Long> areaList) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CallInterceptAttributionNumberSimCardSwitch(isOpen, type, slotId, areaList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInterceptAttributionNumberSimCardSwitch)) {
            return false;
        }
        CallInterceptAttributionNumberSimCardSwitch callInterceptAttributionNumberSimCardSwitch = (CallInterceptAttributionNumberSimCardSwitch) other;
        return this.isOpen == callInterceptAttributionNumberSimCardSwitch.isOpen && Intrinsics.areEqual(this.type, callInterceptAttributionNumberSimCardSwitch.type) && this.slotId == callInterceptAttributionNumberSimCardSwitch.slotId && Intrinsics.areEqual(this.areaList, callInterceptAttributionNumberSimCardSwitch.areaList);
    }

    @Nullable
    public final HashSet<Long> getAreaList() {
        return this.areaList;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isOpen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.slotId)) * 31;
        HashSet<Long> hashSet = this.areaList;
        return iHashCode + (hashSet == null ? 0 : hashSet.hashCode());
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "CallInterceptAttributionNumberSimCardSwitch(isOpen=" + this.isOpen + ", type=" + this.type + ", slotId=" + this.slotId + ", areaList=" + this.areaList + ")";
    }
}

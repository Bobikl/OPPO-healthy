package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SyncTravelDataResult;", "", "name", "", "address", "guardBindList", "Ljava/util/ArrayList;", "Lcom/heytap/wearable/watch/emergency/safeguard/GuardStatus;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAddress", "()Ljava/lang/String;", "getGuardBindList", "()Ljava/util/ArrayList;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncTravelDataResult {

    @Nullable
    private final String address;

    @NotNull
    private final ArrayList<GuardStatus> guardBindList;

    @Nullable
    private final String name;

    public SyncTravelDataResult(@Nullable String str, @Nullable String str2, @NotNull ArrayList<GuardStatus> guardBindList) {
        Intrinsics.checkNotNullParameter(guardBindList, "guardBindList");
        this.name = str;
        this.address = str2;
        this.guardBindList = guardBindList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncTravelDataResult copy$default(SyncTravelDataResult syncTravelDataResult, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncTravelDataResult.name;
        }
        if ((i & 2) != 0) {
            str2 = syncTravelDataResult.address;
        }
        if ((i & 4) != 0) {
            arrayList = syncTravelDataResult.guardBindList;
        }
        return syncTravelDataResult.copy(str, str2, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final ArrayList<GuardStatus> component3() {
        return this.guardBindList;
    }

    @NotNull
    public final SyncTravelDataResult copy(@Nullable String name, @Nullable String address, @NotNull ArrayList<GuardStatus> guardBindList) {
        Intrinsics.checkNotNullParameter(guardBindList, "guardBindList");
        return new SyncTravelDataResult(name, address, guardBindList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncTravelDataResult)) {
            return false;
        }
        SyncTravelDataResult syncTravelDataResult = (SyncTravelDataResult) other;
        return Intrinsics.areEqual(this.name, syncTravelDataResult.name) && Intrinsics.areEqual(this.address, syncTravelDataResult.address) && Intrinsics.areEqual(this.guardBindList, syncTravelDataResult.guardBindList);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final ArrayList<GuardStatus> getGuardBindList() {
        return this.guardBindList;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.guardBindList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SyncTravelDataResult(name=" + this.name + ", address=" + this.address + ", guardBindList=" + this.guardBindList + ")";
    }
}

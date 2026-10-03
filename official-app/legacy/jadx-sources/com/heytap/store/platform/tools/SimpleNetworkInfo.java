package com.heytap.store.platform.tools;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "", "isAvailable", "", "isWifi", "isPortal", "isAir", "type", "Lcom/heytap/store/platform/tools/NetworkType;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/heytap/store/platform/tools/NetworkType;)V", "()Ljava/lang/Boolean;", "setAir", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setAvailable", "setPortal", "setWifi", "getType", "()Lcom/heytap/store/platform/tools/NetworkType;", "setType", "(Lcom/heytap/store/platform/tools/NetworkType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/heytap/store/platform/tools/NetworkType;)Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "equals", "other", "hashCode", "", "toString", "", "utils_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SimpleNetworkInfo {

    @Nullable
    private Boolean isAir;

    @Nullable
    private Boolean isAvailable;

    @Nullable
    private Boolean isPortal;

    @Nullable
    private Boolean isWifi;

    @Nullable
    private NetworkType type;

    public SimpleNetworkInfo(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable NetworkType networkType) {
        this.isAvailable = bool;
        this.isWifi = bool2;
        this.isPortal = bool3;
        this.isAir = bool4;
        this.type = networkType;
    }

    public static /* synthetic */ SimpleNetworkInfo copy$default(SimpleNetworkInfo simpleNetworkInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, NetworkType networkType, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = simpleNetworkInfo.isAvailable;
        }
        if ((i & 2) != 0) {
            bool2 = simpleNetworkInfo.isWifi;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = simpleNetworkInfo.isPortal;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            bool4 = simpleNetworkInfo.isAir;
        }
        Boolean bool7 = bool4;
        if ((i & 16) != 0) {
            networkType = simpleNetworkInfo.type;
        }
        return simpleNetworkInfo.copy(bool, bool5, bool6, bool7, networkType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsWifi() {
        return this.isWifi;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsPortal() {
        return this.isPortal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsAir() {
        return this.isAir;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NetworkType getType() {
        return this.type;
    }

    @NotNull
    public final SimpleNetworkInfo copy(@Nullable Boolean isAvailable, @Nullable Boolean isWifi, @Nullable Boolean isPortal, @Nullable Boolean isAir, @Nullable NetworkType type) {
        return new SimpleNetworkInfo(isAvailable, isWifi, isPortal, isAir, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleNetworkInfo)) {
            return false;
        }
        SimpleNetworkInfo simpleNetworkInfo = (SimpleNetworkInfo) other;
        return Intrinsics.areEqual(this.isAvailable, simpleNetworkInfo.isAvailable) && Intrinsics.areEqual(this.isWifi, simpleNetworkInfo.isWifi) && Intrinsics.areEqual(this.isPortal, simpleNetworkInfo.isPortal) && Intrinsics.areEqual(this.isAir, simpleNetworkInfo.isAir) && Intrinsics.areEqual(this.type, simpleNetworkInfo.type);
    }

    @Nullable
    public final NetworkType getType() {
        return this.type;
    }

    public int hashCode() {
        Boolean bool = this.isAvailable;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isWifi;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.isPortal;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isAir;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        NetworkType networkType = this.type;
        return iHashCode4 + (networkType != null ? networkType.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAir() {
        return this.isAir;
    }

    @Nullable
    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    @Nullable
    public final Boolean isPortal() {
        return this.isPortal;
    }

    @Nullable
    public final Boolean isWifi() {
        return this.isWifi;
    }

    public final void setAir(@Nullable Boolean bool) {
        this.isAir = bool;
    }

    public final void setAvailable(@Nullable Boolean bool) {
        this.isAvailable = bool;
    }

    public final void setPortal(@Nullable Boolean bool) {
        this.isPortal = bool;
    }

    public final void setType(@Nullable NetworkType networkType) {
        this.type = networkType;
    }

    public final void setWifi(@Nullable Boolean bool) {
        this.isWifi = bool;
    }

    @NotNull
    public String toString() {
        return "SimpleNetworkInfo{isAvailable=" + this.isAvailable + ", isWifi=" + this.isWifi + ", isPortal=" + this.isPortal + ", isAir=" + this.isAir + ", type=" + this.type + '}';
    }
}

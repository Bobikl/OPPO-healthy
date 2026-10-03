package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.heytap.log.config.StdDtoConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/OptionExtensionArgs;", "", StdDtoConst.FORCE_KEY, "", "addBlacklist", "isCloseAll", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAddBlacklist", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getForce", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/oplus/pantaconnect/sdk/connectionservice/connection/OptionExtensionArgs;", "equals", "other", "hashCode", "", "toString", "", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OptionExtensionArgs {

    @Nullable
    private final Boolean addBlacklist;

    @Nullable
    private final Boolean force;

    @Nullable
    private final Boolean isCloseAll;

    @JvmOverloads
    public OptionExtensionArgs() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OptionExtensionArgs copy$default(OptionExtensionArgs optionExtensionArgs, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = optionExtensionArgs.force;
        }
        if ((i & 2) != 0) {
            bool2 = optionExtensionArgs.addBlacklist;
        }
        if ((i & 4) != 0) {
            bool3 = optionExtensionArgs.isCloseAll;
        }
        return optionExtensionArgs.copy(bool, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getForce() {
        return this.force;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAddBlacklist() {
        return this.addBlacklist;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsCloseAll() {
        return this.isCloseAll;
    }

    @NotNull
    public final OptionExtensionArgs copy(@Nullable Boolean force, @Nullable Boolean addBlacklist, @Nullable Boolean isCloseAll) {
        return new OptionExtensionArgs(force, addBlacklist, isCloseAll);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExtensionArgs)) {
            return false;
        }
        OptionExtensionArgs optionExtensionArgs = (OptionExtensionArgs) other;
        return Intrinsics.areEqual(this.force, optionExtensionArgs.force) && Intrinsics.areEqual(this.addBlacklist, optionExtensionArgs.addBlacklist) && Intrinsics.areEqual(this.isCloseAll, optionExtensionArgs.isCloseAll);
    }

    @Nullable
    public final Boolean getAddBlacklist() {
        return this.addBlacklist;
    }

    @Nullable
    public final Boolean getForce() {
        return this.force;
    }

    public int hashCode() {
        Boolean bool = this.force;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.addBlacklist;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCloseAll;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCloseAll() {
        return this.isCloseAll;
    }

    @NotNull
    public String toString() {
        return "OptionExtensionArgs(force=" + this.force + ", addBlacklist=" + this.addBlacklist + ", isCloseAll=" + this.isCloseAll + ')';
    }

    @JvmOverloads
    public OptionExtensionArgs(@Nullable Boolean bool) {
        this(bool, null, null, 6, null);
    }

    @JvmOverloads
    public OptionExtensionArgs(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this(bool, bool2, null, 4, null);
    }

    @JvmOverloads
    public OptionExtensionArgs(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.force = bool;
        this.addBlacklist = bool2;
        this.isCloseAll = bool3;
    }

    public /* synthetic */ OptionExtensionArgs(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}

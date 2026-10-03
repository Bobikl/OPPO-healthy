package com.oplus.pantaconnect.sdk.discovery.fusion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/Identity;", "", ServiceNodeBundleKeys.ACCOUNT_HASH, "", ServiceNodeBundleKeys.ACCOUNT_GROUP, ServiceNodeBundleKeys.CONTACT_HASH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountGroup", "()Ljava/lang/String;", "getAccountHash", "getContactHash", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Identity {

    @NotNull
    private final String accountGroup;

    @NotNull
    private final String accountHash;

    @NotNull
    private final String contactHash;

    public Identity(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.accountHash = str;
        this.accountGroup = str2;
        this.contactHash = str3;
    }

    public static /* synthetic */ Identity copy$default(Identity identity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identity.accountHash;
        }
        if ((i & 2) != 0) {
            str2 = identity.accountGroup;
        }
        if ((i & 4) != 0) {
            str3 = identity.contactHash;
        }
        return identity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountHash() {
        return this.accountHash;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountGroup() {
        return this.accountGroup;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContactHash() {
        return this.contactHash;
    }

    @NotNull
    public final Identity copy(@NotNull String accountHash, @NotNull String accountGroup, @NotNull String contactHash) {
        return new Identity(accountHash, accountGroup, contactHash);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Identity)) {
            return false;
        }
        Identity identity = (Identity) other;
        return Intrinsics.areEqual(this.accountHash, identity.accountHash) && Intrinsics.areEqual(this.accountGroup, identity.accountGroup) && Intrinsics.areEqual(this.contactHash, identity.contactHash);
    }

    @NotNull
    public final String getAccountGroup() {
        return this.accountGroup;
    }

    @NotNull
    public final String getAccountHash() {
        return this.accountHash;
    }

    @NotNull
    public final String getContactHash() {
        return this.contactHash;
    }

    public int hashCode() {
        return this.contactHash.hashCode() + ((this.accountGroup.hashCode() + (this.accountHash.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Identity(accountHash=" + this.accountHash + ", accountGroup=" + this.accountGroup + ", contactHash=" + this.contactHash + ')';
    }
}

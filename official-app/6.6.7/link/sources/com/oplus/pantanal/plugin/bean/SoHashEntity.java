package com.oplus.pantanal.plugin.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/oplus/pantanal/plugin/bean/SoHashEntity;", "", "soName", "", "hash", "encryptedHash", "oaepHash", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedHash", "()Ljava/lang/String;", "getHash", "getOaepHash", "getSoName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SoHashEntity {

    @Nullable
    private final String encryptedHash;

    @Nullable
    private final String hash;

    @Nullable
    private final String oaepHash;

    @NotNull
    private final String soName;

    public SoHashEntity(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "soName");
        this.soName = str;
        this.hash = str2;
        this.encryptedHash = str3;
        this.oaepHash = str4;
    }

    public static /* synthetic */ SoHashEntity copy$default(SoHashEntity soHashEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = soHashEntity.soName;
        }
        if ((i & 2) != 0) {
            str2 = soHashEntity.hash;
        }
        if ((i & 4) != 0) {
            str3 = soHashEntity.encryptedHash;
        }
        if ((i & 8) != 0) {
            str4 = soHashEntity.oaepHash;
        }
        return soHashEntity.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSoName() {
        return this.soName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEncryptedHash() {
        return this.encryptedHash;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOaepHash() {
        return this.oaepHash;
    }

    @NotNull
    public final SoHashEntity copy(@NotNull String soName, @Nullable String hash, @Nullable String encryptedHash, @Nullable String oaepHash) {
        Intrinsics.checkNotNullParameter(soName, "soName");
        return new SoHashEntity(soName, hash, encryptedHash, oaepHash);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoHashEntity)) {
            return false;
        }
        SoHashEntity soHashEntity = (SoHashEntity) other;
        return Intrinsics.areEqual(this.soName, soHashEntity.soName) && Intrinsics.areEqual(this.hash, soHashEntity.hash) && Intrinsics.areEqual(this.encryptedHash, soHashEntity.encryptedHash) && Intrinsics.areEqual(this.oaepHash, soHashEntity.oaepHash);
    }

    @Nullable
    public final String getEncryptedHash() {
        return this.encryptedHash;
    }

    @Nullable
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final String getOaepHash() {
        return this.oaepHash;
    }

    @NotNull
    public final String getSoName() {
        return this.soName;
    }

    public int hashCode() {
        int iHashCode = this.soName.hashCode() * 31;
        String str = this.hash;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encryptedHash;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oaepHash;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SoHashEntity(soName=" + this.soName + ", hash=" + this.hash + ", encryptedHash=" + this.encryptedHash + ", oaepHash=" + this.oaepHash + ")";
    }

    public /* synthetic */ SoHashEntity(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

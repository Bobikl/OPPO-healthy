package com.oplus.pantanal.plugin.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/oplus/pantanal/plugin/bean/HashEntity;", "", "hash", "", "soHash", "", "Lcom/oplus/pantanal/plugin/bean/SoHashEntity;", "encryptedHash", "oaepHash", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedHash", "()Ljava/lang/String;", "getHash", "getOaepHash", "getSoHash", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HashEntity {

    @Nullable
    private final String encryptedHash;

    @Nullable
    private final String hash;

    @Nullable
    private final String oaepHash;

    @Nullable
    private final List<SoHashEntity> soHash;

    public HashEntity(@Nullable String str, @Nullable List<SoHashEntity> list, @Nullable String str2, @Nullable String str3) {
        this.hash = str;
        this.soHash = list;
        this.encryptedHash = str2;
        this.oaepHash = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HashEntity copy$default(HashEntity hashEntity, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hashEntity.hash;
        }
        if ((i & 2) != 0) {
            list = hashEntity.soHash;
        }
        if ((i & 4) != 0) {
            str2 = hashEntity.encryptedHash;
        }
        if ((i & 8) != 0) {
            str3 = hashEntity.oaepHash;
        }
        return hashEntity.copy(str, list, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final List<SoHashEntity> component2() {
        return this.soHash;
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
    public final HashEntity copy(@Nullable String hash, @Nullable List<SoHashEntity> soHash, @Nullable String encryptedHash, @Nullable String oaepHash) {
        return new HashEntity(hash, soHash, encryptedHash, oaepHash);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HashEntity)) {
            return false;
        }
        HashEntity hashEntity = (HashEntity) other;
        return Intrinsics.areEqual(this.hash, hashEntity.hash) && Intrinsics.areEqual(this.soHash, hashEntity.soHash) && Intrinsics.areEqual(this.encryptedHash, hashEntity.encryptedHash) && Intrinsics.areEqual(this.oaepHash, hashEntity.oaepHash);
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

    @Nullable
    public final List<SoHashEntity> getSoHash() {
        return this.soHash;
    }

    public int hashCode() {
        String str = this.hash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SoHashEntity> list = this.soHash;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.encryptedHash;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oaepHash;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HashEntity(hash=" + this.hash + ", soHash=" + this.soHash + ", encryptedHash=" + this.encryptedHash + ", oaepHash=" + this.oaepHash + ")";
    }

    public /* synthetic */ HashEntity(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}

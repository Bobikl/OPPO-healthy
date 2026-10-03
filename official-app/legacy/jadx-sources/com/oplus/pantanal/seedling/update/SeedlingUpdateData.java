package com.oplus.pantanal.seedling.update;

import com.oplus.cardwidget.domain.pack.BaseDataPack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingUpdateData;", "", "cardId", "", "data", "", BaseDataPack.KEY_DATA_COMPRESS, "forceUpdate", "", "(ILjava/lang/String;IZ)V", "getCardId", "()I", "getCompress", "getData", "()Ljava/lang/String;", "getForceUpdate", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingUpdateData {
    private final int cardId;
    private final int compress;

    @NotNull
    private final String data;
    private final boolean forceUpdate;

    public SeedlingUpdateData(int i, @NotNull String data, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cardId = i;
        this.data = data;
        this.compress = i2;
        this.forceUpdate = z;
    }

    public static /* synthetic */ SeedlingUpdateData copy$default(SeedlingUpdateData seedlingUpdateData, int i, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = seedlingUpdateData.cardId;
        }
        if ((i3 & 2) != 0) {
            str = seedlingUpdateData.data;
        }
        if ((i3 & 4) != 0) {
            i2 = seedlingUpdateData.compress;
        }
        if ((i3 & 8) != 0) {
            z = seedlingUpdateData.forceUpdate;
        }
        return seedlingUpdateData.copy(i, str, i2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompress() {
        return this.compress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    @NotNull
    public final SeedlingUpdateData copy(int cardId, @NotNull String data, int compress, boolean forceUpdate) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SeedlingUpdateData(cardId, data, compress, forceUpdate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingUpdateData)) {
            return false;
        }
        SeedlingUpdateData seedlingUpdateData = (SeedlingUpdateData) other;
        return this.cardId == seedlingUpdateData.cardId && Intrinsics.areEqual(this.data, seedlingUpdateData.data) && this.compress == seedlingUpdateData.compress && this.forceUpdate == seedlingUpdateData.forceUpdate;
    }

    public final int getCardId() {
        return this.cardId;
    }

    public final int getCompress() {
        return this.compress;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.cardId) * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.compress)) * 31) + Boolean.hashCode(this.forceUpdate);
    }

    @NotNull
    public String toString() {
        return "SeedlingUpdateData(cardId=" + this.cardId + ", data=" + this.data + ", compress=" + this.compress + ", forceUpdate=" + this.forceUpdate + ")";
    }

    public /* synthetic */ SeedlingUpdateData(int i, String str, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i3 & 8) != 0 ? true : z);
    }
}

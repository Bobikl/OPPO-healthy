package com.oplus.seedling.sdk.seedling;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/RemoteViewImage;", "", "data", "", "([B)V", "getData", "()[B", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewImage {

    @Nullable
    private final byte[] data;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteViewImage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RemoteViewImage copy$default(RemoteViewImage remoteViewImage, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = remoteViewImage.data;
        }
        return remoteViewImage.copy(bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final RemoteViewImage copy(@Nullable byte[] data) {
        return new RemoteViewImage(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RemoteViewImage.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.seedling.sdk.seedling.RemoteViewImage");
        return Arrays.equals(this.data, ((RemoteViewImage) other).data);
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    @NotNull
    public String toString() {
        byte[] bArr = this.data;
        return "RemoteViewImage(dataSize=" + (bArr != null ? Integer.valueOf(bArr.length) : null) + ")";
    }

    public RemoteViewImage(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public /* synthetic */ RemoteViewImage(byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bArr);
    }
}

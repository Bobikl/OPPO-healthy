package com.oplus.seedling.sdk.seedling;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/EngineRawData;", "", ParserTag.TAG_URI, "", "type", "byteArray", "", "(Ljava/lang/String;Ljava/lang/String;[B)V", "getByteArray", "()[B", "getType", "()Ljava/lang/String;", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EngineRawData {

    @Nullable
    private final byte[] byteArray;

    @NotNull
    private final String type;

    @NotNull
    private final String uri;

    public EngineRawData(@NotNull String uri, @NotNull String type, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uri = uri;
        this.type = type;
        this.byteArray = bArr;
    }

    public static /* synthetic */ EngineRawData copy$default(EngineRawData engineRawData, String str, String str2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = engineRawData.uri;
        }
        if ((i & 2) != 0) {
            str2 = engineRawData.type;
        }
        if ((i & 4) != 0) {
            bArr = engineRawData.byteArray;
        }
        return engineRawData.copy(str, str2, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @NotNull
    public final EngineRawData copy(@NotNull String uri, @NotNull String type, @Nullable byte[] byteArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        return new EngineRawData(uri, type, byteArray);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(EngineRawData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.seedling.sdk.seedling.EngineRawData");
        EngineRawData engineRawData = (EngineRawData) other;
        if (!Intrinsics.areEqual(this.uri, engineRawData.uri) || !Intrinsics.areEqual(this.type, engineRawData.type)) {
            return false;
        }
        byte[] bArr = this.byteArray;
        if (bArr != null) {
            byte[] bArr2 = engineRawData.byteArray;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (engineRawData.byteArray != null) {
            return false;
        }
        return true;
    }

    @Nullable
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = ((this.uri.hashCode() * 31) + this.type.hashCode()) * 31;
        byte[] bArr = this.byteArray;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        return "EngineRawData(uri=" + this.uri + ", type=" + this.type + ", byteArray=" + Arrays.toString(this.byteArray) + ")";
    }
}

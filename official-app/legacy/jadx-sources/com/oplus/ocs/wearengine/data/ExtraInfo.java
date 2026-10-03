package com.oplus.ocs.wearengine.data;

import androidx.annotation.RestrictTo;
import com.google.protobuf.ByteString;
import com.oplus.ocs.wearengine.proto.DataProto$ExtraInfo;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExtraInfo;", "", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExtraInfo;", "(Lcom/oplus/ocs/wearengine/proto/DataProto$ExtraInfo;)V", "extraInfoArray", "", "([B)V", "getExtraInfoArray", "()[B", "getProto$thirdparty_impl_release", "()Lcom/oplus/ocs/wearengine/proto/DataProto$ExtraInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExtraInfo {

    @NotNull
    private final byte[] extraInfoArray;

    @NotNull
    private final DataProto$ExtraInfo proto;

    public ExtraInfo(@NotNull byte[] extraInfoArray) {
        Intrinsics.checkNotNullParameter(extraInfoArray, "extraInfoArray");
        this.extraInfoArray = extraInfoArray;
        DataProto$ExtraInfo dataProto$ExtraInfoBuild = DataProto$ExtraInfo.newBuilder().setExtraInfoVal(ByteString.copyFrom(extraInfoArray)).build();
        Intrinsics.checkNotNullExpressionValue(dataProto$ExtraInfoBuild, "newBuilder().setExtraInf…(extraInfoArray)).build()");
        this.proto = dataProto$ExtraInfoBuild;
    }

    public static /* synthetic */ ExtraInfo copy$default(ExtraInfo extraInfo, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = extraInfo.extraInfoArray;
        }
        return extraInfo.copy(bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getExtraInfoArray() {
        return this.extraInfoArray;
    }

    @NotNull
    public final ExtraInfo copy(@NotNull byte[] extraInfoArray) {
        Intrinsics.checkNotNullParameter(extraInfoArray, "extraInfoArray");
        return new ExtraInfo(extraInfoArray);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtraInfo) && Intrinsics.areEqual(this.extraInfoArray, ((ExtraInfo) other).extraInfoArray);
    }

    @NotNull
    public final byte[] getExtraInfoArray() {
        return this.extraInfoArray;
    }

    @NotNull
    /* JADX INFO: renamed from: getProto$thirdparty_impl_release, reason: from getter */
    public final DataProto$ExtraInfo getProto() {
        return this.proto;
    }

    public int hashCode() {
        return Arrays.hashCode(this.extraInfoArray);
    }

    @NotNull
    public String toString() {
        return "ExtraInfo(extraInfoArray=" + Arrays.toString(this.extraInfoArray) + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ExtraInfo(@NotNull DataProto$ExtraInfo proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        byte[] byteArray = proto.getExtraInfoVal().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "proto.extraInfoVal.toByteArray()");
        this(byteArray);
    }
}

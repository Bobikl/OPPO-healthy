package com.oplus.ocs.wearengine.data;

import com.oplus.ocs.wearengine.proto.DataProto$BatchingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u0006H\u0016J\r\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/oplus/ocs/wearengine/data/BatchingMode;", "", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$BatchingMode;", "(Lcom/oplus/ocs/wearengine/proto/DataProto$BatchingMode;)V", "id", "", "(I)V", "getId", "()I", "equals", "", "other", "hashCode", "toProto", "toProto$thirdparty_impl_release", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BatchingMode {
    private final int id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final BatchingMode BATCHING_MODE_UNKNOWN = new BatchingMode(0);

    @JvmField
    @NotNull
    public static final BatchingMode BATCHING_MODE_30_SECONDS = new BatchingMode(1);

    @JvmField
    @NotNull
    public static final BatchingMode BATCHING_MODE_60_SECONDS = new BatchingMode(2);

    @JvmField
    @NotNull
    public static final BatchingMode BATCHING_MODE_120_SECONDS = new BatchingMode(3);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/ocs/wearengine/data/BatchingMode$Companion;", "", "()V", "BATCHING_MODE_120_SECONDS", "Lcom/oplus/ocs/wearengine/data/BatchingMode;", "BATCHING_MODE_30_SECONDS", "BATCHING_MODE_60_SECONDS", "BATCHING_MODE_UNKNOWN", "fromProto", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$BatchingMode;", "fromProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BatchingMode fromProto$thirdparty_impl_release(@NotNull DataProto$BatchingMode proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BatchingMode(proto.getNumber());
        }
    }

    public BatchingMode(int i) {
        this.id = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchingMode) && this.id == ((BatchingMode) other).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }

    @NotNull
    public final DataProto$BatchingMode toProto$thirdparty_impl_release() {
        DataProto$BatchingMode dataProto$BatchingModeForNumber = DataProto$BatchingMode.forNumber(this.id);
        return dataProto$BatchingModeForNumber == null ? DataProto$BatchingMode.BATCHING_MODE_UNKNOWN : dataProto$BatchingModeForNumber;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatchingMode(@NotNull DataProto$BatchingMode proto) {
        this(proto.getNumber());
        Intrinsics.checkNotNullParameter(proto, "proto");
    }
}

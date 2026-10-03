package com.oplus.ocs.wearengine.data;

import com.oplus.ocs.wearengine.proto.DataProto$Value;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/ocs/wearengine/data/PerKMPaceData;", "", "perKMPaceData", "", "", "(Ljava/util/List;)V", "getPerKMPaceData", "()Ljava/util/List;", "addToValueProtoBuilder", "", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$Value$Builder;", "addToValueProtoBuilder$thirdparty_impl_release", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PerKMPaceData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Double> perKMPaceData;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/PerKMPaceData$Companion;", "", "()V", "fromDataProtoValue", "Lcom/oplus/ocs/wearengine/data/PerKMPaceData;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$Value;", "fromDataProtoValue$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PerKMPaceData fromDataProtoValue$thirdparty_impl_release(@NotNull DataProto$Value proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<Double> doubleArrayList = proto.getDoubleArrayVal().getDoubleArrayList();
            Intrinsics.checkNotNullExpressionValue(doubleArrayList, "proto.doubleArrayVal.doubleArrayList");
            return new PerKMPaceData(CollectionsKt___CollectionsKt.toList(doubleArrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PerKMPaceData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void addToValueProtoBuilder$thirdparty_impl_release(@NotNull DataProto$Value.Builder proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        proto.setDoubleArrayVal(DataProto$Value.DoubleArray.newBuilder().addAllDoubleArray(this.perKMPaceData));
    }

    @NotNull
    public final List<Double> getPerKMPaceData() {
        return this.perKMPaceData;
    }

    public PerKMPaceData(@NotNull List<Double> perKMPaceData) {
        Intrinsics.checkNotNullParameter(perKMPaceData, "perKMPaceData");
        this.perKMPaceData = perKMPaceData;
    }

    public /* synthetic */ PerKMPaceData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}

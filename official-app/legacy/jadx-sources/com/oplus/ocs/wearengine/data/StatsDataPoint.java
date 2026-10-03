package com.oplus.ocs.wearengine.data;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.y15;
import com.oplus.ocs.wearengine.proto.DataProto$DataType;
import com.oplus.ocs.wearengine.proto.DataProto$StatsDataPoint;
import com.oplus.ocs.wearengine.proto.DataProto$Value;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000fB'\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/ocs/wearengine/data/StatsDataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/oplus/ocs/wearengine/data/DataPoint;", y15.PARAMS_DATA_TYPE, "Lcom/oplus/ocs/wearengine/data/StatsDataType;", "value", "(Lcom/oplus/ocs/wearengine/data/StatsDataType;Ljava/lang/Object;)V", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$StatsDataPoint;", "getProto$thirdparty_impl_release", "()Lcom/oplus/ocs/wearengine/proto/DataProto$StatsDataPoint;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatsDataPoint<T> extends DataPoint<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DataProto$StatsDataPoint proto;

    @NotNull
    private final T value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/StatsDataPoint$Companion;", "", "()V", "fromProto", "Lcom/oplus/ocs/wearengine/data/StatsDataPoint;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$StatsDataPoint;", "fromProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StatsDataPoint<?> fromProto$thirdparty_impl_release(@NotNull DataProto$StatsDataPoint proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DataType.Companion companion = DataType.INSTANCE;
            DataProto$DataType dataType = proto.getDataType();
            Intrinsics.checkNotNullExpressionValue(dataType, "proto.dataType");
            StatsDataType<? extends Object, ? extends StatsDataPoint<? extends Object>> statsDataTypeStatsFromProto$thirdparty_impl_release = companion.statsFromProto$thirdparty_impl_release(dataType);
            Intrinsics.checkNotNull(statsDataTypeStatsFromProto$thirdparty_impl_release, "null cannot be cast to non-null type com.oplus.ocs.wearengine.data.StatsDataType<kotlin.Number, com.oplus.ocs.wearengine.data.StatsDataPoint<kotlin.Number>>");
            DataProto$Value value = proto.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "proto.value");
            return new StatsDataPoint<>(statsDataTypeStatsFromProto$thirdparty_impl_release, statsDataTypeStatsFromProto$thirdparty_impl_release.toValueFromProto$thirdparty_impl_release(value));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsDataPoint(@NotNull StatsDataType<T, StatsDataPoint<T>> dataType, @NotNull T value) {
        super(dataType);
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        DataProto$StatsDataPoint dataProto$StatsDataPointBuild = DataProto$StatsDataPoint.newBuilder().setDataType(dataType.getProto()).setValue(dataType.toProtoFromValue$thirdparty_impl_release(value)).build();
        Intrinsics.checkNotNullExpressionValue(dataProto$StatsDataPointBuild, "newBuilder()\n           …ue))\n            .build()");
        this.proto = dataProto$StatsDataPointBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: getProto$thirdparty_impl_release, reason: from getter */
    public final DataProto$StatsDataPoint getProto() {
        return this.proto;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }
}

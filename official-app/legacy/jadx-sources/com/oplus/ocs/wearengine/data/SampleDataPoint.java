package com.oplus.ocs.wearengine.data;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.y15;
import com.oplus.ocs.wearengine.proto.DataProto$Bundle;
import com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy;
import com.oplus.ocs.wearengine.proto.DataProto$DataType;
import com.oplus.ocs.wearengine.proto.DataProto$SampleDataPoint;
import com.oplus.ocs.wearengine.proto.DataProto$Value;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001#BE\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/oplus/ocs/wearengine/data/SampleDataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/oplus/ocs/wearengine/data/DataPoint;", y15.PARAMS_DATA_TYPE, "Lcom/oplus/ocs/wearengine/data/SampleDataType;", "value", ClickApiEntity.TIME, "", "metadata", "Landroid/os/Bundle;", "accuracy", "Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;", "(Lcom/oplus/ocs/wearengine/data/SampleDataType;Ljava/lang/Object;JLandroid/os/Bundle;Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;)V", "getAccuracy", "()Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;", "getDataType", "()Lcom/oplus/ocs/wearengine/data/SampleDataType;", "getMetadata", "()Landroid/os/Bundle;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$SampleDataPoint;", "getProto$thirdparty_impl_release", "()Lcom/oplus/ocs/wearengine/proto/DataProto$SampleDataPoint;", "getTime", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "getDataPointProto", "hashCode", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSampleDataPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SampleDataPoint.kt\ncom/oplus/ocs/wearengine/data/SampleDataPoint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class SampleDataPoint<T> extends DataPoint<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final DataPointAccuracy accuracy;

    @NotNull
    private final SampleDataType<T, SampleDataPoint<T>> dataType;

    @NotNull
    private final Bundle metadata;

    @NotNull
    private final DataProto$SampleDataPoint proto;
    private final long time;

    @NotNull
    private final T value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/SampleDataPoint$Companion;", "", "()V", "fromProto", "Lcom/oplus/ocs/wearengine/data/SampleDataPoint;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$SampleDataPoint;", "fromProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SampleDataPoint<?> fromProto$thirdparty_impl_release(@NotNull DataProto$SampleDataPoint proto) {
            DataPointAccuracy dataPointAccuracyFromProto$thirdparty_impl_release;
            Intrinsics.checkNotNullParameter(proto, "proto");
            DataType.Companion companion = DataType.INSTANCE;
            DataProto$DataType dataType = proto.getDataType();
            Intrinsics.checkNotNullExpressionValue(dataType, "proto.dataType");
            SampleDataType<? extends Object, ? extends SampleDataPoint<? extends Object>> sampleDataTypeSampleFromProto$thirdparty_impl_release = companion.sampleFromProto$thirdparty_impl_release(dataType);
            Intrinsics.checkNotNull(sampleDataTypeSampleFromProto$thirdparty_impl_release, "null cannot be cast to non-null type com.oplus.ocs.wearengine.data.SampleDataType<kotlin.Any, com.oplus.ocs.wearengine.data.SampleDataPoint<kotlin.Any>>");
            DataProto$Value value = proto.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "proto.value");
            Object valueFromProto$thirdparty_impl_release = sampleDataTypeSampleFromProto$thirdparty_impl_release.toValueFromProto$thirdparty_impl_release(value);
            long time = proto.getTime();
            DataProto$Bundle metaData = proto.getMetaData();
            Intrinsics.checkNotNullExpressionValue(metaData, "proto.metaData");
            Bundle bundleFromProto$thirdparty_impl_release = BundlesUtil.fromProto$thirdparty_impl_release(metaData);
            if (proto.hasAccuracy()) {
                DataPointAccuracy.Companion companion2 = DataPointAccuracy.INSTANCE;
                DataProto$DataPointAccuracy accuracy = proto.getAccuracy();
                Intrinsics.checkNotNullExpressionValue(accuracy, "proto.accuracy");
                dataPointAccuracyFromProto$thirdparty_impl_release = companion2.fromProto$thirdparty_impl_release(accuracy);
            } else {
                dataPointAccuracyFromProto$thirdparty_impl_release = null;
            }
            return new SampleDataPoint<>(sampleDataTypeSampleFromProto$thirdparty_impl_release, valueFromProto$thirdparty_impl_release, time, bundleFromProto$thirdparty_impl_release, dataPointAccuracyFromProto$thirdparty_impl_release);
        }
    }

    public /* synthetic */ SampleDataPoint(SampleDataType sampleDataType, Object obj, long j2, Bundle bundle, DataPointAccuracy dataPointAccuracy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sampleDataType, obj, j2, (i & 8) != 0 ? new Bundle() : bundle, (i & 16) != 0 ? null : dataPointAccuracy);
    }

    private final DataProto$SampleDataPoint getDataPointProto() {
        DataProto$SampleDataPoint.Builder metaData = DataProto$SampleDataPoint.newBuilder().setDataType(getDataType().getProto()).setValue(getDataType().toProtoFromValue$thirdparty_impl_release(this.value)).setTime(this.time).setMetaData(BundlesUtil.toProto$thirdparty_impl_release(this.metadata));
        DataPointAccuracy dataPointAccuracy = this.accuracy;
        if (dataPointAccuracy != null) {
            metaData.setAccuracy(dataPointAccuracy.getProto$thirdparty_impl_release());
        }
        DataProto$SampleDataPoint dataProto$SampleDataPointBuild = metaData.build();
        Intrinsics.checkNotNullExpressionValue(dataProto$SampleDataPointBuild, "builder.build()");
        return dataProto$SampleDataPointBuild;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleDataPoint)) {
            return false;
        }
        SampleDataPoint sampleDataPoint = (SampleDataPoint) other;
        return Intrinsics.areEqual(getDataType(), sampleDataPoint.getDataType()) && Intrinsics.areEqual(this.value, sampleDataPoint.value) && Intrinsics.areEqual(this.accuracy, sampleDataPoint.accuracy) && this.time == sampleDataPoint.time;
    }

    @Nullable
    public final DataPointAccuracy getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final Bundle getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* JADX INFO: renamed from: getProto$thirdparty_impl_release, reason: from getter */
    public final DataProto$SampleDataPoint getProto() {
        return this.proto;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((this.value.hashCode() * 31) + Long.hashCode(this.time)) * 31) + this.metadata.hashCode()) * 31;
        DataPointAccuracy dataPointAccuracy = this.accuracy;
        return iHashCode + (dataPointAccuracy != null ? dataPointAccuracy.hashCode() : 0);
    }

    @Override // com.oplus.ocs.wearengine.data.DataPoint
    @NotNull
    public SampleDataType<T, SampleDataPoint<T>> getDataType() {
        return this.dataType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleDataPoint(@NotNull SampleDataType<T, SampleDataPoint<T>> dataType, @NotNull T value, long j2, @NotNull Bundle metadata, @Nullable DataPointAccuracy dataPointAccuracy) {
        super(dataType);
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.dataType = dataType;
        this.value = value;
        this.time = j2;
        this.metadata = metadata;
        this.accuracy = dataPointAccuracy;
        this.proto = getDataPointProto();
    }
}

package com.oplus.ocs.wearengine.data;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.ByteString;
import com.oplus.ocs.wearengine.data.DataPoint;
import com.oplus.ocs.wearengine.proto.DataProto$DataType;
import com.oplus.ocs.wearengine.proto.DataProto$Value;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.JvmClassMappingKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 $*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0002:\u0001$B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0017\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0006H\u0016J\u0017\u0010!\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/oplus/ocs/wearengine/data/DataType;", ExifInterface.GPS_DIRECTION_TRUE, "", "D", "Lcom/oplus/ocs/wearengine/data/DataPoint;", "name", "", "valueClass", "Ljava/lang/Class;", "isStatistical", "", "(Ljava/lang/String;Ljava/lang/Class;Z)V", "isStatistical$thirdparty_impl_release", "()Z", "getName", "()Ljava/lang/String;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$DataType;", "getProto$thirdparty_impl_release", "()Lcom/oplus/ocs/wearengine/proto/DataProto$DataType;", "getValueClass", "()Ljava/lang/Class;", "classToValueFormat", "", "equals", "other", "hashCode", "toProtoFromValue", "Lcom/oplus/ocs/wearengine/proto/DataProto$Value;", "value", "toProtoFromValue$thirdparty_impl_release", "(Ljava/lang/Object;)Lcom/oplus/ocs/wearengine/proto/DataProto$Value;", "toString", "toValueFromProto", "toValueFromProto$thirdparty_impl_release", "(Lcom/oplus/ocs/wearengine/proto/DataProto$Value;)Ljava/lang/Object;", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DataType<T, D extends DataPoint<T>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FORMAT_BOOLEAN = 4;
    public static final int FORMAT_BYTE_ARRAY = 5;
    public static final int FORMAT_DOUBLE = 1;
    public static final int FORMAT_DOUBLE_ARRAY = 3;
    public static final int FORMAT_LONG = 2;

    @NotNull
    private static final String TAG = "DataType";
    private final boolean isStatistical;

    @NotNull
    private final String name;

    @NotNull
    private final DataProto$DataType proto;

    @NotNull
    private final Class<T> valueClass;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J-\u0010\u000f\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00150\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/ocs/wearengine/data/DataType$Companion;", "", "()V", "FORMAT_BOOLEAN", "", "FORMAT_BYTE_ARRAY", "FORMAT_DOUBLE", "FORMAT_DOUBLE_ARRAY", "FORMAT_LONG", "TAG", "", "protoDataTypeToClass", "Ljava/lang/Class;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$DataType;", "sampleFromProto", "Lcom/oplus/ocs/wearengine/data/SampleDataType;", "Lcom/oplus/ocs/wearengine/data/SampleDataPoint;", "sampleFromProto$thirdparty_impl_release", "statsFromProto", "Lcom/oplus/ocs/wearengine/data/StatsDataType;", "Lcom/oplus/ocs/wearengine/data/StatsDataPoint;", "statsFromProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDataType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataType.kt\ncom/oplus/ocs/wearengine/data/DataType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n288#2,2:158\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 DataType.kt\ncom/oplus/ocs/wearengine/data/DataType$Companion\n*L\n127#1:158,2\n135#1:160,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Class<? extends Object> protoDataTypeToClass(DataProto$DataType proto) {
            int format = proto.getFormat();
            if (format == 1) {
                return Double.TYPE;
            }
            if (format == 2) {
                return Long.TYPE;
            }
            if (format != 3) {
                if (format != 4) {
                    return format != 5 ? Void.class : byte[].class;
                }
                return Boolean.TYPE;
            }
            String name = proto.getName();
            SampleDataType<LocationData, SampleDataPoint<LocationData>> sampleDataType = SampleDataType.LOCATION;
            return Intrinsics.areEqual(name, sampleDataType.getName()) ? sampleDataType.getValueClass() : double[].class;
        }

        @NotNull
        public final SampleDataType<? extends Object, ? extends SampleDataPoint<? extends Object>> sampleFromProto$thirdparty_impl_release(@NotNull DataProto$DataType proto) {
            T next;
            Intrinsics.checkNotNullParameter(proto, "proto");
            Iterator<T> it = SampleDataType.INSTANCE.getSampleDataTypes$thirdparty_impl_release().iterator();
            do {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((SampleDataType) next).getName(), proto.getName()));
            SampleDataType<? extends Object, ? extends SampleDataPoint<? extends Object>> sampleDataType = next;
            if (sampleDataType != null) {
                return sampleDataType;
            }
            String name = proto.getName();
            Intrinsics.checkNotNullExpressionValue(name, "proto.name");
            return new SampleDataType<>(name, protoDataTypeToClass(proto));
        }

        @NotNull
        public final StatsDataType<? extends Object, ? extends StatsDataPoint<? extends Object>> statsFromProto$thirdparty_impl_release(@NotNull DataProto$DataType proto) {
            T next;
            Intrinsics.checkNotNullParameter(proto, "proto");
            Iterator<T> it = StatsDataType.INSTANCE.getStatsDataType$thirdparty_impl_release().iterator();
            do {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((StatsDataType) next).getName(), proto.getName()));
            StatsDataType<? extends Object, ? extends StatsDataPoint<? extends Object>> statsDataType = next;
            if (statsDataType != null) {
                return statsDataType;
            }
            String name = proto.getName();
            Intrinsics.checkNotNullExpressionValue(name, "proto.name");
            return new StatsDataType<>(name, protoDataTypeToClass(proto));
        }
    }

    public DataType(@NotNull String name, @NotNull Class<T> valueClass, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueClass, "valueClass");
        this.name = name;
        this.valueClass = valueClass;
        this.isStatistical = z;
        DataProto$DataType dataProto$DataTypeBuild = DataProto$DataType.newBuilder().setName(name).setFormat(classToValueFormat()).build();
        Intrinsics.checkNotNullExpressionValue(dataProto$DataTypeBuild, "newBuilder().setName(nam…sToValueFormat()).build()");
        this.proto = dataProto$DataTypeBuild;
    }

    private final int classToValueFormat() {
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(this.valueClass);
        if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return 1;
        }
        if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return 2;
        }
        if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return 4;
        }
        if (!Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
            if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                return 5;
            }
            if (!Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(LocationData.class)) && !Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(PerKMPaceData.class))) {
                throw new UnsupportedOperationException("No IPC format available for class " + this.valueClass);
            }
        }
        return 3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.ocs.wearengine.data.DataType<*, *>");
        DataType dataType = (DataType) other;
        return Intrinsics.areEqual(this.name, dataType.name) && this.isStatistical == dataType.isStatistical;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: getProto$thirdparty_impl_release, reason: from getter */
    public final DataProto$DataType getProto() {
        return this.proto;
    }

    @NotNull
    public final Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    /* JADX INFO: renamed from: isStatistical$thirdparty_impl_release, reason: from getter */
    public final boolean getIsStatistical() {
        return this.isStatistical;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final DataProto$Value toProtoFromValue$thirdparty_impl_release(@NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        DataProto$Value.Builder builder = DataProto$Value.newBuilder();
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(this.valueClass);
        if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            builder.setLongVal(((Long) value).longValue());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            builder.setDoubleVal(((Double) value).doubleValue());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            builder.setBoolVal(((Boolean) value).booleanValue());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
            builder.setByteArrayVal(ByteString.copyFrom((byte[]) value));
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
            builder.setDoubleArrayVal(DataProto$Value.DoubleArray.newBuilder().addAllDoubleArray(ArraysKt___ArraysKt.toList((double[]) value)).build());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(LocationData.class))) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            ((LocationData) value).addToValueProtoBuilder$thirdparty_impl_release(builder);
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(PerKMPaceData.class))) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            ((PerKMPaceData) value).addToValueProtoBuilder$thirdparty_impl_release(builder);
        } else {
            Log.w(TAG, "Unexpected value class " + this.valueClass.getSimpleName());
        }
        DataProto$Value dataProto$ValueBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(dataProto$ValueBuild, "builder.build()");
        return dataProto$ValueBuild;
    }

    @NotNull
    public String toString() {
        return "DataType(name=" + this.name + ", class=" + this.valueClass.getSimpleName() + ")";
    }

    @NotNull
    public final T toValueFromProto$thirdparty_impl_release(@NotNull DataProto$Value proto) {
        T t;
        Intrinsics.checkNotNullParameter(proto, "proto");
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(this.valueClass);
        if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            t = (T) Long.valueOf(proto.getLongVal());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            t = (T) Double.valueOf(proto.getDoubleVal());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            t = (T) Boolean.valueOf(proto.getBoolVal());
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
            ByteString byteArrayVal = proto.getByteArrayVal();
            t = byteArrayVal != null ? (T) byteArrayVal.toByteArray() : null;
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
            t = (T) proto.getDoubleArrayVal();
        } else if (Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(LocationData.class))) {
            t = (T) LocationData.INSTANCE.fromDataProtoValue$thirdparty_impl_release(proto);
        } else {
            if (!Intrinsics.areEqual(kotlinClass, Reflection.getOrCreateKotlinClass(PerKMPaceData.class))) {
                throw new UnsupportedOperationException("Cannot retrieve value for " + this.valueClass);
            }
            t = (T) PerKMPaceData.INSTANCE.fromDataProtoValue$thirdparty_impl_release(proto);
        }
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.oplus.ocs.wearengine.data.DataType");
        return t;
    }
}

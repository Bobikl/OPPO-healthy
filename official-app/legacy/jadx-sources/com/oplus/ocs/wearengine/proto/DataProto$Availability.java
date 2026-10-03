package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$Availability extends GeneratedMessageLite<DataProto$Availability, Builder> implements DataProto$AvailabilityOrBuilder {
    public static final int DATA_TYPE_AVAILABILITY_FIELD_NUMBER = 1;
    private static final DataProto$Availability DEFAULT_INSTANCE;
    public static final int LOCATION_AVAILABILITY_FIELD_NUMBER = 2;
    private static volatile Parser<DataProto$Availability> PARSER;
    private int availabilityCase_ = 0;
    private Object availability_;

    public enum AvailabilityCase {
        DATA_TYPE_AVAILABILITY(1),
        LOCATION_AVAILABILITY(2),
        AVAILABILITY_NOT_SET(0);

        private final int value;

        AvailabilityCase(int i) {
            this.value = i;
        }

        public static AvailabilityCase forNumber(int i) {
            if (i == 0) {
                return AVAILABILITY_NOT_SET;
            }
            if (i == 1) {
                return DATA_TYPE_AVAILABILITY;
            }
            if (i != 2) {
                return null;
            }
            return LOCATION_AVAILABILITY;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AvailabilityCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$Availability, Builder> implements DataProto$AvailabilityOrBuilder {
        public Builder clearAvailability() {
            copyOnWrite();
            ((DataProto$Availability) this.instance).clearAvailability();
            return this;
        }

        public Builder clearDataTypeAvailability() {
            copyOnWrite();
            ((DataProto$Availability) this.instance).clearDataTypeAvailability();
            return this;
        }

        public Builder clearLocationAvailability() {
            copyOnWrite();
            ((DataProto$Availability) this.instance).clearLocationAvailability();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public AvailabilityCase getAvailabilityCase() {
            return ((DataProto$Availability) this.instance).getAvailabilityCase();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public DataTypeAvailability getDataTypeAvailability() {
            return ((DataProto$Availability) this.instance).getDataTypeAvailability();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public int getDataTypeAvailabilityValue() {
            return ((DataProto$Availability) this.instance).getDataTypeAvailabilityValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public LocationAvailability getLocationAvailability() {
            return ((DataProto$Availability) this.instance).getLocationAvailability();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public int getLocationAvailabilityValue() {
            return ((DataProto$Availability) this.instance).getLocationAvailabilityValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public boolean hasDataTypeAvailability() {
            return ((DataProto$Availability) this.instance).hasDataTypeAvailability();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
        public boolean hasLocationAvailability() {
            return ((DataProto$Availability) this.instance).hasLocationAvailability();
        }

        public Builder setDataTypeAvailability(DataTypeAvailability dataTypeAvailability) {
            copyOnWrite();
            ((DataProto$Availability) this.instance).setDataTypeAvailability(dataTypeAvailability);
            return this;
        }

        public Builder setDataTypeAvailabilityValue(int i) {
            copyOnWrite();
            ((DataProto$Availability) this.instance).setDataTypeAvailabilityValue(i);
            return this;
        }

        public Builder setLocationAvailability(LocationAvailability locationAvailability) {
            copyOnWrite();
            ((DataProto$Availability) this.instance).setLocationAvailability(locationAvailability);
            return this;
        }

        public Builder setLocationAvailabilityValue(int i) {
            copyOnWrite();
            ((DataProto$Availability) this.instance).setLocationAvailabilityValue(i);
            return this;
        }

        private Builder() {
            super(DataProto$Availability.DEFAULT_INSTANCE);
        }
    }

    public enum DataTypeAvailability implements Internal.EnumLite {
        DATA_TYPE_AVAILABILITY_UNKNOWN(0),
        DATA_TYPE_AVAILABILITY_AVAILABLE(1),
        DATA_TYPE_AVAILABILITY_ACQUIRING(2),
        DATA_TYPE_AVAILABILITY_UNAVAILABLE(3),
        DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY(4),
        UNRECOGNIZED(-1);

        public static final int DATA_TYPE_AVAILABILITY_ACQUIRING_VALUE = 2;
        public static final int DATA_TYPE_AVAILABILITY_AVAILABLE_VALUE = 1;
        public static final int DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY_VALUE = 4;
        public static final int DATA_TYPE_AVAILABILITY_UNAVAILABLE_VALUE = 3;
        public static final int DATA_TYPE_AVAILABILITY_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<DataTypeAvailability> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<DataTypeAvailability> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DataTypeAvailability findValueByNumber(int i) {
                return DataTypeAvailability.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DataTypeAvailability.forNumber(i) != null;
            }
        }

        DataTypeAvailability(int i) {
            this.value = i;
        }

        public static DataTypeAvailability forNumber(int i) {
            if (i == 0) {
                return DATA_TYPE_AVAILABILITY_UNKNOWN;
            }
            if (i == 1) {
                return DATA_TYPE_AVAILABILITY_AVAILABLE;
            }
            if (i == 2) {
                return DATA_TYPE_AVAILABILITY_ACQUIRING;
            }
            if (i == 3) {
                return DATA_TYPE_AVAILABILITY_UNAVAILABLE;
            }
            if (i != 4) {
                return null;
            }
            return DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY;
        }

        public static Internal.EnumLiteMap<DataTypeAvailability> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DataTypeAvailability valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LocationAvailability implements Internal.EnumLite {
        LOCATION_AVAILABILITY_UNKNOWN(0),
        LOCATION_AVAILABILITY_UNAVAILABLE(1),
        LOCATION_AVAILABILITY_NO_GNSS(2),
        LOCATION_AVAILABILITY_ACQUIRING(3),
        LOCATION_AVAILABILITY_ACQUIRED_TETHERED(4),
        LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED(5),
        UNRECOGNIZED(-1);

        public static final int LOCATION_AVAILABILITY_ACQUIRED_TETHERED_VALUE = 4;
        public static final int LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED_VALUE = 5;
        public static final int LOCATION_AVAILABILITY_ACQUIRING_VALUE = 3;
        public static final int LOCATION_AVAILABILITY_NO_GNSS_VALUE = 2;
        public static final int LOCATION_AVAILABILITY_UNAVAILABLE_VALUE = 1;
        public static final int LOCATION_AVAILABILITY_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<LocationAvailability> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<LocationAvailability> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LocationAvailability findValueByNumber(int i) {
                return LocationAvailability.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LocationAvailability.forNumber(i) != null;
            }
        }

        LocationAvailability(int i) {
            this.value = i;
        }

        public static LocationAvailability forNumber(int i) {
            if (i == 0) {
                return LOCATION_AVAILABILITY_UNKNOWN;
            }
            if (i == 1) {
                return LOCATION_AVAILABILITY_UNAVAILABLE;
            }
            if (i == 2) {
                return LOCATION_AVAILABILITY_NO_GNSS;
            }
            if (i == 3) {
                return LOCATION_AVAILABILITY_ACQUIRING;
            }
            if (i == 4) {
                return LOCATION_AVAILABILITY_ACQUIRED_TETHERED;
            }
            if (i != 5) {
                return null;
            }
            return LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED;
        }

        public static Internal.EnumLiteMap<LocationAvailability> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LocationAvailability valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        DataProto$Availability dataProto$Availability = new DataProto$Availability();
        DEFAULT_INSTANCE = dataProto$Availability;
        GeneratedMessageLite.registerDefaultInstance(DataProto$Availability.class, dataProto$Availability);
    }

    private DataProto$Availability() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        this.availabilityCase_ = 0;
        this.availability_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataTypeAvailability() {
        if (this.availabilityCase_ == 1) {
            this.availabilityCase_ = 0;
            this.availability_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationAvailability() {
        if (this.availabilityCase_ == 2) {
            this.availabilityCase_ = 0;
            this.availability_ = null;
        }
    }

    public static DataProto$Availability getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$Availability parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Availability parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$Availability> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataTypeAvailability(DataTypeAvailability dataTypeAvailability) {
        this.availability_ = Integer.valueOf(dataTypeAvailability.getNumber());
        this.availabilityCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataTypeAvailabilityValue(int i) {
        this.availabilityCase_ = 1;
        this.availability_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationAvailability(LocationAvailability locationAvailability) {
        this.availability_ = Integer.valueOf(locationAvailability.getNumber());
        this.availabilityCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationAvailabilityValue(int i) {
        this.availabilityCase_ = 2;
        this.availability_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$Availability();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000", new Object[]{"availability_", "availabilityCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$Availability> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$Availability.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public AvailabilityCase getAvailabilityCase() {
        return AvailabilityCase.forNumber(this.availabilityCase_);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public DataTypeAvailability getDataTypeAvailability() {
        if (this.availabilityCase_ != 1) {
            return DataTypeAvailability.DATA_TYPE_AVAILABILITY_UNKNOWN;
        }
        DataTypeAvailability dataTypeAvailabilityForNumber = DataTypeAvailability.forNumber(((Integer) this.availability_).intValue());
        return dataTypeAvailabilityForNumber == null ? DataTypeAvailability.UNRECOGNIZED : dataTypeAvailabilityForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public int getDataTypeAvailabilityValue() {
        if (this.availabilityCase_ == 1) {
            return ((Integer) this.availability_).intValue();
        }
        return 0;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public LocationAvailability getLocationAvailability() {
        if (this.availabilityCase_ != 2) {
            return LocationAvailability.LOCATION_AVAILABILITY_UNKNOWN;
        }
        LocationAvailability locationAvailabilityForNumber = LocationAvailability.forNumber(((Integer) this.availability_).intValue());
        return locationAvailabilityForNumber == null ? LocationAvailability.UNRECOGNIZED : locationAvailabilityForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public int getLocationAvailabilityValue() {
        if (this.availabilityCase_ == 2) {
            return ((Integer) this.availability_).intValue();
        }
        return 0;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public boolean hasDataTypeAvailability() {
        return this.availabilityCase_ == 1;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$AvailabilityOrBuilder
    public boolean hasLocationAvailability() {
        return this.availabilityCase_ == 2;
    }

    public static Builder newBuilder(DataProto$Availability dataProto$Availability) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$Availability);
    }

    public static DataProto$Availability parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Availability parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$Availability parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$Availability parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$Availability parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$Availability parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$Availability parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Availability parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Availability parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$Availability parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Availability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

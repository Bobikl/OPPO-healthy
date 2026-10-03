package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$DataPointAccuracy extends GeneratedMessageLite<DataProto$DataPointAccuracy, Builder> implements DataProto$DataPointAccuracyOrBuilder {
    private static final DataProto$DataPointAccuracy DEFAULT_INSTANCE;
    public static final int LOCATION_ACCURACY_FIELD_NUMBER = 1;
    private static volatile Parser<DataProto$DataPointAccuracy> PARSER;
    private int accuracyCase_ = 0;
    private Object accuracy_;

    public enum AccuracyCase {
        LOCATION_ACCURACY(1),
        ACCURACY_NOT_SET(0);

        private final int value;

        AccuracyCase(int i) {
            this.value = i;
        }

        public static AccuracyCase forNumber(int i) {
            if (i == 0) {
                return ACCURACY_NOT_SET;
            }
            if (i != 1) {
                return null;
            }
            return LOCATION_ACCURACY;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AccuracyCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$DataPointAccuracy, Builder> implements DataProto$DataPointAccuracyOrBuilder {
        public Builder clearAccuracy() {
            copyOnWrite();
            ((DataProto$DataPointAccuracy) this.instance).clearAccuracy();
            return this;
        }

        public Builder clearLocationAccuracy() {
            copyOnWrite();
            ((DataProto$DataPointAccuracy) this.instance).clearLocationAccuracy();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
        public AccuracyCase getAccuracyCase() {
            return ((DataProto$DataPointAccuracy) this.instance).getAccuracyCase();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
        public LocationAccuracy getLocationAccuracy() {
            return ((DataProto$DataPointAccuracy) this.instance).getLocationAccuracy();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
        public boolean hasLocationAccuracy() {
            return ((DataProto$DataPointAccuracy) this.instance).hasLocationAccuracy();
        }

        public Builder mergeLocationAccuracy(LocationAccuracy locationAccuracy) {
            copyOnWrite();
            ((DataProto$DataPointAccuracy) this.instance).mergeLocationAccuracy(locationAccuracy);
            return this;
        }

        public Builder setLocationAccuracy(LocationAccuracy locationAccuracy) {
            copyOnWrite();
            ((DataProto$DataPointAccuracy) this.instance).setLocationAccuracy(locationAccuracy);
            return this;
        }

        private Builder() {
            super(DataProto$DataPointAccuracy.DEFAULT_INSTANCE);
        }

        public Builder setLocationAccuracy(LocationAccuracy.Builder builder) {
            copyOnWrite();
            ((DataProto$DataPointAccuracy) this.instance).setLocationAccuracy(builder.build());
            return this;
        }
    }

    public static final class LocationAccuracy extends GeneratedMessageLite<LocationAccuracy, Builder> implements LocationAccuracyOrBuilder {
        private static final LocationAccuracy DEFAULT_INSTANCE;
        public static final int HORIZONTAL_POSITION_ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<LocationAccuracy> PARSER = null;
        public static final int VERTICAL_POSITION_ERROR_FIELD_NUMBER = 2;
        private double horizontalPositionError_;
        private double verticalPositionError_;

        public static final class Builder extends GeneratedMessageLite.Builder<LocationAccuracy, Builder> implements LocationAccuracyOrBuilder {
            public Builder clearHorizontalPositionError() {
                copyOnWrite();
                ((LocationAccuracy) this.instance).clearHorizontalPositionError();
                return this;
            }

            public Builder clearVerticalPositionError() {
                copyOnWrite();
                ((LocationAccuracy) this.instance).clearVerticalPositionError();
                return this;
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy.LocationAccuracyOrBuilder
            public double getHorizontalPositionError() {
                return ((LocationAccuracy) this.instance).getHorizontalPositionError();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy.LocationAccuracyOrBuilder
            public double getVerticalPositionError() {
                return ((LocationAccuracy) this.instance).getVerticalPositionError();
            }

            public Builder setHorizontalPositionError(double d) {
                copyOnWrite();
                ((LocationAccuracy) this.instance).setHorizontalPositionError(d);
                return this;
            }

            public Builder setVerticalPositionError(double d) {
                copyOnWrite();
                ((LocationAccuracy) this.instance).setVerticalPositionError(d);
                return this;
            }

            private Builder() {
                super(LocationAccuracy.DEFAULT_INSTANCE);
            }
        }

        static {
            LocationAccuracy locationAccuracy = new LocationAccuracy();
            DEFAULT_INSTANCE = locationAccuracy;
            GeneratedMessageLite.registerDefaultInstance(LocationAccuracy.class, locationAccuracy);
        }

        private LocationAccuracy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalPositionError() {
            this.horizontalPositionError_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalPositionError() {
            this.verticalPositionError_ = 0.0d;
        }

        public static LocationAccuracy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LocationAccuracy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LocationAccuracy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LocationAccuracy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalPositionError(double d) {
            this.horizontalPositionError_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalPositionError(double d) {
            this.verticalPositionError_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = vu4.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new LocationAccuracy();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"horizontalPositionError_", "verticalPositionError_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LocationAccuracy> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (LocationAccuracy.class) {
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

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy.LocationAccuracyOrBuilder
        public double getHorizontalPositionError() {
            return this.horizontalPositionError_;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy.LocationAccuracyOrBuilder
        public double getVerticalPositionError() {
            return this.verticalPositionError_;
        }

        public static Builder newBuilder(LocationAccuracy locationAccuracy) {
            return DEFAULT_INSTANCE.createBuilder(locationAccuracy);
        }

        public static LocationAccuracy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LocationAccuracy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LocationAccuracy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LocationAccuracy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LocationAccuracy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LocationAccuracy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LocationAccuracy parseFrom(InputStream inputStream) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LocationAccuracy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LocationAccuracy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LocationAccuracy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LocationAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LocationAccuracyOrBuilder extends MessageLiteOrBuilder {
        double getHorizontalPositionError();

        double getVerticalPositionError();
    }

    static {
        DataProto$DataPointAccuracy dataProto$DataPointAccuracy = new DataProto$DataPointAccuracy();
        DEFAULT_INSTANCE = dataProto$DataPointAccuracy;
        GeneratedMessageLite.registerDefaultInstance(DataProto$DataPointAccuracy.class, dataProto$DataPointAccuracy);
    }

    private DataProto$DataPointAccuracy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracy() {
        this.accuracyCase_ = 0;
        this.accuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationAccuracy() {
        if (this.accuracyCase_ == 1) {
            this.accuracyCase_ = 0;
            this.accuracy_ = null;
        }
    }

    public static DataProto$DataPointAccuracy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationAccuracy(LocationAccuracy locationAccuracy) {
        locationAccuracy.getClass();
        if (this.accuracyCase_ != 1 || this.accuracy_ == LocationAccuracy.getDefaultInstance()) {
            this.accuracy_ = locationAccuracy;
        } else {
            this.accuracy_ = LocationAccuracy.newBuilder((LocationAccuracy) this.accuracy_).mergeFrom(locationAccuracy).buildPartial();
        }
        this.accuracyCase_ = 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$DataPointAccuracy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$DataPointAccuracy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$DataPointAccuracy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationAccuracy(LocationAccuracy locationAccuracy) {
        locationAccuracy.getClass();
        this.accuracy_ = locationAccuracy;
        this.accuracyCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$DataPointAccuracy();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"accuracy_", "accuracyCase_", LocationAccuracy.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$DataPointAccuracy> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$DataPointAccuracy.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
    public AccuracyCase getAccuracyCase() {
        return AccuracyCase.forNumber(this.accuracyCase_);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
    public LocationAccuracy getLocationAccuracy() {
        return this.accuracyCase_ == 1 ? (LocationAccuracy) this.accuracy_ : LocationAccuracy.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracyOrBuilder
    public boolean hasLocationAccuracy() {
        return this.accuracyCase_ == 1;
    }

    public static Builder newBuilder(DataProto$DataPointAccuracy dataProto$DataPointAccuracy) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$DataPointAccuracy);
    }

    public static DataProto$DataPointAccuracy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$DataPointAccuracy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$DataPointAccuracy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$DataPointAccuracy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$DataPointAccuracy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$DataPointAccuracy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$DataPointAccuracy parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$DataPointAccuracy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$DataPointAccuracy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$DataPointAccuracy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataPointAccuracy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

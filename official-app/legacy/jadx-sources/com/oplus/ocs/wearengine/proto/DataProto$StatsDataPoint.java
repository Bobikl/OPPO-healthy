package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$StatsDataPoint extends GeneratedMessageLite<DataProto$StatsDataPoint, Builder> implements DataProto$StatsDataPointOrBuilder {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final DataProto$StatsDataPoint DEFAULT_INSTANCE;
    private static volatile Parser<DataProto$StatsDataPoint> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DataProto$DataType dataType_;
    private DataProto$Value value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$StatsDataPoint, Builder> implements DataProto$StatsDataPointOrBuilder {
        public Builder clearDataType() {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).clearDataType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).clearValue();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
        public DataProto$DataType getDataType() {
            return ((DataProto$StatsDataPoint) this.instance).getDataType();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
        public DataProto$Value getValue() {
            return ((DataProto$StatsDataPoint) this.instance).getValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
        public boolean hasDataType() {
            return ((DataProto$StatsDataPoint) this.instance).hasDataType();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
        public boolean hasValue() {
            return ((DataProto$StatsDataPoint) this.instance).hasValue();
        }

        public Builder mergeDataType(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).mergeDataType(dataProto$DataType);
            return this;
        }

        public Builder mergeValue(DataProto$Value dataProto$Value) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).mergeValue(dataProto$Value);
            return this;
        }

        public Builder setDataType(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).setDataType(dataProto$DataType);
            return this;
        }

        public Builder setValue(DataProto$Value dataProto$Value) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).setValue(dataProto$Value);
            return this;
        }

        private Builder() {
            super(DataProto$StatsDataPoint.DEFAULT_INSTANCE);
        }

        public Builder setDataType(DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).setDataType(builder.build());
            return this;
        }

        public Builder setValue(DataProto$Value.Builder builder) {
            copyOnWrite();
            ((DataProto$StatsDataPoint) this.instance).setValue(builder.build());
            return this;
        }
    }

    static {
        DataProto$StatsDataPoint dataProto$StatsDataPoint = new DataProto$StatsDataPoint();
        DEFAULT_INSTANCE = dataProto$StatsDataPoint;
        GeneratedMessageLite.registerDefaultInstance(DataProto$StatsDataPoint.class, dataProto$StatsDataPoint);
    }

    private DataProto$StatsDataPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -3;
    }

    public static DataProto$StatsDataPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDataType(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        DataProto$DataType dataProto$DataType2 = this.dataType_;
        if (dataProto$DataType2 == null || dataProto$DataType2 == DataProto$DataType.getDefaultInstance()) {
            this.dataType_ = dataProto$DataType;
        } else {
            this.dataType_ = DataProto$DataType.newBuilder(this.dataType_).mergeFrom(dataProto$DataType).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(DataProto$Value dataProto$Value) {
        dataProto$Value.getClass();
        DataProto$Value dataProto$Value2 = this.value_;
        if (dataProto$Value2 == null || dataProto$Value2 == DataProto$Value.getDefaultInstance()) {
            this.value_ = dataProto$Value;
        } else {
            this.value_ = DataProto$Value.newBuilder(this.value_).mergeFrom(dataProto$Value).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$StatsDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$StatsDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$StatsDataPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataType(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        this.dataType_ = dataProto$DataType;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(DataProto$Value dataProto$Value) {
        dataProto$Value.getClass();
        this.value_ = dataProto$Value;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$StatsDataPoint();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "dataType_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$StatsDataPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$StatsDataPoint.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
    public DataProto$DataType getDataType() {
        DataProto$DataType dataProto$DataType = this.dataType_;
        return dataProto$DataType == null ? DataProto$DataType.getDefaultInstance() : dataProto$DataType;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
    public DataProto$Value getValue() {
        DataProto$Value dataProto$Value = this.value_;
        return dataProto$Value == null ? DataProto$Value.getDefaultInstance() : dataProto$Value;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
    public boolean hasDataType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$StatsDataPointOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$StatsDataPoint);
    }

    public static DataProto$StatsDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$StatsDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$StatsDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$StatsDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$StatsDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$StatsDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$StatsDataPoint parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$StatsDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$StatsDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$StatsDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$StatsDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

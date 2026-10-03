package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.juf;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class ResponsesProto$AvailabilityResponse extends GeneratedMessageLite<ResponsesProto$AvailabilityResponse, Builder> implements ResponsesProto$AvailabilityResponseOrBuilder {
    public static final int AVAILABILITY_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final ResponsesProto$AvailabilityResponse DEFAULT_INSTANCE;
    private static volatile Parser<ResponsesProto$AvailabilityResponse> PARSER;
    private DataProto$Availability availability_;
    private int bitField0_;
    private DataProto$DataType dataType_;

    public static final class Builder extends GeneratedMessageLite.Builder<ResponsesProto$AvailabilityResponse, Builder> implements ResponsesProto$AvailabilityResponseOrBuilder {
        public Builder clearAvailability() {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).clearAvailability();
            return this;
        }

        public Builder clearDataType() {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).clearDataType();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
        public DataProto$Availability getAvailability() {
            return ((ResponsesProto$AvailabilityResponse) this.instance).getAvailability();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
        public DataProto$DataType getDataType() {
            return ((ResponsesProto$AvailabilityResponse) this.instance).getDataType();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
        public boolean hasAvailability() {
            return ((ResponsesProto$AvailabilityResponse) this.instance).hasAvailability();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
        public boolean hasDataType() {
            return ((ResponsesProto$AvailabilityResponse) this.instance).hasDataType();
        }

        public Builder mergeAvailability(DataProto$Availability dataProto$Availability) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).mergeAvailability(dataProto$Availability);
            return this;
        }

        public Builder mergeDataType(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).mergeDataType(dataProto$DataType);
            return this;
        }

        public Builder setAvailability(DataProto$Availability dataProto$Availability) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).setAvailability(dataProto$Availability);
            return this;
        }

        public Builder setDataType(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).setDataType(dataProto$DataType);
            return this;
        }

        private Builder() {
            super(ResponsesProto$AvailabilityResponse.DEFAULT_INSTANCE);
        }

        public Builder setAvailability(DataProto$Availability.Builder builder) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).setAvailability(builder.build());
            return this;
        }

        public Builder setDataType(DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((ResponsesProto$AvailabilityResponse) this.instance).setDataType(builder.build());
            return this;
        }
    }

    static {
        ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse = new ResponsesProto$AvailabilityResponse();
        DEFAULT_INSTANCE = responsesProto$AvailabilityResponse;
        GeneratedMessageLite.registerDefaultInstance(ResponsesProto$AvailabilityResponse.class, responsesProto$AvailabilityResponse);
    }

    private ResponsesProto$AvailabilityResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        this.availability_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = null;
        this.bitField0_ &= -2;
    }

    public static ResponsesProto$AvailabilityResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailability(DataProto$Availability dataProto$Availability) {
        dataProto$Availability.getClass();
        DataProto$Availability dataProto$Availability2 = this.availability_;
        if (dataProto$Availability2 == null || dataProto$Availability2 == DataProto$Availability.getDefaultInstance()) {
            this.availability_ = dataProto$Availability;
        } else {
            this.availability_ = DataProto$Availability.newBuilder(this.availability_).mergeFrom(dataProto$Availability).buildPartial();
        }
        this.bitField0_ |= 2;
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResponsesProto$AvailabilityResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResponsesProto$AvailabilityResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailability(DataProto$Availability dataProto$Availability) {
        dataProto$Availability.getClass();
        this.availability_ = dataProto$Availability;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataType(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        this.dataType_ = dataProto$DataType;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = juf.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ResponsesProto$AvailabilityResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "dataType_", "availability_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResponsesProto$AvailabilityResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResponsesProto$AvailabilityResponse.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
    public DataProto$Availability getAvailability() {
        DataProto$Availability dataProto$Availability = this.availability_;
        return dataProto$Availability == null ? DataProto$Availability.getDefaultInstance() : dataProto$Availability;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
    public DataProto$DataType getDataType() {
        DataProto$DataType dataProto$DataType = this.dataType_;
        return dataProto$DataType == null ? DataProto$DataType.getDefaultInstance() : dataProto$DataType;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
    public boolean hasAvailability() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$AvailabilityResponseOrBuilder
    public boolean hasDataType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse) {
        return DEFAULT_INSTANCE.createBuilder(responsesProto$AvailabilityResponse);
    }

    public static ResponsesProto$AvailabilityResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResponsesProto$AvailabilityResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$AvailabilityResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

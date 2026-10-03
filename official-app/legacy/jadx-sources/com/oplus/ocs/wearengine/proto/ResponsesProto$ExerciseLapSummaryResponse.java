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
public final class ResponsesProto$ExerciseLapSummaryResponse extends GeneratedMessageLite<ResponsesProto$ExerciseLapSummaryResponse, Builder> implements ResponsesProto$ExerciseLapSummaryResponseOrBuilder {
    private static final ResponsesProto$ExerciseLapSummaryResponse DEFAULT_INSTANCE;
    public static final int LAP_SUMMARY_FIELD_NUMBER = 1;
    private static volatile Parser<ResponsesProto$ExerciseLapSummaryResponse> PARSER;
    private int bitField0_;
    private DataProto$ExerciseLapSummary lapSummary_;

    public static final class Builder extends GeneratedMessageLite.Builder<ResponsesProto$ExerciseLapSummaryResponse, Builder> implements ResponsesProto$ExerciseLapSummaryResponseOrBuilder {
        public Builder clearLapSummary() {
            copyOnWrite();
            ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).clearLapSummary();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseLapSummaryResponseOrBuilder
        public DataProto$ExerciseLapSummary getLapSummary() {
            return ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).getLapSummary();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseLapSummaryResponseOrBuilder
        public boolean hasLapSummary() {
            return ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).hasLapSummary();
        }

        public Builder mergeLapSummary(DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary) {
            copyOnWrite();
            ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).mergeLapSummary(dataProto$ExerciseLapSummary);
            return this;
        }

        public Builder setLapSummary(DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary) {
            copyOnWrite();
            ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).setLapSummary(dataProto$ExerciseLapSummary);
            return this;
        }

        private Builder() {
            super(ResponsesProto$ExerciseLapSummaryResponse.DEFAULT_INSTANCE);
        }

        public Builder setLapSummary(DataProto$ExerciseLapSummary.Builder builder) {
            copyOnWrite();
            ((ResponsesProto$ExerciseLapSummaryResponse) this.instance).setLapSummary(builder.build());
            return this;
        }
    }

    static {
        ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse = new ResponsesProto$ExerciseLapSummaryResponse();
        DEFAULT_INSTANCE = responsesProto$ExerciseLapSummaryResponse;
        GeneratedMessageLite.registerDefaultInstance(ResponsesProto$ExerciseLapSummaryResponse.class, responsesProto$ExerciseLapSummaryResponse);
    }

    private ResponsesProto$ExerciseLapSummaryResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLapSummary() {
        this.lapSummary_ = null;
        this.bitField0_ &= -2;
    }

    public static ResponsesProto$ExerciseLapSummaryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLapSummary(DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary) {
        dataProto$ExerciseLapSummary.getClass();
        DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary2 = this.lapSummary_;
        if (dataProto$ExerciseLapSummary2 == null || dataProto$ExerciseLapSummary2 == DataProto$ExerciseLapSummary.getDefaultInstance()) {
            this.lapSummary_ = dataProto$ExerciseLapSummary;
        } else {
            this.lapSummary_ = DataProto$ExerciseLapSummary.newBuilder(this.lapSummary_).mergeFrom(dataProto$ExerciseLapSummary).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResponsesProto$ExerciseLapSummaryResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLapSummary(DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary) {
        dataProto$ExerciseLapSummary.getClass();
        this.lapSummary_ = dataProto$ExerciseLapSummary;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = juf.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ResponsesProto$ExerciseLapSummaryResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "lapSummary_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResponsesProto$ExerciseLapSummaryResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResponsesProto$ExerciseLapSummaryResponse.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseLapSummaryResponseOrBuilder
    public DataProto$ExerciseLapSummary getLapSummary() {
        DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary = this.lapSummary_;
        return dataProto$ExerciseLapSummary == null ? DataProto$ExerciseLapSummary.getDefaultInstance() : dataProto$ExerciseLapSummary;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseLapSummaryResponseOrBuilder
    public boolean hasLapSummary() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse) {
        return DEFAULT_INSTANCE.createBuilder(responsesProto$ExerciseLapSummaryResponse);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResponsesProto$ExerciseLapSummaryResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseLapSummaryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

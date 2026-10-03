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
public final class ResponsesProto$ExerciseExtraInfoResponse extends GeneratedMessageLite<ResponsesProto$ExerciseExtraInfoResponse, Builder> implements ResponsesProto$ExerciseExtraInfoResponseOrBuilder {
    private static final ResponsesProto$ExerciseExtraInfoResponse DEFAULT_INSTANCE;
    public static final int EXTRA_INFO_FIELD_NUMBER = 1;
    private static volatile Parser<ResponsesProto$ExerciseExtraInfoResponse> PARSER;
    private int bitField0_;
    private DataProto$ExtraInfo extraInfo_;

    public static final class Builder extends GeneratedMessageLite.Builder<ResponsesProto$ExerciseExtraInfoResponse, Builder> implements ResponsesProto$ExerciseExtraInfoResponseOrBuilder {
        public Builder clearExtraInfo() {
            copyOnWrite();
            ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).clearExtraInfo();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseExtraInfoResponseOrBuilder
        public DataProto$ExtraInfo getExtraInfo() {
            return ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).getExtraInfo();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseExtraInfoResponseOrBuilder
        public boolean hasExtraInfo() {
            return ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).hasExtraInfo();
        }

        public Builder mergeExtraInfo(DataProto$ExtraInfo dataProto$ExtraInfo) {
            copyOnWrite();
            ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).mergeExtraInfo(dataProto$ExtraInfo);
            return this;
        }

        public Builder setExtraInfo(DataProto$ExtraInfo dataProto$ExtraInfo) {
            copyOnWrite();
            ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).setExtraInfo(dataProto$ExtraInfo);
            return this;
        }

        private Builder() {
            super(ResponsesProto$ExerciseExtraInfoResponse.DEFAULT_INSTANCE);
        }

        public Builder setExtraInfo(DataProto$ExtraInfo.Builder builder) {
            copyOnWrite();
            ((ResponsesProto$ExerciseExtraInfoResponse) this.instance).setExtraInfo(builder.build());
            return this;
        }
    }

    static {
        ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse = new ResponsesProto$ExerciseExtraInfoResponse();
        DEFAULT_INSTANCE = responsesProto$ExerciseExtraInfoResponse;
        GeneratedMessageLite.registerDefaultInstance(ResponsesProto$ExerciseExtraInfoResponse.class, responsesProto$ExerciseExtraInfoResponse);
    }

    private ResponsesProto$ExerciseExtraInfoResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraInfo() {
        this.extraInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static ResponsesProto$ExerciseExtraInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtraInfo(DataProto$ExtraInfo dataProto$ExtraInfo) {
        dataProto$ExtraInfo.getClass();
        DataProto$ExtraInfo dataProto$ExtraInfo2 = this.extraInfo_;
        if (dataProto$ExtraInfo2 == null || dataProto$ExtraInfo2 == DataProto$ExtraInfo.getDefaultInstance()) {
            this.extraInfo_ = dataProto$ExtraInfo;
        } else {
            this.extraInfo_ = DataProto$ExtraInfo.newBuilder(this.extraInfo_).mergeFrom(dataProto$ExtraInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResponsesProto$ExerciseExtraInfoResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraInfo(DataProto$ExtraInfo dataProto$ExtraInfo) {
        dataProto$ExtraInfo.getClass();
        this.extraInfo_ = dataProto$ExtraInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = juf.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ResponsesProto$ExerciseExtraInfoResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "extraInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResponsesProto$ExerciseExtraInfoResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResponsesProto$ExerciseExtraInfoResponse.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseExtraInfoResponseOrBuilder
    public DataProto$ExtraInfo getExtraInfo() {
        DataProto$ExtraInfo dataProto$ExtraInfo = this.extraInfo_;
        return dataProto$ExtraInfo == null ? DataProto$ExtraInfo.getDefaultInstance() : dataProto$ExtraInfo;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseExtraInfoResponseOrBuilder
    public boolean hasExtraInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse) {
        return DEFAULT_INSTANCE.createBuilder(responsesProto$ExerciseExtraInfoResponse);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResponsesProto$ExerciseExtraInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseExtraInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

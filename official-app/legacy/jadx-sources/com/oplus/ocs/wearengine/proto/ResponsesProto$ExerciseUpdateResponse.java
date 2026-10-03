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
public final class ResponsesProto$ExerciseUpdateResponse extends GeneratedMessageLite<ResponsesProto$ExerciseUpdateResponse, Builder> implements ResponsesProto$ExerciseUpdateResponseOrBuilder {
    private static final ResponsesProto$ExerciseUpdateResponse DEFAULT_INSTANCE;
    public static final int EXERCISE_UPDATE_FIELD_NUMBER = 1;
    private static volatile Parser<ResponsesProto$ExerciseUpdateResponse> PARSER;
    private int bitField0_;
    private DataProto$ExerciseUpdate exerciseUpdate_;

    public static final class Builder extends GeneratedMessageLite.Builder<ResponsesProto$ExerciseUpdateResponse, Builder> implements ResponsesProto$ExerciseUpdateResponseOrBuilder {
        public Builder clearExerciseUpdate() {
            copyOnWrite();
            ((ResponsesProto$ExerciseUpdateResponse) this.instance).clearExerciseUpdate();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseUpdateResponseOrBuilder
        public DataProto$ExerciseUpdate getExerciseUpdate() {
            return ((ResponsesProto$ExerciseUpdateResponse) this.instance).getExerciseUpdate();
        }

        @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseUpdateResponseOrBuilder
        public boolean hasExerciseUpdate() {
            return ((ResponsesProto$ExerciseUpdateResponse) this.instance).hasExerciseUpdate();
        }

        public Builder mergeExerciseUpdate(DataProto$ExerciseUpdate dataProto$ExerciseUpdate) {
            copyOnWrite();
            ((ResponsesProto$ExerciseUpdateResponse) this.instance).mergeExerciseUpdate(dataProto$ExerciseUpdate);
            return this;
        }

        public Builder setExerciseUpdate(DataProto$ExerciseUpdate dataProto$ExerciseUpdate) {
            copyOnWrite();
            ((ResponsesProto$ExerciseUpdateResponse) this.instance).setExerciseUpdate(dataProto$ExerciseUpdate);
            return this;
        }

        private Builder() {
            super(ResponsesProto$ExerciseUpdateResponse.DEFAULT_INSTANCE);
        }

        public Builder setExerciseUpdate(DataProto$ExerciseUpdate.Builder builder) {
            copyOnWrite();
            ((ResponsesProto$ExerciseUpdateResponse) this.instance).setExerciseUpdate(builder.build());
            return this;
        }
    }

    static {
        ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse = new ResponsesProto$ExerciseUpdateResponse();
        DEFAULT_INSTANCE = responsesProto$ExerciseUpdateResponse;
        GeneratedMessageLite.registerDefaultInstance(ResponsesProto$ExerciseUpdateResponse.class, responsesProto$ExerciseUpdateResponse);
    }

    private ResponsesProto$ExerciseUpdateResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseUpdate() {
        this.exerciseUpdate_ = null;
        this.bitField0_ &= -2;
    }

    public static ResponsesProto$ExerciseUpdateResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseUpdate(DataProto$ExerciseUpdate dataProto$ExerciseUpdate) {
        dataProto$ExerciseUpdate.getClass();
        DataProto$ExerciseUpdate dataProto$ExerciseUpdate2 = this.exerciseUpdate_;
        if (dataProto$ExerciseUpdate2 == null || dataProto$ExerciseUpdate2 == DataProto$ExerciseUpdate.getDefaultInstance()) {
            this.exerciseUpdate_ = dataProto$ExerciseUpdate;
        } else {
            this.exerciseUpdate_ = DataProto$ExerciseUpdate.newBuilder(this.exerciseUpdate_).mergeFrom(dataProto$ExerciseUpdate).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResponsesProto$ExerciseUpdateResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResponsesProto$ExerciseUpdateResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseUpdate(DataProto$ExerciseUpdate dataProto$ExerciseUpdate) {
        dataProto$ExerciseUpdate.getClass();
        this.exerciseUpdate_ = dataProto$ExerciseUpdate;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = juf.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ResponsesProto$ExerciseUpdateResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "exerciseUpdate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResponsesProto$ExerciseUpdateResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResponsesProto$ExerciseUpdateResponse.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseUpdateResponseOrBuilder
    public DataProto$ExerciseUpdate getExerciseUpdate() {
        DataProto$ExerciseUpdate dataProto$ExerciseUpdate = this.exerciseUpdate_;
        return dataProto$ExerciseUpdate == null ? DataProto$ExerciseUpdate.getDefaultInstance() : dataProto$ExerciseUpdate;
    }

    @Override // com.oplus.ocs.wearengine.proto.ResponsesProto$ExerciseUpdateResponseOrBuilder
    public boolean hasExerciseUpdate() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse) {
        return DEFAULT_INSTANCE.createBuilder(responsesProto$ExerciseUpdateResponse);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(InputStream inputStream) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResponsesProto$ExerciseUpdateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsesProto$ExerciseUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SyncStatusResponse extends GeneratedMessageLite<FitnessProtoV2$SyncStatusResponse, Builder> implements FitnessProtoV2$SyncStatusResponseOrBuilder {
    private static final FitnessProtoV2$SyncStatusResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$SyncStatusResponse> PARSER;
    private int errorCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SyncStatusResponse, Builder> implements FitnessProtoV2$SyncStatusResponseOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((FitnessProtoV2$SyncStatusResponse) this.instance).clearErrorCode();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SyncStatusResponseOrBuilder
        public int getErrorCode() {
            return ((FitnessProtoV2$SyncStatusResponse) this.instance).getErrorCode();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SyncStatusResponse) this.instance).setErrorCode(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SyncStatusResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SyncStatusResponse fitnessProtoV2$SyncStatusResponse = new FitnessProtoV2$SyncStatusResponse();
        DEFAULT_INSTANCE = fitnessProtoV2$SyncStatusResponse;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SyncStatusResponse.class, fitnessProtoV2$SyncStatusResponse);
    }

    private FitnessProtoV2$SyncStatusResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    public static FitnessProtoV2$SyncStatusResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SyncStatusResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SyncStatusResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SyncStatusResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SyncStatusResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SyncStatusResponse.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SyncStatusResponseOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    public static Builder newBuilder(FitnessProtoV2$SyncStatusResponse fitnessProtoV2$SyncStatusResponse) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SyncStatusResponse);
    }

    public static FitnessProtoV2$SyncStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SyncStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatusResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

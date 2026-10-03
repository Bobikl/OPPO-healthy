package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$SPO2ManualResponse extends GeneratedMessageLite<FitnessProto$SPO2ManualResponse, Builder> implements FitnessProto$SPO2ManualResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 2;
    private static final FitnessProto$SPO2ManualResponse DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SPO2ManualResponse> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int code_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SPO2ManualResponse, Builder> implements FitnessProto$SPO2ManualResponseOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((FitnessProto$SPO2ManualResponse) this.instance).clearCode();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$SPO2ManualResponse) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2ManualResponseOrBuilder
        public int getCode() {
            return ((FitnessProto$SPO2ManualResponse) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2ManualResponseOrBuilder
        public int getStartTime() {
            return ((FitnessProto$SPO2ManualResponse) this.instance).getStartTime();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((FitnessProto$SPO2ManualResponse) this.instance).setCode(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$SPO2ManualResponse) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SPO2ManualResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SPO2ManualResponse fitnessProto$SPO2ManualResponse = new FitnessProto$SPO2ManualResponse();
        DEFAULT_INSTANCE = fitnessProto$SPO2ManualResponse;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SPO2ManualResponse.class, fitnessProto$SPO2ManualResponse);
    }

    private FitnessProto$SPO2ManualResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$SPO2ManualResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SPO2ManualResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SPO2ManualResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SPO2ManualResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"startTime_", "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SPO2ManualResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SPO2ManualResponse.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2ManualResponseOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2ManualResponseOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$SPO2ManualResponse fitnessProto$SPO2ManualResponse) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SPO2ManualResponse);
    }

    public static FitnessProto$SPO2ManualResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SPO2ManualResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2ManualResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

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
public final class FitnessProto$GetDevicesSleepModelResult extends GeneratedMessageLite<FitnessProto$GetDevicesSleepModelResult, Builder> implements FitnessProto$GetDevicesSleepModelResultOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final FitnessProto$GetDevicesSleepModelResult DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$GetDevicesSleepModelResult> PARSER;
    private int code_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$GetDevicesSleepModelResult, Builder> implements FitnessProto$GetDevicesSleepModelResultOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((FitnessProto$GetDevicesSleepModelResult) this.instance).clearCode();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GetDevicesSleepModelResultOrBuilder
        public int getCode() {
            return ((FitnessProto$GetDevicesSleepModelResult) this.instance).getCode();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((FitnessProto$GetDevicesSleepModelResult) this.instance).setCode(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$GetDevicesSleepModelResult.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$GetDevicesSleepModelResult fitnessProto$GetDevicesSleepModelResult = new FitnessProto$GetDevicesSleepModelResult();
        DEFAULT_INSTANCE = fitnessProto$GetDevicesSleepModelResult;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$GetDevicesSleepModelResult.class, fitnessProto$GetDevicesSleepModelResult);
    }

    private FitnessProto$GetDevicesSleepModelResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static FitnessProto$GetDevicesSleepModelResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$GetDevicesSleepModelResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$GetDevicesSleepModelResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$GetDevicesSleepModelResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$GetDevicesSleepModelResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$GetDevicesSleepModelResult.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GetDevicesSleepModelResultOrBuilder
    public int getCode() {
        return this.code_;
    }

    public static Builder newBuilder(FitnessProto$GetDevicesSleepModelResult fitnessProto$GetDevicesSleepModelResult) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$GetDevicesSleepModelResult);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$GetDevicesSleepModelResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModelResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

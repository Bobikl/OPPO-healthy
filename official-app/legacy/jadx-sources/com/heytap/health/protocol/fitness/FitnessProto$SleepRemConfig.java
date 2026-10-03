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
public final class FitnessProto$SleepRemConfig extends GeneratedMessageLite<FitnessProto$SleepRemConfig, Builder> implements FitnessProto$SleepRemConfigOrBuilder {
    private static final FitnessProto$SleepRemConfig DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$SleepRemConfig> PARSER;
    private int enable_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepRemConfig, Builder> implements FitnessProto$SleepRemConfigOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProto$SleepRemConfig) this.instance).clearEnable();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRemConfigOrBuilder
        public int getEnable() {
            return ((FitnessProto$SleepRemConfig) this.instance).getEnable();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProto$SleepRemConfig) this.instance).setEnable(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepRemConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepRemConfig fitnessProto$SleepRemConfig = new FitnessProto$SleepRemConfig();
        DEFAULT_INSTANCE = fitnessProto$SleepRemConfig;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepRemConfig.class, fitnessProto$SleepRemConfig);
    }

    private FitnessProto$SleepRemConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    public static FitnessProto$SleepRemConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepRemConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepRemConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepRemConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepRemConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"enable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepRemConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepRemConfig.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRemConfigOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    public static Builder newBuilder(FitnessProto$SleepRemConfig fitnessProto$SleepRemConfig) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepRemConfig);
    }

    public static FitnessProto$SleepRemConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepRemConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepRemConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepRemConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepRemConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepRemConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepRemConfig parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepRemConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepRemConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepRemConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

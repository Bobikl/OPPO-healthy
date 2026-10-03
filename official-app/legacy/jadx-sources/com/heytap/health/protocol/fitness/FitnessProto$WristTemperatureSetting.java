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
public final class FitnessProto$WristTemperatureSetting extends GeneratedMessageLite<FitnessProto$WristTemperatureSetting, Builder> implements FitnessProto$WristTemperatureSettingOrBuilder {
    private static final FitnessProto$WristTemperatureSetting DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$WristTemperatureSetting> PARSER;
    private int enable_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WristTemperatureSetting, Builder> implements FitnessProto$WristTemperatureSettingOrBuilder {
        private Builder() {
            super(FitnessProto$WristTemperatureSetting.DEFAULT_INSTANCE);
        }

        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureSetting) this.instance).clearEnable();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureSettingOrBuilder
        public int getEnable() {
            return ((FitnessProto$WristTemperatureSetting) this.instance).getEnable();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureSetting) this.instance).setEnable(i);
            return this;
        }
    }

    static {
        FitnessProto$WristTemperatureSetting fitnessProto$WristTemperatureSetting = new FitnessProto$WristTemperatureSetting();
        DEFAULT_INSTANCE = fitnessProto$WristTemperatureSetting;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WristTemperatureSetting.class, fitnessProto$WristTemperatureSetting);
    }

    private FitnessProto$WristTemperatureSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    public static FitnessProto$WristTemperatureSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WristTemperatureSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$WristTemperatureSetting> parser() {
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
                return new FitnessProto$WristTemperatureSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"enable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WristTemperatureSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WristTemperatureSetting.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureSettingOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    public static Builder newBuilder(FitnessProto$WristTemperatureSetting fitnessProto$WristTemperatureSetting) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WristTemperatureSetting);
    }

    public static FitnessProto$WristTemperatureSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WristTemperatureSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

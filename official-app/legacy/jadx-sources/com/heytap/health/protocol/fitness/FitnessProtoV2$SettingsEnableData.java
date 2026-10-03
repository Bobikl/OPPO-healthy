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
public final class FitnessProtoV2$SettingsEnableData extends GeneratedMessageLite<FitnessProtoV2$SettingsEnableData, Builder> implements FitnessProtoV2$SettingsEnableDataOrBuilder {
    private static final FitnessProtoV2$SettingsEnableData DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$SettingsEnableData> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    private int enable_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SettingsEnableData, Builder> implements FitnessProtoV2$SettingsEnableDataOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableData) this.instance).clearEnable();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableData) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableDataOrBuilder
        public int getEnable() {
            return ((FitnessProtoV2$SettingsEnableData) this.instance).getEnable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableDataOrBuilder
        public int getTime() {
            return ((FitnessProtoV2$SettingsEnableData) this.instance).getTime();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableData) this.instance).setEnable(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableData) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SettingsEnableData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = new FitnessProtoV2$SettingsEnableData();
        DEFAULT_INSTANCE = fitnessProtoV2$SettingsEnableData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SettingsEnableData.class, fitnessProtoV2$SettingsEnableData);
    }

    private FitnessProtoV2$SettingsEnableData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProtoV2$SettingsEnableData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SettingsEnableData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SettingsEnableData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SettingsEnableData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"enable_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SettingsEnableData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SettingsEnableData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableDataOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableDataOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SettingsEnableData);
    }

    public static FitnessProtoV2$SettingsEnableData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SettingsEnableData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

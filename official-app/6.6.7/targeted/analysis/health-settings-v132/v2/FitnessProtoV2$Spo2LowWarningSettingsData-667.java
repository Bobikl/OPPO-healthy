package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$Spo2LowWarningSettingsData extends GeneratedMessageLite<FitnessProtoV2$Spo2LowWarningSettingsData, Builder> implements FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder {
    private static final FitnessProtoV2$Spo2LowWarningSettingsData DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$Spo2LowWarningSettingsData> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int enable_;
    private int time_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$Spo2LowWarningSettingsData, Builder> implements FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearEnable();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearTime();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
        public int getEnable() {
            return ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).getEnable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
        public int getTime() {
            return ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).getTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
        public int getValue() {
            return ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).getValue();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).setEnable(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).setTime(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2LowWarningSettingsData) ((GeneratedMessageLite.Builder) this).instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$Spo2LowWarningSettingsData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData = new FitnessProtoV2$Spo2LowWarningSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$Spo2LowWarningSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$Spo2LowWarningSettingsData.class, fitnessProtoV2$Spo2LowWarningSettingsData);
    }

    private FitnessProtoV2$Spo2LowWarningSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$Spo2LowWarningSettingsData> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$Spo2LowWarningSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"enable_", "value_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$Spo2LowWarningSettingsData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2LowWarningSettingsDataOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$Spo2LowWarningSettingsData);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$Spo2LowWarningSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2LowWarningSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
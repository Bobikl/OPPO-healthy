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
public final class FitnessProtoV2$SettingsCommonData extends GeneratedMessageLite<FitnessProtoV2$SettingsCommonData, Builder> implements FitnessProtoV2$SettingsCommonDataOrBuilder {
    private static final FitnessProtoV2$SettingsCommonData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SettingsCommonData> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int time_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SettingsCommonData, Builder> implements FitnessProtoV2$SettingsCommonDataOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsCommonData) this.instance).clearTime();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsCommonData) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsCommonDataOrBuilder
        public int getTime() {
            return ((FitnessProtoV2$SettingsCommonData) this.instance).getTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsCommonDataOrBuilder
        public int getValue() {
            return ((FitnessProtoV2$SettingsCommonData) this.instance).getValue();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsCommonData) this.instance).setTime(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsCommonData) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SettingsCommonData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SettingsCommonData fitnessProtoV2$SettingsCommonData = new FitnessProtoV2$SettingsCommonData();
        DEFAULT_INSTANCE = fitnessProtoV2$SettingsCommonData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SettingsCommonData.class, fitnessProtoV2$SettingsCommonData);
    }

    private FitnessProtoV2$SettingsCommonData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProtoV2$SettingsCommonData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SettingsCommonData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SettingsCommonData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SettingsCommonData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"value_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SettingsCommonData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SettingsCommonData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsCommonDataOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsCommonDataOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProtoV2$SettingsCommonData fitnessProtoV2$SettingsCommonData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SettingsCommonData);
    }

    public static FitnessProtoV2$SettingsCommonData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SettingsCommonData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

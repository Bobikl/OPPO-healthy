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
public final class FitnessProtoV2$MeditationBreathGoalSettingsData extends GeneratedMessageLite<FitnessProtoV2$MeditationBreathGoalSettingsData, Builder> implements FitnessProtoV2$MeditationBreathGoalSettingsDataOrBuilder {
    private static final FitnessProtoV2$MeditationBreathGoalSettingsData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$MeditationBreathGoalSettingsData> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$MeditationBreathGoalSettingsData, Builder> implements FitnessProtoV2$MeditationBreathGoalSettingsDataOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProtoV2$MeditationBreathGoalSettingsData) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$MeditationBreathGoalSettingsDataOrBuilder
        public int getValue() {
            return ((FitnessProtoV2$MeditationBreathGoalSettingsData) this.instance).getValue();
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$MeditationBreathGoalSettingsData) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$MeditationBreathGoalSettingsData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$MeditationBreathGoalSettingsData fitnessProtoV2$MeditationBreathGoalSettingsData = new FitnessProtoV2$MeditationBreathGoalSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$MeditationBreathGoalSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$MeditationBreathGoalSettingsData.class, fitnessProtoV2$MeditationBreathGoalSettingsData);
    }

    private FitnessProtoV2$MeditationBreathGoalSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$MeditationBreathGoalSettingsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return new FitnessProtoV2$MeditationBreathGoalSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$MeditationBreathGoalSettingsData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$MeditationBreathGoalSettingsData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$MeditationBreathGoalSettingsDataOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProtoV2$MeditationBreathGoalSettingsData fitnessProtoV2$MeditationBreathGoalSettingsData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$MeditationBreathGoalSettingsData);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$MeditationBreathGoalSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$MeditationBreathGoalSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

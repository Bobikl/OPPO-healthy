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
public final class FitnessProtoV2$QuietHeartRateSettingsData extends GeneratedMessageLite<FitnessProtoV2$QuietHeartRateSettingsData, Builder> implements FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder {
    private static final FitnessProtoV2$QuietHeartRateSettingsData DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    public static final int HIGHVALUE_FIELD_NUMBER = 2;
    public static final int LOWVALUE_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProtoV2$QuietHeartRateSettingsData> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 4;
    private int enable_;
    private int highValue_;
    private int lowValue_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$QuietHeartRateSettingsData, Builder> implements FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).clearEnable();
            return this;
        }

        public Builder clearHighValue() {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).clearHighValue();
            return this;
        }

        public Builder clearLowValue() {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).clearLowValue();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
        public int getEnable() {
            return ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).getEnable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
        public int getHighValue() {
            return ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).getHighValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
        public int getLowValue() {
            return ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).getLowValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
        public int getTime() {
            return ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).getTime();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).setEnable(i);
            return this;
        }

        public Builder setHighValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).setHighValue(i);
            return this;
        }

        public Builder setLowValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).setLowValue(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$QuietHeartRateSettingsData) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$QuietHeartRateSettingsData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData = new FitnessProtoV2$QuietHeartRateSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$QuietHeartRateSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$QuietHeartRateSettingsData.class, fitnessProtoV2$QuietHeartRateSettingsData);
    }

    private FitnessProtoV2$QuietHeartRateSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighValue() {
        this.highValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowValue() {
        this.lowValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$QuietHeartRateSettingsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighValue(int i) {
        this.highValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowValue(int i) {
        this.lowValue_ = i;
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
                return new FitnessProtoV2$QuietHeartRateSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"enable_", "highValue_", "lowValue_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$QuietHeartRateSettingsData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$QuietHeartRateSettingsData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
    public int getHighValue() {
        return this.highValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
    public int getLowValue() {
        return this.lowValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$QuietHeartRateSettingsDataOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$QuietHeartRateSettingsData);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$QuietHeartRateSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$QuietHeartRateSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

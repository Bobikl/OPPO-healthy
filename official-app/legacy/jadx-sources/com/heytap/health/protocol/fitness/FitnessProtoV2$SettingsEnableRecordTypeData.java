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
public final class FitnessProtoV2$SettingsEnableRecordTypeData extends GeneratedMessageLite<FitnessProtoV2$SettingsEnableRecordTypeData, Builder> implements FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder {
    private static final FitnessProtoV2$SettingsEnableRecordTypeData DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$SettingsEnableRecordTypeData> PARSER = null;
    public static final int RECORDTYPE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 3;
    private int enable_;
    private int recordType_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SettingsEnableRecordTypeData, Builder> implements FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).clearEnable();
            return this;
        }

        public Builder clearRecordType() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).clearRecordType();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
        public int getEnable() {
            return ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).getEnable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
        public int getRecordType() {
            return ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).getRecordType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
        public int getTime() {
            return ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).getTime();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).setEnable(i);
            return this;
        }

        public Builder setRecordType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).setRecordType(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SettingsEnableRecordTypeData) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SettingsEnableRecordTypeData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SettingsEnableRecordTypeData fitnessProtoV2$SettingsEnableRecordTypeData = new FitnessProtoV2$SettingsEnableRecordTypeData();
        DEFAULT_INSTANCE = fitnessProtoV2$SettingsEnableRecordTypeData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SettingsEnableRecordTypeData.class, fitnessProtoV2$SettingsEnableRecordTypeData);
    }

    private FitnessProtoV2$SettingsEnableRecordTypeData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecordType() {
        this.recordType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SettingsEnableRecordTypeData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordType(int i) {
        this.recordType_ = i;
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
                return new FitnessProtoV2$SettingsEnableRecordTypeData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"enable_", "recordType_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SettingsEnableRecordTypeData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SettingsEnableRecordTypeData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
    public int getRecordType() {
        return this.recordType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SettingsEnableRecordTypeDataOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProtoV2$SettingsEnableRecordTypeData fitnessProtoV2$SettingsEnableRecordTypeData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SettingsEnableRecordTypeData);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SettingsEnableRecordTypeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SettingsEnableRecordTypeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

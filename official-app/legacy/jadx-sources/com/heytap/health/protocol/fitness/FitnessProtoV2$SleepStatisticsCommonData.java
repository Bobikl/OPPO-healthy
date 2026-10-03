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
public final class FitnessProtoV2$SleepStatisticsCommonData extends GeneratedMessageLite<FitnessProtoV2$SleepStatisticsCommonData, Builder> implements FitnessProtoV2$SleepStatisticsCommonDataOrBuilder {
    public static final int BASE_DATA_FIELD_NUMBER = 1;
    public static final int BASE_RANGE_HIGHT_FIELD_NUMBER = 3;
    public static final int BASE_RANGE_LOW_FIELD_NUMBER = 2;
    public static final int BASE_REASONABLE_RANGE_HIGHT_FIELD_NUMBER = 5;
    public static final int BASE_REASONABLE_RANGE_LOW_FIELD_NUMBER = 4;
    private static final FitnessProtoV2$SleepStatisticsCommonData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SleepStatisticsCommonData> PARSER;
    private int baseData_;
    private int baseRangeHight_;
    private int baseRangeLow_;
    private int baseReasonableRangeHight_;
    private int baseReasonableRangeLow_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SleepStatisticsCommonData, Builder> implements FitnessProtoV2$SleepStatisticsCommonDataOrBuilder {
        public Builder clearBaseData() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).clearBaseData();
            return this;
        }

        public Builder clearBaseRangeHight() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).clearBaseRangeHight();
            return this;
        }

        public Builder clearBaseRangeLow() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).clearBaseRangeLow();
            return this;
        }

        public Builder clearBaseReasonableRangeHight() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).clearBaseReasonableRangeHight();
            return this;
        }

        public Builder clearBaseReasonableRangeLow() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).clearBaseReasonableRangeLow();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
        public int getBaseData() {
            return ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).getBaseData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
        public int getBaseRangeHight() {
            return ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).getBaseRangeHight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
        public int getBaseRangeLow() {
            return ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).getBaseRangeLow();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
        public int getBaseReasonableRangeHight() {
            return ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).getBaseReasonableRangeHight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
        public int getBaseReasonableRangeLow() {
            return ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).getBaseReasonableRangeLow();
        }

        public Builder setBaseData(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).setBaseData(i);
            return this;
        }

        public Builder setBaseRangeHight(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).setBaseRangeHight(i);
            return this;
        }

        public Builder setBaseRangeLow(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).setBaseRangeLow(i);
            return this;
        }

        public Builder setBaseReasonableRangeHight(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).setBaseReasonableRangeHight(i);
            return this;
        }

        public Builder setBaseReasonableRangeLow(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsCommonData) this.instance).setBaseReasonableRangeLow(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SleepStatisticsCommonData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData = new FitnessProtoV2$SleepStatisticsCommonData();
        DEFAULT_INSTANCE = fitnessProtoV2$SleepStatisticsCommonData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SleepStatisticsCommonData.class, fitnessProtoV2$SleepStatisticsCommonData);
    }

    private FitnessProtoV2$SleepStatisticsCommonData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseData() {
        this.baseData_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseRangeHight() {
        this.baseRangeHight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseRangeLow() {
        this.baseRangeLow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseReasonableRangeHight() {
        this.baseReasonableRangeHight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseReasonableRangeLow() {
        this.baseReasonableRangeLow_ = 0;
    }

    public static FitnessProtoV2$SleepStatisticsCommonData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SleepStatisticsCommonData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseData(int i) {
        this.baseData_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseRangeHight(int i) {
        this.baseRangeHight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseRangeLow(int i) {
        this.baseRangeLow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseReasonableRangeHight(int i) {
        this.baseReasonableRangeHight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseReasonableRangeLow(int i) {
        this.baseReasonableRangeLow_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SleepStatisticsCommonData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"baseData_", "baseRangeLow_", "baseRangeHight_", "baseReasonableRangeLow_", "baseReasonableRangeHight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SleepStatisticsCommonData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SleepStatisticsCommonData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
    public int getBaseData() {
        return this.baseData_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
    public int getBaseRangeHight() {
        return this.baseRangeHight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
    public int getBaseRangeLow() {
        return this.baseRangeLow_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
    public int getBaseReasonableRangeHight() {
        return this.baseReasonableRangeHight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsCommonDataOrBuilder
    public int getBaseReasonableRangeLow() {
        return this.baseReasonableRangeLow_;
    }

    public static Builder newBuilder(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SleepStatisticsCommonData);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SleepStatisticsCommonData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsCommonData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

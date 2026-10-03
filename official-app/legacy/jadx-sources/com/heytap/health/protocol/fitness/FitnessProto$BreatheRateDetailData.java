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
public final class FitnessProto$BreatheRateDetailData extends GeneratedMessageLite<FitnessProto$BreatheRateDetailData, Builder> implements FitnessProto$BreatheRateDetailDataOrBuilder {
    public static final int BREATHE_DATA_FIELD_NUMBER = 2;
    private static final FitnessProto$BreatheRateDetailData DEFAULT_INSTANCE;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$BreatheRateDetailData> PARSER;
    private int breatheData_;
    private int minuteOffset_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BreatheRateDetailData, Builder> implements FitnessProto$BreatheRateDetailDataOrBuilder {
        public Builder clearBreatheData() {
            copyOnWrite();
            ((FitnessProto$BreatheRateDetailData) this.instance).clearBreatheData();
            return this;
        }

        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProto$BreatheRateDetailData) this.instance).clearMinuteOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateDetailDataOrBuilder
        public int getBreatheData() {
            return ((FitnessProto$BreatheRateDetailData) this.instance).getBreatheData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateDetailDataOrBuilder
        public int getMinuteOffset() {
            return ((FitnessProto$BreatheRateDetailData) this.instance).getMinuteOffset();
        }

        public Builder setBreatheData(int i) {
            copyOnWrite();
            ((FitnessProto$BreatheRateDetailData) this.instance).setBreatheData(i);
            return this;
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProto$BreatheRateDetailData) this.instance).setMinuteOffset(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BreatheRateDetailData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BreatheRateDetailData fitnessProto$BreatheRateDetailData = new FitnessProto$BreatheRateDetailData();
        DEFAULT_INSTANCE = fitnessProto$BreatheRateDetailData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BreatheRateDetailData.class, fitnessProto$BreatheRateDetailData);
    }

    private FitnessProto$BreatheRateDetailData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreatheData() {
        this.breatheData_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    public static FitnessProto$BreatheRateDetailData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BreatheRateDetailData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BreatheRateDetailData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreatheData(int i) {
        this.breatheData_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$BreatheRateDetailData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minuteOffset_", "breatheData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BreatheRateDetailData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BreatheRateDetailData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateDetailDataOrBuilder
    public int getBreatheData() {
        return this.breatheData_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateDetailDataOrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    public static Builder newBuilder(FitnessProto$BreatheRateDetailData fitnessProto$BreatheRateDetailData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BreatheRateDetailData);
    }

    public static FitnessProto$BreatheRateDetailData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BreatheRateDetailData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

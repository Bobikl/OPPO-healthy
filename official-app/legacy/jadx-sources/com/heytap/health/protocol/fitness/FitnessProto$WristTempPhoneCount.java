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
public final class FitnessProto$WristTempPhoneCount extends GeneratedMessageLite<FitnessProto$WristTempPhoneCount, Builder> implements FitnessProto$WristTempPhoneCountOrBuilder {
    public static final int BASELINEDAY_FIELD_NUMBER = 4;
    public static final int CONFIDENCE_FIELD_NUMBER = 3;
    private static final FitnessProto$WristTempPhoneCount DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$WristTempPhoneCount> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TYPICALVALUE_FIELD_NUMBER = 2;
    private int baselineDay_;
    private int confidence_;
    private int timestamp_;
    private int typicalValue_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WristTempPhoneCount, Builder> implements FitnessProto$WristTempPhoneCountOrBuilder {
        private Builder() {
            super(FitnessProto$WristTempPhoneCount.DEFAULT_INSTANCE);
        }

        public Builder clearBaselineDay() {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).clearBaselineDay();
            return this;
        }

        public Builder clearConfidence() {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).clearConfidence();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTypicalValue() {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).clearTypicalValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
        public int getBaselineDay() {
            return ((FitnessProto$WristTempPhoneCount) this.instance).getBaselineDay();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
        public int getConfidence() {
            return ((FitnessProto$WristTempPhoneCount) this.instance).getConfidence();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$WristTempPhoneCount) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
        public int getTypicalValue() {
            return ((FitnessProto$WristTempPhoneCount) this.instance).getTypicalValue();
        }

        public Builder setBaselineDay(int i) {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).setBaselineDay(i);
            return this;
        }

        public Builder setConfidence(int i) {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).setConfidence(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTypicalValue(int i) {
            copyOnWrite();
            ((FitnessProto$WristTempPhoneCount) this.instance).setTypicalValue(i);
            return this;
        }
    }

    static {
        FitnessProto$WristTempPhoneCount fitnessProto$WristTempPhoneCount = new FitnessProto$WristTempPhoneCount();
        DEFAULT_INSTANCE = fitnessProto$WristTempPhoneCount;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WristTempPhoneCount.class, fitnessProto$WristTempPhoneCount);
    }

    private FitnessProto$WristTempPhoneCount() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaselineDay() {
        this.baselineDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidence() {
        this.confidence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypicalValue() {
        this.typicalValue_ = 0;
    }

    public static FitnessProto$WristTempPhoneCount getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WristTempPhoneCount parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$WristTempPhoneCount> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaselineDay(int i) {
        this.baselineDay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidence(int i) {
        this.confidence_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypicalValue(int i) {
        this.typicalValue_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WristTempPhoneCount();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"timestamp_", "typicalValue_", "confidence_", "baselineDay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WristTempPhoneCount> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WristTempPhoneCount.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
    public int getBaselineDay() {
        return this.baselineDay_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
    public int getConfidence() {
        return this.confidence_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTempPhoneCountOrBuilder
    public int getTypicalValue() {
        return this.typicalValue_;
    }

    public static Builder newBuilder(FitnessProto$WristTempPhoneCount fitnessProto$WristTempPhoneCount) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WristTempPhoneCount);
    }

    public static FitnessProto$WristTempPhoneCount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WristTempPhoneCount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTempPhoneCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

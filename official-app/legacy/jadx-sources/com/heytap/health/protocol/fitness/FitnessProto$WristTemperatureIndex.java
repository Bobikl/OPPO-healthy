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
public final class FitnessProto$WristTemperatureIndex extends GeneratedMessageLite<FitnessProto$WristTemperatureIndex, Builder> implements FitnessProto$WristTemperatureIndexOrBuilder {
    public static final int BASELINE_DAY_FIELD_NUMBER = 4;
    public static final int BEHAVIORS_FIELD_NUMBER = 6;
    public static final int CONFIDENCE_FIELD_NUMBER = 3;
    private static final FitnessProto$WristTemperatureIndex DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$WristTemperatureIndex> PARSER = null;
    public static final int SYMPTOMS_FIELD_NUMBER = 5;
    public static final int TIME_STAMP_FIELD_NUMBER = 1;
    public static final int TYPICAL_VALUE_FIELD_NUMBER = 2;
    private int baselineDay_;
    private int behaviors_;
    private int confidence_;
    private int symptoms_;
    private int timeStamp_;
    private int typicalValue_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WristTemperatureIndex, Builder> implements FitnessProto$WristTemperatureIndexOrBuilder {
        private Builder() {
            super(FitnessProto$WristTemperatureIndex.DEFAULT_INSTANCE);
        }

        public Builder clearBaselineDay() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearBaselineDay();
            return this;
        }

        public Builder clearBehaviors() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearBehaviors();
            return this;
        }

        public Builder clearConfidence() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearConfidence();
            return this;
        }

        public Builder clearSymptoms() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearSymptoms();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearTimeStamp();
            return this;
        }

        public Builder clearTypicalValue() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).clearTypicalValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getBaselineDay() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getBaselineDay();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getBehaviors() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getBehaviors();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getConfidence() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getConfidence();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getSymptoms() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getSymptoms();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getTimeStamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
        public int getTypicalValue() {
            return ((FitnessProto$WristTemperatureIndex) this.instance).getTypicalValue();
        }

        public Builder setBaselineDay(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setBaselineDay(i);
            return this;
        }

        public Builder setBehaviors(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setBehaviors(i);
            return this;
        }

        public Builder setConfidence(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setConfidence(i);
            return this;
        }

        public Builder setSymptoms(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setSymptoms(i);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setTimeStamp(i);
            return this;
        }

        public Builder setTypicalValue(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureIndex) this.instance).setTypicalValue(i);
            return this;
        }
    }

    static {
        FitnessProto$WristTemperatureIndex fitnessProto$WristTemperatureIndex = new FitnessProto$WristTemperatureIndex();
        DEFAULT_INSTANCE = fitnessProto$WristTemperatureIndex;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WristTemperatureIndex.class, fitnessProto$WristTemperatureIndex);
    }

    private FitnessProto$WristTemperatureIndex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaselineDay() {
        this.baselineDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBehaviors() {
        this.behaviors_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidence() {
        this.confidence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptoms() {
        this.symptoms_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypicalValue() {
        this.typicalValue_ = 0;
    }

    public static FitnessProto$WristTemperatureIndex getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WristTemperatureIndex parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$WristTemperatureIndex> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaselineDay(int i) {
        this.baselineDay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBehaviors(int i) {
        this.behaviors_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidence(int i) {
        this.confidence_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptoms(int i) {
        this.symptoms_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
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
                return new FitnessProto$WristTemperatureIndex();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b", new Object[]{"timeStamp_", "typicalValue_", "confidence_", "baselineDay_", "symptoms_", "behaviors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WristTemperatureIndex> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WristTemperatureIndex.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getBaselineDay() {
        return this.baselineDay_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getBehaviors() {
        return this.behaviors_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getConfidence() {
        return this.confidence_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getSymptoms() {
        return this.symptoms_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureIndexOrBuilder
    public int getTypicalValue() {
        return this.typicalValue_;
    }

    public static Builder newBuilder(FitnessProto$WristTemperatureIndex fitnessProto$WristTemperatureIndex) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WristTemperatureIndex);
    }

    public static FitnessProto$WristTemperatureIndex parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WristTemperatureIndex parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

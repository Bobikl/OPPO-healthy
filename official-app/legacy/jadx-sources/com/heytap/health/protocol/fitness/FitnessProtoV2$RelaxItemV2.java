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
public final class FitnessProtoV2$RelaxItemV2 extends GeneratedMessageLite<FitnessProtoV2$RelaxItemV2, Builder> implements FitnessProtoV2$RelaxItemV2OrBuilder {
    private static final FitnessProtoV2$RelaxItemV2 DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int HEART_RATE_MAX_FIELD_NUMBER = 6;
    public static final int HEART_RATE_MIN_FIELD_NUMBER = 5;
    private static volatile Parser<FitnessProtoV2$RelaxItemV2> PARSER = null;
    public static final int PHYSICAL_MENTAL_FIELD_NUMBER = 8;
    public static final int PHYSICAL_MENTAL_STATE_FIELD_NUMBER = 9;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int STRESS_AVG_FIELD_NUMBER = 7;
    public static final int SUB_TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int duration_;
    private int heartRateMax_;
    private int heartRateMin_;
    private int physicalMentalState_;
    private int physicalMental_;
    private int startTime_;
    private int stressAvg_;
    private int subType_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$RelaxItemV2, Builder> implements FitnessProtoV2$RelaxItemV2OrBuilder {
        public Builder clearDuration() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearDuration();
            return this;
        }

        public Builder clearHeartRateMax() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearHeartRateMax();
            return this;
        }

        public Builder clearHeartRateMin() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearHeartRateMin();
            return this;
        }

        public Builder clearPhysicalMental() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearPhysicalMental();
            return this;
        }

        public Builder clearPhysicalMentalState() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearPhysicalMentalState();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearStartTime();
            return this;
        }

        public Builder clearStressAvg() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearStressAvg();
            return this;
        }

        public Builder clearSubType() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearSubType();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getDuration() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getHeartRateMax() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getHeartRateMax();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getHeartRateMin() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getHeartRateMin();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getPhysicalMental() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getPhysicalMental();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getPhysicalMentalState() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getPhysicalMentalState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getStartTime() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getStressAvg() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getStressAvg();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getSubType() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getSubType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
        public int getType() {
            return ((FitnessProtoV2$RelaxItemV2) this.instance).getType();
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setDuration(i);
            return this;
        }

        public Builder setHeartRateMax(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setHeartRateMax(i);
            return this;
        }

        public Builder setHeartRateMin(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setHeartRateMin(i);
            return this;
        }

        public Builder setPhysicalMental(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setPhysicalMental(i);
            return this;
        }

        public Builder setPhysicalMentalState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setPhysicalMentalState(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setStartTime(i);
            return this;
        }

        public Builder setStressAvg(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setStressAvg(i);
            return this;
        }

        public Builder setSubType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setSubType(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RelaxItemV2) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$RelaxItemV2.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$RelaxItemV2 fitnessProtoV2$RelaxItemV2 = new FitnessProtoV2$RelaxItemV2();
        DEFAULT_INSTANCE = fitnessProtoV2$RelaxItemV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$RelaxItemV2.class, fitnessProtoV2$RelaxItemV2);
    }

    private FitnessProtoV2$RelaxItemV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateMax() {
        this.heartRateMax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateMin() {
        this.heartRateMin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhysicalMental() {
        this.physicalMental_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhysicalMentalState() {
        this.physicalMentalState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressAvg() {
        this.stressAvg_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProtoV2$RelaxItemV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$RelaxItemV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$RelaxItemV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateMax(int i) {
        this.heartRateMax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateMin(int i) {
        this.heartRateMin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalMental(int i) {
        this.physicalMental_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalMentalState(int i) {
        this.physicalMentalState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressAvg(int i) {
        this.stressAvg_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(int i) {
        this.subType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$RelaxItemV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u000b\t\u000b", new Object[]{"type_", "subType_", "startTime_", "duration_", "heartRateMin_", "heartRateMax_", "stressAvg_", "physicalMental_", "physicalMentalState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$RelaxItemV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$RelaxItemV2.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getHeartRateMax() {
        return this.heartRateMax_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getHeartRateMin() {
        return this.heartRateMin_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getPhysicalMental() {
        return this.physicalMental_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getPhysicalMentalState() {
        return this.physicalMentalState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getStressAvg() {
        return this.stressAvg_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getSubType() {
        return this.subType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RelaxItemV2OrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProtoV2$RelaxItemV2 fitnessProtoV2$RelaxItemV2) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$RelaxItemV2);
    }

    public static FitnessProtoV2$RelaxItemV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$RelaxItemV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RelaxItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

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
public final class FitnessProto$IntervalData extends GeneratedMessageLite<FitnessProto$IntervalData, Builder> implements FitnessProto$IntervalDataOrBuilder {
    public static final int CADENCE_FIELD_NUMBER = 3;
    private static final FitnessProto$IntervalData DEFAULT_INSTANCE;
    public static final int HR_FIELD_NUMBER = 1;
    public static final int PACE_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$IntervalData> PARSER;
    private int bitField0_;
    private FitnessProto$TargetRangeItem cadence_;
    private FitnessProto$RangeHeartRate hr_;
    private FitnessProto$TargetRangeItem pace_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$IntervalData, Builder> implements FitnessProto$IntervalDataOrBuilder {
        private Builder() {
            super(FitnessProto$IntervalData.DEFAULT_INSTANCE);
        }

        public Builder clearCadence() {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).clearCadence();
            return this;
        }

        public Builder clearHr() {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).clearHr();
            return this;
        }

        public Builder clearPace() {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).clearPace();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public FitnessProto$TargetRangeItem getCadence() {
            return ((FitnessProto$IntervalData) this.instance).getCadence();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public FitnessProto$RangeHeartRate getHr() {
            return ((FitnessProto$IntervalData) this.instance).getHr();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public FitnessProto$TargetRangeItem getPace() {
            return ((FitnessProto$IntervalData) this.instance).getPace();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public boolean hasCadence() {
            return ((FitnessProto$IntervalData) this.instance).hasCadence();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public boolean hasHr() {
            return ((FitnessProto$IntervalData) this.instance).hasHr();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
        public boolean hasPace() {
            return ((FitnessProto$IntervalData) this.instance).hasPace();
        }

        public Builder mergeCadence(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).mergeCadence(fitnessProto$TargetRangeItem);
            return this;
        }

        public Builder mergeHr(FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).mergeHr(fitnessProto$RangeHeartRate);
            return this;
        }

        public Builder mergePace(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).mergePace(fitnessProto$TargetRangeItem);
            return this;
        }

        public Builder setCadence(FitnessProto$TargetRangeItem.Builder builder) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setCadence(builder.build());
            return this;
        }

        public Builder setHr(FitnessProto$RangeHeartRate.Builder builder) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setHr(builder.build());
            return this;
        }

        public Builder setPace(FitnessProto$TargetRangeItem.Builder builder) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setPace(builder.build());
            return this;
        }

        public Builder setCadence(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setCadence(fitnessProto$TargetRangeItem);
            return this;
        }

        public Builder setHr(FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setHr(fitnessProto$RangeHeartRate);
            return this;
        }

        public Builder setPace(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
            copyOnWrite();
            ((FitnessProto$IntervalData) this.instance).setPace(fitnessProto$TargetRangeItem);
            return this;
        }
    }

    static {
        FitnessProto$IntervalData fitnessProto$IntervalData = new FitnessProto$IntervalData();
        DEFAULT_INSTANCE = fitnessProto$IntervalData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$IntervalData.class, fitnessProto$IntervalData);
    }

    private FitnessProto$IntervalData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCadence() {
        this.cadence_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHr() {
        this.hr_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPace() {
        this.pace_ = null;
        this.bitField0_ &= -3;
    }

    public static FitnessProto$IntervalData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCadence(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
        fitnessProto$TargetRangeItem.getClass();
        FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem2 = this.cadence_;
        if (fitnessProto$TargetRangeItem2 != null && fitnessProto$TargetRangeItem2 != FitnessProto$TargetRangeItem.getDefaultInstance()) {
            fitnessProto$TargetRangeItem = FitnessProto$TargetRangeItem.newBuilder(this.cadence_).mergeFrom(fitnessProto$TargetRangeItem).buildPartial();
        }
        this.cadence_ = fitnessProto$TargetRangeItem;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHr(FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate) {
        fitnessProto$RangeHeartRate.getClass();
        FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate2 = this.hr_;
        if (fitnessProto$RangeHeartRate2 != null && fitnessProto$RangeHeartRate2 != FitnessProto$RangeHeartRate.getDefaultInstance()) {
            fitnessProto$RangeHeartRate = FitnessProto$RangeHeartRate.newBuilder(this.hr_).mergeFrom(fitnessProto$RangeHeartRate).buildPartial();
        }
        this.hr_ = fitnessProto$RangeHeartRate;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePace(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
        fitnessProto$TargetRangeItem.getClass();
        FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem2 = this.pace_;
        if (fitnessProto$TargetRangeItem2 != null && fitnessProto$TargetRangeItem2 != FitnessProto$TargetRangeItem.getDefaultInstance()) {
            fitnessProto$TargetRangeItem = FitnessProto$TargetRangeItem.newBuilder(this.pace_).mergeFrom(fitnessProto$TargetRangeItem).buildPartial();
        }
        this.pace_ = fitnessProto$TargetRangeItem;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$IntervalData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$IntervalData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$IntervalData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCadence(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
        fitnessProto$TargetRangeItem.getClass();
        this.cadence_ = fitnessProto$TargetRangeItem;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHr(FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate) {
        fitnessProto$RangeHeartRate.getClass();
        this.hr_ = fitnessProto$RangeHeartRate;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPace(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
        fitnessProto$TargetRangeItem.getClass();
        this.pace_ = fitnessProto$TargetRangeItem;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$IntervalData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "hr_", "pace_", "cadence_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$IntervalData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$IntervalData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public FitnessProto$TargetRangeItem getCadence() {
        FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem = this.cadence_;
        return fitnessProto$TargetRangeItem == null ? FitnessProto$TargetRangeItem.getDefaultInstance() : fitnessProto$TargetRangeItem;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public FitnessProto$RangeHeartRate getHr() {
        FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate = this.hr_;
        return fitnessProto$RangeHeartRate == null ? FitnessProto$RangeHeartRate.getDefaultInstance() : fitnessProto$RangeHeartRate;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public FitnessProto$TargetRangeItem getPace() {
        FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem = this.pace_;
        return fitnessProto$TargetRangeItem == null ? FitnessProto$TargetRangeItem.getDefaultInstance() : fitnessProto$TargetRangeItem;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public boolean hasCadence() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public boolean hasHr() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$IntervalDataOrBuilder
    public boolean hasPace() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(FitnessProto$IntervalData fitnessProto$IntervalData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$IntervalData);
    }

    public static FitnessProto$IntervalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$IntervalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$IntervalData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$IntervalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$IntervalData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$IntervalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$IntervalData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$IntervalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$IntervalData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$IntervalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$IntervalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

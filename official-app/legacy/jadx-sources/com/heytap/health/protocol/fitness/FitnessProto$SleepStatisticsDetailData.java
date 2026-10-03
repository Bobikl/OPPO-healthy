package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$SleepStatisticsDetailData extends GeneratedMessageLite<FitnessProto$SleepStatisticsDetailData, Builder> implements FitnessProto$SleepStatisticsDetailDataOrBuilder {
    public static final int AVG_SLEEP_BREATHE_RANG_HIGHT_FIELD_NUMBER = 7;
    public static final int AVG_SLEEP_BREATHE_RANG_LOW_FIELD_NUMBER = 6;
    public static final int AVG_SLEEP_HEART_RATE_FIELD_NUMBER = 3;
    public static final int AVG_SLEEP_SPO2_FIELD_NUMBER = 2;
    public static final int DATE_TIME_FIELD_NUMBER = 1;
    private static final FitnessProto$SleepStatisticsDetailData DEFAULT_INSTANCE;
    public static final int HEART_RATE_WARNING_LABEL_FIELD_NUMBER = 9;
    private static volatile Parser<FitnessProto$SleepStatisticsDetailData> PARSER = null;
    public static final int SLEEP_BED_FIELD_NUMBER = 8;
    public static final int SLEEP_HEART_RATE_RANGE_HIGHT_FIELD_NUMBER = 5;
    public static final int SLEEP_HEART_RATE_RANGE_LOW_FIELD_NUMBER = 4;
    private int avgSleepBreatheRangHight_;
    private int avgSleepBreatheRangLow_;
    private int avgSleepHeartRate_;
    private int avgSleepSpo2_;
    private int dateTime_;
    private int sleepHeartRateRangeHight_;
    private int sleepHeartRateRangeLow_;
    private Internal.ProtobufList<FitnessProto$SleepBedTimeData> sleepBed_ = GeneratedMessageLite.emptyProtobufList();
    private String heartRateWarningLabel_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepStatisticsDetailData, Builder> implements FitnessProto$SleepStatisticsDetailDataOrBuilder {
        public Builder addAllSleepBed(Iterable<? extends FitnessProto$SleepBedTimeData> iterable) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).addAllSleepBed(iterable);
            return this;
        }

        public Builder addSleepBed(FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).addSleepBed(fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder clearAvgSleepBreatheRangHight() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearAvgSleepBreatheRangHight();
            return this;
        }

        public Builder clearAvgSleepBreatheRangLow() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearAvgSleepBreatheRangLow();
            return this;
        }

        public Builder clearAvgSleepHeartRate() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearAvgSleepHeartRate();
            return this;
        }

        public Builder clearAvgSleepSpo2() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearAvgSleepSpo2();
            return this;
        }

        public Builder clearDateTime() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearDateTime();
            return this;
        }

        public Builder clearHeartRateWarningLabel() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearHeartRateWarningLabel();
            return this;
        }

        public Builder clearSleepBed() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearSleepBed();
            return this;
        }

        public Builder clearSleepHeartRateRangeHight() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearSleepHeartRateRangeHight();
            return this;
        }

        public Builder clearSleepHeartRateRangeLow() {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).clearSleepHeartRateRangeLow();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getAvgSleepBreatheRangHight() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getAvgSleepBreatheRangHight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getAvgSleepBreatheRangLow() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getAvgSleepBreatheRangLow();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getAvgSleepHeartRate() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getAvgSleepHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getAvgSleepSpo2() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getAvgSleepSpo2();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getDateTime() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getDateTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public String getHeartRateWarningLabel() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getHeartRateWarningLabel();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public ByteString getHeartRateWarningLabelBytes() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getHeartRateWarningLabelBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public FitnessProto$SleepBedTimeData getSleepBed(int i) {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getSleepBed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getSleepBedCount() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getSleepBedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public List<FitnessProto$SleepBedTimeData> getSleepBedList() {
            return Collections.unmodifiableList(((FitnessProto$SleepStatisticsDetailData) this.instance).getSleepBedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getSleepHeartRateRangeHight() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getSleepHeartRateRangeHight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
        public int getSleepHeartRateRangeLow() {
            return ((FitnessProto$SleepStatisticsDetailData) this.instance).getSleepHeartRateRangeLow();
        }

        public Builder removeSleepBed(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).removeSleepBed(i);
            return this;
        }

        public Builder setAvgSleepBreatheRangHight(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setAvgSleepBreatheRangHight(i);
            return this;
        }

        public Builder setAvgSleepBreatheRangLow(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setAvgSleepBreatheRangLow(i);
            return this;
        }

        public Builder setAvgSleepHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setAvgSleepHeartRate(i);
            return this;
        }

        public Builder setAvgSleepSpo2(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setAvgSleepSpo2(i);
            return this;
        }

        public Builder setDateTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setDateTime(i);
            return this;
        }

        public Builder setHeartRateWarningLabel(String str) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setHeartRateWarningLabel(str);
            return this;
        }

        public Builder setHeartRateWarningLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setHeartRateWarningLabelBytes(byteString);
            return this;
        }

        public Builder setSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setSleepBed(i, fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder setSleepHeartRateRangeHight(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setSleepHeartRateRangeHight(i);
            return this;
        }

        public Builder setSleepHeartRateRangeLow(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setSleepHeartRateRangeLow(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepStatisticsDetailData.DEFAULT_INSTANCE);
        }

        public Builder addSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).addSleepBed(i, fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder setSleepBed(int i, FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).setSleepBed(i, builder.build());
            return this;
        }

        public Builder addSleepBed(FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).addSleepBed(builder.build());
            return this;
        }

        public Builder addSleepBed(int i, FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepStatisticsDetailData) this.instance).addSleepBed(i, builder.build());
            return this;
        }
    }

    static {
        FitnessProto$SleepStatisticsDetailData fitnessProto$SleepStatisticsDetailData = new FitnessProto$SleepStatisticsDetailData();
        DEFAULT_INSTANCE = fitnessProto$SleepStatisticsDetailData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepStatisticsDetailData.class, fitnessProto$SleepStatisticsDetailData);
    }

    private FitnessProto$SleepStatisticsDetailData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSleepBed(Iterable<? extends FitnessProto$SleepBedTimeData> iterable) {
        ensureSleepBedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sleepBed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSleepBed(FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.add(fitnessProto$SleepBedTimeData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSleepBreatheRangHight() {
        this.avgSleepBreatheRangHight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSleepBreatheRangLow() {
        this.avgSleepBreatheRangLow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSleepHeartRate() {
        this.avgSleepHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSleepSpo2() {
        this.avgSleepSpo2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateTime() {
        this.dateTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateWarningLabel() {
        this.heartRateWarningLabel_ = getDefaultInstance().getHeartRateWarningLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepBed() {
        this.sleepBed_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepHeartRateRangeHight() {
        this.sleepHeartRateRangeHight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepHeartRateRangeLow() {
        this.sleepHeartRateRangeLow_ = 0;
    }

    private void ensureSleepBedIsMutable() {
        Internal.ProtobufList<FitnessProto$SleepBedTimeData> protobufList = this.sleepBed_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sleepBed_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProto$SleepStatisticsDetailData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepStatisticsDetailData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepStatisticsDetailData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSleepBed(int i) {
        ensureSleepBedIsMutable();
        this.sleepBed_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSleepBreatheRangHight(int i) {
        this.avgSleepBreatheRangHight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSleepBreatheRangLow(int i) {
        this.avgSleepBreatheRangLow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSleepHeartRate(int i) {
        this.avgSleepHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSleepSpo2(int i) {
        this.avgSleepSpo2_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateTime(int i) {
        this.dateTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateWarningLabel(String str) {
        str.getClass();
        this.heartRateWarningLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateWarningLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.heartRateWarningLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.set(i, fitnessProto$SleepBedTimeData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepHeartRateRangeHight(int i) {
        this.sleepHeartRateRangeHight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepHeartRateRangeLow(int i) {
        this.sleepHeartRateRangeLow_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepStatisticsDetailData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u001b\tȈ", new Object[]{"dateTime_", "avgSleepSpo2_", "avgSleepHeartRate_", "sleepHeartRateRangeLow_", "sleepHeartRateRangeHight_", "avgSleepBreatheRangLow_", "avgSleepBreatheRangHight_", "sleepBed_", FitnessProto$SleepBedTimeData.class, "heartRateWarningLabel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepStatisticsDetailData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepStatisticsDetailData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getAvgSleepBreatheRangHight() {
        return this.avgSleepBreatheRangHight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getAvgSleepBreatheRangLow() {
        return this.avgSleepBreatheRangLow_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getAvgSleepHeartRate() {
        return this.avgSleepHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getAvgSleepSpo2() {
        return this.avgSleepSpo2_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getDateTime() {
        return this.dateTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public String getHeartRateWarningLabel() {
        return this.heartRateWarningLabel_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public ByteString getHeartRateWarningLabelBytes() {
        return ByteString.copyFromUtf8(this.heartRateWarningLabel_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public FitnessProto$SleepBedTimeData getSleepBed(int i) {
        return this.sleepBed_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getSleepBedCount() {
        return this.sleepBed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public List<FitnessProto$SleepBedTimeData> getSleepBedList() {
        return this.sleepBed_;
    }

    public FitnessProto$SleepBedTimeDataOrBuilder getSleepBedOrBuilder(int i) {
        return this.sleepBed_.get(i);
    }

    public List<? extends FitnessProto$SleepBedTimeDataOrBuilder> getSleepBedOrBuilderList() {
        return this.sleepBed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getSleepHeartRateRangeHight() {
        return this.sleepHeartRateRangeHight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStatisticsDetailDataOrBuilder
    public int getSleepHeartRateRangeLow() {
        return this.sleepHeartRateRangeLow_;
    }

    public static Builder newBuilder(FitnessProto$SleepStatisticsDetailData fitnessProto$SleepStatisticsDetailData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepStatisticsDetailData);
    }

    public static FitnessProto$SleepStatisticsDetailData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.add(i, fitnessProto$SleepBedTimeData);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepStatisticsDetailData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStatisticsDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

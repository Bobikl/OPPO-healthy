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
public final class FitnessProto$WristTemperatureRecord extends GeneratedMessageLite<FitnessProto$WristTemperatureRecord, Builder> implements FitnessProto$WristTemperatureRecordOrBuilder {
    public static final int BASELINE_MINUTE_VALUE_FIELD_NUMBER = 3;
    private static final FitnessProto$WristTemperatureRecord DEFAULT_INSTANCE;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$WristTemperatureRecord> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int baselineMinuteValue_;
    private int minuteOffset_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WristTemperatureRecord, Builder> implements FitnessProto$WristTemperatureRecordOrBuilder {
        private Builder() {
            super(FitnessProto$WristTemperatureRecord.DEFAULT_INSTANCE);
        }

        public Builder clearBaselineMinuteValue() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).clearBaselineMinuteValue();
            return this;
        }

        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).clearMinuteOffset();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
        public int getBaselineMinuteValue() {
            return ((FitnessProto$WristTemperatureRecord) this.instance).getBaselineMinuteValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
        public int getMinuteOffset() {
            return ((FitnessProto$WristTemperatureRecord) this.instance).getMinuteOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
        public int getValue() {
            return ((FitnessProto$WristTemperatureRecord) this.instance).getValue();
        }

        public Builder setBaselineMinuteValue(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).setBaselineMinuteValue(i);
            return this;
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).setMinuteOffset(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureRecord) this.instance).setValue(i);
            return this;
        }
    }

    static {
        FitnessProto$WristTemperatureRecord fitnessProto$WristTemperatureRecord = new FitnessProto$WristTemperatureRecord();
        DEFAULT_INSTANCE = fitnessProto$WristTemperatureRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WristTemperatureRecord.class, fitnessProto$WristTemperatureRecord);
    }

    private FitnessProto$WristTemperatureRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaselineMinuteValue() {
        this.baselineMinuteValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProto$WristTemperatureRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WristTemperatureRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$WristTemperatureRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaselineMinuteValue(int i) {
        this.baselineMinuteValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WristTemperatureRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"minuteOffset_", "value_", "baselineMinuteValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WristTemperatureRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WristTemperatureRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
    public int getBaselineMinuteValue() {
        return this.baselineMinuteValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureRecordOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$WristTemperatureRecord fitnessProto$WristTemperatureRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WristTemperatureRecord);
    }

    public static FitnessProto$WristTemperatureRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WristTemperatureRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

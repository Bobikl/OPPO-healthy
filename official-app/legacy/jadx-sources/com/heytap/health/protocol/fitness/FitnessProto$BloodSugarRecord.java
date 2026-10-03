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
public final class FitnessProto$BloodSugarRecord extends GeneratedMessageLite<FitnessProto$BloodSugarRecord, Builder> implements FitnessProto$BloodSugarRecordOrBuilder {
    private static final FitnessProto$BloodSugarRecord DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$BloodSugarRecord> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TREND_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int status_;
    private int timestamp_;
    private int trend_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BloodSugarRecord, Builder> implements FitnessProto$BloodSugarRecordOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).clearStatus();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTrend() {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).clearTrend();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
        public int getStatus() {
            return ((FitnessProto$BloodSugarRecord) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$BloodSugarRecord) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
        public int getTrend() {
            return ((FitnessProto$BloodSugarRecord) this.instance).getTrend();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
        public int getValue() {
            return ((FitnessProto$BloodSugarRecord) this.instance).getValue();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).setStatus(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTrend(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).setTrend(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarRecord) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BloodSugarRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BloodSugarRecord fitnessProto$BloodSugarRecord = new FitnessProto$BloodSugarRecord();
        DEFAULT_INSTANCE = fitnessProto$BloodSugarRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BloodSugarRecord.class, fitnessProto$BloodSugarRecord);
    }

    private FitnessProto$BloodSugarRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrend() {
        this.trend_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProto$BloodSugarRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BloodSugarRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BloodSugarRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrend(int i) {
        this.trend_ = i;
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
                return new FitnessProto$BloodSugarRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"timestamp_", "value_", "status_", "trend_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BloodSugarRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BloodSugarRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
    public int getTrend() {
        return this.trend_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarRecordOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$BloodSugarRecord fitnessProto$BloodSugarRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BloodSugarRecord);
    }

    public static FitnessProto$BloodSugarRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BloodSugarRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

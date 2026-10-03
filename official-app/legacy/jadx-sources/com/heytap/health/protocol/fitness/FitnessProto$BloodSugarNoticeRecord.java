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
public final class FitnessProto$BloodSugarNoticeRecord extends GeneratedMessageLite<FitnessProto$BloodSugarNoticeRecord, Builder> implements FitnessProto$BloodSugarNoticeRecordOrBuilder {
    private static final FitnessProto$BloodSugarNoticeRecord DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$BloodSugarNoticeRecord> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int timestamp_;
    private int type_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BloodSugarNoticeRecord, Builder> implements FitnessProto$BloodSugarNoticeRecordOrBuilder {
        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$BloodSugarNoticeRecord) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
        public int getType() {
            return ((FitnessProto$BloodSugarNoticeRecord) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
        public int getValue() {
            return ((FitnessProto$BloodSugarNoticeRecord) this.instance).getValue();
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).setType(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarNoticeRecord) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BloodSugarNoticeRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BloodSugarNoticeRecord fitnessProto$BloodSugarNoticeRecord = new FitnessProto$BloodSugarNoticeRecord();
        DEFAULT_INSTANCE = fitnessProto$BloodSugarNoticeRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BloodSugarNoticeRecord.class, fitnessProto$BloodSugarNoticeRecord);
    }

    private FitnessProto$BloodSugarNoticeRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProto$BloodSugarNoticeRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BloodSugarNoticeRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BloodSugarNoticeRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
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
                return new FitnessProto$BloodSugarNoticeRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"timestamp_", "type_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BloodSugarNoticeRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BloodSugarNoticeRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarNoticeRecordOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$BloodSugarNoticeRecord fitnessProto$BloodSugarNoticeRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BloodSugarNoticeRecord);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BloodSugarNoticeRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarNoticeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

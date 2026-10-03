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
public final class FitnessProto$WeightRecord extends GeneratedMessageLite<FitnessProto$WeightRecord, Builder> implements FitnessProto$WeightRecordOrBuilder {
    private static final FitnessProto$WeightRecord DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$WeightRecord> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 1;
    private int timeStamp_;
    private int weight_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WeightRecord, Builder> implements FitnessProto$WeightRecordOrBuilder {
        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$WeightRecord) this.instance).clearTimeStamp();
            return this;
        }

        public Builder clearWeight() {
            copyOnWrite();
            ((FitnessProto$WeightRecord) this.instance).clearWeight();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightRecordOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$WeightRecord) this.instance).getTimeStamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightRecordOrBuilder
        public int getWeight() {
            return ((FitnessProto$WeightRecord) this.instance).getWeight();
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$WeightRecord) this.instance).setTimeStamp(i);
            return this;
        }

        public Builder setWeight(int i) {
            copyOnWrite();
            ((FitnessProto$WeightRecord) this.instance).setWeight(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$WeightRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$WeightRecord fitnessProto$WeightRecord = new FitnessProto$WeightRecord();
        DEFAULT_INSTANCE = fitnessProto$WeightRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WeightRecord.class, fitnessProto$WeightRecord);
    }

    private FitnessProto$WeightRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    public static FitnessProto$WeightRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WeightRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WeightRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$WeightRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WeightRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"weight_", "timeStamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WeightRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WeightRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightRecordOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightRecordOrBuilder
    public int getWeight() {
        return this.weight_;
    }

    public static Builder newBuilder(FitnessProto$WeightRecord fitnessProto$WeightRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WeightRecord);
    }

    public static FitnessProto$WeightRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WeightRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WeightRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$WeightRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WeightRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WeightRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$WeightRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WeightRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WeightRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WeightRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

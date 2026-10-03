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
public final class FitnessProto$RangeTimeDataCount extends GeneratedMessageLite<FitnessProto$RangeTimeDataCount, Builder> implements FitnessProto$RangeTimeDataCountOrBuilder {
    public static final int DATA_COUNT_FIELD_NUMBER = 3;
    private static final FitnessProto$RangeTimeDataCount DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$RangeTimeDataCount> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int dataCount_;
    private int endTime_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$RangeTimeDataCount, Builder> implements FitnessProto$RangeTimeDataCountOrBuilder {
        public Builder clearDataCount() {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).clearDataCount();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).clearEndTime();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
        public int getDataCount() {
            return ((FitnessProto$RangeTimeDataCount) this.instance).getDataCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
        public int getEndTime() {
            return ((FitnessProto$RangeTimeDataCount) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
        public int getStartTime() {
            return ((FitnessProto$RangeTimeDataCount) this.instance).getStartTime();
        }

        public Builder setDataCount(int i) {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).setDataCount(i);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).setEndTime(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$RangeTimeDataCount) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$RangeTimeDataCount.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$RangeTimeDataCount fitnessProto$RangeTimeDataCount = new FitnessProto$RangeTimeDataCount();
        DEFAULT_INSTANCE = fitnessProto$RangeTimeDataCount;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$RangeTimeDataCount.class, fitnessProto$RangeTimeDataCount);
    }

    private FitnessProto$RangeTimeDataCount() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataCount() {
        this.dataCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$RangeTimeDataCount getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$RangeTimeDataCount parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$RangeTimeDataCount> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataCount(int i) {
        this.dataCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$RangeTimeDataCount();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"startTime_", "endTime_", "dataCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$RangeTimeDataCount> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$RangeTimeDataCount.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
    public int getDataCount() {
        return this.dataCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeTimeDataCountOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$RangeTimeDataCount fitnessProto$RangeTimeDataCount) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$RangeTimeDataCount);
    }

    public static FitnessProto$RangeTimeDataCount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$RangeTimeDataCount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeTimeDataCount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

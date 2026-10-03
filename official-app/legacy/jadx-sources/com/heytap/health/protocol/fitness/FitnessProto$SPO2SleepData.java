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
public final class FitnessProto$SPO2SleepData extends GeneratedMessageLite<FitnessProto$SPO2SleepData, Builder> implements FitnessProto$SPO2SleepDataOrBuilder {
    private static final FitnessProto$SPO2SleepData DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$SPO2SleepData> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 4;
    public static final int SPO2_FIELD_NUMBER = 3;
    private int interval_;
    private int minuteOffset_;
    private ByteString reliability_;
    private ByteString spo2_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SPO2SleepData, Builder> implements FitnessProto$SPO2SleepDataOrBuilder {
        public Builder clearInterval() {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).clearInterval();
            return this;
        }

        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).clearMinuteOffset();
            return this;
        }

        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).clearReliability();
            return this;
        }

        public Builder clearSpo2() {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).clearSpo2();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
        public int getInterval() {
            return ((FitnessProto$SPO2SleepData) this.instance).getInterval();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
        public int getMinuteOffset() {
            return ((FitnessProto$SPO2SleepData) this.instance).getMinuteOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
        public ByteString getReliability() {
            return ((FitnessProto$SPO2SleepData) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
        public ByteString getSpo2() {
            return ((FitnessProto$SPO2SleepData) this.instance).getSpo2();
        }

        public Builder setInterval(int i) {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).setInterval(i);
            return this;
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).setMinuteOffset(i);
            return this;
        }

        public Builder setReliability(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).setReliability(byteString);
            return this;
        }

        public Builder setSpo2(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SPO2SleepData) this.instance).setSpo2(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$SPO2SleepData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SPO2SleepData fitnessProto$SPO2SleepData = new FitnessProto$SPO2SleepData();
        DEFAULT_INSTANCE = fitnessProto$SPO2SleepData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SPO2SleepData.class, fitnessProto$SPO2SleepData);
    }

    private FitnessProto$SPO2SleepData() {
        ByteString byteString = ByteString.EMPTY;
        this.spo2_ = byteString;
        this.reliability_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.interval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReliability() {
        this.reliability_ = getDefaultInstance().getReliability();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2() {
        this.spo2_ = getDefaultInstance().getSpo2();
    }

    public static FitnessProto$SPO2SleepData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SPO2SleepData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2SleepData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SPO2SleepData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(int i) {
        this.interval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReliability(ByteString byteString) {
        byteString.getClass();
        this.reliability_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2(ByteString byteString) {
        byteString.getClass();
        this.spo2_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SPO2SleepData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\n\u0004\n", new Object[]{"minuteOffset_", "interval_", "spo2_", "reliability_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SPO2SleepData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SPO2SleepData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
    public int getInterval() {
        return this.interval_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
    public ByteString getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2SleepDataOrBuilder
    public ByteString getSpo2() {
        return this.spo2_;
    }

    public static Builder newBuilder(FitnessProto$SPO2SleepData fitnessProto$SPO2SleepData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SPO2SleepData);
    }

    public static FitnessProto$SPO2SleepData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2SleepData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SPO2SleepData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SPO2SleepData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SPO2SleepData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SPO2SleepData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SPO2SleepData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2SleepData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2SleepData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SPO2SleepData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

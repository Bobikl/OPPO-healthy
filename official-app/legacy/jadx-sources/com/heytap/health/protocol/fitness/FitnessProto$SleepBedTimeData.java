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
public final class FitnessProto$SleepBedTimeData extends GeneratedMessageLite<FitnessProto$SleepBedTimeData, Builder> implements FitnessProto$SleepBedTimeDataOrBuilder {
    public static final int DATE_TIME_FIELD_NUMBER = 2;
    private static final FitnessProto$SleepBedTimeData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepBedTimeData> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int dateTime_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepBedTimeData, Builder> implements FitnessProto$SleepBedTimeDataOrBuilder {
        public Builder clearDateTime() {
            copyOnWrite();
            ((FitnessProto$SleepBedTimeData) this.instance).clearDateTime();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$SleepBedTimeData) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepBedTimeDataOrBuilder
        public int getDateTime() {
            return ((FitnessProto$SleepBedTimeData) this.instance).getDateTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepBedTimeDataOrBuilder
        public int getType() {
            return ((FitnessProto$SleepBedTimeData) this.instance).getType();
        }

        public Builder setDateTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepBedTimeData) this.instance).setDateTime(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$SleepBedTimeData) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepBedTimeData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData = new FitnessProto$SleepBedTimeData();
        DEFAULT_INSTANCE = fitnessProto$SleepBedTimeData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepBedTimeData.class, fitnessProto$SleepBedTimeData);
    }

    private FitnessProto$SleepBedTimeData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateTime() {
        this.dateTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$SleepBedTimeData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepBedTimeData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepBedTimeData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateTime(int i) {
        this.dateTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepBedTimeData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"type_", "dateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepBedTimeData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepBedTimeData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepBedTimeDataOrBuilder
    public int getDateTime() {
        return this.dateTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepBedTimeDataOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepBedTimeData);
    }

    public static FitnessProto$SleepBedTimeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepBedTimeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepBedTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

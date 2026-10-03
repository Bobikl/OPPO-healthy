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
public final class FitnessProto$WearRecord extends GeneratedMessageLite<FitnessProto$WearRecord, Builder> implements FitnessProto$WearRecordOrBuilder {
    private static final FitnessProto$WearRecord DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$WearRecord> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    public static final int SYSTEM_MODE_FIELD_NUMBER = 3;
    private int duration_;
    private int startTime_;
    private int systemMode_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WearRecord, Builder> implements FitnessProto$WearRecordOrBuilder {
        public Builder clearDuration() {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).clearDuration();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).clearStartTime();
            return this;
        }

        public Builder clearSystemMode() {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).clearSystemMode();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
        public int getDuration() {
            return ((FitnessProto$WearRecord) this.instance).getDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
        public int getStartTime() {
            return ((FitnessProto$WearRecord) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
        public int getSystemMode() {
            return ((FitnessProto$WearRecord) this.instance).getSystemMode();
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).setDuration(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).setStartTime(i);
            return this;
        }

        public Builder setSystemMode(int i) {
            copyOnWrite();
            ((FitnessProto$WearRecord) this.instance).setSystemMode(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$WearRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$WearRecord fitnessProto$WearRecord = new FitnessProto$WearRecord();
        DEFAULT_INSTANCE = fitnessProto$WearRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WearRecord.class, fitnessProto$WearRecord);
    }

    private FitnessProto$WearRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemMode() {
        this.systemMode_ = 0;
    }

    public static FitnessProto$WearRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WearRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WearRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$WearRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemMode(int i) {
        this.systemMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WearRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"startTime_", "duration_", "systemMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WearRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WearRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WearRecordOrBuilder
    public int getSystemMode() {
        return this.systemMode_;
    }

    public static Builder newBuilder(FitnessProto$WearRecord fitnessProto$WearRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WearRecord);
    }

    public static FitnessProto$WearRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WearRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WearRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$WearRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WearRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WearRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$WearRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WearRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WearRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WearRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WearRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

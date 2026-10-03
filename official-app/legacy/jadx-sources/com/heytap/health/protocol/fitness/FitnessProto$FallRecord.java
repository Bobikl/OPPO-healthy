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
public final class FitnessProto$FallRecord extends GeneratedMessageLite<FitnessProto$FallRecord, Builder> implements FitnessProto$FallRecordOrBuilder {
    private static final FitnessProto$FallRecord DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$FallRecord> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int state_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$FallRecord, Builder> implements FitnessProto$FallRecordOrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$FallRecord) this.instance).clearState();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$FallRecord) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FallRecordOrBuilder
        public int getState() {
            return ((FitnessProto$FallRecord) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FallRecordOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$FallRecord) this.instance).getTimestamp();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$FallRecord) this.instance).setState(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$FallRecord) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$FallRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$FallRecord fitnessProto$FallRecord = new FitnessProto$FallRecord();
        DEFAULT_INSTANCE = fitnessProto$FallRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$FallRecord.class, fitnessProto$FallRecord);
    }

    private FitnessProto$FallRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$FallRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$FallRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FallRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$FallRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$FallRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timestamp_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$FallRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$FallRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FallRecordOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FallRecordOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$FallRecord fitnessProto$FallRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$FallRecord);
    }

    public static FitnessProto$FallRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FallRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$FallRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$FallRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$FallRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$FallRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$FallRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FallRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FallRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$FallRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FallRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

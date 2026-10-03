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
public final class FitnessProto$AudioRecordEvent extends GeneratedMessageLite<FitnessProto$AudioRecordEvent, Builder> implements FitnessProto$AudioRecordEventOrBuilder {
    private static final FitnessProto$AudioRecordEvent DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$AudioRecordEvent> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int time_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$AudioRecordEvent, Builder> implements FitnessProto$AudioRecordEventOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProto$AudioRecordEvent) this.instance).clearTime();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$AudioRecordEvent) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AudioRecordEventOrBuilder
        public int getTime() {
            return ((FitnessProto$AudioRecordEvent) this.instance).getTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AudioRecordEventOrBuilder
        public int getType() {
            return ((FitnessProto$AudioRecordEvent) this.instance).getType();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProto$AudioRecordEvent) this.instance).setTime(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$AudioRecordEvent) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$AudioRecordEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$AudioRecordEvent fitnessProto$AudioRecordEvent = new FitnessProto$AudioRecordEvent();
        DEFAULT_INSTANCE = fitnessProto$AudioRecordEvent;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$AudioRecordEvent.class, fitnessProto$AudioRecordEvent);
    }

    private FitnessProto$AudioRecordEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$AudioRecordEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$AudioRecordEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$AudioRecordEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
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
                return new FitnessProto$AudioRecordEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"type_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$AudioRecordEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$AudioRecordEvent.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AudioRecordEventOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AudioRecordEventOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$AudioRecordEvent fitnessProto$AudioRecordEvent) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$AudioRecordEvent);
    }

    public static FitnessProto$AudioRecordEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$AudioRecordEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AudioRecordEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

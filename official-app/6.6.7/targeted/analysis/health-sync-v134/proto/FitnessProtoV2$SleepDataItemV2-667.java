package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$SleepDataItemV2 extends GeneratedMessageLite<FitnessProtoV2$SleepDataItemV2, Builder> implements FitnessProtoV2$SleepDataItemV2OrBuilder {
    private static final FitnessProtoV2$SleepDataItemV2 DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SleepDataItemV2> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TIME_OFFSET_FIELD_NUMBER = 1;
    private int state_;
    private int timeOffset_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SleepDataItemV2, Builder> implements FitnessProtoV2$SleepDataItemV2OrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        public Builder clearTimeOffset() {
            copyOnWrite();
            ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).clearTimeOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataItemV2OrBuilder
        public int getState() {
            return ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataItemV2OrBuilder
        public int getTimeOffset() {
            return ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).getTimeOffset();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).setState(i);
            return this;
        }

        public Builder setTimeOffset(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepDataItemV2) ((GeneratedMessageLite.Builder) this).instance).setTimeOffset(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SleepDataItemV2.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SleepDataItemV2 fitnessProtoV2$SleepDataItemV2 = new FitnessProtoV2$SleepDataItemV2();
        DEFAULT_INSTANCE = fitnessProtoV2$SleepDataItemV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SleepDataItemV2.class, fitnessProtoV2$SleepDataItemV2);
    }

    private FitnessProtoV2$SleepDataItemV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffset_ = 0;
    }

    public static FitnessProtoV2$SleepDataItemV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SleepDataItemV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SleepDataItemV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOffset(int i) {
        this.timeOffset_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SleepDataItemV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timeOffset_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SleepDataItemV2.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataItemV2OrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataItemV2OrBuilder
    public int getTimeOffset() {
        return this.timeOffset_;
    }

    public static Builder newBuilder(FitnessProtoV2$SleepDataItemV2 fitnessProtoV2$SleepDataItemV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SleepDataItemV2);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SleepDataItemV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepDataItemV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
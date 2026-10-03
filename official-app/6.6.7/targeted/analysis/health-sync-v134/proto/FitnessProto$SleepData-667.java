package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$SleepData extends GeneratedMessageLite<FitnessProto$SleepData, Builder> implements FitnessProto$SleepDataOrBuilder {
    private static final FitnessProto$SleepData DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$SleepData> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 3;
    private int index_;
    private int startTime_;
    private ByteString state_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepData, Builder> implements FitnessProto$SleepDataOrBuilder {
        public Builder clearIndex() {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).clearIndex();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
        public int getIndex() {
            return ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).getIndex();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
        public int getStartTime() {
            return ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
        public ByteString getState() {
            return ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).setIndex(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
            return this;
        }

        public Builder setState(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SleepData) ((GeneratedMessageLite.Builder) this).instance).setState(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepData fitnessProto$SleepData = new FitnessProto$SleepData();
        DEFAULT_INSTANCE = fitnessProto$SleepData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepData.class, fitnessProto$SleepData);
    }

    private FitnessProto$SleepData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = getDefaultInstance().getState();
    }

    public static FitnessProto$SleepData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(ByteString byteString) {
        byteString.getClass();
        this.state_ = byteString;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\n", new Object[]{"index_", "startTime_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepDataOrBuilder
    public ByteString getState() {
        return this.state_;
    }

    public static Builder newBuilder(FitnessProto$SleepData fitnessProto$SleepData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepData);
    }

    public static FitnessProto$SleepData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}